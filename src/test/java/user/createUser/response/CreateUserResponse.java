package user.createUser.response;
import lombok.Getter;
import lombok.Setter;
@Getter
public class CreateUserResponse {

    @Setter
    public int satatusCode;

    private String firstName;

    private String lastName;

    private String id;

    private String updatedDate;

    private String title;

    private String picture;

    private String email;

    private String registerDate;
}
