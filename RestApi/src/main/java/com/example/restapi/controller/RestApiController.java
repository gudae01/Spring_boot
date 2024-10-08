package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {

    //"http://localhost:8080/api/hello"
    @GetMapping("/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(
            @PathVariable(name = "message") String msg,
            @PathVariable int age,
            @PathVariable boolean isMan
    ) {
        System.out.println("echo: " + msg);
        System.out.println("echo: " + age);
        System.out.println("echo: " + isMan);

        return msg.toUpperCase();
    }

    @GetMapping("/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear,
            @RequestParam(name = "issued-month") String issuedMonth,
            @RequestParam String issued_day
    ){
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issued_day);


    }

    @GetMapping("/book2")
    public void queryParamDto(BookQueryParam bookQueryParam){

        System.out.println(bookQueryParam);

    }

    @DeleteMapping(path = {"/user/{userName}/delete/", "/user/{userName}/del"})
    public void delete(@PathVariable String userName) {
        log.info("user-name : {}",userName);

    }
}