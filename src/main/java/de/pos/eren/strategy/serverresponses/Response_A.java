package de.pos.eren.strategy.serverresponses;

import de.pos.eren.strategy.CompressBehavior.Compress_br;

public class Response_A extends Response
{
    public Response_A() {
        setCompressBehavior(new Compress_br());
    }
}
