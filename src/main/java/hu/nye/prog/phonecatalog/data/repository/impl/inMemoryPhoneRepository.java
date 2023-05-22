package hu.nye.prog.phonecatalog.data.repository.impl;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import hu.nye.prog.phonecatalog.data.model.phone;
import hu.nye.prog.phonecatalog.data.repository.Repository;

/**
 * TODO.
 */
@org.springframework.stereotype.Repository
public class inMemoryPhoneRepository implements Repository<phone, Long>  {

private static final Map<Long,phone> STORAGE =new LinkedHashMap<Long,phone>();

    @Override
    public phone save(phone phone) {
   Long id=STORAGE.size() + 1L;
   phone.setId(id);
   STORAGE.put(id, phone);
        return STORAGE.get(id);
    }

    @Override
    public phone getById(Long id) {
        return STORAGE.get(id);
    }

    @Override
    public List<phone> getAll() {
        return STORAGE.values().stream().collect(Collectors.toList());
    }

    @Override
    public phone update(phone phone) {
       Long id= phone.getId();
       STORAGE.put(id, phone);
        return STORAGE.get(id);
    }

    @Override
    public void deleteById(Long id) {
STORAGE.remove(id);
    }
}
