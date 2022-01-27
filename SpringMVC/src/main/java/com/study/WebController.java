
 
package com.study;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
	@GetMapping("/greet")
	public String greet()
	{
		System.out.println("\n\ngreetcalled");
		return "hello";
	}
}
