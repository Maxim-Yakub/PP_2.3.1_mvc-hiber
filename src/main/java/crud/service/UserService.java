package crud.service;

import crud.model.User;

import java.util.List;

public interface UserService {
     void save(User user);
    List<User> getAll ();
    User get(Long id);
    void delete(Long id);
    void update(Long id, User updatedUser);
    List<User> search(String keyword);


}
