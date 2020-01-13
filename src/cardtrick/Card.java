/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrick;

/**
 *
 * @author vadimandreev
 */
public class Card {
    private String suit;
    private int value;
    
    //constractor
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        if(suit.equals("Spades")||suit.equals("Diamond")||suit.equals("Clubs")
                ||suit.equals("Hearts"))
            this.suit = suit;
        else{
        this.suit = suit;
        }
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        if(value > 0 && value < 14)
            this.value = value;
        else{
        this.value = value;
        }
    }
}
