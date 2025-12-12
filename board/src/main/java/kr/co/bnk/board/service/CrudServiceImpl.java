package kr.co.bnk.board.service;

import kr.co.bnk.board.dto.BoardRequest;
import kr.co.bnk.board.dto.BoardResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrudServiceImpl implements CrudService{

    private final BoardRequest boardRepository;

    @Override
    public void create(BoardRequest boardRequest) {
        BoardEntity boardEntity = requestToEntity(boardRequest);
        boardRepository.save(boardEntity);

    }

    @Override
    public void read() {

    }

    @Override
    public List<BoardResponse> reads() {
        List<BoardEntity> boardEntityList = (List<BoardEntity>) boardRepository.findAll();
        boardEntityList.stream()
    }

    @Override
    public void fix() {

    }

    @Override
    public void delete() {

    }
}
