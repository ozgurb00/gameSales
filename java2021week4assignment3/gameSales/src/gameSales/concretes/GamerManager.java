package gameSales.concretes;

import gameSales.abstracts.GamerService;
import gameSales.abstracts.Person;
import gameSales.abstracts.PersonCheckService;
import gameSales.abstracts.PersonManager;

public class GamerManager extends PersonManager implements GamerService{

	private PersonCheckService personCheckService;
	public GamerManager(PersonCheckService personCheckService) {
	
		this.personCheckService = personCheckService;
	}
	
	@Override
	public void buyGame() {
		System.out.println("Oyunu satın aldın gamer");
		
	}
	
	@Override
	public void add(Person person) throws Exception{
		
		if(personCheckService.checkIfRealPerson(person)) {
			super.add(person);
		}else {
			throw new Exception("Kiþi doðrulanamadý..");
		}
		
	}

}
