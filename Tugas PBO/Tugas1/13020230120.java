// Tugas Program 
// Silahkan Kerjakan tugas berikut: 
// 1. Kode Program 
// 1. Kode Program 
public class Asgdll { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* Kamus */  
  float f= 20.0f; 
  double fll; 
 
  /* Algoritma */  
  fll=10.0f; 
  System.out.println ("f  : "+f  + 
       "\nf11: "+fll); 
 
 } 
 
} 
// 2. Kode Program 
public class Asign { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* Kamus */  
   int i; 
  /* Program */  
   System.out.print ("hello\n"); i = 5; 
   System.out.println ("Ini nilai i :" + i);  
 } 
 
} 
// 3. Kode Program 
/* Deskripsi :   */ 
/* Program ini berisi contoh sederhana untuk mendefinisikan */ 
/* variabel-variabel bilangan bulat (short int, int, long int), */ 
/* karakter, bilangan riil, */  
 
public class ASIGNi { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* KAMUS */    
  short ks = 1;    
  int ki = 1;    
  long kl = 10000;    
  char c = 65;  /* inisialisasi karakter dengan 
integer */ 
  char c1 = 'Z'; /* inisialisasi karakter dengan karakter */ 
  double x = 50.2f;    
  float y = 50.2f; 
  /* Algoritma */ 
 
  /* penulisan karakter sebagai karakter */  
  System.out.println  ("Karakter = "+ c); 
  System.out.println  ("Karakter = "+ c1); 
 
  /* penulisan karakter sebagai integer */  
  System.out.println  ("Karakter = "+ c); 
  System.out.println  ("Karakter = "+ c1); 
 
 
  System.out.println  ("Bilangan integer (short) = "+ ks); 
  System.out.println  ("\t(int) = "+ ki);  
  System.out.println  ("\t(long)= "+ kl);  
  System.out.println  ("Bilangan Real x = "+ x);  
  System.out.println  ("Bilangan Real y = "+ y);  
 
 
 } 
 
} 
 
// 4. Kode Program 
 
import java.util.Scanner; 
 
/* contoh membaca integer menggunakan Class Scanner*/ 
public class BacaData { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* Kamus */  
  int a; 
  Scanner masukan; 
  /* Program */ 
  System.out.print ("Contoh membaca dan menulis, ketik nilai 
integer: \n"); 
  masukan = new Scanner(System.in); 
  a = masukan.nextInt(); /* coba ketik : masukan.nextInt(); ; 
Apa akibatnya ?*/  
  System.out.print ("Nilai yang dibaca : "+ a); 
 
 } 
 
} 
 
// 5. Kode Program  
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
 
//import javax.swing.*; 
 
public class Bacakar { 
 
 /** 
  * @param args 
  * @throws IOException  
  */ 
 public static void main(String[] args) throws IOException { 
  // TODO Auto-generated method stub 
  /* Kamus */  
  char cc; 
  int bil; 
  InputStreamReader isr = new InputStreamReader(System.in); 
  BufferedReader dataIn = new BufferedReader(isr); 
  // atau 
  BufferedReader datAIn = new BufferedReader(new 
InputStreamReader(System.in)); 
  /* Algoritma */ 
  System.out.print ("hello\n"); 
   
  System.out.print("baca 1 karakter : "); 
  //perintah baca karakter cc  
  cc =dataIn.readLine().charAt(0); 
  System.out.print("baca 1 bilangan : "); 
  //perintah baca bil  
  bil =Integer.parseInt(datAIn.readLine()); 
  /*String kar = JOptionPane.showInputDialog("Karakter 1 : ");
   
  System.out.println(kar);*/ 
  //JOptionPane.showMessageDialog(null, "hello"); 
  System.out.print (cc +"\n" +bil+"\n"); 
  System.out.print ("bye \n");  
 } 
 
} 
// 6. Kode Program  
 
/*Casting menggunakan tipe data primitif*/ 
public class Casting1 { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  int a=5,b=6; 
  float d=2.f,e=3.2f; 
  char g='5'; 
  double k=3.14; 
   
  System.out.println((float)a);  // int   <-- float 
  System.out.println((double)b); // int   <-- double 
  System.out.println((int)d);    // float <-- int 
  System.out.println((double)e); // float <-- double 
  System.out.println((int)g);    // char  <-- int      (ASCII) 
  System.out.println((float)g);  // char  <-- float    (ASCII) 
  System.out.println((double)g); // char  <-- double   (ASCII) 
  System.out.println((int)k);    // double   <-- int 
  System.out.println((float)k);  // double   <-- float 
 } 
 
} 
 // 
