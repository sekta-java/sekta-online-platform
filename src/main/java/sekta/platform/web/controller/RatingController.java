package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import sekta.platform.core.service.GradeService;
import sekta.platform.core.service.UserService;


@Controller
@RequestMapping("ratings")
public class RatingController {
    @Autowired
    private GradeService gradeService;

    @Autowired
    private UserService userService;


    @RequestMapping("")
    public String showAll(ModelMap model){
        model.addAttribute("grades", gradeService.getAllGrades());
        model.addAttribute("users", userService.getAllUsers());
        return "ratings/rating-list";
    }


}
