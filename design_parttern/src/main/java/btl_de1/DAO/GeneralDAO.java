package btl_de1.DAO;

import java.util.List;

public interface GeneralDAO<T> {
    List<T> get();
    List<T> getByName(String name);
    T findId(String id);
    boolean add(T entity);
    boolean edit(T entity,int index);
    boolean remove(T entity);
}
