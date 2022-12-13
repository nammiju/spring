package co.yedam.prjt.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.yedam.prjt.emp.mapper.DeptMapper;
import co.yedam.prjt.emp.service.DeptService;
import co.yedam.prjt.emp.service.DeptVO;
import co.yedam.prjt.emp.service.EmpVO;

@Service
public class DeptServiceImpl implements DeptService{
	@Autowired DeptMapper deptMapper;
	
	@Override
	public List<DeptVO> getDeptAll(EmpVO vo) {
		// 전체조회
		return deptMapper.getDeptAll(vo);
	}

	@Override
	public DeptVO getDept(String id) {
		// 단건조회
		return deptMapper.getDept(id);
	}

	@Override
	public int insertDept(DeptVO vo) {
		// 등록
		return deptMapper.insertDept(vo);
	}

	@Override
	public int updateDept(DeptVO vo) {
		// 수정
		return deptMapper.updateDept(vo);
	}

	@Override
	public int deleteDept(String id) {
		// 삭제
		return deptMapper.deleteDept(id);
	}


}
