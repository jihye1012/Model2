package kr.hs.study.Model2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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
        @GetMapping("/test2")
        public String test2(Model model){
            List<String> list= new ArrayList<>();
            list.add("kim");
            list.add("lee");
            list.add("park");
            list.add("kang");
            list.add("min");
            model.addAttribute("list1",list);
            return "re_test2";

        }

    @GetMapping("/test3")
    public ModelAndView test3(ModelAndView mv){
        List<String> list= new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("park");
        list.add("kang");
        list.add("min");
        mv.addObject("list2",list);
        mv.setViewName("test3");
        return mv;
    }

    @GetMapping("/test4")
    public ModelAndView test4(@RequestParam String n,
                              @RequestParam String m,
                              ModelAndView mv){
        mv.addObject("n",n);
        mv.addObject("m",m);
        int n2 = Integer.parseInt(n);
        int m2 = Integer.parseInt(m);
        int sum=0;
        for(int i=n2; i<=m2; i++){
            sum+=i;
        }
        mv.addObject("sum",sum);
        mv.setViewName("test4");
        return mv;
    }








}


