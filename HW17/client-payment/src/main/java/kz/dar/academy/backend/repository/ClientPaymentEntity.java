package kz.dar.academy.backend.repository;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "client-payment")
public class ClientPaymentEntity {
    @Id
    @Field(type = FieldType.Keyword)
    private String paymentId;
    @Field(type = FieldType.Keyword)
    private String initiatorId;
    @Field(type = FieldType.Keyword)
    private String clientId;
    @Field(type = FieldType.Date)
    private String date;
    @Field(type = FieldType.Text)
    private String address;
    @Field(type = FieldType.Double)
    private Double price;
    @Field(type = FieldType.Keyword)
    private String status;
}
