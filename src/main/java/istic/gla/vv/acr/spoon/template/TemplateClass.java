package istic.gla.vv.acr.spoon.template;

import java.util.HashMap;

import org.junit.runners.Parameterized.Parameter;

import spoon.template.ExtensionTemplate;

public class TemplateClass extends ExtensionTemplate {
	@Parameter
	public Class<?> templateClass = this.getClass();
	HashMap<String,Integer> reportMap = new HashMap<String,Integer>();
	public void signalMethodExecuted(String methodId){
		
		Integer oldValue = this.reportMap.get(methodId);
		if(oldValue==null){Integer newValue= new Integer(1);
		this.reportMap.put(methodId, newValue);
		}else{
		Integer newValue= new Integer(oldValue.intValue()+1);
		this.reportMap.put(methodId, newValue);
		}
		
		
	}
	
	
	

}
