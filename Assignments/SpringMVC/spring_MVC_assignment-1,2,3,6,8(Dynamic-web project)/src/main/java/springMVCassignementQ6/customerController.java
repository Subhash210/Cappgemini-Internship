package springMVCassignementQ6;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class customerController {

	@RequestMapping("/registration.html")
	public ModelAndView registrationForm() {
		ModelAndView modelAndView = new ModelAndView("registration");
		return modelAndView;

	}

	@RequestMapping("/validation.html")
	public ModelAndView formValidation(@Valid @ModelAttribute("customer") customer customer1,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("inside");
			ModelAndView modelAndView = new ModelAndView("registration");
			return modelAndView;
		}
		ModelAndView modelAndView = new ModelAndView("test");
		modelAndView.addObject("msg", customer1);
		return modelAndView;
	}
}