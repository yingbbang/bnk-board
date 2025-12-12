package kr.co.bnk.board.controller;

import kr.co.bnk.board.dto.BoardRequest;
import kr.co.bnk.board.dto.BoardResponse;
import kr.co.bnk.board.service.CrudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CrudController {

    private final CrudService crudService;

    @PostMapping("/create")
    public void create(
            @RequestBody BoardRequest boardRequest
    ) {

        crudService.create(boardRequest);

    }

    @GetMapping("/board")
    public List<BoardResponse> readBoards(){
        crudService.read();
    }
}


