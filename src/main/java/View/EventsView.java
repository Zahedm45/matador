package View;

import Model.BankruptPlayers;
import Model.GameEvents;
import Model.Player;
import gui_fields.GUI_Car;
import gui_fields.GUI_Player;
import gui_main.GUI;
import gui_fields.GUI_Street;
import gui_fields.GUI_Field;
import gui_fields.GUI_Board;

import java.awt.*;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class EventsView {

    public static boolean hasWon (HashMap<String,String> stringList,BankruptPlayers bankruptPlayers, GUI gui, GUI_Player[] guiPlayer){
        boolean endGame = false;
        int i = GameEvents.whoWon(bankruptPlayers);
        if(i != -1) {
            gui.showMessage(guiPlayer[i].getName() + stringList.get("winMessage"));
            endGame = true;
        }
        return endGame;
    }

    public static void chanceCardMsg(String chanceCardKeyWord, GUI gui,HashMap<String,String> stringList){
        gui.showMessage(stringList.get(chanceCardKeyWord));
    }
}
