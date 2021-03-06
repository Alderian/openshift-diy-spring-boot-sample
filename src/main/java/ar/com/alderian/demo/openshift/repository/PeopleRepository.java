package ar.com.alderian.demo.openshift.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ar.com.alderian.demo.openshift.model.Person;

import java.util.List;

@RepositoryRestResource(path = "people", collectionResourceRel = "person", itemResourceRel = "person")
public interface PeopleRepository extends PagingAndSortingRepository<Person, Integer> {

    @RestResource(path = "byLastName")
    List<Person> findByLastName(@Param("lastName") String lastName);

}
