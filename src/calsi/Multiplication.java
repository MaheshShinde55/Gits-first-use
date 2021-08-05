package calsi;

public class Multiplication implements Operate {

	@Override
	public Double getResult(Double... numbers) {
		Double result =1.0;
		
		for(Double num : numbers) {
			
			result *=num;
		}
		return result;
	}

}
