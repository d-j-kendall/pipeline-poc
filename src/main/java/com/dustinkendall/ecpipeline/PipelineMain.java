package com.dustinkendall.ecpipeline;

public class PipelineMain {

    public static void main(String[] args)
    {
        PipelineMain pipelineMain = new PipelineMain();
        System.out.println(pipelineMain.getMessage());
    }

    public String getMessage()
    {
        return "Every Commit Example Pipeline";
    }
}
