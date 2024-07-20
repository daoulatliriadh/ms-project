package com.filiale.Repository;

import com.filiale.Model.FilialeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilialeRepository extends MongoRepository<FilialeModel,Integer> {
}
