# include <stdio.h>

/* Counts character in input 1st version */
main(){
	long nc = 0;
	
	while(getchar() != EOF){
		nc++;
	}
	printf("%ld\n", nc);
}
