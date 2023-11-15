package lk.ijse.hotel.dao.custom;

import lk.ijse.hotel.dao.SQLUtil;
import lk.ijse.hotel.entity.User;

public interface UserDAO extends SQLUtil<User> {
    User get(String userName);
}
