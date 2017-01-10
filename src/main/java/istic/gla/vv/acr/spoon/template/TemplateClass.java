package istic.gla.vv.acr.spoon.template;

import java.util.HashMap;

import org.junit.runners.Parameterized.Parameter;

import spoon.template.ExtensionTemplate;

public class TemplateClass extends ExtensionTemplate {
	@Parameter
	public Class<?> templateClass = this.getClass();
	private HashMap<String,Integer> reportMap = new HashMap<String,Integer>();
	
	public void signalMethodExecuted(String methodId){
		
		Integer oldValue = this.reportMap.get(methodId);
		if(oldValue==null){Integer newValue= new Integer(1);
		this.reportMap.put(methodId, newValue);
		}else{
		Integer newValue= new Integer(oldValue.intValue()+1);
		this.reportMap.put(methodId, newValue);
		}
		
	
	
	
	}
	public void prettyPrinter(){
		int taille = this.reportMap.size();
		for(int i=0; i<taille;i++){
		System.out.println(this.reportMap.get(i).toString());
		}
	}
	

}
