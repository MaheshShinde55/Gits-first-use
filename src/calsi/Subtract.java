package calsi;

public class Subtract implements Operate{
	
	@Override
	public Double getResult(Double... numbers) {
		Double sub =0.0;
		
		for(Double num : numbers) {
			sub -= num;
			
		}
		
		return sub;
			
		}
	}
