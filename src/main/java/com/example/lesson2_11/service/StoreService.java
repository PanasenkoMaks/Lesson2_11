package com.example.lesson2_11.service;

import com.example.lesson2_11.component.Basket;
import com.example.lesson2_11.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoreService {
    private final Basket basket;

    public StoreService(Basket basket) {
        this.basket = basket;
    }
    public Item add (long id){
        Item item = new Item(id);
        basket.add(item);
        return item;
    }
    public List<Item> getItems(){
        return basket.getItems();
    }
}
