package control;

import java.io.IOException;
import java.math.BigDecimal;

import model.MarketFeed;

public class Engine {
	
	public static void main(String[] args){
		MarketFeed feed = new MarketFeed("SPY");
		
		try {
			double d = feed.getQuote();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
