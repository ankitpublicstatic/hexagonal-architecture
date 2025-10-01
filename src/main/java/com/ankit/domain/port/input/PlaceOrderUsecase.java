package com.ankit.domain.port.input;

import com.ankit.domain.dto.FoodOrder;

public interface PlaceOrderUsecase {

  void placeOrder(FoodOrder order);
}
