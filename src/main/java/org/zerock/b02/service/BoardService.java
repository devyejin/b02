package org.zerock.b02.service;

import org.springframework.stereotype.Service;
import org.zerock.b02.dto.BoardDTO;

public interface BoardService {

    Long register(BoardDTO boardDTO);

    BoardDTO readOne(Long bno);

    void modify(BoardDTO boardDTO);

    void remove(Long bno);
}
