 Initilization Rules in java

Default Rule:
  1- Class Scope
    all variables are implicitly initialized at object instanciation time
        
  2- Local scope

.....................................................  
  class Scope 
.....................................................
  class Abc {
     int k; // class scope initialized with zero
    void m() {
        int j=k;//store zero at j(Alocal scope variable)
         System.out.println(j);
    }

  }
class Test {
public static void main(String o[]){
Abc ob= new Abc();
ob.m();
}
}
 
.........................................................
Local Scope 
.....................................................

class Abc {
     int k;
    void m() {
          int j; //local scope
           k=j+1;//error  
    }

  } 
class Test {
public static void main(String o[]){
Abc ob= new Abc();
ob.m();
}
}
............................................
Rule of Thumb: (Industry)
   Don't use defaults
   always write explicit instructions
......................................... 
e.g.
class Student{
int id;
String name;
Student () { } //not prefered
}

class Student{
int id;
String name;
Student () {id=0;
             name=null; } //prefered way in industry
}
...................................................
c++

f() {  //by default returned  type is integre
...

return 10;
}
.....................................................
Initialization at class scope 
class Student{
int id=0;
String name=null;
Student () { } //prefered way in industry
}
...................................................

