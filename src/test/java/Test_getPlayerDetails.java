import org.example.IGamePlayerManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_getPlayerDetails {

    static IGamePlayerManager digitalLibrary;


    static IGamePlayerManager iGamePlayerManager;

    @BeforeAll
    public static void paruoštiObjektus() {

    }
    @Test
    public void getPlayerDetails_checkIfDetailWithExistingPlayer_returnString(){
        //Arrange
        String playerID = "1";
        String expectedDetails = "Jonas";
        iGamePlayerManager.registerPlayer(playerID,expectedDetails);
        //Assert
        String actualDetails = iGamePlayerManager.getPlayerDetails(playerID);
        //Act
        assertEquals(expectedDetails,actualDetails);
    }

    @Test
    public void getPlayerDetails_checkIfDetailsWithNotExistingPlayer_returnEmptyString(){
        //Arrange
        String playerID1 = "1";
        String expectedDetails = "Jonas";
        String playerID2 = "99999";
        iGamePlayerManager.registerPlayer(playerID1,expectedDetails);
        //Assert
        String actualDetails = iGamePlayerManager.getPlayerDetails(playerID2);
        //Act
        assertEquals(expectedDetails,actualDetails);
    }





}
