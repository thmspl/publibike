package ch.thomaspauli.publibike.entities;

public interface IEntity {

    /**
     * Returns the id of the given entity.
     *
     * @return The id of the given entity.
     */
    Long getId();

    /**
     * Sets the id for the given entity to set.
     *
     * @param id The id for the given entity.
     */
    void setId(Long id);
}
