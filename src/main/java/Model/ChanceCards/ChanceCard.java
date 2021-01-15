package Model.ChanceCards;

import Model.Player;

public abstract class ChanceCard {

    protected Player currentPlayer;
    protected Player[] players;
    protected String msgKeyWord;

    public ChanceCard(Player currentPlayer, Player[] players, String msgKeyWord){
        this.currentPlayer = currentPlayer;
        this.players = players;
        this.msgKeyWord = msgKeyWord;
    }

    public abstract String useChanceCard();

}
