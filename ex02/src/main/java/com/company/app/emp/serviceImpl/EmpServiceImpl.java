package com.company.app.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.app.common.Paging;
import com.company.app.emp.mapper.EmpMapper;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

//@Component // �� ���
@Service //@Service ���: �� ���, Ʈ����� ó�� 
public class EmpServiceImpl implements EmpService {
	@Autowired
	EmpMapper empMapper;

	@Override
	public List<EmpVO> getEmpAll(EmpVO vo, Paging paging) {
		// 전체조회
		paging.setTotalRecord(empMapper.count(vo)); // first, last
		vo.setFirst(paging.getFirst());
		vo.setLast(paging.getLast());
		return empMapper.getEmpAll(vo);
	}

	@Override
	public EmpVO getEmp(String id) {
		// �ܰ���ȸ
		return empMapper.getEmp(id);
	}

	@Override
	public int insertEmp(EmpVO vo) {
		// ���
		return empMapper.insertEmp(vo);
	}

	@Override
	public int updateName(EmpVO vo) {
		// ����
		return empMapper.updateName(vo);
	}

	@Override
	public int deleteEmp(String id) {
		// ����
		// �����ȣ 100���� ����� ������ ���� �� ��ȣ�� �ٸ� ���̺��� fk�� ���̸� ������ �� �� ����.
		// �Ŵ������� Ȯ�� int��
		if (empMapper.getManagerCheck(id) == 0) {
			// �ƴϸ� ����
			return empMapper.deleteEmp(id);
		}
		else {
			return 0;
		}
	}

	@Override
	public int addData(String data) {
		empMapper.insertCol1(data);
		empMapper.insertCol2(data);
		return 0;
	}

}
