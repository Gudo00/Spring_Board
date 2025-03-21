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

	@Override
	public Integer add(BoardDTO dto) {

		// They Not Like Us
		String str = "Say, Drake, I hear you like 'em young "
				+ "You better not ever go to cell block one "
				+ "To any bixxx that talk to him and they in love "
				+ "Just make sure you hide your lil' sister from him";
		
		mapper.insertA(str);
		mapper.insertB(str);
		
		int count = mapper.insert(dto);
	
		log.info("Count: " + count);
		log.info("BNO: " + dto.getBno());
		

		return dto.getBno();
	}

	@Override
	public BoardDTO getOne(Integer bno) {

		return mapper.selectOne(bno);
	}

}










