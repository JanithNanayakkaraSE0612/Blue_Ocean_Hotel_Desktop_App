package lk.ijse.hotel.dao;

import lk.ijse.hotel.dao.custom.impl.UserDAOImpl;

public class DAOFactory {
        private static  DAOFactory daoFactory;

    private DAOFactory() {
    }
    public static DAOFactory getInstance(){
        return daoFactory == null ? daoFactory = new DAOFactory():daoFactory;
    }
    public SuperDAO getDAOType(lk.ijse.hotel.dao.DAOType daoType){
        switch (daoType){
            case USER:return  new UserDAOImpl();
            default:
                return null;
        }
    }
}
