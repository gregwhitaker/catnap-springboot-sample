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

package com.github.gregwhitaker.catnapspringboot.sample.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder(value = {
        "id",
        "name",
        "prices",
        "images"
})
public class ProductDetails {
    private String id;
    private String name;
    private PricingDetails prices;
    private List<ImageDetails> images;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PricingDetails getPrices() {
        return prices;
    }

    public void setPrices(PricingDetails prices) {
        this.prices = prices;
    }

    public List<ImageDetails> getImages() {
        return images;
    }

    public void setImages(List<ImageDetails> images) {
        this.images = images;
    }
}
