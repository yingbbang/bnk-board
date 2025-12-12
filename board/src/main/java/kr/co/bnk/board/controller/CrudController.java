package kr.co.bnk.board.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class CrudController {

    @GetMapping("/test")
    public String test() {
        return "ok";
    }
}
