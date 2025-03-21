package org.zerock.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.zerock.board.dto.BoardDTO;
import org.zerock.board.dto.PageRequestDTO;

public interface BoardMapper {

	String getTime();
	
	List<BoardDTO> list(PageRequestDTO requestDTO);
	
	int listCount(PageRequestDTO requestDTO);

	int insert(BoardDTO dto);
	
	BoardDTO selectOne(Integer bno);
	
	 @Insert("insert into tbl_testA (col1) values (#{str})")
   	int insertA ( @Param("str") String str);
   	
   	@Insert("insert into tbl_testB (col2) values (#{str})")
   	int insertB( @Param("str") String str);
	
}








