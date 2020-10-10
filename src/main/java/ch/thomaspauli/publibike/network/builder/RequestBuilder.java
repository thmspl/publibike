package ch.thomaspauli.publibike.network.builder;


import ch.thomaspauli.publibike.entities.AbstractEntity;
import ch.thomaspauli.publibike.network.MultiRequest;
import ch.thomaspauli.publibike.network.SingleRequest;

public class RequestBuilder {

    // locked
    private RequestBuilder() {}

    public <E extends AbstractEntity> MultiRequest<E> getMultiRequest(E entity) {
        return null;
    }

    public <E extends AbstractEntity> SingleRequest<E> getSingleRequest(E entity) {
        return null;
    }
}
