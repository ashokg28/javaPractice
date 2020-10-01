class OperatorExample{
	public static void main(String []args){

int a=10;
int b=5;
int c=20;
//boolean c = true;
//boolean d= false;

System.out.println(a>b||a<c);
System.out.println(a>b|a<c);

System.out.println(a>b||a++<c);
System.out.println(a);

System.out.println(a>b|a++<c);
System.out.println(a);
	}
}
