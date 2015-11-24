package ar.com.alderian.demo.openshift.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import ar.com.alderian.demo.openshift.model.Item;

@RepositoryRestResource(path = "item")
public interface ItemRepository extends PagingAndSortingRepository<Item, Integer> {

    @RestResource(path = "byCode")
    List<Item> findByCode(@Param("code") String code);

}
