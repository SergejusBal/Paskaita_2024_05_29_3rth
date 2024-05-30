import org.example.IGamePlayerManager;
import org.example.IGamePlayerManagerImp;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_deletePlayer {

    static IGamePlayerManager iGamePlayerManager;
    static String playerID99;

    @BeforeAll
    public static void paruoštiObjektus() {

        iGamePlayerManager = new IGamePlayerManagerImp();

        playerID99 = "99";
        String playerName99 = "ControlCheck";
        iGamePlayerManager.registerPlayer(playerID99,playerName99);

    }
    @Test
    public void deletePlayer_deleteActualPlayer_returnTrue(){

        //Arrange
        String playerID1 = "1";
        String playerName = "Jonas";
        iGamePlayerManager.registerPlayer(playerID1,playerName);

        boolean expectedBoolean = true;

        //Act
        boolean actualBoolean = iGamePlayerManager.deletePlayer(playerID1);

        //Assert
        assertEquals(expectedBoolean,actualBoolean);
    }

    @Test
    public void deletePlayer_deleteNonExistingPlayer_returnFalse(){

        //Arrange
        String playerID2 = "2";

        boolean expectedBoolean = false;

        //Act
        boolean actualBoolean = iGamePlayerManager.deletePlayer(playerID2);

        //Assert
        assertEquals(expectedBoolean,actualBoolean);
    }

    @AfterAll
    public static void deletePlayer_checkIfAllPlayersGotDeleted_returnBoolean() {

        //Arrange
        String expectedDetails = "ID: 99 * Name: ControlCheck * Score: 0";

        //Act
        String actualDetails = iGamePlayerManager.getPlayerDetails(playerID99);

        //Assert
        assertEquals(expectedDetails,actualDetails);

    }



}
