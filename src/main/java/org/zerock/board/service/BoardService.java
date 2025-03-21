package org.zerock.board.service;

import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;
import org.zerock.board.dto.PageResponseDTO;

public interface BoardService {

	PageResponseDTO<BoardDTO> list(PageRequestDTO requestDTO);
	
	//새로운 게시물이 몇번인지 
	Integer add(BoardDTO dto);
	
	BoardDTO getOne(Integer bno);
}
