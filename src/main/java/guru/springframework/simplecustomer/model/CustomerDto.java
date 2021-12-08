package guru.springframework.simplecustomer.model;

import lombok.*;

import java.util.UUID;

/**
 * @Author: michael
 * @CreateDate: 12/8/21
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
