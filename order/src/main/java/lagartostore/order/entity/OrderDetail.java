package lagartostore.order.entity;

import jakarta.persistence.*;
import lagartostore.order.dto.ProductDto;
import lombok.Data;

@Entity
@Data

public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double price;
    private Double amount;
    private Integer productId;
    @Transient
    private ProductDto productDto;

    public OrderDetail() {
        this.price = (double) 0;
        this.amount = (double) 0;
    }
}
