package user.getAllUsers.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
public class GetAllUsersResponse {

    @Setter
    private int statusCode;

    private String total;

    @JsonProperty("data")
    private List<Data> data;

    private String limit;

    private String page;

    @Getter
    public static class Data{
        private String firstName;

        private String lastName;

        private String id;

        private String title;

        private String picture;
    }


}
