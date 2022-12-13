package co.yedam.prjt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.yedam.prjt.emp.mapper.EmpMapper;
import co.yedam.prjt.emp.service.EmpVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/*-context.xml")
@Log4j
public class JacksonClient {
	@Autowired EmpMapper empMapper;
	
	//@Test
	public void test2() throws JsonMappingException, JsonProcessingException {
		String str = "{\"employeeId\":\"100\",\"firstName\":\"홍길동\",\"lastName\":\"King\",\"email\":\"SKING\",\"hireDate\":866473200000,\"jobId\":\"AD_PRES\",\"departmentId\":\"90\",\"salary\":\"24000\",\"employeeIds\":null,\"first\":1,\"last\":10}";
		ObjectMapper om = new ObjectMapper();
		EmpVO vo = om.readValue(str, EmpVO.class); //readValue: 자스에서 JSON.parse()랑 같은 의미
		log.info(vo.getEmployeeId());
	}
	
	@Test
	public void test1() throws JsonProcessingException {
		EmpVO vo = empMapper.getEmp("100");
		log.info(vo);
		ObjectMapper om = new ObjectMapper();
		String result = om.writeValueAsString(vo);
		log.info(result);
	}
}
