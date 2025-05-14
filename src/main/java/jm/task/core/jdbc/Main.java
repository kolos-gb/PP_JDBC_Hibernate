package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        Util.getSessionFactory();
        UserDao userDao = new UserDaoHibernateImpl();

        userDao.createUsersTable();

        userDao.saveUser("Name1", "LastName1", (byte) 21);
        userDao.saveUser("Name2", "LastName2", (byte) 22);
        userDao.saveUser("Name3", "LastName3", (byte) 33);
        userDao.saveUser("Name4", "LastName4", (byte) 34);

//        userDao.removeUserById(1);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        System.out.println(userDao.getAllUsers());
//        userDao.dropUsersTable();
    }
}
