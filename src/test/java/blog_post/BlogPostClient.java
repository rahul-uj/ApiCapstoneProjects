package blog_post;
import blog_post.createBlogPost.request.CreateBlogPostRequestBody;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class BlogPostClient {

    public Response createBlogPost(CreateBlogPostRequestBody requestBody){
        Response response = given()
                .header("app-id", "63bfa624e6f00077ab32cfd9")
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post("https://dummyapi.io/data/v1/post/create");
        response.then().log().body();
        return response;
    }

    public Response getBlogPostById(String post_id){
        Response response = given()
                .header("app-id", "63bfa624e6f00077ab32cfd9")
                .when()
                .pathParam("post_id", post_id)
                .get("https://dummyapi.io/data/v1/post/{post_id}");
        response.then()
                .log()
                .body();
        return  response;
    }
}
