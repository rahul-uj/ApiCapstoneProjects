package blog_post.deleteBlogPost;

import blog_post.BlogPostService;
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
        String post_Id = "63e345bcfc308179152070bb";
        DeleteBlogPostResponse deleteBlogPostResponse = blogPostService.deleteBlogPostById(post_Id);

        Assert.assertEquals(deleteBlogPostResponse.getStatusCode(),200);

    }
}
