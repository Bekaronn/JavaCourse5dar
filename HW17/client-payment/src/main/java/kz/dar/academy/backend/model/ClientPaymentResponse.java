package kz.dar.academy.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientPaymentResponse {
    private String paymentId;
    private String initiatorId;
    private String clientId;
    private String date;
    private String address;
    private Double price;
    private String status;
}
