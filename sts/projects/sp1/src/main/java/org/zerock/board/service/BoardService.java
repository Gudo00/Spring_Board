package org.zerock.board.service;

import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;
import org.zerock.board.dto.PageResponseDTO;

public interface BoardService {

	PageResponseDTO<BoardDTO> list(PageRequestDTO requestDTO);
	
}
