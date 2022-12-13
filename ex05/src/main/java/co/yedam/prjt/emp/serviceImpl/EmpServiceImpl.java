package co.yedam.prjt.emp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.yedam.prjt.common.Paging;
import co.yedam.prjt.emp.mapper.EmpMapper;
import co.yedam.prjt.emp.service.EmpService;
import co.yedam.prjt.emp.service.EmpVO;

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
	public int updateEmp(EmpVO vo) {
		// 수정
		return empMapper.updateEmp(vo);
	}

}
