
public abstract class PolynomialGrapher extends FunctionGrapher
{
	public abstract double[] coefficients();
	
	@Override
	public double yValue(double xValue)
	{
		double[] coefficients = coefficients();
		double y = 0;
		for(int i = coefficients.length - 1; i >= 0 ; i--)
		{
			y += coefficients[i] * Math.pow(xValue, i);
		}
		return y;
	}
}
