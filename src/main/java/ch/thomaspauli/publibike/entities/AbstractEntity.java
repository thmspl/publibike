package ch.thomaspauli.publibike.entities;

public abstract class AbstractEntity implements IEntity {

    private Long id;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
