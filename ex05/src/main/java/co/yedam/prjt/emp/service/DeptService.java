package co.yedam.prjt.emp.service;

import java.util.List;

public interface DeptService {
	// 전체목록
	List<DeptVO> getDeptAll(EmpVO vo);
	// 단건조회
	DeptVO getDept(String id);
	// 등록
	int insertDept(DeptVO vo);
	// 수정
	int updateDept(DeptVO vo);
	// 삭제
	int deleteDept(String id);
}
