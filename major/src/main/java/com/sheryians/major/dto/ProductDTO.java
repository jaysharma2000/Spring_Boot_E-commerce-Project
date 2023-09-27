package com.sheryians.major.dto;

// import javax.persistence.FetchType;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.ManyToOne;

import lombok.Data;

//data tranfer object information

@Data
public class ProductDTO {
    
    private Long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}
