package istic.gla.vv.acr.spoon.processing.processor;

import java.lang.reflect.Modifier;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;

import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.CodeFactory;
import spoon.reflect.factory.Factory;

public class MethodProcessor extends AbstractProcessor<CtMethod> {

	
	
		
	//add a code snipet to each method of asource code

	public void process(CtMethod arg0) {
		CtBlock methodBody =arg0.getBody();
		
		String methodId = arg0.getSimpleName();
		if(!(arg0.hasModifier(ModifierKind.STATIC))){
		
		String codeSnipet = "String methodId="+"\""+methodId+"\""+";\n"+"signalMethodExecuted(methodId)\n ";
		String codeSnipet2 ="prettyPrinter()";
		Factory factory = arg0.getFactory();
		CodeFactory codeFactory= factory.Code();
		CtCodeSnippetStatement cSStatement =codeFactory.createCodeSnippetStatement(codeSnipet);
		CtCodeSnippetStatement cSStatement2 =codeFactory.createCodeSnippetStatement(codeSnipet2);
		if(methodBody != null){
		methodBody.insertBegin(cSStatement2);
		methodBody.insertBegin(cSStatement);
		}
		}
		
	}

	
}
