package web.mvc.cicd02_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String index(){
        return "깃헙액션스 TEST- 도커컴포즈 허브ㅇㄹㄴㅇ ㅇㅇ~~appddication.dd...";
    }
}
