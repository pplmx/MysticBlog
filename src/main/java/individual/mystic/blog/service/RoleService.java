package individual.mystic.blog.service;

import individual.mystic.blog.pojo.Role;
import reactor.core.publisher.Mono;

public interface RoleService {

    /**
     * save role
     * @param role Role
     * @return Role
     */
    Mono<Role> save(Role role);

    /**
     * remove role
     * @param role Role
     * @return the result
     */
    Mono<Void> remove(Role role);

}
