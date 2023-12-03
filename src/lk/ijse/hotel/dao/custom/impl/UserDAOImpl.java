package lk.ijse.hotel.dao.custom.impl;

import lk.ijse.hotel.dao.custom.UserDAO;
import lk.ijse.hotel.entity.User;
import lk.ijse.hotel.util.CrudUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAO {
    @Override
    public ArrayList<User> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(User entity) throws SQLException, ClassNotFoundException {

        String sql = " insert into user vales (?,?)";
        return CrudUtil.execute(sql,entity.getUserName(),entity.getPassword());
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
    public User search(String id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public User get(String userName) {
        return null;
    }
}
