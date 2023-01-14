package user.getAllUsers;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import user.UserService;
import user.getAllUsers.response.GetAllUsersResponse;

import static org.testng.Assert.*;

public class GetAllUsersTests {

    private UserService userService;

    @BeforeClass
    public void beforeClass(){
        userService = new UserService();
    }
    @Test
    public void getAllUsers(){
        GetAllUsersResponse getAllUsersResponse = userService.getAll();

        assertEquals(getAllUsersResponse.getStatusCode(),200);
        assertEquals(getAllUsersResponse.getData().size(),7);

    }
}
