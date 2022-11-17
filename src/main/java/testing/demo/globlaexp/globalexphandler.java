package testing.demo.globlaexp;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import testing.demo.exception.ActorNotFoundException;

@ControllerAdvice
public class globalexphandler {

	@ExceptionHandler
	@ResponseStatus(code  = HttpStatus.NOT_FOUND, reason = "Some parameters are invalid")
	void onIllegalArgumentException(ActorNotFoundException exception) {
		
	}
	
	
}
