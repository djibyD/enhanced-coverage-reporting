package istic.gla.vv.acr.spoon.processing.runner;

import istic.gla.vv.acr.spoon.processing.processor.ClassProcessor;
import istic.gla.vv.acr.spoon.processing.processor.MethodExecutedProcessor;
import istic.gla.vv.acr.spoon.processing.processor.MethodProcessor;
import spoon.Launcher;

public class Runner {
	
	public static void main(String[] args){
//		String path = args[0];
//		String outsrcPath= path+"/spooned";
//		
		String path ="/home/steve/mworkspace/istic/vv/tp/testResources/wordbrain-solver/src/main";
		String outsrcPath="/home/steve/mworkspace/istic/vv/workspace/wordbrainspooned/src/main";
//		
//		String path2 = "/home/steve/mworkspace/istic/vv/workspace/test/src/main";
//		String path3 ="/home/steve/mworkspace/istic/vv/tp/testResources/pairwise/src/main";
//		String outsrcPath3="/home/steve/mworkspace/istic/vv/tp/spoonedressources/pairwisespooned/src/main";
//		String outsrcPath2="/home/steve/mworkspace/istic/vv/workspace/testspooned/";
//		String outbinPath2="/home/steve/mworkspace/istic/vv/workspace/testspooned/";
		Launcher launcher = new Launcher();
		launcher.addInputResource(path);
		launcher.setSourceOutputDirectory(outsrcPath);
		ClassProcessor cProcessor = new ClassProcessor();
		MethodProcessor mProcessor = new MethodProcessor();
		MethodExecutedProcessor methodExecutedProcessor= new MethodExecutedProcessor();
		launcher.addProcessor(mProcessor);
		launcher.addProcessor(cProcessor);
		launcher.addProcessor(methodExecutedProcessor);
		
		launcher.run();
		
	}

}
