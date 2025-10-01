package com.ankit.domain.port.output;

import com.ankit.domain.dto.FoodOrder;

public interface OrderRepositoryPort {

  void saveOrder(FoodOrder order);

  String findById(String orderId);
}
