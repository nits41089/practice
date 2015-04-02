# include <stdio.h>

/* Counting space, newlines and tabs */

main(){
	int c, ns, nl, nt;
	
	ns = nl = nt = 0;
	
	while((c = getchar()) != EOF){
		if(c == ' ')
			++ns;
		if(c == '\t')
			++nt;
		if(c == '\n')
			++nl;
	}

	printf("Blank space are %d \n", ns);
	printf("Tabs are %d \n", nt);
	printf("New lines are  %d \n", nl);
}
