package com.ankit.adapter.output.repository;

import com.ankit.domain.dto.FoodOrder;
import com.ankit.domain.port.output.OrderRepositoryPort;

public class MongoOrderRepository implements OrderRepositoryPort {

  // inject mongo repository

  @Override
  public void saveOrder(FoodOrder order) {

  }

  @Override
  public String findById(String orderId) {
    return "";
  }
}
