package blog_post.getBlogPost.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
public class GetBlogPostByIdResponse {

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
    public static class Owner{
        private String firstName;

        private String lastName;

        private String id;

        private String title;

        private String picture;

    }
}
