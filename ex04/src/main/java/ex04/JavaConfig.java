package ex04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration // ������������ �˷���
public class JavaConfig {
	
	@Bean  // �����̳ʿ� �� �����.
	//@Scope("prototype") // ���� Ÿ���� ��ü�� ������ ������ �� ���� ���ο� ��ü�� �����Ǵ� ��
	@Scope("singleton")
	@Lazy // ��û�� ������ ������, ������ ��ó���� ��ŸƮ�Ҷ� ��� ��ü�� ��ĵ�ϱ⶧���� ������ 
	public BoardService boardService() {
		return new BoardServiceImpl();
	}
}
