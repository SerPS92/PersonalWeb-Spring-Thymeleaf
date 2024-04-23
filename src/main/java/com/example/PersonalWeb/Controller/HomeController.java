package com.example.PersonalWeb.Controller;

import com.example.PersonalWeb.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class HomeController {

    private final MailSenderService mailSenderService;

    @Autowired
    public HomeController(MailSenderService mailSenderService) {
        this.mailSenderService = mailSenderService;
    }

    @GetMapping("/")
    public String home(){
        return "index";
    }

    @GetMapping("/send")
    public String send(@RequestParam(name = "name") String name,
                       @RequestParam(name = "from") String from,
                       @RequestParam(name = "text") String text){

        String to = "";
        String subject = "Mensaje recibido desde el blog";
        String content = "Name: " + name + "\n" + "Email: " + from + "\n" + "\n" + text;
        mailSenderService.sendEmail(to, subject, content);

        return "redirect:/thanks";
    }

    @GetMapping("/thanks")
    public String thanks(){
        return "thanks";
    }
}
