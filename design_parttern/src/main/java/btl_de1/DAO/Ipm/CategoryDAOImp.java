package btl_de1.DAO.Ipm;

import btl_de1.Category;
import btl_de1.DAO.GeneralDAO;

import java.util.ArrayList;
import java.util.List;

public class CategoryDAOImp implements GeneralDAO<Category> {
    private List<Category> data;
    private static final CategoryDAOImp instance = new CategoryDAOImp();

    private CategoryDAOImp() {
        data = new ArrayList<Category>();
    }

    public static CategoryDAOImp getInstance(){
        return instance;
    }

    @Override
    public List<Category> get() {
        return data;
    }

    @Override
    public List<Category> getByName(String name) {

        List<Category> getByName = new ArrayList<>();
        for (int i =0;i<data.size();i++){
            if(data.get(i).getName().equalsIgnoreCase(name)){
                getByName.add(data.get(i));
            }
        }
        return getByName;
    }

    @Override
    public Category findId(String id) {

        int index = 0;
        for (int i =0;i<data.size();i++){
            if(data.get(i).getName().equalsIgnoreCase(id)){
                index=i;
            }
        }
        return data.get(index);
    }

    @Override
    public boolean add(Category entity) {

        boolean bl =false;
        int i = data.size();
        data.add(entity);
        if(data.size()>i){
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean edit(Category entity,int index) {
        boolean bl =false;
        int i = data.size();
        data.set(index,entity);
        if(data.size()==i){
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean remove(Category entity) {

        boolean bl =false;
        int i = data.size();
        data.remove(entity);
        if(data.size()<i){
            bl = true;
        }
        return bl;
    }
}
