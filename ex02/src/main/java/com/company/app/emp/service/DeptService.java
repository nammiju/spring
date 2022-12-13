package com.company.app.emp.service;

import java.util.List;

public interface DeptService {
	// 전체조회
	List<DeptVO> getDeptAll();
	// 단건조회
	// 등록
	int insertDept(DeptVO vo);
	// 수정
	// 삭제
}
