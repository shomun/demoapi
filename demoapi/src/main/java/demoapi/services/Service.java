package demoapi.services;

import java.util.List;

public interface Service<I,O> {

	List<O> list();
	
	O create(I resource);
	
	O update(I resource);
	
	void delete(int id);
	
	O get(int id);
	
}
