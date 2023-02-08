package blog_post.getBlogPost;

import blog_post.BlogPostService;
import blog_post.getBlogPost.response.GetBlogPostByIdResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class GetBlogPostTest {

    BlogPostService blogPostService;

    @BeforeClass
    public void beforeClass(){
        blogPostService = new BlogPostService();
    }
    @Test(priority=2)
    public void getBlogPost(){
        String post_id = "63e3450dfc308112fa206ffe";
        GetBlogPostByIdResponse response = blogPostService.getBlogPost(post_id);

        assertEquals(response.getStatusCode(),200);
        assertEquals(response.getId(),post_id);
    }

}
