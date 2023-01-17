package blog_post.integrationTests;
import blog_post.BlogPostService;
import blog_post.createBlogPost.request.CreateBlogPostRequestBody;
import blog_post.createBlogPost.response.CreateBlogPostResponse;
import blog_post.deleteBlogPost.response.DeleteBlogPostResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class BlogPostIntegrationTest {

    public BlogPostService blogPostService;

    @BeforeClass
    public void beforeClass(){
        blogPostService = new BlogPostService();
    }
    @Test
    public void shouldCreateAndDeletePost(){
        CreateBlogPostRequestBody requestBody = new CreateBlogPostRequestBody.Builder().build();
        CreateBlogPostResponse response = blogPostService.create(requestBody);
        int createStatusCode = response.getStatusCode();
        assertEquals(createStatusCode,200);

        String id = response.getId();
        DeleteBlogPostResponse deleteBlogPostResponse = blogPostService.deleteBlogPostById(id);
        int deleteStatusCode = deleteBlogPostResponse.getStatusCode();

        assertEquals(deleteStatusCode,200);
    }
}
