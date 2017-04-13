package ua.goit.offline.crud_spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import ua.goit.offline.crud_spring.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Вадим on 10.04.2017.
 */

@Controller
@RequestMapping("/users")
public class UsersController {

//    @GetMapping(value = "/hello")
//    public ResponseEntity<String> sayHello(@RequestParam("name") String name){
//
//        return ResponseEntity.status(HttpStatus.OK)
//                .body("Hello from: " + name);
//    }

//    @GetMapping("/hello")
//    public ModelAndView sayHello(@RequestParam("name") String name){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("name", name );
//        modelAndView.addObject("array", Arrays.asList(1,2,5,4));
//        modelAndView.setViewName("users");
//        return modelAndView;
//    }

    @GetMapping("/hello")
    public ModelAndView sayHello(@RequestParam("name") String name){

        List<User> list = new ArrayList<User>();
        for (int i = 0; i <5; i++){
            list.add(new User("User" + i, i*5));
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userslist", list);
        modelAndView.addObject("name", name );
        modelAndView.addObject("array", Arrays.asList(1,2,5,4));
        modelAndView.setViewName("users");
        return modelAndView;
    }


}
