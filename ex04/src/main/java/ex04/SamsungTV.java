package ex04;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Data
@AllArgsConstructor
@NoArgsConstructor // @AllArgsConstructor @NoArgsConstructor ���� ����� �⺻�����ڵ� ������

@Component
@Log4j
public class SamsungTV implements TV {

	//@Setter(onMethod_ = { @Autowired }) // DI�ε���
	@Autowired
	Speaker speaker;

// lombok�� ����ϸ� �����ڸ� ���� �ȸ��� ��.
//	public SamsungTV() {}
//
//	public SamsungTV(Speaker speaker) {
//		super();
//		this.speaker = speaker;
//	}

	// ���� @Log4j ���ָ� ������ log �ȸ��� ��
	//Logger log = LogManager.getLogger(SamsungTV.class);
	@Override
	public void on() {
		log.info("samsung tv on"); // sysout��� log.info���
		speaker.volumnUp();
	}

}
