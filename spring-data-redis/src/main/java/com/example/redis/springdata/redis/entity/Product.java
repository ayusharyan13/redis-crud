package com.example.redis.springdata.redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Product") // to store this entity as a hash in redis
public class Product implements Serializable {
    @Id
    private int id;
    private String name;
    private int qty;
    private long price;

}
