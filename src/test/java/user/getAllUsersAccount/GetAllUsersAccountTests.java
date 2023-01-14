package user.getAllUsersAccount;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import user.UserService;
import user.getAllUsersAccount.response.GetAllUsersAccountResponse;

public class GetAllUsersAccountTests {

    private UserService userService;

    @BeforeClass
    public void beforeClass(){
        userService = new UserService();
    }

    @Test
    public void shouldGetAllUsersAccount(){
        GetAllUsersAccountResponse getAllUsersAccountResponse = userService.getAllUsers();
        Assert.assertEquals(getAllUsersAccountResponse.getStatusCode(),200);
        Assert.assertEquals(getAllUsersAccountResponse.getData().size(),10);


    }
}
