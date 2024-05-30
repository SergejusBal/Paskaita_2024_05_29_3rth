import org.example.IGamePlayerManager;
import org.example.IGamePlayerManagerImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_getPlayerDetails {


    static IGamePlayerManager iGamePlayerManager;

    @BeforeAll
    public static void paruoštiObjektus() {

        iGamePlayerManager = new IGamePlayerManagerImp();

    }
    @Test
    public void getPlayerDetails_checkDetailWithExistingPlayer_returnString(){

        //Arrange
        String playerID1 = "1";
        String playerName = "Jonas";
        iGamePlayerManager.registerPlayer(playerID1,playerName);

        String expectedDetails = "ID: 1 * Name: Jonas * Score: 0";

        //Act
        String actualDetails = iGamePlayerManager.getPlayerDetails(playerID1);

        //Assert
        assertEquals(expectedDetails,actualDetails);
    }

    @Test
    public void getPlayerDetails_checkDetailsWithNotExistingPlayer_returnEmptyString(){

        //Arrange
        String playerID2 = "2";

        String expectedDetails = "";

        //Act
        String actualDetails = iGamePlayerManager.getPlayerDetails(playerID2);

        //Assert
        assertEquals(expectedDetails,actualDetails);
    }





}
