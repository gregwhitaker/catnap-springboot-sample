package com.github.gregwhitaker.catnapspringboot.sample.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder(value = {
        "online",
        "stores"
})
public class InventoryDetails {
    private StoreInventoryDetails online;
    private List<StoreInventoryDetails> stores;

    public StoreInventoryDetails getOnline() {
        return online;
    }

    public void setOnline(StoreInventoryDetails online) {
        this.online = online;
    }

    public List<StoreInventoryDetails> getStores() {
        return stores;
    }

    public void setStores(List<StoreInventoryDetails> stores) {
        this.stores = stores;
    }
}
