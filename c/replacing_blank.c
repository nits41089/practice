# include <stdio.h>

/* Replacing multiple blanks with single blank */

main(){
	int c, nb;
	nb = 0;

	while((c = getchar()) != EOF){
		if(c == ' '){
			++nb;
			if(nb > 1){
				c = '\0';
			}
		} else {
			nb = 0;
		}
		putchar(c);
	}
}
