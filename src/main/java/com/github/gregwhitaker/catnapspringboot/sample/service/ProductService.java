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
import com.github.gregwhitaker.catnapspringboot.sample.model.PricingDetails;
import com.github.gregwhitaker.catnapspringboot.sample.model.ProductDetails;
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

        return productDetails;
    }

    private List<ImageDetails> images() {
        ImageDetails image1 = new ImageDetails();
        image1.setSortOrder(1);
        image1.setUrl("http://www.google.com/1");
        image1.setAlt("Product 1");
        image1.setSize("primary");

        ImageDetails image2 = new ImageDetails();
        image2.setSortOrder(2);
        image2.setUrl("http://www.google.com/2");
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
        prices.setSale("89.99");

        return prices;
    }
}
