package com.dustinkendall.ecpipeline;

public class PipelineMain {

    public static void main(String[] args)
    {
        System.out.println("Added crash bug fix here");
        PipelineMain pipelineMain = new PipelineMain();
        System.out.println(pipelineMain.getMessage());
    }

    public String getMessage()
    {
        return "Every Commit Example Pipeline";
    }
}
