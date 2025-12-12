package kr.co.bnk.board.controller;

import kr.co.bnk.board.dto.BoardRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class CrudController {

    @PostMapping
    public void create(
            @RequestBody BoardRequest boardRequest
            ){

    }
}
