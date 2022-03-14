package springMVCassignmentQ3;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userController {
	@RequestMapping(value = "/login.html", method = RequestMethod.GET)
	protected ModelAndView input() {
		ModelAndView mode1 = new ModelAndView("login");
		return mode1;
	}

	@RequestMapping(value = "/output", method = RequestMethod.POST)
	protected ModelAndView output(@Valid @ModelAttribute("user1") user user1, BindingResult result) {
		if (result.hasErrors()) {
			ModelAndView mode1 = new ModelAndView("error");
			return mode1;
		}
		ModelAndView mode2 = new ModelAndView("success");
		return mode2;
	}

}
