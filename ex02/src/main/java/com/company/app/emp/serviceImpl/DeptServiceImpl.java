package com.company.app.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.app.emp.mapper.DeptMapper;
import com.company.app.emp.service.DeptService;
import com.company.app.emp.service.DeptVO;

@Component
public class DeptServiceImpl implements DeptService {
@Autowired DeptMapper mapper;
		
	@Override
	public List<DeptVO> getDeptAll() {
		// 전체조회
		return mapper.getDeptAll();
	}

	@Override
	public int insertDept(DeptVO vo) {
		// 등록
		return mapper.insertDept(vo);
	}
}
