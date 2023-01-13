package user;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import user.createUser.request.CreateUserRequestBody;
import static io.restassured.RestAssured.given;

public class UserClient {

    public Response createUser(CreateUserRequestBody requestBody){
        Response response = given().
                header("app-id", "63bfa624e6f00077ab32cfd9")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("https://dummyapi.io/data/v1/user/create");
       response.then().log().body();
       return response;
    }
}
