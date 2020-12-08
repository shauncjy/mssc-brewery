package guru.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data //create getters and setters, equals and hash code methods
@NoArgsConstructor
@AllArgsConstructor
@Builder //implement the builder pattern
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private long upc;

}
