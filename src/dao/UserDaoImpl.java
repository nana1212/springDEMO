package dao;

import model.User;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Bo on 2016/1/30.
 */
public class UserDaoImpl extends org.springframework.orm.hibernate4.support.HibernateDaoSupport implements UserDao {


    @Override
    public void addUser(User user) {
        Session session=getSessionFactory().getCurrentSession();
        Transaction trans=session.beginTransaction();
        session.save(user);
        trans.commit();
    }
}
