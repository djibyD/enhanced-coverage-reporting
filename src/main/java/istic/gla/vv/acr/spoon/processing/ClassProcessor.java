package istic.gla.vv.acr.spoon.processing;


import istic.gla.vv.acr.spoon.template.TemplateClass;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.TypeFactory;
import spoon.template.Substitution;

public class ClassProcessor extends AbstractProcessor<CtClass<?>> {

	public void process(CtClass<?> arg0) {
		
		TemplateClass templateClass =new TemplateClass();
		//templateClass.apply(arg0);
		
		Substitution.insertAllFields(arg0, templateClass);
		Substitution.insertAllMethods(arg0, templateClass);
		CtConstructor constructor = arg0.getFactory().Constructor().createDefault(arg0);
		constructor.addModifier(ModifierKind.PRIVATE);
		arg0.removeConstructor(constructor);
		
		
//		CtType<java.util.HashMap<String, Integer>> hashMapClassType = arg0.getFactory().Type().get(new java.util.HashMap<String, Integer>().getClass());
//		Substitution.insertField(hashMapClassType, templateClass,templateClass.apply(arg0).getField("reportMap"));
//	TypeFactory typeFactory =arg0.getFactory().Type();
		//Substitution.substitute(templateClass, arg0.getFactory().Type().get(new istic.gla.vv.acr.spoon.template.TemplateClass().getClass()));
		//Substitution.insertMethod(arg0, templateClass,);
	
		//Substitution.substitute(templateClass, typeFactory.get(new TemplateClass().getClass()));
	}

	
	
	}


