package tddjunit;

public class tddjuint {

	public String remove(String string) {
		// TODO Auto-generated method stub
		int l = 0;
	
		while(l<2) {
			if(string.charAt(0)=='A') {
				string=string.substring(1,string.length());	
			}
			else if(string.charAt(1)=='A'&& l==0) {
				string = string.charAt(0)+string.substring(2,string.length());
			}
			l = l+1;
		}
		
		
		return string;
	}
	
}
