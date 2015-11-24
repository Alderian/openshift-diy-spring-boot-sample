package ar.com.alderian.demo.openshift.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "item")
public class Item extends AbstractTimestampEntity {

    @NotEmpty
    protected String code;
    
    protected String source;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
