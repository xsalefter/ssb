package id.xsalefter.ssb.mock;

import id.xsalefter.ssb.domain.User;
import id.xsalefter.ssb.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Repository
public class UserRepositoryMock implements UserRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public boolean hasData() {
        return !users.isEmpty();
    }

    @Override
    public Stream<User> findUsersWithDataConfig() {
        return users.stream();
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void edit(User user) {
        String id = user.getUserId();
        Optional<User> toRemove = users.stream().filter(u -> u.getUserId().equals(id)).findFirst();
        if (toRemove.isPresent()) {
            users.remove(toRemove.get());
            users.add(user);
        }

    }

    @Override
    public void delete(String userId) {
        Optional<User> toRemove = users.stream().filter(u -> u.getUserId().equals(userId)).findFirst();
        if (toRemove.isPresent()) {
            users.remove(toRemove.get());
        }
    }
}
