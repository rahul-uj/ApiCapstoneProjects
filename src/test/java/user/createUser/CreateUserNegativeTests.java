package user.createUser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import user.UserService;
import user.createUser.request.CreateUserRequestBody;
import user.createUser.response.CreateUserErrorResponse;

public class CreateUserNegativeTests {

    private UserService usersService;
    @BeforeClass
    public void beforeClass()
    {
        usersService = new UserService();
    }

    @Test
    public void shouldNotAllowToCreateUserWithExistingEmail()
    {
        //Arrange
        CreateUserRequestBody requestBody = new CreateUserRequestBody.Builder().email("suriyaprakash123@gmail.com").build();
        //Act
        CreateUserErrorResponse errorResponse = usersService.createUserExpectingError(requestBody);
        //Assert
        errorResponse.assertUserNegative(requestBody);

    }

}
