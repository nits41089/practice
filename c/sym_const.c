/* The program introduces symbolic constant */

#include <stdio.h>
#define LOWER 0	// #define defines a symbolic constant or symbolic name to be a particular string of characters
#define UPPER 300
#define STEP 20

main(){
	int fahr;
	
	for(fahr = LOWER; fahr <= UPPER; fahr = fahr + STEP){
		printf("%3d %6.1f\n", fahr, (5.0/9.0) * (fahr - 32));
	}
}
