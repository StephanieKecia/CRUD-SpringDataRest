package projeto_crud.rest.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import projeto_crud.rest.entity.User;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource(
        path = "users",
        collectionResourceRel = "users"
)
public interface UserRestRepository extends JpaRepository<User, UUID> {

    List<User> findByName(@Param("name") String name);

    
    @Override
    @RestResource(exported = false)
    void deleteById(UUID uuid);
}
