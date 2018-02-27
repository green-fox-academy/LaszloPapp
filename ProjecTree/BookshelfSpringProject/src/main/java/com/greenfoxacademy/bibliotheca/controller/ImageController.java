package com.greenfoxacademy.bibliotheca.controller;
import com.greenfoxacademy.bibliotheca.model.Book;
import com.greenfoxacademy.bibliotheca.service.CategoryService;
import com.greenfoxacademy.bibliotheca.service.ItemService;
import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/myImage")
public class ImageController {

    @Resource(name = "categoryService")
    private CategoryService categoryService;

    @Resource(name = "itemService")
    private ItemService itemService;

    @RequestMapping(value = "/imageDisplay", method = RequestMethod.GET)
    public void showImage(@RequestParam("id") Integer bookId, HttpServletResponse response,
        HttpServletRequest request)
        throws ServletException, IOException {

        Book book = new Book();
        response.setContentType("image/jpeg, image/jpg, image/png, image/gif");
        response.getOutputStream().write(book.getImage());
        response.getOutputStream().close();
    }
}