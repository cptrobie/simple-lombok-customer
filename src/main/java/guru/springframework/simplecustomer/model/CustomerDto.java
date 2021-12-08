package guru.springframework.simplecustomer.model;

import lombok.*;

import java.util.UUID;

/**
 * Created by michael on 2021-12-08.
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class CustomerDto {
    private UUID id;
    private String customerName;

}
