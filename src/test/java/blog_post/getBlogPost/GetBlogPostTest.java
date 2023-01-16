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
    @Test
    public void getBlogPost(){
        String post_id = "63c4dd3c4f9237672ecb80e9";
        GetBlogPostByIdResponse response = blogPostService.getBlogPost(post_id);

        assertEquals(response.getStatusCode(),200);
        assertEquals(response.getId(),post_id);
    }

}
