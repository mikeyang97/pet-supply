package database.cop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.lang.annotation.*;


@Controller
@Slf4j
public class LoginController {

    @GetMapping(value = {"/", "/login", "/demo/templates/login.html"})
    public String login(){
        log.info("GET");
        return "login";
    }

    @PostMapping("/login")
    public String main(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session, Model model){
        log.info("POST");
        if("root".equals(username) && "123456".equals(password)){
            session.setAttribute("currentUser", username);
            return "redirect:/main";
        }
        else {
            model.addAttribute("message", "Invalid Username or Password");
            return "login";
        }
    }

    @GetMapping("/main")
    public String mainPage(HttpSession session, Model model){
        log.info("GET(main)");
        Object loggedIn = session.getAttribute("currentUser");
        log.info("check if logged in");
        if(loggedIn != null){
            log.info("already logged in");
            return "main";
        }
        else {
            log.info("haven't logged in, please log in first");
            model.addAttribute("message", "Please login in");
            return "login";
        }

    }

    @GetMapping("/generalQuery")
    public String generalQuery(HttpSession session, Model model) {
        Object loggedIn = session.getAttribute("currentUser");
        log.info("check if logged in");
        if(loggedIn != null){
            log.info("already logged in");
            return "generalQuery";
        }
        else {
            log.info("haven't logged in, please log in first");
            model.addAttribute("message", "Please login in");
            return "login";
        }
    }

    @GetMapping("/error")
    public String error() {
        return "error";
    }

}
