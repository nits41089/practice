#include <stdio.h>

main(){
	/* Print Fahrenheit-Celsius table */

	int  fahr;
	
	/* Fahr to Celsius program can be reduced using for loop */

	for (fahr = 0; fahr <= 300; fahr = fahr + 20){
		printf("%3d %6.1f\n", fahr, (5.0/9.0) * (fahr - 32));
	}
}
