package springMVCassignmentQ1and2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class simpleInterestController {

	@RequestMapping(value = "/si", method = RequestMethod.GET)
	protected ModelAndView index() {
		ModelAndView mode1 = new ModelAndView("simpleInterest");
		return mode1;
	}

	@RequestMapping(value = "/siresult", method = RequestMethod.POST)
	protected ModelAndView helloworld(@ModelAttribute("result1") siInput result1) {
		ModelAndView mode1 = new ModelAndView("siResult");
		mode1.addObject("msg", result1.getOutput());
		return mode1;
	}

}
