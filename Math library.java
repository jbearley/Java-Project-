public class Math {
	public static double abs(double x)
	{
		if (x<0) {
			x = -x;} 
		return x;
			

	}
	
	public static double dist(double x, double y)
	{
		return abs((x-y));

	}
	
	public static double maxDistance(double array1[], double array2[], int size)
	{
		double max = 0;
		double a;
		for(int i=0; i < size; i++) {
		a = dist(array1[i],array2[i]);
		if (a > max) {
				max = a;
				}
		}
		return max;
		

	}
}
