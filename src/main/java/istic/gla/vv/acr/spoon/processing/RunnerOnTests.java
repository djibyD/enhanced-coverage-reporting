package istic.gla.vv.acr.spoon.processing;

import spoon.Launcher;

public class RunnerOnTests {
	
	public static void main(String[] args){
    String inputPath="/home/steve/mworkspace/istic/vv/tp/testResources/wordbrain-solver/test/";
    String outPath ="home/steve/mworkspace/istic/vv/workspace/testspooned";
	Launcher launcher = new Launcher();
	DefaultClassProcessor defaultClassProcessor= new DefaultClassProcessor();
	launcher.addProcessor(defaultClassProcessor);
	launcher.addInputResource(inputPath);
	launcher.setSourceOutputDirectory(outPath);
	launcher.run();
	
	
	}
	
}
