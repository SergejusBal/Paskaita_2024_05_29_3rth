package org.example;

import java.util.HashMap;

public class IGamePlayerManagerImp implements IGamePlayerManager{

    private final HashMap<String,String> playerNameList;
    private final HashMap<String, Integer> playerScoreList;

    public IGamePlayerManagerImp() {
        playerNameList = new HashMap<>();
        playerScoreList = new HashMap<>();
    }

    @Override
    public void registerPlayer(String playerId, String playerName) {
        if(playerNameList.containsKey(playerId)) return;

        int startingScore = 0;
        playerNameList.put(playerId,playerName);
        playerScoreList.put(playerId,startingScore);
    }

    @Override
    public String getPlayerDetails(String playerId) {
        if(!playerNameList.containsKey(playerId)) return "";
        return "ID: " + playerId + " * Name: " + playerNameList.get(playerId) + " * Score: " + playerScoreList.get(playerId);
    }

    @Override
    public void updatePlayerScore(String playerId, int scoreToAdd) {
        Integer playerScore  = playerScoreList.get(playerId);
        playerScore+=scoreToAdd;
        playerScoreList.put(playerId,playerScore);
    }

    @Override
    public boolean checkLevelUp(String playerId) {
        if(!playerNameList.containsKey(playerId)) return false;
        int playerScore = playerScoreList.get(playerId);
        if(playerScore >= 100) {
            playerScore-=100;
            playerScoreList.put(playerId,playerScore);
            return true;
        }
        return false;
    }

    @Override
    public boolean deletePlayer(String playerId) {
        if(!playerNameList.containsKey(playerId)) return false;
        playerNameList.remove(playerId);
        playerScoreList.remove(playerId);
        return true;
    }
}
