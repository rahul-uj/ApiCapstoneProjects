package blog_post;

import blog_post.createBlogPost.request.CreateBlogPostRequestBody;
import blog_post.createBlogPost.response.CreateBlogPostResponse;
import blog_post.getBlogPost.response.GetBlogPostByIdResponse;
import io.restassured.response.Response;

public class BlogPostService {

    public CreateBlogPostResponse create(CreateBlogPostRequestBody requestBody){
        Response response = new BlogPostClient().createBlogPost(requestBody);
        CreateBlogPostResponse creaateBlogPostResponse = response.as(CreateBlogPostResponse.class);
        creaateBlogPostResponse.setStatusCode(response.statusCode());
        return creaateBlogPostResponse;
    }

    public GetBlogPostByIdResponse getBlogPost(String post_id){
        Response response = new BlogPostClient().getBlogPostById(post_id);
        int statusCode = response.statusCode();
        GetBlogPostByIdResponse getBlogPostByIdResponse = response.as(GetBlogPostByIdResponse.class);
        getBlogPostByIdResponse.setStatusCode(statusCode);
        return  getBlogPostByIdResponse;
    }

}
