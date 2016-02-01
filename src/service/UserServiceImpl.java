package service;

import dao.UserDao;
import dao.UserDaoImpl;
import model.User;

/**
 * Created by Bo on 2016/1/30.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao ;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
         userDao.addUser(user);
    }
}
