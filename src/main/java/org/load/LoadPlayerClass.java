package org.load;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.event_handler.load_event.LoadEventListener;
import org.event_handler.load_event.LoadListenerData;
import org.player_classes.DefaultAttributes;
import org.user_interface.UserInterfaceDisplay;

import java.io.*;

public class LoadPlayerClass implements LoadEventListener {
    @Override
    public void listPlayerClasses(LoadListenerData loadListenerData) {
        File directoryPath = new File("./src/main/resources/");
        File[] filesList = directoryPath.listFiles();

        loadListenerData.userInterfaceDisplay().setFilesList(filesList);
    }

    @Override
    public void loadChosenPlayerClass(LoadListenerData loadListenerData) {
        ObjectMapper objectMapper = new ObjectMapper();
        UserInterfaceDisplay userInterfaceDisplay = loadListenerData.userInterfaceDisplay();

        File[] files = userInterfaceDisplay.getFilesList();
        int userInputAsInt = Integer.parseInt(userInterfaceDisplay.getCurrentUserInput());

        String pathToSaveFile = files[userInputAsInt].getAbsolutePath();

        String jsonString = "";
        try {
            FileInputStream fileInputStream = new FileInputStream(pathToSaveFile);
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonString = line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Currently doesn't load cus DefaultAttributes does not have a constructor, somehow save the received as array, then manually assign it with getters/setters
        DefaultAttributes playerClass;
        try {
            playerClass = objectMapper.readValue(jsonString, DefaultAttributes.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        userInterfaceDisplay.setPlayerClass(playerClass);
    }

    @Override
    public void loadHighScore(LoadListenerData loadListenerData) { }
}
