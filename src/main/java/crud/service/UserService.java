package crud.service;

import crud.model.User;
import crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service

//перехват Spring Data JPA
@Transactional
public class UserService {
    final
    UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void save (User user) {
        repository.save(user);
    }

    public List<User> getAll () {
        return (List<User>) repository.findAll();
    }

    public User get(Long id) {
        return repository.findById(id).get();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public void update(Long id, User updatedUser){
        User userToBeUpdated = get(id);
        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setLastName(updatedUser.getLastName());
        userToBeUpdated.setEmail(updatedUser.getEmail());
    }

    public List<User> search(String keyword) {
        return repository.search(keyword);
    }
}
