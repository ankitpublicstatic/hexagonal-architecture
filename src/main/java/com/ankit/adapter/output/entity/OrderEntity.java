package com.ankit.adapter.output.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

  @Id
  private String orderId;

  private String customerName;
  private String restaurantName;
  private String item;
  private String status;

}
