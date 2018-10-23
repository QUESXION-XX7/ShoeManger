package com.xx7.shoemanager;

import com.xx7.shoemanager.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ShoeListRepository extends JpaRepository<Shoe,Long> {
    List<Shoe> findByBrand(String brand);
}
