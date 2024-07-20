package com.filiale.Service;

import com.filiale.Model.FilialeModel;
import com.filiale.Repository.FilialeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FilialeService {
    @Autowired
    private FilialeRepository filialeRepository;

    public FilialeModel save(FilialeModel filiale){
        return filialeRepository.save(filiale);
    }
    public Optional<FilialeModel> findById(int id){
        return filialeRepository.findById(id);
    }
    public List<FilialeModel> findAll(){
        return filialeRepository.findAll();
    }
    public void deleteById(int id){
        filialeRepository.deleteById(id);
    }
}
