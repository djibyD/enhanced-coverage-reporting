package istic.gla.vv.acr.spoon.processing.processor;

import istic.gla.vv.acr.spoon.template.TemplateExecuted;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.CodeFactory;
import spoon.reflect.factory.Factory;

public class MethodExecutedProcessor extends AbstractProcessor<CtMethod<?>>{

	public void process(CtMethod<?> arg0) {
		String codesnipet1 ="if (this.reportMap == null){this.reportMap=new java.util.HashMap();}\n"+ 
	"Integer oldValue = (Integer) this.reportMap.get(arg0);\n"+
		"if(oldValue==null){\n"+
				"Integer newValue= new Integer(1);	\n"+
		" this.reportMap.put(arg0, newValue);}\n"+
		"else{ Integer newValue= new Integer(oldValue.intValue()+1);\n"+
		"this.reportMap.put(arg0, newValue);\n"+
		"}";
		
		Factory factory = arg0.getFactory();
		CodeFactory codeFactory = factory.Code();
		CtStatement codeStatemenet1 =codeFactory.createCodeSnippetStatement(codesnipet1);
		
		if(arg0.getSimpleName().equals("signalMethodExecuted")){
			arg0.getBody().addStatement(codeStatemenet1);
		}
		
		String codesnipet2 ="if(this.reportMap != null){\n"+
		"//int taille = this.reportMap.size();\n"+
		"//for(int i=0; i<taille;i++){\n"+
				
		"System.out.println(this.getClass().getName()+reportMap.toString());\n"+
		"/*}*/\n}";
					
					
					CtStatement codeStatemenet2 =codeFactory.createCodeSnippetStatement(codesnipet2);
					
					if(arg0.getSimpleName().equals("prettyPrinter")){
						arg0.getBody().addStatement(codeStatemenet2);
					}		
	}

}
