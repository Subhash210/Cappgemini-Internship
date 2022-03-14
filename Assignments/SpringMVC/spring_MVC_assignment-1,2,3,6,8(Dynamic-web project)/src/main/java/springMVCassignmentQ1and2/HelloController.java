package springMVCassignmentQ1and2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	protected ModelAndView index() {
		ModelAndView mode1 = new ModelAndView("index");
		return mode1;
	}

	@RequestMapping(value = "/helloWorld", method = RequestMethod.POST)
	protected ModelAndView helloworld() {
		ModelAndView mode1 = new ModelAndView("helloWorld");
		return mode1;
	}
}
