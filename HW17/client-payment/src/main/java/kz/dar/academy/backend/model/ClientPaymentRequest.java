package kz.dar.academy.backend.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientPaymentRequest {
    private String paymentId;
    @NotNull(message = "InitiatorId may not be null")
    private String initiatorId;
    @NotNull(message = "ClientId may not be null")
    private String clientId;
    @NotNull(message = "Date may not be null")
    private String date;
    @NotNull(message = "Address may not be null")
    private String address;
    @NotNull(message = "Price may not be null")
    private Double price;
    @NotNull(message = "Status may not be null")
    private String status;
}
