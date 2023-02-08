package blog_post.createBlogPost;

import blog_post.BlogPostService;
import blog_post.createBlogPost.request.CreateBlogPostRequestBody;
import blog_post.createBlogPost.response.CreateBlogPostResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CreateBlogPostTest {

    private BlogPostService blogPostService;

    @BeforeClass
    public void beforeClass(){
        blogPostService = new BlogPostService();
    }
    @Test(priority=1)
    public void shouldCreatePost(){
        CreateBlogPostRequestBody requestBody = new CreateBlogPostRequestBody.Builder().build();
        CreateBlogPostResponse createBlogPostResponse = blogPostService.create(requestBody);
        createBlogPostResponse.assertOwner(requestBody);
    }
}
