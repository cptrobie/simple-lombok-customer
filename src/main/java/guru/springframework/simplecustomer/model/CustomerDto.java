package guru.springframework.simplecustomer.model;

import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@ToString
public class CustomerDto {
    private UUID id;
    private String customerName;

}
