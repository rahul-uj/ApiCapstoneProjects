package blog_post;

import blog_post.createBlogPost.request.CreateBlogPostRequestBody;
import blog_post.createBlogPost.response.CreateBlogPostResponse;
import io.restassured.response.Response;

public class BlogPostService {

    public CreateBlogPostResponse create(CreateBlogPostRequestBody requestBody){
        Response response = new BlogPostClient().createBlogPost(requestBody);
        CreateBlogPostResponse creaateBlogPostResponse = response.as(CreateBlogPostResponse.class);
        creaateBlogPostResponse.setStatusCode(response.statusCode());
        return creaateBlogPostResponse;
    }

}
