package com.ing.product.repository;

import com.ing.product.model.OverviewCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OverviewRepository extends JpaRepository<OverviewCount,Long>{

}
