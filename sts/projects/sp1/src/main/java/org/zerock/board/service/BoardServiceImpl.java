package org.zerock.board.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;
import org.zerock.board.dto.PageResponseDTO;
import org.zerock.board.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@RequiredArgsConstructor
@Log4j2
@Transactional
public class BoardServiceImpl implements BoardService{
	
	private final BoardMapper mapper;

	@Override
	public PageResponseDTO<BoardDTO> list(PageRequestDTO requestDTO) {
		
		List<BoardDTO> dtoList = mapper.list(requestDTO);
		int count = mapper.listCount(requestDTO);
		
		return PageResponseDTO.<BoardDTO>withAll()
				.dtoList(dtoList)
				.total(count)
				.pageRequestDTO(requestDTO)
				.build();
	}

}
