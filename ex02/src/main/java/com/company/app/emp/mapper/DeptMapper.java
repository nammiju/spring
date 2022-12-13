package com.company.app.emp.mapper;

import java.util.List;

import com.company.app.emp.service.DeptVO;

public interface DeptMapper {
	// 전체조회
		List<DeptVO> getDeptAll();
		// 단건조회
		// 등록
		int insertDept(DeptVO vo);
		// 수정
		// 삭제
}
