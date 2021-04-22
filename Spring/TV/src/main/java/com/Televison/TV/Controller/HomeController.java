package com.Televison.TV.Controller;

import com.Televison.TV.Bean.TV;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {
    @Autowired
    private TV tivi;
    @ResponseBody
    @GetMapping(value = "/haha", produces = MediaType.TEXT_HTML_VALUE)
    public String getTivi(){
        return tivi.toString();
    }
    
}
