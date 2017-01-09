package istic.gla.vv.acr.probes;

import java.util.Map;

public class MethodExecuted {
	// identification de la methode
	private String methodId;
	private int count;
	private Map<String,Integer> reportMAp ;
	
	public void signalExecuted(){
		Integer oldValue = this.reportMAp.get(this.methodId);
		Integer newValue= new Integer(oldValue.intValue()+1);
		this.reportMAp.put(this.methodId, newValue);
	}
	

}
