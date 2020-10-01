public class Switchexample{

public enum Days{sun,mon,tue,hol}

public static void main(String[] args){

Days[] Daynow=Days.values();

for(Days now : Daynow){

switch(now){

case sun:
System.out.println("sunday");
break;

case mon:
System.out.println("monday");
break;

case tue:
System.out.println("tuesday");
break;

default:
System.out.println("Holiday");

}

}

}
}
