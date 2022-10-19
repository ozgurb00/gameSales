package gameSales.abstracts;

public abstract class PersonManager implements PersonService{

	@Override
	public void add(Person person) throws Exception {
		System.out.println("Kişi eklendi : " + person.getFirstName());
		
	}

	@Override
	public void remove(Person person) {
		System.out.println("Kişi silindi : " + person.getFirstName());
		
	}

	@Override
	public void update(Person person) {
		System.out.println("Kişi silindi : " + person.getFirstName());
		
	}
	
}
