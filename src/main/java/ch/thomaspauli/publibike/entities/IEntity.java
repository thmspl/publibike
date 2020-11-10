package ch.thomaspauli.publibike.entities;

/**
 * {@link IEntity}
 * 
 * @author thomas pauli | pauli.solutions
 */
public interface IEntity {

    /**
     * Returns the id of the given entity.
     *
     * @return The id of the given entity.
     */
    Long getId();

    /**
     * Sets the id for the given entity.
     *
     * @param id The id for the given entity.
     */
    void setId(Long id);

    /* ------------------------------------ */

    /**
     * Returns the name of the given entity.
     *
     * @return The name of the given entity.
     */
    String getName();

    /**
     * Sets the name for the given entity.
     *
     * @param name The name for the given entity.
     */
    void setName(String name);
}
