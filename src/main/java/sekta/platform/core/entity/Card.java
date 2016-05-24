package sekta.platform.core.entity;

import javax.persistence.Entity;

@Entity
public class Card extends EntityModel{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
