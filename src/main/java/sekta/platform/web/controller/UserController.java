package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sekta.platform.core.entity.User;
import sekta.platform.core.service.UserService;

/**
 * Created by natad on 18.05.2016.
 */
@Controller
@RequestMapping("users")
public class UserController {
    public static final String PATH_VARIABLE_USER_ID = "user_id";

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String showAll(ModelMap model){
        model.addAttribute("users", userService.getAllUsers());
        return "users/user-list";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String createUser(@ModelAttribute(value = "user") User user,
                             RedirectAttributes redirectAttributes){
        userService.createUser(user);
        redirectAttributes.addFlashAttribute("message", "User successfully created!");
        return "redirect:/users";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String showCreationForm(){
        return "new-user";
    }


    @RequestMapping(value = "{" + PATH_VARIABLE_USER_ID + "}/delete", method = RequestMethod.POST)
    public String delete(@PathVariable(PATH_VARIABLE_USER_ID) Long userId, RedirectAttributes redirectAttributes){
        User user = userService.getUserById(userId);
        userService.deleteUser(userId);
        redirectAttributes.addFlashAttribute("message", user.getUserName() + " has successfully deleted!");
        return "redirect:/users";
    }

    @RequestMapping(value = "{" + PATH_VARIABLE_USER_ID + "}/edit", method = RequestMethod.GET)
    public String editUser(@PathVariable(PATH_VARIABLE_USER_ID) Long userId, ModelMap model){
        User user = userService.getUserById(userId);
        model.addAttribute(user);
        return "users/user-edit";
    }

    @RequestMapping(value = "edit", method = RequestMethod.POST)
    public String updateUser(@ModelAttribute User user,
                             RedirectAttributes redirectAttributes){
        userService.updateUser(user);
        redirectAttributes.addFlashAttribute("message", "User successfully edited!");
        return "redirect:/users";
    }
}
