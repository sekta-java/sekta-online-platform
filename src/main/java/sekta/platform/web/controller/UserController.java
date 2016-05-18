package sekta.platform.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String showMenu(){
        return "user-menu";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    public String createUser(@RequestParam("userName") String userName){
        User user = new User();
        user.setUserName(userName);
        userService.createUser(user);
        return "new-user";
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
}
