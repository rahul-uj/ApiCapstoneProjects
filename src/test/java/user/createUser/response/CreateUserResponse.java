package user.createUser.response;
import lombok.Getter;
import lombok.Setter;
import user.createUser.request.CreateUserRequestBody;
import static org.testng.Assert.assertEquals;

@Getter
public class CreateUserResponse {

    @Setter
    private int statusCode;

    private String firstName;

    private String lastName;

    private String id;

    private String updatedDate;

    private String title;

    private String picture;

    private String email;

    private String registerDate;

    public void assertUser(CreateUserRequestBody createUserRequestBody) {
        assertEquals(this.getStatusCode(),200);
        assertEquals(this.getEmail(),createUserRequestBody.getEmail());
        assertEquals(this.getFirstName(),createUserRequestBody.getFirstName());
        assertEquals(this.getLastName(),createUserRequestBody.getLastName());
    }
}
