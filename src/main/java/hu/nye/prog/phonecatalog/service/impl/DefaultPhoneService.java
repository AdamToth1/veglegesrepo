package hu.nye.prog.phonecatalog.service.impl;
import java.util.List;

import hu.nye.prog.phonecatalog.data.model.phone;
import hu.nye.prog.phonecatalog.data.repository.Repository;
import hu.nye.prog.phonecatalog.service.phoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefaultPhoneService implements phoneService {
private final Repository<phone, Long> phoneRepository;
@Autowired
    public DefaultPhoneService(Repository<phone, Long> phoneLongRepository) {
        this.phoneRepository = phoneLongRepository;
    }

    @Override
    public phone createPhone(phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public phone retrievePhoneByid(Long id) {
        return phoneRepository.getById(id);
    }

    @Override
    public List<phone> retrieveAllPhone() {
        return phoneRepository.getAll();
    }

    @Override
    public phone update(phone phone) {
        return phoneRepository.update(phone);
    }

    @Override
    public void deletePhoneById(Long id) {
phoneRepository.deleteById(id);
    }
}
