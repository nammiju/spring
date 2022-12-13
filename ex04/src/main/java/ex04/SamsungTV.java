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
@NoArgsConstructor // @AllArgsConstructor @NoArgsConstructor 같이 써야지 기본생성자도 생성됨

@Component
@Log4j
public class SamsungTV implements TV {

	//@Setter(onMethod_ = { @Autowired }) // DI인덱션
	@Autowired
	Speaker speaker;

// lombok를 사용하면 생성자를 따로 안만들어도 됨.
//	public SamsungTV() {}
//
//	public SamsungTV(Speaker speaker) {
//		super();
//		this.speaker = speaker;
//	}

	// 위에 @Log4j 써주면 일일히 log 안만들어도 됨
	//Logger log = LogManager.getLogger(SamsungTV.class);
	@Override
	public void on() {
		log.info("samsung tv on"); // sysout대신 log.info사용
		speaker.volumnUp();
	}

}
