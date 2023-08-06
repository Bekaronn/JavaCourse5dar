package example.postcoreapi.model;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PostModel {
    private String postId;
    @NotNull(message = "Client id can not be empty")
    private String clientId;
    @NotNull(message = "Post recipient id can not be empty")
    private String postRecipientId;
    @NotNull(message = "Post item can not be empty")
    private String postItem;
    private String status;
}
