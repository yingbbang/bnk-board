package kr.co.bnk.board.service;

import kr.co.bnk.board.dto.BoardRequest;
import kr.co.bnk.board.dto.BoardResponse;
import kr.co.bnk.board.entity.BoardEntity;
import java.util.List;

public interface CrudService {

    void create(BoardRequest boardRequest);
    void read();
    List<BoardResponse> reads();
    void fix();
    void delete();


    default BoardEntity requestToEntity(BoardRequest boardRequest){
        return BoardEntity.builder()
                .title(boardRequest.title())
                .content(boardRequest.content())
                .name(boardRequest.name())
                .build();
    }

    default BoardRequest entityToResponse(){

    }
}
