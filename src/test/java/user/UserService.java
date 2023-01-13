package user;

import io.restassured.response.Response;
import user.createUser.request.CreateUserRequestBody;
import user.createUser.response.CreateUserResponse;

public class UserService {

    public CreateUserResponse createUser(CreateUserRequestBody requestBody){
        Response response = new UserClient().createUser(requestBody);
        CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);
        createUserResponse.setStatusCode(response.statusCode());
        return createUserResponse;
    }
}
