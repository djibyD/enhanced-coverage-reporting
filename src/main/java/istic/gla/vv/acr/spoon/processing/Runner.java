package istic.gla.vv.acr.spoon.processing;

import spoon.Launcher;

public class Runner {
	
	public static void main(String[] args){
		String path ="/home/steve/mworkspace/istic/vv/tp/testResources/wordbrain-solver/src/main";
		String path2 = "/home/steve/mworkspace/istic/vv/workspace/test/src/";
		String path3 ="/home/steve/mworkspace/istic/vv/tp/testResources/junit4/src/main";
		String outsrcPath3="/home/steve/mworkspace/istic/vv/tp/spoonedressources/junit4spooned/src";
		String outsrcPath2="/home/steve/mworkspace/istic/vv/workspace/testspooned/";
		String outbinPath2="/home/steve/mworkspace/istic/vv/workspace/testspooned/";
		String outsrcPath="/home/steve/mworkspace/istic/vv/workspace/wordbrainspooned/src/main";
		Launcher launcher = new Launcher();
		launcher.addInputResource(path3);
		launcher.setSourceOutputDirectory(outsrcPath3);
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
