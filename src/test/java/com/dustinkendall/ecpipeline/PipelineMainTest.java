package com.dustinkendall.ecpipeline;

import static org.junit.jupiter.api.Assertions.*;

class PipelineMainTest {

    @org.junit.jupiter.api.Test
    void getMessage() {
        PipelineMain pipelineMain = new PipelineMain();
        assertEquals("Every Commit Example Pipeline", pipelineMain.getMessage(), "Messages should match!");
    }
}