package me.eminem.demoRSO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {
    @Autowired
    private StorageService imeServica;


    @GetMapping(path="/test")
    public String test(){
        return imeServica.getKurc();
    }
}
