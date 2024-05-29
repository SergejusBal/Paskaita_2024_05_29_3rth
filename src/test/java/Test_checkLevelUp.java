import org.example.IGamePlayerManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_checkLevelUp {

    static IGamePlayerManager iGamePlayerManager;

    @BeforeAll
    public static void paruoštiObjektus() {


    }

    @Test
    public void checkLevelUP_checkIfPlayerLvlsUps_returnTrue(){
        //Arrange
        String playerID = "1";
        boolean expectedBoolean = true;
        //Assert
        boolean actualBoolean = iGamePlayerManager.checkLevelUp(playerID);
        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }

    @Test
    public void checkLevelUP_checkIfPlayerDoesNotLvlsUps_returnFalse(){
        //Arrange
        String playerID = "1";
        boolean expectedBoolean = false;
        //Assert
        boolean actualBoolean = iGamePlayerManager.checkLevelUp(playerID);
        //Act
        assertEquals(expectedBoolean,actualBoolean);
    }

}
