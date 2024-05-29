import org.example.IGamePlayerManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_deletePlayer {

    static IGamePlayerManager iGamePlayerManager;

    @BeforeAll
    public static void paruoštiObjektus() {


    }
    @Test
    public void deletePlayer_deleteActualPlayer_returnTrue(){
        //Arrange
        String playerID = "1";
        boolean expectedBoolean = true;
        //Assert
        boolean actualBoolen = iGamePlayerManager.deletePlayer(playerID);
        //Act
        assertEquals(expectedBoolean,actualBoolen);
    }

    @Test
    public void deletePlayer_deleteNonExistingPlayer_returnFalse(){
        //Arrange
        String playerID = "1";
        boolean expectedBoolean = false;
        //Assert
        boolean actualBoolen = iGamePlayerManager.deletePlayer(playerID);
        //Act
        assertEquals(expectedBoolean,actualBoolen);
    }




}
