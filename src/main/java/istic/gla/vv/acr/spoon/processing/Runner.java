package istic.gla.vv.acr.spoon.processing;

import spoon.Launcher;

public class Runner {
	
	public static void main(String[] args){
		String path ="/home/steve/mworkspace/istic/vv/tp/testResources/wordbrain-solver/src/";
		String path2 = "/home/steve/mworkspace/istic/vv/workspace/test/src";
		String outsrcPath2="/home/steve/mworkspace/istic/vv/workspace/testspooned/";
		String outbinPath2="/home/steve/mworkspace/istic/vv/workspace/testspooned/";
		
		Launcher launcher = new Launcher();
		launcher.addInputResource(path2);
		launcher.setSourceOutputDirectory(outsrcPath2);
		launcher.setBinaryOutputDirectory(outbinPath2);
		ClassProcessor cProcessor = new ClassProcessor();
		MethodProcessor mProcessor = new MethodProcessor();
		MethodExecutedProcessor methodExecutedProcessor= new MethodExecutedProcessor();
		launcher.addProcessor(mProcessor);
		launcher.addProcessor(cProcessor);
		launcher.addProcessor(methodExecutedProcessor);
		
		launcher.run();
		
	}

}
