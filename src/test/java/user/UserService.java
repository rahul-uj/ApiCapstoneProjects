package user;

import io.restassured.response.Response;
import user.createUser.request.CreateUserRequestBody;
import user.createUser.response.CreateUserErrorResponse;
import user.createUser.response.CreateUserResponse;

public class UserService {

    public CreateUserResponse createUser(CreateUserRequestBody requestBody){
        Response response = new UserClient().createUser(requestBody);
        CreateUserResponse createUserResponse = response.as(CreateUserResponse.class);
        createUserResponse.setStatusCode(response.statusCode());
        return createUserResponse;
    }


    public CreateUserErrorResponse createUserExpectingError (CreateUserRequestBody body){
        Response response =  new UserClient().createUser(body);
        CreateUserErrorResponse errorResponse = response.as(CreateUserErrorResponse.class);
        errorResponse.setStatuscode(response.statusCode());
        return errorResponse;
    }
}
