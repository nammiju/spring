package co.yedam.prjt.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.yedam.prjt.emp.service.EmpService;
import co.yedam.prjt.emp.service.EmpVO;
import co.yedam.prjt.emp.service.UserListVO;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/test")
@Log4j
public class TestController {
	@Autowired EmpService empService;
	// 등록
	@RequestMapping("/insert")
	public String insert(EmpVO vo) { // 커맨드 객체에 값을 담아줌, 값을 여러개 받을땐 vo를 쓰는게 나음
		log.info(vo);
		return "home";
	}

	@RequestMapping("/params")
	public String params(@RequestParam List<String> employeeIds) {
		log.info(employeeIds);
		return "home";
	}

	// 등록
	// @RequestMapping(path = "/insertList", method = {RequestMethod.GET,
	// RequestMethod.POST})
	@PostMapping
	public String insertList(UserListVO vo) {
		log.info(vo);
		return "home";
	}

	@RequestMapping("/insertListPage") // 뷰페이지로 고고싱
	public String insertListPage() {
		return "empInsertList";
	}

	// 등록
	@RequestMapping("/insertparam")
	public String insertparam(Integer age, // int 타입은 값이 없으면 에러가 나지만, Integer는 null값이 가능해서 에러가 안남
			@RequestParam(name = "name") String firstName, // "name"으로 파라메터를 넘겨도 firstName값으로 알아서 처리해줌
			@RequestParam(required = false, defaultValue = "kim") String lastName) {
		// @RequestParam(생략가능) String firstName = request.getParameter("firstName")\
		// @RequestParam(required = false) 기본값은 true이고 false일땐 값이 안넘겨도 에러가 안뜸
		log.info(firstName);
		log.info(lastName);
		log.info(age);
		return "home";
	}

	// 수정
	// 삭제
	@RequestMapping("/delete")
	public String delete(@RequestParam(name = "userId") String employeeId) { // 값을 하나만 받을땐 @RequestParam 괜춘
		empService.deleteEmp(employeeId);
		return "home";
	}

	// 삭제 @PathVariable 사용
	@RequestMapping("/delete/{id}/{deptid}") // 매개변수명과 경로의 이름이 일치해야한다
	public String deletepath(@PathVariable String id, @PathVariable int deptid) { // 값을 하나만 받을땐 @RequestParam 괜춘
		// empService.deleteEmp(employeeId);
		log.info(id);
		return "home";
	}
	// 조회
}
