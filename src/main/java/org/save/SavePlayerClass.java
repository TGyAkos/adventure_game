package org.save;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.event_handler.save_event.SaveEventListener;
import org.event_handler.save_event.SaveListenerData;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SavePlayerClass implements SaveEventListener {
    @Override
    public void saveCurrentPlayerClass(SaveListenerData saveListenerData) {
        ObjectMapper objectMapper = new ObjectMapper();
        String userGivenFileName = String.format("./src/main/resources/save_games/%s.json", saveListenerData.userInput());
        String jsonString = "";

        try {
            jsonString = objectMapper.writeValueAsString(saveListenerData.playerClass());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        try (PrintWriter writer = new PrintWriter(userGivenFileName)) {
            writer.write(jsonString);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveHighScore(SaveListenerData saveListenerData) {}
}
