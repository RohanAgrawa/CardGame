/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.Example.Entity.Card;
import org.Example.Entity.Deck;
import org.Example.Entity.Suits;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class DeckTest {

    @Test
    public void checkShuffling(){
        // unshuffled deck
        ArrayList<Card> unShuffled = new ArrayList<>();

        for(Suits suits : Suits.values()){

            for(int i = 1; i <= 13; i++){
                unShuffled.add(new Card(i,suits));
            }

        }

        Deck deck = new Deck();
        ArrayList<Card> shuffled = deck.getDeck();
        // to check if the new deck created is shuffled or not.
        Assert.assertEquals(false,unShuffled.toString() == shuffled.toString());


    }






}
