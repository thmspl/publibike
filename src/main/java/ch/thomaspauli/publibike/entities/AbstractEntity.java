package ch.thomaspauli.publibike.entities;

/**
 * {@link AbstractEntity}
 * 
 * @author thomas pauli | pauli.solutions
 */
public abstract class AbstractEntity implements IEntity {

    private Long id;

    private String name;

    /**
     * @see AbstractEntity@getId()
     */
    @Override
    public Long getId() {
        return id;
    }

    /**
     * @see AbstractEntity@setId(Long)
     */
    @Override
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @see AbstractEntity@getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @see AbstractEntity@setName(String)
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }
}
