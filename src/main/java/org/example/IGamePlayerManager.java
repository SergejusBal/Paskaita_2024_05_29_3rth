package org.example;

public interface IGamePlayerManager {
    void registerPlayer(String playerId, String playerName);
    String getPlayerDetails(String playerId);
    void updatePlayerScore(String playerId, int scoreToAdd);
    boolean checkLevelUp(String playerId);
    boolean deletePlayer(String playerId);
}

