package Aufgabe_6;


public class Hofstadter {

	
	public int h(int n) {
	  if (n > 2) {
	      return (h(n-h(n-1))+h(n-h(n-2)));
	  }
	  else {
	      return 1;
	  }
	}
	
}
