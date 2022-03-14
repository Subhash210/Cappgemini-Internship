package springboot;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@RequestMapping("/registration")
	public String registrationForm() {
		// ModelAndView modelAndView = new ModelAndView("registration1");
		return "registration1";

	}

	@RequestMapping(value = "/validation.html", method = RequestMethod.POST)
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