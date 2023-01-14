package user;

import io.restassured.response.Response;
import user.createUser.request.CreateUserRequestBody;
import user.createUser.response.CreateUserErrorResponse;
import user.createUser.response.CreateUserResponse;
import user.getAllUsersAccount.response.GetAllUsersAccountResponse;

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

    public GetAllUsersAccountResponse getAllUsers(){
        Response response = new UserClient().getAllUsers();
        int statusCode = response.statusCode();
        GetAllUsersAccountResponse getAllUsersAccountResponse = response.as(GetAllUsersAccountResponse.class);
        getAllUsersAccountResponse.setStatusCode(statusCode);
        return getAllUsersAccountResponse;
    }
}
