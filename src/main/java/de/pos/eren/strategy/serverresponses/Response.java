package de.pos.eren.strategy.serverresponses;

import de.pos.eren.strategy.CompressBehavior.CompressBehavior;

public abstract class Response
{
    private CompressBehavior compressBehavior;

    void setCompressBehavior(CompressBehavior compressBehavior) {
        this.compressBehavior = compressBehavior;
    }

    public void compressAndSendResponse() {
        compressBehavior.doCompress();
    }
}
