package com.greenfoxacademy.bibliotheca;
import com.greenfoxacademy.bibliotheca.model.Book;
import com.greenfoxacademy.bibliotheca.service.HibernateUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.hibernate.Session;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class BibliothecaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BibliothecaApplication.class, args);

		System.out.println("Hibernate save image into database");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();

		//save image into database
		File file = new File("C:\\mavan-hibernate-image-mysql.gif");
		byte[] bFile = new byte[(int) file.length()];

		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			//convert file into array of bytes
			fileInputStream.read(bFile);
			fileInputStream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Book book = new Book();
		book.setImage(bFile);

		session.save(book);

		//Get image from database
		Book book2 = (Book)session.get(Book.class, book.getId());
		byte[] bAvatar = book2.getImage();

		try{
			FileOutputStream fos = new FileOutputStream("C:\\test.gif");
			fos.write(bAvatar);
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		session.getTransaction().commit();
	}

	@Override
	public void run(String... args) throws Exception {

	}

	@Configuration
	@EnableWebMvc
	public class WebConfig extends WebMvcConfigurerAdapter {

		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/static/**")
					.addResourceLocations("classpath:/static/");
		}
	}
}
