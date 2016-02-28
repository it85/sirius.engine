package control;

import java.io.IOException;

import model.CandleStick;
import model.MarketFeed;

public class Engine {
	
	public static void main(String[] args){
		MarketFeed feed = new MarketFeed("SPY", 60);
		
		
		try {
			CandleStick d = feed.getQuote();
			CandleStick x = d;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
