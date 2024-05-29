import org.example.IGamePlayerManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Test_registerPlayer {


    static IGamePlayerManager iGamePlayerManager;

    @BeforeAll
    public static void paruoštiObjektus() {


    }
    @Test
    public void registerPlayer_SuccessfulRegistrationActualPlayer_ReturnVoid(){
        //Arrange
        String playerID = "1";
        String expectedDetails = "Jonas";
        //Assert
        iGamePlayerManager.registerPlayer(playerID,expectedDetails);
        String actualDetail = iGamePlayerManager.getPlayerDetails(playerID);
        //Act
        assertEquals(expectedDetails,actualDetail);
    }

    @Test
    public void registerPlayer_RegisterNotSuccessful_ReturnVoid(){
        //Arrange
        String playerID = "1";
        String expectedDetails = "Jonas";
        boolean expectedBoolean = false;
        //Assert
        iGamePlayerManager.registerPlayer(playerID,expectedDetails);
        iGamePlayerManager.registerPlayer(playerID,expectedDetails);
        iGamePlayerManager.deletePlayer(playerID);
        boolean actualBoolean = iGamePlayerManager.deletePlayer(playerID);
        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }


}



