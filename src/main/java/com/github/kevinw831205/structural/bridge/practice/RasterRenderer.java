package com.github.kevinw831205.structural.bridge.practice;

public class RasterRenderer implements Renderer {

    @Override
    public String whatToRenderAs() {
        return "pixels";
    }
}
