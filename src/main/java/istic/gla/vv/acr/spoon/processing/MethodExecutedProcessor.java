package istic.gla.vv.acr.spoon.processing;

import istic.gla.vv.acr.spoon.template.TemplateExecuted;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.CodeFactory;
import spoon.reflect.factory.Factory;

public class MethodExecutedProcessor extends AbstractProcessor<CtMethod<?>>{

	public void process(CtMethod<?> arg0) {
		String codesnipet ="if (this.reportMap == null){this.reportMap=new HashMap();}\n"+ 
	"Integer oldValue = this.reportMap.get(methodId);\n"+
		"if(oldValue==null){\n"+
				"Integer newValue= new Integer(1);	\n"+
		" this.reportMap.put(methodId, newValue);}\n"+
		"else{ Integer newValue= new Integer(oldValue.intValue()+1);\n"+
		"this.reportMap.put(methodId, newValue);\n"+
		"}";
		
		Factory factory = arg0.getFactory();
		CodeFactory codeFactory = factory.Code();
		CtStatement codeStatemenet =codeFactory.createCodeSnippetStatement(codesnipet);
		
		if(arg0.getSimpleName().equals("signalMethodExecuted")){
			arg0.getBody().addStatement(codeStatemenet);
		}
		
	}

}
