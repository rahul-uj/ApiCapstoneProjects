package user.createUser.request;

import lombok.Getter;
@Getter
public class CreateUserRequestBody {

    private String firstName;
    private String lastName;
    private String title;
    private String email;

    public CreateUserRequestBody(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.title = builder.title;
        this.email = builder.email;
    }

    @Getter
    public static class Builder{
        private String firstName;

        private String lastName;

        private String title;

        private String email;


        public Builder() {
            this.firstName = "Suresh";
            this.lastName = "Patil";
            this.title = "mr";
            this.email = "sureshpatil14@gmail.com";
        }

        public Builder email(String email)
        {
            this.email=email;
            return this;
        }

        public CreateUserRequestBody build(){
            CreateUserRequestBody createUserRequestBody = new CreateUserRequestBody(this);
            return createUserRequestBody;
        }
    }
}
