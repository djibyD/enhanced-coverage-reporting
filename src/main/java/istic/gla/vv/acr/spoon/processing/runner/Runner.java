package istic.gla.vv.acr.spoon.processing.runner;

import istic.gla.vv.acr.spoon.processing.processor.ClassProcessor;
import istic.gla.vv.acr.spoon.processing.processor.MethodExecutedProcessor;
import istic.gla.vv.acr.spoon.processing.processor.MethodProcessor;
import spoon.Launcher;

public class Runner {
	
	public static void main(String[] args){
		String path = args[0];
		String outsrcPath= path+"/spooned";
//		
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
