package co.yedam.prjt.emp.service;

import java.util.List;

import co.yedam.prjt.common.Paging;

public interface EmpService {
	// 전체조회
	List<EmpVO> getEmpAll(EmpVO vo, Paging paging);
	// 단건조회
	EmpVO getEmp(String id);
	// 등록
	int insertEmp(EmpVO vo);
	// 수정
	int updateName(EmpVO vo);
	int updateEmp(EmpVO vo);
	// 삭제
	int deleteEmp(String id);
}
