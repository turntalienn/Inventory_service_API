package com.turntalien.inventoryservice.repository;

import com.turntalien.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    //spring data jpa generate the query at runtime
   List<Inventory> findBySkuCodeIn(List<String> skuCode);
}
