package lagartostore.order.dto;

import lombok.Data;

@Data

public class CategoryDto {
    private Integer id;
    private String name;
    private String description;
    private boolean state;

}
