package org.zerock.b02.service;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.b02.dto.BoardDTO;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class BoardServiceImplTest {

    @Autowired
    private BoardService boardService;

    @Test
    void testRegister() {
        log.info("name={}", boardService.getClass().getName());
   //org.zerock.b02.service.BoardServiceImpl$$EnhancerBySpringCGLIB$$835d420d

        //given
        BoardDTO boardDTO = BoardDTO.builder()
                .title("테스트해볼 타이틀입니당")
                .content("테스트해볼 컨텐츠")
                .writer("테스트해볼 유저")
                .build();
        //when
        Long registeredNum = boardService.register(boardDTO);

        //then
        log.info("bno={}",registeredNum);

    }
}