package com.company.app.users.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.company.app.users.service.UserService;
import com.company.app.users.service.UserVO;

@RestController // @Controller + @ResponsBody
public class UsersController {
	@Autowired UserService userService;
	
	// 등록
	@PostMapping("/users")
	public UserVO insert(UserVO vo) {
		userService.insertUser(vo);
		return vo;
	}
	
	// 수정
	@PutMapping("/users")
	public UserVO update(@RequestBody UserVO vo) {
		userService.updateUser(vo);
		return vo;
	}
	
	// 페이지 이동
	@GetMapping("/userPage")
	public ModelAndView userPage() {
		return new ModelAndView("users");
	}
	
	// 삭제
	@DeleteMapping("/users/{id}")
	public UserVO delete(UserVO vo, @PathVariable String id) {
		vo.setId(id);
		userService.deleteUser(vo);
		return vo;
	}
	
	
	// 단건조회
	@GetMapping("/users/{id}")
	public UserVO user(UserVO vo, @PathVariable String id) {
		vo.setId(id);
		return userService.getUser(vo);
	}
	
	// 전체조회
	@GetMapping("/users")
	public List<UserVO> usersList() {
		return userService.getUserList(null);
	}
}
