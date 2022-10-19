package gameSales.concretes;

import gameSales.abstracts.Person;
import gameSales.abstracts.PersonCheckService;

public class PersonCheckManager implements PersonCheckService{

	@Override
	public Boolean checkIfRealPerson(Person person){
		return true;
	}

}
