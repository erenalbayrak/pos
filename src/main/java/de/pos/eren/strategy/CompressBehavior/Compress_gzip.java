package de.pos.eren.strategy.CompressBehavior;

public class Compress_gzip implements CompressBehavior
{
    @Override
    public void doCompress()
    {
        System.out.println("Compress gzip");
    }
}
