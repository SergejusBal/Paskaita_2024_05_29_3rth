import org.example.IGamePlayerManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_updatePlayerScore {

    static IGamePlayerManager iGamePlayerManager;

    @BeforeAll
    public static void paruoštiObjektus() {


    }
    @Test
    public void updatePlayerScore_PlayerLvlsUps_ReturnVoid(){
        //Arrange
        String playerID = "1";
        int score = 100;
        boolean expectedBoolean = true;
        //Assert
        iGamePlayerManager.updatePlayerScore(playerID,score);
        boolean actualBoolean = iGamePlayerManager.checkLevelUp(playerID);
        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }
    @Test
    public void updatePlayerScore_PlayerDidNotLvlUp_ReturnVoid(){
        //Arrange
        String playerID = "1";
        int score = 0;
        boolean expectedBoolean = false;
        //Assert
        iGamePlayerManager.updatePlayerScore(playerID,score);
        boolean actualBoolean = iGamePlayerManager.checkLevelUp(playerID);
        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }

}
