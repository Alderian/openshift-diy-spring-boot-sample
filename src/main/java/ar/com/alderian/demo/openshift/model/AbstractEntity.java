package ar.com.alderian.demo.openshift.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    public void setId(Integer id) {
	this.id = id;
    }

    public Integer getId() {
	return id;
    }

}