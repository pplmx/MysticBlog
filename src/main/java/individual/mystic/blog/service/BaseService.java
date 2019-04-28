package individual.mystic.blog.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Base Service Interface
 *
 * @param <T>  the domain type the repository manages
 * @param <ID> the type of the id of the entity the repository manages
 */
public interface BaseService<T, ID> {

    /**
     * add or update T
     *
     * @param entity T
     * @return T
     */
    Mono<T> save(T entity);

    /**
     * find T by ID
     *
     * @param id ID
     * @return T
     */
    Mono<T> findById(ID id);

    /**
     * find all T
     *
     * @return List<T>
     */
    Flux<T> findAll();

    /**
     * remove T by ID
     *
     * @param id ID
     * @return void
     */
    Mono<Void> removeById(ID id);

}
