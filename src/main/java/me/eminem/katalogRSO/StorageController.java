package me.eminem.katalogRSO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {


    @GetMapping(path="/katalog")
    public String test(){
        return "Obširna ponudba";
    }
}