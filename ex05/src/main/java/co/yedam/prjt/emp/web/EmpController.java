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

import co.yedam.prjt.common.Paging;
import co.yedam.prjt.emp.mapper.EmpMapper;
import co.yedam.prjt.emp.service.EmpService;
import co.yedam.prjt.emp.service.EmpVO;

@Controller
@RequestMapping("/emp")
public class EmpController {
	@Autowired
	EmpService empService;
	@Autowired EmpMapper mapper;
	
	// 등록 페이지 이동
	@GetMapping("/insert")
	public void insert(Model model) {
		model.addAttribute("jobs", mapper.getJobs());
	}
	// 등록 처리
	@PostMapping("/insert") // 메서드만 다르게 해주면 같은 url을 쓸 수 있다.
	public String insertProc(EmpVO vo, RedirectAttributes rttr) {
		empService.insertEmp(vo);
		rttr.addAttribute("page", 2);
		rttr.addAttribute("search", "dddd");
		rttr.addFlashAttribute("result", "등록처리완료"); //true
		return "redirect:/emp/list";
	}
	
	
	// 수정 페이지 이동
	@GetMapping("/update")
	public String update(Model model, @RequestParam String id) {
		model.addAttribute("emp", empService.getEmp(id));
		// 단건조회에서 결과를 가져와서 수정
		return "emp/update";
	}
	//수정처리
	@PostMapping("/update")
	public String updateProc(EmpVO vo, RedirectAttributes rttr) {
		empService.updateEmp(vo);
//		log.info(vo);
		rttr.addFlashAttribute("result", "수정완료"); //true
		return "redirect:/emp/list";
	}
	// 삭제처리
	@GetMapping("/delete")
	public String delete(@RequestParam String id, RedirectAttributes rttr) {
		empService.deleteEmp(id);
		rttr.addFlashAttribute("result", "삭제완료");
		return "redirect:/emp/list";
	}
	
	// 전체조회 페이지
	@GetMapping("/list")
	public ModelAndView list(EmpVO vo, Paging paging) {
		ModelAndView mv = new ModelAndView("/emp/list");
		mv.setViewName("emp/list");
		mv.addObject("emps", empService.getEmpAll(vo, paging));
		return mv;
	}

	// 단건조회 페이지
	@GetMapping("/select")
	public String select(Model model, @RequestParam String id) {
		model.addAttribute("emp", empService.getEmp(id));
		return "emp/select";
	}
}
