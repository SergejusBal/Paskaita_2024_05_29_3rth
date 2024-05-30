import org.example.IGamePlayerManager;
import org.example.IGamePlayerManagerImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_checkLevelUp {

    static IGamePlayerManager iGamePlayerManager;

    @BeforeAll
    public static void paruoštiObjektus() {

        iGamePlayerManager = new IGamePlayerManagerImp();

    }

    @Test
    public void checkLevelUP_checkIfPlayerLvlsUps_returnTrue(){

        //Arrange
        String playerID = "1";
        String playerName = "Jonas";
        iGamePlayerManager.registerPlayer(playerID,playerName);

        int playerScore = 100;
        iGamePlayerManager.updatePlayerScore(playerID,playerScore);

        boolean expectedBoolean = true;

        //Assert
        boolean actualBoolean = iGamePlayerManager.checkLevelUp(playerID);

        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }

    @Test
    public void checkLevelUP_checkIfPlayerDoesNotLvlsUps_returnFalse(){

        //Arrange
        String playerID2 = "2";
        String playerName = "Jonas";
        iGamePlayerManager.registerPlayer(playerID2,playerName);

        int playerScore = 0;
        iGamePlayerManager.updatePlayerScore(playerID2,playerScore);

        boolean expectedBoolean = false;

        //Assert
        boolean actualBoolean = iGamePlayerManager.checkLevelUp(playerID2);

        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }

    @Test
    public void checkLevelUP_checkWithNonExistingId_returnFalse(){

        //Arrange
        String playerId99 = "99";

        boolean expectedBoolean = false;

        //Assert
        boolean actualBoolean = iGamePlayerManager.checkLevelUp(playerId99);

        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }




}
