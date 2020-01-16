package instruments;

import songs.IVisitor;

/**
 * This class is the main part of the Visitor design pattern.
 * By using this simple accept method you can add new SONGS without needing to worry about dependancy, 
 * and you do not need to change all instruments after adding a new SONG.
 * 
 * I have not implemented two-way Visitor pattern (if there even is such a thing?),
 * which means this pattern doesn't work both ways, so you can't add new instruments without having to change the interface on the songs.
 * So make sure to add all the instruments before you add any songs.
 * 
 * This pattern is used mostly with payment etc, like you can have different Credit Cards which gives different kind of 
 * savings depending on what you buy, the offers.
 * Usually banks (or others) have maybe 2-3 different Credit Cards, Bronze-Silver-Gold. (Or in this case, different instruments).
 * But the merchants can offer various stuff with different savings depending on your Credit Card,
 *  like food, online purchase, gas prices (or in this case, different songs).
 *  
 *  There is A LOT more different kind of purchaes than Credit Cards, and there is A LOOOOT more songs than instruments.
 * @author Jesper
 *
 */
public interface IInstrument {
	
	void accept(IVisitor visitor);
	
}
