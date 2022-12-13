package co.yedam.prjt.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import co.yedam.prjt.emp.mapper.DeptMapper;
import co.yedam.prjt.emp.service.DeptService;
import co.yedam.prjt.emp.service.DeptVO;
import co.yedam.prjt.emp.service.EmpVO;

@Controller
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	DeptService deptService;
	@Autowired
	DeptMapper mapper;

	// 전체조회 페이지
	@GetMapping("/list")
	public ModelAndView list(EmpVO vo) {
		ModelAndView mv = new ModelAndView("/dept/list");
		mv.setViewName("dept/list");
		mv.addObject("depts", deptService.getDeptAll(vo));
		return mv;
	}
	
	// 단건조회 페이지
	@GetMapping("/select")
	public String select(Model model, @RequestParam String id) {
		model.addAttribute("dept", deptService.getDept(id));
		return "dept/select";
	}
	
	// 등록 페이지
	@GetMapping("/insert")
	public void insert(Model model) {
		model.addAttribute("employees", mapper.getEmployeeId());
		model.addAttribute("locations", mapper.getLocationId());
	}

	// 등록 처리
	@PostMapping("/insert")
	public String insertProc(DeptVO vo, RedirectAttributes rttr) {
		deptService.insertDept(vo);
		rttr.addFlashAttribute("result", "등록처리완료");
		return "redirect:/dept/list";
	}

	// 수정 페이지
	@GetMapping("/update")
	public String update(Model model, String id) {
		model.addAttribute("dept", deptService.getDept(id));
		model.addAttribute("employees", mapper.getEmployeeId());
		model.addAttribute("locations", mapper.getLocationId());
		return "dept/update";
	}

	// 수정 처리
	@PostMapping("/update")
	public String updateProc(DeptVO vo, RedirectAttributes rttr) {
		deptService.updateDept(vo);
		rttr.addFlashAttribute("result", "수정완료");
		return "redirect:/dept/list";
	}

	// 삭제 처리
	@GetMapping("/delete")
	public String delete(String id, RedirectAttributes rttr) {
		deptService.deleteDept(id);
		rttr.addFlashAttribute("result", "삭제완료");
		return "redirect:/dept/list";
	}
}
