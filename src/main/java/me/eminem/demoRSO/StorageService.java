package me.eminem.demoRSO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageService {
    @Autowired
    private StorageRepository imeStRepoja;

    public String getKurc(){
        return imeStRepoja.findById(2).get().getNaslov();
    }
}
