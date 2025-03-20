package org.zerock.board.mapper;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.board.dto.PageRequestDTO;

import lombok.extern.log4j.Log4j2;

@ExtendWith(SpringExtension.class)
@Log4j2
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperTests {

	@Autowired(required = false)
	BoardMapper mapper;

	@Test
	public void testTime() {
		
		log.info("--------------");
		log.info(mapper.getTime());
	}
	
	@Test
	public void testDynamic() {
		
		PageRequestDTO requestDTO = new PageRequestDTO();
		requestDTO.setKeyword("12345");
		requestDTO.setType("TC");
		requestDTO.setPage(1);
	
		mapper.list(requestDTO).forEach(dto -> log.info(dto));
		
	}
	
	
}









