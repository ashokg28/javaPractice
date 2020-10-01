public class Forloop{

	public static void main(String[] args){
//int i=10;

for(char i='A';i<='F';++i){

for(char j='A';j<=i;++j){
System.out.print( i+" " );
}
System.out.println();
}

for(char k='F';k>='A';k--){

for(char l='A';l<=k;l++){
System.out.print( k+" " );
}
System.out.println();
}


	}
}
