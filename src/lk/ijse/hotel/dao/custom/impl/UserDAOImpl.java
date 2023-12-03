package lk.ijse.hotel.dao.custom.impl;

import lk.ijse.hotel.dao.custom.UserDAO;
import lk.ijse.hotel.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAOImpl implements UserDAO {
    @Override
    public boolean save(User entity) {
      return false;
    }

    @Override
    public boolean update(User entity) {
        return false;
    }

    @Override
    public boolean delete(User entity) {
        return false;
    }

    @Override
    public User get(String userName) {
        return null;
    }
}
