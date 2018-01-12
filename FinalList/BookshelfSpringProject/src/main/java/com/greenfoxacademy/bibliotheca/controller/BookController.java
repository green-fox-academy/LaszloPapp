package com.greenfoxacademy.bibliotheca.controller;
import com.greenfoxacademy.bibliotheca.model.BookShelf;
import com.greenfoxacademy.bibliotheca.model.ErrorMessage;
import com.greenfoxacademy.bibliotheca.repository.BookRepository;
import com.greenfoxacademy.bibliotheca.service.ScoreProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.size;

@Controller
public class BookController {

    @Autowired
    BookRepository bookRepo;

    @Autowired
    ScoreProvider scoreProvider;

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping({"/"})
    public String listOfBooks(Model model){
        if (size(bookRepo.findAll()) != 0) {
            model.addAttribute("list", bookRepo.findAll());
        }else {
            return String.valueOf(new ErrorMessage("The bookshelf is empty"));
        }
        return "index";
    }

    @RequestMapping(value = "/title", method = RequestMethod.GET)
    public String getBookListByTitle(Model model,String search){
        if (search.matches("^[a-zA-Z]*$")) {
            model.addAttribute("list", bookRepo.findAllByTitleIsContaining("%" + search + "%"));
        }else {
            model.addAttribute("error", new ErrorMessage("Provide valid character! (a-z, A-Z)"));
        }
        return "index";
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String getBookListByAuthor(Model model,String search){
        if (search.matches("^[a-zA-Z]*$")) {
            model.addAttribute("list", bookRepo.findAllByAuthorIsContaining("%" + search + "%"));
        }else{
            model.addAttribute("error", new ErrorMessage("Provide valid character! (a-z, A-Z)"));
        }
        return "index";
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.GET)
    public String addNewBookToShelf(Model model) {
        model.addAttribute("addBook", new BookShelf());
        return "addBook";
    }

    /**
     * This method saves a new book in the bookshelf
     * @param bookShelf 1 bookshelf instance for saving
     * @return redirects to the main page
     */
    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String addNewBookToShelf(@ModelAttribute BookShelf bookShelf) {
        bookRepo.save(bookShelf);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/delete", method = RequestMethod.GET)
    public String deleteBookById(@PathVariable long id) {
        bookRepo.delete(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.GET)
    public String editBookById(@PathVariable long id, Model model) {
        model.addAttribute("edit", bookRepo.findOne(id));
        return "editBook";
    }

    @RequestMapping(value = "/{id}/edit", method = RequestMethod.POST)
    public String editBookById(@ModelAttribute BookShelf bookShelf) {
        bookRepo.save(bookShelf);
        return "redirect:/";
    }

    @RequestMapping(value = "/favourite", method = RequestMethod.GET)
    public String getFavouriteBookList(Model model){
        model.addAttribute("list", bookRepo.listFavourites());
        return "index";
    }

    @RequestMapping(value = "/isbnsearch", method = RequestMethod.GET)
    public String getBookListByISBN(Model model, String search){
        if (search.matches("^[0-9-]*$")) {
            model.addAttribute("list", bookRepo.findAllByIsbnIsLike("%" + search + "%"));
        }else{
            model.addAttribute("error", new ErrorMessage("Provide numbers! (0-9)"));
        }
        return "index";
    }

    @RequestMapping(value = "/isbn", method = RequestMethod.GET)
    public String getOrderedBookListByISBN(Model model){
            model.addAttribute("list", bookRepo.orderedByIsbn());
        return "index";
    }

    @RequestMapping(value = "/{id}/increase", method = RequestMethod.GET)
    public String increaseBookScore(@PathVariable Long id) {
        scoreProvider.increase(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/{id}/decrease", method = RequestMethod.GET)
    public String decreaseBookScore(@PathVariable Long id) {
        scoreProvider.decrease(id);
        return "redirect:/";
    }

    @RequestMapping(value = "/{author}", method = RequestMethod.GET)
    public String getAllBookByAuthor(Model model, @PathVariable("author") String author){
        model.addAttribute("list", bookRepo.findAllByAuthor(author));
        return "index";
    }

    @RequestMapping(value = "/score", method = RequestMethod.GET)
    public String getOrderedBookListByScore(Model model){
        model.addAttribute("list", bookRepo.orderedByScore());
        return "index";
    }

    @RequestMapping(value = "/year", method = RequestMethod.GET)
    public String getBookListByYear(Model model, String search){
        if (search.matches("^[0-9-]*$")) {
            model.addAttribute("list", bookRepo.findAllByYearIsLike("%" + search + "%"));
        }else {
            model.addAttribute("error", new ErrorMessage("Provide numbers! (0-9)"));
        }
        return "index";
    }

    @RequestMapping(value = "/{id}/details", method = RequestMethod.GET)
    public String showBookDetails(@PathVariable long id, Model model) {
        model.addAttribute("list", bookRepo.findOne(id));
        return "details";
    }
}
