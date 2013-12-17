
public abstract class PolynomialGrapher extends FunctionGrapher
{
	public abstract double[] coefficients();
	
	@Override
	public double yValue(double xValue)
	{
		double[] coefficients = coefficients();
		double y = 0;
		for(int i = 0; i < coefficients.length; i++)
		{
			y += coefficients[i] * Math.pow(xValue, (coefficients.length - i));
		}
		return y;
	}
}
