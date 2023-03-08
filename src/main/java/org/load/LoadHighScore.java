package org.load;

import org.event_handler.load_event.LoadEventListener;
import org.event_handler.load_event.LoadListenerData;

import java.io.*;

public class LoadHighScore implements LoadEventListener {
    @Override
    public void loadHighScore(LoadListenerData loadListenerData) {
        try {
            FileInputStream fileInputStream = new FileInputStream("highScore.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(dataInputStream));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                loadListenerData.userInterfaceDisplay().setHighScore(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void listPlayerClasses(LoadListenerData loadListenerData) { }

    @Override
    public void loadChosenPlayerClass(LoadListenerData loadListenerData) { }
}
