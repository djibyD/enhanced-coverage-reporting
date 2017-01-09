package istic.gla.vv.acr.spoon.processing;


import istic.gla.vv.acr.spoon.template.TemplateClass;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;
import spoon.template.Substitution;

public class ClassProcessor extends AbstractProcessor<CtClass<?>> {

	public void process(CtClass<?> arg0) {
		
		TemplateClass templateClass =new TemplateClass();
		
		Substitution.insertAllFields(arg0, templateClass);
		Substitution.insertAllMethods(arg0, templateClass);
		
		
	}

	
	
	}


