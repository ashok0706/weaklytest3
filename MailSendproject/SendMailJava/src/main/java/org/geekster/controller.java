package org.geekster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
	
	@Autowired
	MailConstants mailConstants;
	
	@GetMapping("/get")
	public String getting(  ) {
		
		return mailConstants.toString();
	}

}
