package com.ankit.adapter.output.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ankit.adapter.output.entity.OrderEntity;

public interface SpringDataOrderRepository extends JpaRepository<OrderEntity, String> {
}
