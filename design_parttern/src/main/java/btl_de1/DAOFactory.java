package btl_de1;

import btl_de1.DAO.DaoType;
import btl_de1.DAO.GeneralDAO;
import btl_de1.DAO.Ipm.CategoryDAOImp;
import btl_de1.DAO.Ipm.ProductDAOIpm;

public class DAOFactory{
    public <T> GeneralDAO<T> getDAO(Class<T> _class){
        try {
            return (GeneralDAO<T>) _class.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
    public GeneralDAO getDAO(DaoType type){
        switch (type){
            case CATEGORY: return CategoryDAOImp.getInstance();
            case PRODUCT: return ProductDAOIpm.getInstance();
            default:return null;
       }
    }
}
