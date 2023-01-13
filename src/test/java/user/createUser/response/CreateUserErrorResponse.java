package user.createUser.response;

import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;
import user.UserClient;
import user.createUser.request.CreateUserRequestBody;

@Getter
public class CreateUserErrorResponse {
    @Setter
    private int statuscode;
    private Data data;
    private String error;
    @Getter
    public static class Data{
        private String email;
        private String message;

    }

    public void assertUserNegative(CreateUserRequestBody requestBody) {
        Assert.assertEquals(this.getStatuscode(),400);
        Assert.assertEquals(this.getError(),"BODY_NOT_VALID");
        Assert.assertEquals(this.getData().getEmail(),"Email already used");
    }

    public CreateUserErrorResponse createUserExpectingError (CreateUserRequestBody body){
        Response response =  new UserClient().createUser(body);
        CreateUserErrorResponse errorResponse = response.as(CreateUserErrorResponse.class);
        errorResponse.setStatuscode(response.statusCode());
        return errorResponse;
    }

}


