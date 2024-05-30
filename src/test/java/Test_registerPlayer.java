import org.example.IGamePlayerManager;
import org.example.IGamePlayerManagerImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Test_registerPlayer {


    static IGamePlayerManager iGamePlayerManager;

    @BeforeAll
    public static void paruoštiObjektus() {

        iGamePlayerManager = new IGamePlayerManagerImp();

    }
    @Test
    public void registerPlayer_SuccessfulRegistrationOfAPlayer_ReturnVoid(){

        //Arrange
        String playerID1 = "1";
        String playerName = "Jonas";

        String expectedDetails = "ID: 1 * Name: Jonas * Score: 0";

        //Act
        iGamePlayerManager.registerPlayer(playerID1,playerName);
        String actualDetail = iGamePlayerManager.getPlayerDetails(playerID1);

        //Assert
        assertEquals(expectedDetails,actualDetail);
    }

    @Test
    public void registerPlayer_NotSuccessfulRegistrationOfAPlayer_ReturnVoid(){

        //Arrange
        String playerID2 = "2";
        String playerName = "Jonas";

        boolean expectedBoolean = false;

        //Act
        iGamePlayerManager.registerPlayer(playerID2,playerName);
        iGamePlayerManager.registerPlayer(playerID2,playerName);
        iGamePlayerManager.deletePlayer(playerID2);
        boolean actualBoolean = iGamePlayerManager.deletePlayer(playerID2);

        //Assert
        assertEquals(expectedBoolean,actualBoolean);
    }


}



