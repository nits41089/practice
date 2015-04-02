# include <stdio.h>

/* Copying input to output 1st version */
main(){
	int c;
	
	while(c = (getchar() != EOF)){
		printf("Value of c is %d\n", c);
		putchar(c);
		c = getchar();
	}
	
	/* Second version of the code - Value of EOF*/
	printf("Value of EOF is  %d", c);
}
