package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sekta.platform.core.entity.Grade;
import sekta.platform.core.entity.User;
import sekta.platform.core.service.GradeService;
import sekta.platform.core.service.UserService;

import java.time.LocalDate;


@Controller
@RequestMapping("grades")
public class GradeController {
    @Autowired
    private GradeService gradeService;

    @Autowired
    private UserService userService;


    @RequestMapping("")
    public String showAll(ModelMap model){
        model.addAttribute("grades", gradeService.getAllGrades());
        model.addAttribute("users", userService.getAllUsers());
        return "grades/grade-list";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String createGrade(@RequestParam("userId") Long userId,
                              @RequestParam("grade") Integer gradeValue,
                              @RequestParam("comment") String comment,
                              RedirectAttributes redirectAttributes){
        Grade grade = new Grade();

        User user = new User();
        user.setUserId(userId);
        grade.setUser(user);

        grade.setGrade(gradeValue);
        grade.setComment(comment);
        grade.setDate(LocalDate.now());
        gradeService.createGrade(grade);
        redirectAttributes.addFlashAttribute("message", "Grade successfully added!");
        return "redirect:/grades";
    }


    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String delete(@RequestParam("id") Long id, RedirectAttributes redirectAttributes){
        gradeService.deleteGrade(id);
        redirectAttributes.addFlashAttribute("message", "Grade successfully deleted!");
        return "redirect:/grades";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public String editUser(@PathVariable("id") Long id, ModelMap model){
        Grade grade = gradeService.getGradeById(id);
        model.addAttribute(grade);
        return "grades/grade-edit";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String updateGrade(@RequestParam("id") Long id,
                              @RequestParam("grade") Integer gradeValue,
                              @RequestParam("comment") String comment,
                              RedirectAttributes redirectAttributes){
        Grade grade = gradeService.getGradeById(id);

        grade.setGrade(gradeValue);
        grade.setComment(comment);
        gradeService.updateGrade(grade);
        redirectAttributes.addFlashAttribute("message", "Grade successfully edited!");
        return "redirect:/grades";
    }

}