// 7. Kode Program  
 
/*Casting menggunakan tipe data Class*/ 
public class Casting2 { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  int a=8,b=9; 
  float d=2.f,e=3.2f; 
  char g='5'; 
  double k=3.14; 
  String n="67",m="45", l="100"; 
   
  a = Integer.parseInt(n);    /*Konversi String ke Integer*/ 
  k = Double.parseDouble(m);  /*Konversi String ke Double*/ 
  d = Float.parseFloat(l);    /*Konversi String ke Float*/ 
  System.out.println("a : "+a+"\nk : "+k+"\nd : "+d); 
   
  n = String.valueOf(b);  /*Konversi Integer ke String*/ 
  m = String.valueOf(g);   /*Konversi Karakter ke String*/ 
  l = String.valueOf(e);   /*Konversi Float ke String*/ 
  System.out.println("n : "+n+"\nm : "+m+"\nl : "+l); 
   
  k = Double.valueOf(a).intValue(); /*Konversi Integer ke 
Double*/ 
  double c = Integer.valueOf(b).doubleValue(); 
   
  System.out.println("k : "+k+"\nc : "+c+"\nl : "+l);  
   
 } 
 
} 
 
// 8. Kode Program  
 
/* pemakaian  operator kondisional */ 
public class Ekspresi { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* KAMUS */   
  int x = 1;   
  int y = 2;   
  /* ALGORITMA */   
  System.out.print("x = "+ x + "\n");  
  System.out.print("y = "+ y + "\n");  
  System.out.print("hasil ekspresi  = (x<y)?x:y = "+ ((x < y) ? 
x : y)); /*Gunakan dalam kurung "(statemen dan kondisi)" untuk menyatakan 
satu kesatuan pernyataan*/ 
 
 } 
 
} 
 
// 9. Kode Program 
 
/* pembagian integer, casting */ 
public class Ekspresi1 { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* KAMUS */  
  int x = 1; int y = 2; float fx; float fy; 
 
  /* ALGORITMA */ 
 
  System.out.print ("x/y (format integer) = "+ x/y);  
  System.out.print ("\nx/y (format float) = "+ x/y); 
  /* supaya hasilnya tidak nol */ 
  fx=x; 
  fy=y; 
 
  System.out.print ("\nx/y (format integer) = "+ fx/fy);  
  System.out.print ("\nx/y (format float)   = "+ fx/fy); 
  /* casting */ 
 
  System.out.print ("\nfloat(x)/float(y) (format integer) = "+ 
(float)x/(float)y);  
  System.out.print ("\nfloat(x)/float(y) (format float)   = "+ 
(float)x/(float)y); 
 
  x = 10; y = 3; 
 
  System.out.print ("\nx/y (format integer) = "+ x/y);  
  System.out.print ("\nx/y (format float)   = "+ x/y);  
 } 
 
} 
 
// 10. Kode Program 
 
public class Hello { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* menuliskan hello ke layar */ 
  System.out.print("Hello"); 
  /* menuliskan hello dan ganti baris*/ 
  System.out.print("\nHello "); 
   
  /* menuliskan hello dan ganti baris*/ 
  System.out.println("World"); 
   
  System.out.println("Welcome"); 
 } 
 
} 
 
// 11. Kode Program 
 
/* Effek dari operator ++ */  
public class Incr { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* Kamus */  
  int i, j; 
 
  /* Program */  
  i = 3; 
  j = i++; 
 
  System.out.println ("Nilai i : " + (++i) + 
       "\nNilai j : " + j);  
 } 
 
} 
 
// 12. KOde Program 
/* pemakaian beberapa operator terhadap bit */ 
public class Oper1 { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* KAMUS */ 
 
  int n = 10; /* 1010 */ 
 
  int x = 1; /* 1 */ 
 
  int y = 2; /* 10 */ 
 
  /* ALGORITMA */ 
 
  System.out.println ("n = "+ n); 
 
  System.out.println ("x = "+ x); 
 
  System.out.println ("y = "+ y); 
 
  System.out.println ("n & 8 = "+ (n & 8)); /* 1010 AND 1000 */ 
 
