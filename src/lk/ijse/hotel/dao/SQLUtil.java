package lk.ijse.hotel.dao;

import java.sql.SQLException;
import java.util.ArrayList;

public interface SQLUtil <T> extends SuperDAO{
    ArrayList<T> getAll() throws SQLException,ClassNotFoundException;
    boolean save(T entity) throws SQLException,ClassNotFoundException;
    boolean update(T entity)throws SQLException,ClassNotFoundException;
    boolean delete(T entity)throws SQLException,ClassNotFoundException;
    T search(String id)throws SQLException,ClassNotFoundException;
    String generateNewID()throws SQLException,ClassNotFoundException;
}
