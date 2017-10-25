package com.greenfoxacademy.springstart.controller;
import com.greenfoxacademy.springstart.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class AccountControl {

    BankAccount bankAccount0 = new BankAccount("Simba","2000","Lion",true);
    BankAccount bankAccount1 = new BankAccount("Lanymacska", "2000", "Lion",false);
    BankAccount bankAccount2 = new BankAccount("Timon", "2000", "foldikutya",false);
    BankAccount bankAccount3 = new BankAccount("Pumpa", "2000", "malac",false);

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public String bankAccount(Model model){
        model.addAttribute("account", bankAccount0);
       return "accountTemplate";
   }

   @RequestMapping(value = "/account")
    public String textHappy(){
        return "accountTemplate";
   }

    @RequestMapping(value = "/accounts")
    public String accountSet(Model model){
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(bankAccount0);
        accounts.add(bankAccount1);
        accounts.add(bankAccount2);
        accounts.add(bankAccount3);
        model.addAttribute("account", accounts);
        return "accountTemplate1";
    }

}
