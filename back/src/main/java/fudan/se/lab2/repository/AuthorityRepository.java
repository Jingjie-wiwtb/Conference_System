package fudan.se.lab2.repository;

import fudan.se.lab2.domain.Authority;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AuthorityRepository extends CrudRepository<Authority, Long> {
    Authority findByAuthName(String authName);
}
