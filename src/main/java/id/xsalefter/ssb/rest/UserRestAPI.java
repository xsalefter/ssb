package id.xsalefter.ssb.rest;

import id.xsalefter.ssb.domain.User;
import id.xsalefter.ssb.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserRestAPI {

    private static final ResponseEntity<?> OK = ResponseEntity.ok().build();

    private final UserRepository userRepository;

    public UserRestAPI(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public ResponseEntity<?> showUser() {
        return ResponseEntity.ok(userRepository.findUsersWithDataConfig());
    }

    @PutMapping("/users")
    public ResponseEntity<?> addUser(@RequestBody UserVO userVO) {
        userRepository.save(userVO.toUser());
        return OK;
    }

    @PostMapping("/users")
    public ResponseEntity<?> editUser(@RequestBody UserVO userVO) {
        userRepository.edit(userVO.toUser());
        return OK;
    }

    @DeleteMapping("/users/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable String userId) {
        userRepository.delete(userId);
        return OK;
    }

}
