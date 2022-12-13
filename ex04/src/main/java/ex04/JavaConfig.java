package ex04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration // 설정파일임을 알려줌
public class JavaConfig {
	
	@Bean  // 컨테이너에 빈 등록함.
	//@Scope("prototype") // 같은 타입의 객체를 여러개 생성할 시 각각 새로운 객체가 생성되는 것
	@Scope("singleton")
	@Lazy // 요청이 들어오면 실행함, 없으면 맨처음에 스타트할때 모든 객체를 스캔하기때문에 느려짐 
	public BoardService boardService() {
		return new BoardServiceImpl();
	}
}
