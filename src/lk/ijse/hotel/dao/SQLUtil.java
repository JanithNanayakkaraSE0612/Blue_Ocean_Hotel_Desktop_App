package lk.ijse.hotel.dao;

public interface SQLUtil <T> extends SuperDAO{
    boolean save(T entity);
    boolean update(T entity);
    boolean delete(T entity);
}
