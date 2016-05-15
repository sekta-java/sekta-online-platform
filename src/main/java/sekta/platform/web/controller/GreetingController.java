package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String greeting(Model model, @RequestParam(value = "name", required = false) String paramName) {

        if(paramName == null) {
            paramName = "World";
        }

        if (paramName.equals("")) {
            return "redirect:/";
        }

        model.addAttribute("name", paramName);

        return "main";
    }
}
