import org.example.IGamePlayerManager;
import org.example.IGamePlayerManagerImp;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test_updatePlayerScore {

    static IGamePlayerManager iGamePlayerManager;

    @BeforeAll
    public static void paruoštiObjektus() {

        iGamePlayerManager = new IGamePlayerManagerImp();

    }
    @Test
    public void updatePlayerScore_PlayerScoreChanges_ReturnVoid(){

        //Arrange
        String playerID1 = "1";
        String playerName = "Jonas";
        iGamePlayerManager.registerPlayer(playerID1,playerName);

        int score = 1;

        String notExpectedDetails = iGamePlayerManager.getPlayerDetails(playerID1);

        //Act
        iGamePlayerManager.updatePlayerScore(playerID1,score);
        String actualDetails = iGamePlayerManager.getPlayerDetails(playerID1);

        //Assert
        assertNotEquals(notExpectedDetails,actualDetails);
    }

    @Test
    public void updatePlayerScore_PlayerScoreDidNotChange_ReturnVoid(){

        //Arrange
        String playerID2 = "2";
        String playerName = "Jonas";
        iGamePlayerManager.registerPlayer(playerID2,playerName);

        int score = 0;

        String expectedDetails = iGamePlayerManager.getPlayerDetails(playerID2);

        //Act
        iGamePlayerManager.updatePlayerScore(playerID2,score);
        String actualDetails = iGamePlayerManager.getPlayerDetails(playerID2);

        //Assert
        assertEquals(expectedDetails,actualDetails);
    }



}
