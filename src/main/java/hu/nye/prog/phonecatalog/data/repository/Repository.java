package hu.nye.prog.phonecatalog.data.repository;

import java.util.List;

/**
 *
 *TODO.
 */
public interface Repository<T, ID> {

    //CRUD
    T save(T item);

    T getById(ID id);

    List<T> getAll();


    T update(T item);

    void deleteById(ID id);

}
