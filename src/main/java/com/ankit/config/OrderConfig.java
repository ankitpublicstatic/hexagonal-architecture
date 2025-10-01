package com.ankit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.ankit.domain.port.output.OrderRepositoryPort;
import com.ankit.domain.service.OrderService;

@Configuration
public class OrderConfig {

  @Bean
  public OrderService orderService(OrderRepositoryPort repository) {
    return new OrderService(repository);
  }
}
