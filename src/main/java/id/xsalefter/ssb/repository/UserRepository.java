package id.xsalefter.ssb.repository;

import id.xsalefter.ssb.domain.User;

import java.util.stream.Stream;

public interface UserRepository {

    boolean hasData();
    Stream<User> findUsersWithDataConfig();
    void save(User user);
    void edit(User user);
    void delete(String userId);
}
