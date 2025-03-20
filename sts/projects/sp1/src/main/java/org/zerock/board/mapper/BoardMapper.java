package org.zerock.board.mapper;

import java.util.List;

import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;

public interface BoardMapper {

	String getTime();
	
	List<BoardDTO> list(PageRequestDTO requestDTO);
	
	int listCount(PageRequestDTO requestDTO);
	
}








