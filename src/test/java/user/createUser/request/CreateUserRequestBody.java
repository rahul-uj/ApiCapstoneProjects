package user.createUser.request;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class CreateUserRequestBody {

    private String firstName;

    private String lastName;

    private String title;

    private String picture;

    private String email;

}
