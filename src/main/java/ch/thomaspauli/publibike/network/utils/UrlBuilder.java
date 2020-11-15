package ch.thomaspauli.publibike.network.utils;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.Map;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link UrlBuilder}
 *
 * @author thomas pauli | pauli.solutions
 */
public class UrlBuilder {

    // logger
    private static final Logger LOG = LoggerFactory.getLogger(UrlBuilder.class);

    private static final Map<RequestType, String> URL_MAP = new HashMap<>();

    static {
        URL_MAP.put(RequestType.STATION,     "https://api.publibike.ch/v1/public/stations/%d");
        URL_MAP.put(RequestType.STATIONS,    "https://api.publibike.ch/v1/public/stations");
    }

    // locked due to utility functionality.
    private UrlBuilder() {}

    /**
     * Build the url with the given parameters and the given {@link RequestType}.
     *
     * @param type The {@link RequestType} for which the {@link URI} should be builded.
     * @param params The parameters which should be added to the {@link URI}.
     * @return The builded {@link URI} with the given parameters and the given {@link RequestType}.
     */
    public static URI build(RequestType type, Object... params) {
        String url = String.format(URL_MAP.get(type), params);

        LOG.trace("Build url string for a " + type + " request: " + url);

        try {
            return new URI(url);
        } catch (URISyntaxException e) {
            LOG.error("Failed to create an URI object for the request type " + type, e);
        }

        return null;
    }
}
