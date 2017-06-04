/*
 * Copyright 2016 Greg Whitaker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.gregwhitaker.catnapspringboot.sample.service;

import com.github.gregwhitaker.catnapspringboot.sample.model.ImageDetails;
import com.github.gregwhitaker.catnapspringboot.sample.model.InventoryDetails;
import com.github.gregwhitaker.catnapspringboot.sample.model.InventorySizeDetails;
import com.github.gregwhitaker.catnapspringboot.sample.model.PricingDetails;
import com.github.gregwhitaker.catnapspringboot.sample.model.ProductDetails;
import com.github.gregwhitaker.catnapspringboot.sample.model.StoreInventoryDetails;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    public ProductDetails getProduct(String id) {
        // Only support a single product id for the demo
        if (!id.equals("12345")) {
            return null;
        }

        ProductDetails productDetails = new ProductDetails();
        productDetails.setId("12345");
        productDetails.setName("Product 1");
        productDetails.setPrices(prices());
        productDetails.setImages(images());
        productDetails.setInventory(inventory());

        return productDetails;
    }

    private List<ImageDetails> images() {
        ImageDetails image1 = new ImageDetails();
        image1.setSortOrder(1);
        image1.setUrl("https://catnap-springboot-sample.herokuapp.com/12345-primary.png");
        image1.setAlt("Product 1");
        image1.setSize("primary");

        ImageDetails image2 = new ImageDetails();
        image2.setSortOrder(2);
        image2.setUrl("https://catnap-springboot-sample.herokuapp.com/12345-thumbnail.png");
        image2.setAlt("Product 1");
        image2.setSize("thumbnail");

        List<ImageDetails> images = new ArrayList<>();
        images.add(image1);
        images.add(image2);

        return images;
    }

    private PricingDetails prices() {
        PricingDetails prices = new PricingDetails();
        prices.setList("$120.00");
        prices.setSale("$89.99");

        return prices;
    }

    private InventoryDetails inventory() {
        List<StoreInventoryDetails> storeInventories = new ArrayList<>();
        storeInventories.add(store1InventoryDetails());
        storeInventories.add(store2InventoryDetails());

        InventoryDetails inventory = new InventoryDetails();
        inventory.setOnline(onlineStoreInventory());
        inventory.setStores(storeInventories);

        return inventory;
    }

    private StoreInventoryDetails onlineStoreInventory() {
        InventorySizeDetails smallInventory = new InventorySizeDetails();
        smallInventory.setSize("S");
        smallInventory.setCount(23);

        InventorySizeDetails mediumInventory = new InventorySizeDetails();
        mediumInventory.setSize("M");
        mediumInventory.setCount(0);

        InventorySizeDetails largeInventory = new InventorySizeDetails();
        largeInventory.setSize("L");
        largeInventory.setCount(6);

        List<InventorySizeDetails> sizes = new ArrayList<>();
        sizes.add(smallInventory);
        sizes.add(mediumInventory);
        sizes.add(largeInventory);

        StoreInventoryDetails inventory = new StoreInventoryDetails();
        inventory.setStoreId(999);
        inventory.setStoreName("web");
        inventory.setSizes(sizes);

        return inventory;
    }

    private StoreInventoryDetails store1InventoryDetails() {
        InventorySizeDetails smallInventory = new InventorySizeDetails();
        smallInventory.setSize("S");
        smallInventory.setCount(6);

        InventorySizeDetails mediumInventory = new InventorySizeDetails();
        mediumInventory.setSize("M");
        mediumInventory.setCount(10);

        InventorySizeDetails largeInventory = new InventorySizeDetails();
        largeInventory.setSize("L");
        largeInventory.setCount(14);

        List<InventorySizeDetails> sizes = new ArrayList<>();
        sizes.add(smallInventory);
        sizes.add(mediumInventory);
        sizes.add(largeInventory);

        StoreInventoryDetails inventory = new StoreInventoryDetails();
        inventory.setStoreId(1);
        inventory.setStoreName("store 1");
        inventory.setSizes(sizes);

        return inventory;
    }

    private StoreInventoryDetails store2InventoryDetails() {
        InventorySizeDetails smallInventory = new InventorySizeDetails();
        smallInventory.setSize("S");
        smallInventory.setCount(20);

        InventorySizeDetails mediumInventory = new InventorySizeDetails();
        mediumInventory.setSize("M");
        mediumInventory.setCount(8);

        InventorySizeDetails largeInventory = new InventorySizeDetails();
        largeInventory.setSize("L");
        largeInventory.setCount(3);

        List<InventorySizeDetails> sizes = new ArrayList<>();
        sizes.add(smallInventory);
        sizes.add(mediumInventory);
        sizes.add(largeInventory);

        StoreInventoryDetails inventory = new StoreInventoryDetails();
        inventory.setStoreId(2);
        inventory.setStoreName("store 2");
        inventory.setSizes(sizes);

        return inventory;
    }
}
