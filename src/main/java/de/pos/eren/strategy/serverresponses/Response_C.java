package de.pos.eren.strategy.serverresponses;

import de.pos.eren.strategy.CompressBehavior.Compress_gzip;

public class Response_C extends Response
{
    public Response_C() {
        setCompressBehavior(new Compress_gzip());
    }
}
