package ch.thomaspauli.publibike.network.utils;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.Map;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UrlBuilder {

    private static final Logger LOG = LoggerFactory.getLogger(UrlBuilder.class);

    private static final Map<RequestType, String> UrlMap = new HashMap<>();

    static {
        UrlMap.put(RequestType.STATION,     "https://api.publibike.ch/v1/public/stations/%d");
        UrlMap.put(RequestType.STATIONS,    "https://api.publibike.ch/v1/public/stations");
    }

    // locked due to utility functionality.
    private UrlBuilder() {}

    /**
     *
     * @param type
     * @param params
     * @return
     */
    public static URI build(RequestType type, Object... params) {
        String url = String.format(UrlMap.get(type), params);

        LOG.trace("Build url string for a " + type + " request: " + url);

        try {
            return new URI(url);
        } catch (URISyntaxException e) {
            LOG.error("Failed to create an URI object for the request type " + type, e);
        }

        return null;
    }
}
