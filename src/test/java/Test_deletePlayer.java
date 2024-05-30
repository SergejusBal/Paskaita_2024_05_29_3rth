import org.example.IGamePlayerManager;
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

        //Assert
        boolean actualBoolean = iGamePlayerManager.deletePlayer(playerID1);

        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }

    @Test
    public void deletePlayer_deleteNonExistingPlayer_returnFalse(){

        //Arrange
        String playerID2 = "2";

        boolean expectedBoolean = false;

        //Assert
        boolean actualBoolean = iGamePlayerManager.deletePlayer(playerID2);

        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }

    @AfterAll
    public static void deletePlayer_checkIfAllPlayersGotDeleted_returnBoolean() {

        //Arrange
        String expectedDetails = "ID: 99 * Name: ControlCheck * Score: 0";

        //Assert
        String actualDetails = iGamePlayerManager.getPlayerDetails(playerID99);

        //Act
        assertEquals(expectedDetails,actualDetails);

    }



}
