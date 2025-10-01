package com.ankit.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodOrder {
  private String orderId;
  private String customerName;
  private String restaurantName;
  private String item;
  private String status;
}
