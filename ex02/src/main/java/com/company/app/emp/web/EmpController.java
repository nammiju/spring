package com.company.app.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.app.common.Paging;
import com.company.app.emp.service.EmpService;
import com.company.app.emp.service.EmpVO;

@Controller // @Controller���: @Component �����̳ʿ� �� ���, ������ ȣ���� �� �ֵ��� Ŀ�ǵ�ȭ
			// ������.
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpService empService;

	// 전체조회
	@RequestMapping("/empSelectAll")
	public String empSelectAll(Model model, EmpVO vo, Paging paging) { // page건수 넘어옴
		paging.setPageUnit(3);
		model.addAttribute("emps", empService.getEmpAll(vo, paging));
		return "user/emp/empSelect"; // ����������
	}

	// �ܰ���ȸ
	@RequestMapping("/empSelect")
	public String empSelect(Model model, String id) {
		model.addAttribute("emp", empService.getEmp(id));
		return "user/emp/emp";
	}
}
