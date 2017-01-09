package istic.gla.vv.acr.spoon.processing;

import istic.gla.vv.acr.spoon.template.TemplateExecuted;
import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtMethod;

public class MethodExecutedProcessor extends AbstractProcessor<CtMethod<?>>{

	public void process(CtMethod<?> arg0) {
		// TODO Auto-generated method stub
		TemplateExecuted templateExecuted = new TemplateExecuted();
		//arg0.setBody(templateExecuted.getBlock(arg0.getFactory().Class().cr));
		
		
	}

}
