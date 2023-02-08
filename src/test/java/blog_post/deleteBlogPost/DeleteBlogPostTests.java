package blog_post.deleteBlogPost;

import blog_post.BlogPostService;
import blog_post.createBlogPost.request.CreateBlogPostRequestBody;
import blog_post.deleteBlogPost.response.DeleteBlogPostResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBlogPostTests {

    BlogPostService blogPostService;

    @BeforeClass
    public void beforeClass(){
        blogPostService = new BlogPostService();
    }

    @Test(priority=3)
    public void deleteBlogPost(){

        CreateBlogPostRequestBody createBlogPostRequestBody=new CreateBlogPostRequestBody.Builder().build();
        String createdPostId = blogPostService.create(createBlogPostRequestBody).getId();
        DeleteBlogPostResponse deleteBlogPostResponse = blogPostService.deleteBlogPostById(createdPostId);

        Assert.assertEquals(deleteBlogPostResponse.getStatusCode(),200);
    }
}
