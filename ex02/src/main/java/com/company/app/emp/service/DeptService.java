package com.company.app.emp.service;

import java.util.List;

public interface DeptService {
	// ��ü��ȸ
	List<DeptVO> getDeptAll();
	// �ܰ���ȸ
	// ���
	int insertDept(DeptVO vo);
	// ����
	// ����
}
