package actions;

import com.opensymphony.xwork2.ActionSupport;
import model.User;
import service.UserService;
import service.UserServiceImpl;

/**
 * Created by Bo on 2016/1/30.
 */
public class UserAction extends ActionSupport {
    private UserService userService = new UserServiceImpl();

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public String addUser(){
        userService.addUser(user);
        return SUCCESS;
    }
}
