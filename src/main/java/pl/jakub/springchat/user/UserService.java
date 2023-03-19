package pl.jakub.springchat.user;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);

    User update(Long id, User updatedUser);

    void delete(Long id);
}
