package com.greenfoxacademy.restfirst;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import java.nio.charset.Charset;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@EnableWebMvc
public class RestfirstApplicationTests {

	private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
			MediaType.APPLICATION_JSON.getSubtype(),
			Charset.forName("utf8"));

	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void testSuccessfulDoubling() throws Exception {
		mockMvc.perform(get("/doubling?input=15")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.result", is(30)));
	}

	@Test
	public void testErrorDoubling() throws Exception {
		mockMvc.perform(get("/doubling?input=")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.error", is("Please provide an input!")));
	}

	@Test
	public void tesZeroDoubling() throws Exception {
		mockMvc.perform(get("/doubling?input=0")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.result", is(0)));
	}

	@Test
	public void testTitleNull() throws Exception {
		mockMvc.perform(get("/greeter?name=petike")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.error", is("Please provide a title!")));
	}

	@Test
	public void testNamenull() throws Exception {
		mockMvc.perform(get("/greeter?title=student")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.error", is("Please provide a name!")));
	}

	@Test
	public void testNameTitle() throws Exception {
		mockMvc.perform(get("/greeter?name=Petike&title=student")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear student!")));
	}

	@Test
	public void testAppendaSuccess() throws Exception {
		mockMvc.perform(get("/appenda/kuty")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.appended", is("kutya")));
	}

	@Test
	public void testAppendaIsNotFound() throws Exception {
		mockMvc.perform(get("/appenda/")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound());
	}

	@Test
	public void testDoUntilSumSuccess() throws Exception {
		mockMvc.perform(post("/dountil/sum")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"until\": \"7\"}"))
				.andExpect(status().isOk())
				.andExpect(content().contentType(contentType))
				.andExpect(jsonPath("$.result", is(28)));
	}

}
