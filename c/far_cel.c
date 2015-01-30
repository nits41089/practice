#include <stdio.h> //includes standard input output library

/* Print Fahrenheit-Celcius table */
main()
{
	float fahr, celsius;
	float lower, upper, step;
	
	lower = 0;      // lower limit of the temperature scale
	upper = 300;	// upper limit of the temperature scale
	step = 20;      // step size
	
	fahr = lower;
	
	while(fahr <= upper){
		/* The below formula is inaccurate, because we are using int for calculations */
		/*	
		celsius = 5 * (fahr - 32) / 9;
		printf("%3d%6d\n", fahr, celsius); // specifying a width of 3 to fahr and 6 to celsius.
		*/
		
		/* Using floating points to get accurate results. We would also need to change the data type of all the variables to float */
		celsius = (5.0/9.0) * (fahr - 32.0) ;
		printf("%3.0f %6.1f\n", fahr, celsius);
		fahr = fahr + step;
	}
}
