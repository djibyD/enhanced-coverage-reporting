package istic.gla.vv.acr.spoon.processing;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;

import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.CodeFactory;
import spoon.reflect.factory.Factory;

public class MethodProcessor extends AbstractProcessor<CtMethod> {

	
	
		
	//add a code snipet to each method of asource code

	public void process(CtMethod arg0) {
		CtBlock methodBody =arg0.getBody();
		String methodId = arg0.getSimpleName();
		String codeSnipet = "methodId="+methodId+";\n"+"this.signalMethodExecuted(String methodId)\n ";
		Factory factory = arg0.getFactory();
		CodeFactory codeFactory= factory.Code();
		CtCodeSnippetStatement cSStatement =codeFactory.createCodeSnippetStatement(codeSnipet);
		if(methodBody != null){
		methodBody.insertBegin(cSStatement);
		}
		
	}

	
}