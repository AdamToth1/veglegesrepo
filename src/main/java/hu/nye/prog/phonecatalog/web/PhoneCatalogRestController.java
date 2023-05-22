package hu.nye.prog.phonecatalog.web;

import java.util.List;

import hu.nye.prog.phonecatalog.data.model.phone;
import hu.nye.prog.phonecatalog.service.phoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/phone")
public class PhoneCatalogRestController {
private final phoneService phoneService;
@Autowired
    public PhoneCatalogRestController(hu.nye.prog.phonecatalog.service.phoneService phoneService) {
        this.phoneService = phoneService;
    }
    @GetMapping("/api/v1/phone")
    public phone getPhoneById(@PathVariable Long id){
    return phoneService.retrievePhoneByid(id);
    }
    @GetMapping
    public List<phone>getAllPhones(){
    return phoneService.retrieveAllPhone();
    }

@PostMapping
    public phone createPhone(@RequestBody phone phone){
return phoneService.createPhone(phone);

}
@PutMapping
    public phone updatePhone(@RequestBody phone phone){
    return  phoneService.update(phone);

}
@DeleteMapping("{id}")
    public void deletePhoneById(@PathVariable Long id){
    phoneService.deletePhoneById(id);
}

}
