package blog_post.createBlogPost.response;
import blog_post.createBlogPost.request.CreateBlogPostRequestBody;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;
import java.util.List;

@Getter
public class CreateBlogPostResponse {
    @Setter
    private int statusCode;
    private Owner owner;

    private String image;

    private String link;

    private String publishDate;

    private String id;

    private String text;

    private String updatedDate;

    private String likes;

    private List<String> tags;

    @Getter
    public class Owner{
        private String firstName;

        private String lastName;

        private String id;

        private String title;

        private String picture;
    }
    public void assertOwner(CreateBlogPostRequestBody requestBody){
        Assert.assertEquals(this.getStatusCode(),200);
        Assert.assertEquals(this.getOwner().getId(),requestBody.getOwner());
    }
}
