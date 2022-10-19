package gameSales.concretes;

import gameSales.abstracts.GameService;
import gameSales.entities.Campaign;
import gameSales.entities.Game;
import gameSales.entities.Gamer;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : "+game.getName());
		
	}

	@Override
	public void remove(Game game) {
		System.out.println("Oyun silindi : "+game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi : "+game.getName());
		
	}

	@Override
	public void buy(Game game, Gamer gamer) {
		System.out.println(gamer.getFirstName() +" oyunu satýn aldý: "+game.getName()+" Ücreti: "+game.getUnitPrice());
		
	}

	@Override
	public void buy(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(gamer.getFirstName() +" oyunu satın aldı: "+game.getName()+". Kullanılan kampanya:  "+ campaign.getName()+". Ücreti: "+
				(game.getUnitPrice()-game.getUnitPrice()*campaign.getDiscount()/100));
		
	}

}
