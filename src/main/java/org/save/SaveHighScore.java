package org.save;

import org.event_handler.save_event.SaveEventListener;
import org.event_handler.save_event.SaveListenerData;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SaveHighScore implements SaveEventListener {

    @Override
    public void saveHighScore(SaveListenerData saveListenerData) {
        String fileName = "./src/main/resources/highScore.txt";

        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.write(Integer.toString(saveListenerData.playerClass().getNumberOfEnemyKilled()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveCurrentPlayerClass(SaveListenerData saveListenerData) { }
}
