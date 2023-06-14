package kr.hs.study.Model2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class getParameterController {

    @GetMapping("/test1")
    public String test1(@RequestParam("id") String id,
                        @RequestParam("pass") String pass,
                        @RequestParam("nickname") String nickname,
                        Model model){
        model.addAttribute("id",id);
        model.addAttribute("pass",pass);
        model.addAttribute("nickname",nickname);



        return "re_test1";
    }
}