  System.out.println ("x & ~ 8 = "+ (x & ~8)); /* 1 AND 
0111 */ 
 
  System.out.println ("y << 2 = "+ (y << 2)); /* 10 ==> 
1000 = 8 */ 
 
  System.out.println ("y >> 3 = "+ (y >>3)); /* 10 ==> 
0000 = 0 */ 
 
 } 
 
} 
 
// 13. Kode Program  
 
/* pemakaian beberapa operator terhadap RELATIONAL DAN bit */ 
public class Oper2 { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* KAMUS */   
  char i, j; 
 
 /* ALGORITMA */   
  i = 3;  /* 00000011 dalam biner */ 
  j = 4;  /* 00000100 dalam biner */ 
        
  System.out.println("i = "+ (int) i);  
  System.out.println("j = "+ j); 
  System.out.println("i & j = "+ (i & j)); /* 0: 00000000 dalam 
biner */ 
  System.out.println("i | j = "+ (i | j)); /* 7:
 00000111 biner */ 
  System.out.println("i ^ j = "+ (i ^ j)); /*   7:
 00000111 biner Ingat!!! operator "^" pada bahasa java bukan 
sebagai pangkat*/ 
  System.out.println(Math.pow(i, j));       /* Class Math 
memiliki method pow(a,b) untuk pemangkatan*/ 
  System.out.println("  ~i  = "+ ~i);      /* -4: 11111100 
biner */ 
 } 
 
} 
 
 
// 14. KOde Program 
 
public class Oper3 { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
   
  /* Algoritma */  
  if (true && true){ System.out.println(true && true); }
 /* true = true and true */ 
  if (true & true) { System.out.println(true & false); }   /* 
true & true */ 
  if (true)   { System.out.println(true); } /* true  
*/ 
  if (true || true){ System.out.println(true); } /* true 
= true or true */ 
  if (true|false)  { System.out.println(true|false); } /* 
true|false */ 
 
 } 
 
} 
 
// 15. Kode Program 
 
/* Operator terner */ 
public class Oper4 { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* KAMUS */ 
 
  int i = 0; /* perhatikan int i,j=0 bukan seperti ini */ 
  int j = 0; 
 
  char c = 8; char d = 10; 
  int e = (((int)c > (int)d) ? c: d);  
  int k = ((i>j) ? i: j); 
  /* ALGORITMA */ 
 
  System.out.print  ("Nilai e = "+ e);  
  System.out.print  ("\nNilai k = "+ k);  
  i = 2; 
  j = 3; 
 
  k = ((i++>j++) ? i: j) ; 
 
  System.out.print  ("\nNilai k = "+ k);  
 } 
 
} 
 
// 16. Kode Program 
 
/* Contoh pengoperasian variabel bertype dasar */  
public class Oprator { 
 
 /** 
  * @param args 
  */ 
 public static void main(String[] args) { 
  // TODO Auto-generated method stub 
  /* Kamus */ 
 
   boolean Bool1, Bool2, TF ; int i,j, hsl ; 
   float x,y,res;  
  /* algoritma */ 
   System.out.println  ("Silahkan baca teksnya dan 
tambahkan perintah untuk menampilkan output"); 
 
    Bool1 = true; Bool2 = false; 
    TF = Bool1 && Bool2 ; /* Boolean AND */ 
    TF = Bool1 || Bool2 ; /* Boolean OR */ 
    TF = ! Bool1 ;  /* NOT */ 
    TF = Bool1  ^Bool2;  /* XOR */ 
   /* operasi numerik */  
    i = 5; j = 2 ;   
    hsl = i+j; hsl = i - j; hsl = i / j; hsl = i * j; 
    hsl = i /j ;  /* pembagian bulat */ 
    hsl = i%j ; /* sisa. modulo */ 
   /* operasi numerik */  
    x = 5 ; y = 5 ;   
    res = x + y; res = x - y; res = x / y; res = x * 
y; 
   /* operasi relasional numerik */ 
    TF = (i==j); TF = (i!=j); 
    TF = (i < j); TF = (i > j); TF = (i <= j); TF = 
(i >= j); 
   /* operasi relasional numerik */ 
    TF = (x != y);   
    TF = (x < y); TF = (x > y); TF = (x <= y); TF = 
(x >= y); 
 
 } 
 
} 
 
 
 
