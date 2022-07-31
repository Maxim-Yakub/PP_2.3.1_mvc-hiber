package crud.repo;

import crud.model.User;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends CrudRepository<User, Long> {
}
