package lk.ijse.hotel.bo;

import lk.ijse.hotel.bo.custom.impl.UserBOImpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory(){

    }
    public static BOFactory getBoFactory(){
        return (boFactory==null)? boFactory = new BOFactory():boFactory;
    }
    public SuperBO getBO(BOType type){
        switch (type){
            case USER:
                return new UserBOImpl();
        }
    }
}
