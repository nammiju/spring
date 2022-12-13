package ex04;

import org.springframework.stereotype.Component;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

@Component
@Log4j
public class AppleSpeaker implements Speaker{
	public void volumnUp() {
		log.info("Apple vulumn Up~!");
	}

}
