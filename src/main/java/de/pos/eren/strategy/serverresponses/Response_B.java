package de.pos.eren.strategy.serverresponses;

import de.pos.eren.strategy.CompressBehavior.Compress_deflate;

public class Response_B extends Response
{
    public Response_B(){
        setCompressBehavior(new Compress_deflate());
    }
}
