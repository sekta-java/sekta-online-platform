package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import sekta.platform.core.entity.User;
import sekta.platform.core.service.UserService;

/**
 * Created by natad on 18.05.2016.
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String showAll(ModelMap model){
        model.addAttribute("users", userService.getAllUsers());
        return "user-list";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String createUser(@RequestParam("userName") String userName,
                             @RequestParam("email") String email,
                             @RequestParam("password") String password,
                             RedirectAttributes redirectAttributes){
        User user = new User();
        user.setUserName(userName);
        user.setEmail(email);
        user.setPassword(password);
        userService.createUser(user);
        redirectAttributes.addFlashAttribute("message", "User successfully created!");
        return "redirect:/user/all";
    }

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String showCreationForm(){
        return "new-user";
    }

    @RequestMapping("all")
    public String showAllUsers(ModelMap model){
        model.addAttribute("users", userService.getAllUsers());
        return "user-list";
    }

    @RequestMapping("delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return "redirect:/user/all";
    }
}
