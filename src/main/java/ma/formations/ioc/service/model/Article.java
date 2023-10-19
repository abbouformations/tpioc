package ma.formations.ioc.service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private Long id;
    private String description;
    private Double price;
    private Double quantity;

}
