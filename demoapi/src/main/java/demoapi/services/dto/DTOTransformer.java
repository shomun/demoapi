package demoapi.services.dto;

public interface DTOTransformer<S,T> {

	T transform(S entity);
	
}
