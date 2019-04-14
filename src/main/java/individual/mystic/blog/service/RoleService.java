package individual.mystic.blog.service;

import individual.mystic.blog.pojo.Role;
import reactor.core.publisher.Mono;

public interface RoleService {

    Mono<Role> save(Role role);

    Mono<Void> remove(Role role);

}
