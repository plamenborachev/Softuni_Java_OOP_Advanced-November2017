package p04CardToString;

public class Card {
    private CardRanks cardRank;
    private CardSuits cardSuit;

    public Card(CardRanks cardRank, CardSuits cardSuit) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public CardRanks getCardRank() {
        return this.cardRank;
    }

    public CardSuits getCardSuit() {
        return this.cardSuit;
    }

    public int getCardPower(){
        return this.cardRank.getPower() + this.cardSuit.getPower();
    }

    @Override
    public String toString(){
        return String.format("Card name: %s of %s; Card power: %d",
                this.cardRank, this.cardSuit, this.getCardPower());
    }
}
