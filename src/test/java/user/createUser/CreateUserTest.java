package user.createUser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import user.UserService;
import user.createUser.request.CreateUserRequestBody;
import user.createUser.response.CreateUserResponse;

public class CreateUserTest {

    private UserService userService;
@BeforeClass
    public void beforeClass(){
        userService = new UserService();
    }
    @Test
    public void shouldCreateUser(){

        CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody.Builder().build();
        CreateUserResponse createUserResponse = userService.createUser(createUserRequestBody);
        createUserResponse.assertUser(createUserRequestBody);
    }
}
