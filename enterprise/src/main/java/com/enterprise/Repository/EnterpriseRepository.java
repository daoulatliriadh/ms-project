package com.enterprise.Repository;

import com.enterprise.Model.Enterprise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnterpriseRepository extends JpaRepository<Enterprise,Integer> {
}
