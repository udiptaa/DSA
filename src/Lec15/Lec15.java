package Lec15;

public class Lec15 {

	public static void main(String[] args) {
		
		char path[][]= {{' ',' ',' ',' '},
				        {' ',' ','X',' '},
				        {' ',' ', ' ',' '},
				        {' ','X','X',' '}};
		
		find("",0,0,3,3,path);
	}
	public static void find
	(String ans, int cc,int cr, int dc, int dr,
			char path[][]) {
		
		if(cc==dc&& cr==dr) {
			System.out.println(ans);
			return ;
			
		}
		if(cc>dc ||cr>dr ||path[cr][cc]=='X') return;
		
		find(ans+"H",cc+1,cr,dc,dr,path);
		find(ans+"V",cc,cr+1,dc,dr,path);
		find(ans+"D",cc+1,cr+1,dc,dr,path);
		
		
		
		
	}

}
