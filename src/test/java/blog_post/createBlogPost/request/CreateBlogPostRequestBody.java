package blog_post.createBlogPost.request;
import lombok.Getter;
import java.util.List;

@Getter
public class CreateBlogPostRequestBody {

    private String owner;

    private String image;

    private String text;

    private String likes;

    private List<String> tags;

    public CreateBlogPostRequestBody(Builder builder){
        this.owner = builder.owner;
        this.text = builder.text;
        this.likes = builder.likes;
        this.image = builder.image;

    }
    public static class Builder{
        private String owner;

        private String image;

        private String text;

        private String likes;

        private List<String> tags;

        public Builder(){
            this.image = "https://img.dummyapi.io/photo-1500879747858-bb1845b61beb.jpg";
            this.text = "My first Blog Post";
            this.likes = "100";
            this.tags = List.of("dog","animal","golden retriever");
            this.owner = "63bfa88b55beb62a21b59ad4";
        }

        public CreateBlogPostRequestBody build(){
            CreateBlogPostRequestBody requestBody = new CreateBlogPostRequestBody(this);
            return requestBody;
        }
    }
}
