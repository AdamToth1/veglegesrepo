package hu.nye.prog.phonecatalog.service;

import java.util.List;
import hu.nye.prog.phonecatalog.data.model.phone;
/**
 * TODO.
 */
public interface phoneService {
    //CRUD
    phone createPhone (phone  phone);

    phone retrievePhoneByid(Long id);

    List<phone> retrieveAllPhone();


    phone update(phone phone);

    void deletePhoneById(Long id);



}
