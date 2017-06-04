package com.github.gregwhitaker.catnapspringboot.sample.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder(value = {
        "storeId",
        "storeName",
        "sizes"
})
public class StoreInventoryDetails {
    private int storeId;
    private String storeName;
    private List<InventorySizeDetails> sizes;

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<InventorySizeDetails> getSizes() {
        return sizes;
    }

    public void setSizes(List<InventorySizeDetails> sizes) {
        this.sizes = sizes;
    }
}
