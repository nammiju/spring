package com.company.app.emp.mapper;

import java.util.List;

import com.company.app.emp.service.DeptVO;

public interface DeptMapper {
	// ��ü��ȸ
		List<DeptVO> getDeptAll();
		// �ܰ���ȸ
		// ���
		int insertDept(DeptVO vo);
		// ����
		// ����
}
