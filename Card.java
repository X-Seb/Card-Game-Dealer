public class Card {
    
    private String suit;
    private String rank;
    
    // 2 parameter Card constructor
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    // Getter methodds:
    
    public String getSuit(){
        return this.suit;
    }
    
    public String getRank(){
        return this.rank;
    }
    
    // Setter methods:
    
    public void setSuit(String suit){
        this.suit = suit;
    }
    
    public void setRankr(String rank){
        this.rank = rank;
    }
    
    // Override toString method
    @Override
    public String toString(){
        return this.rank + " of " + this.suit;
    }
}
