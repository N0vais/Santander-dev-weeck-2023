package dan.nov17.santander_project_desafio.service;

import java.util.List;

public class CrudService {
    List<T> findAll();
    T findById(ID id);
    T create(T entity);
    T update(ID id, T entity);
    void delete(ID id);
}