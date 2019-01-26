package com.skilldistillery.cardgames.player;

import java.util.ArrayList;
import java.util.List;
import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer extends Player {

	public Deck newDeck() {
		Deck deck = new Deck();

		deck.shuffle();
		return deck;
	}

	public void dealCards(Deck deck) {
		List<Card> hand = new ArrayList<>(2);
		int totalValue = 0;
		for (int i = 0; i < 2; i++) {
			Card c = deck.dealCard();
			totalValue += c.getValue();
			hand.add(c);
		}
		printHandAndValue(hand, totalValue);
	}

	private void printHandAndValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("Total value: " + value);
	}

}
