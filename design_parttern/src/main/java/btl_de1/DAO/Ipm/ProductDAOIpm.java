package btl_de1.DAO.Ipm;

import btl_de1.DAO.GeneralDAO;
import btl_de1.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOIpm implements GeneralDAO<Product> {
    private List<Product> data = new ArrayList<>();
    private static final ProductDAOIpm instance = new ProductDAOIpm();
    private ProductDAOIpm(){}
    public static ProductDAOIpm getInstance(){
        return instance;
    }

    public List<Product> getData() {
        return data;
    }

    @Override
    public List<Product> get() {
        return data;
    }

    @Override
    public List<Product> getByName(String name) {
        List<Product> getByName = new ArrayList<>();
        for (int i =0;i<data.size();i++){
            if(data.get(i).getName().equalsIgnoreCase(name)){
              getByName.add(data.get(i));
            }
        }
        return getByName;
    }

    @Override
    public Product findId(String id) {
        int index = 0;
        for (int i =0;i<data.size();i++){
            if(data.get(i).getName().equalsIgnoreCase(id)){
                index=i;
            }
        }
        return data.get(index);
    }

    @Override
    public boolean add(Product entity) {
        boolean bl =false;
        int i = data.size();
        data.add(entity);
        if(data.size()>i){
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean edit(Product entity,int index) {
        boolean bl =false;
        int i = data.size();
        data.set(index,entity);
        if(data.size()==i){
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean remove(Product entity) {
        boolean bl =false;
        int i = data.size();
        data.remove(entity);
        if(data.size()<i){
            bl = true;
        }
        return bl;
    }
}
