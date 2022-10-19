package gameSales.abstracts;

import gameSales.entities.Campaign;
import gameSales.entities.Game;
import gameSales.entities.Gamer;

public interface GameService {
	void add(Game game);
	void remove(Game game);
	void update(Game game);
	
	void buy(Game game,Gamer gamer);
	void buy(Game game,Gamer gamer,Campaign campaign);
}
