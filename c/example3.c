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
	printf("Fahrenheit to Celsius conversion table\n\n");	
	while(fahr <= upper){
		celsius = (5.0/9.0) * (fahr - 32.0) ;
		printf("%3.0f %6.1f\n", fahr, celsius);
		fahr = fahr + step;
	}
}
