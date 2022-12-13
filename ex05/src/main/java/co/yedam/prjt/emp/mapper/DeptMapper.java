package co.yedam.prjt.emp.mapper;

import java.util.List;
import java.util.Map;

import co.yedam.prjt.emp.service.DeptVO;
import co.yedam.prjt.emp.service.EmpVO;

public interface DeptMapper {
	// 전체조회
	List<DeptVO> getDeptAll(EmpVO vo);
	// 단건조회
	DeptVO getDept(String id);
	// 등록
	int insertDept(DeptVO vo);
	// 수정
	int updateDept(DeptVO vo);
	// 삭제
	int deleteDept(String id);
	
	// 사번만 가져오기
	List<Map<String, Object>> getEmployeeId();
	
	// 위치번호 가져오기
	List<Map<String, Object>> getLocationId();
}
