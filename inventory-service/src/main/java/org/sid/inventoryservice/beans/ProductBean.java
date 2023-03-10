package org.sid.inventoryservice.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor
@ToString
public class ProductBean {
    private Long id;
    private String name;
    private double price;
    private double quantity;

    private int port;

}
