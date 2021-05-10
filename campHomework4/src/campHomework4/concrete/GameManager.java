package campHomework4.concrete;

import campHomework4.abstracts.IGameService;
import campHomework4.entities.Game;


public class GameManager implements IGameService{

	@Override
	public void add(Game game) {
		System.out.println("Game added : " + game.getName());
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated : " + game.getName());
		
	}
	
	@Override
	public void delete(Game game) {
		System.out.println("Game deleted : " + game.getName());
		
	}
}
