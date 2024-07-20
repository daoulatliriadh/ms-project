package com.enterprise.Service;

import com.enterprise.Model.Enterprise;
import com.enterprise.Repository.EnterpriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnterpriseService {
    @Autowired
    private EnterpriseRepository enterpriseRepository;

    public Enterprise save(Enterprise enterprise){
        return enterpriseRepository.save(enterprise);
    }
    public Optional<Enterprise> findById(int id){
        return enterpriseRepository.findById(id);
    }
    public List<Enterprise> findAll(){
        return enterpriseRepository.findAll();
    }
    public void deleteById(int id){
        enterpriseRepository.deleteById(id);
    }
}
