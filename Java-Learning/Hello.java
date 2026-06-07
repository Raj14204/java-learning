// complie and run (javac filname , java filename)
// println means the print on new line and not in new line then print will not go in line
// evry statment will have ;
// in java there are two types of data types premitive and non premitive 
// premetive are the int(byte,short and many more),float,char and boolen
// int is 4 bytes ,long -8 bytes,short-2bytes,bytes-1
// float -4 bytes ,double- 8bytes and by default java takes double
// and main thing about float if its float then you have to do num = 5.6f; f you have to mention for not getting error and in double num = 5.6;
// char - 2bytes inn  other languages   its mostly 1 but in java we have the Unicode not asci bitye and the unicode its have a biger range 
// char c = 'k'; for single charater we have to use single quotes and double it will go the string 
// in java its not 0,1 and its true or false in boolean
// bool b=true;
//when talk data types we say value and we say value means literals 
// Ever var need the name and the type 
//to chnage the type of the var we do type conversion and casting
// converion is simple byte to int we can do 
// but if u want to do the int to byte so u have to to explicite conversion which is also know as casting b=(byte)a and a is int 
// and also one this is that byte take only 127 then if we make a int of 256 into the byte then it will give the modulu method then it will give  the reminder
// to run java in one step then use java hello.java its just the shortcut come at 14version so use the two step only 
// operators,relation,logical operators this are easy so see doc or  can check video 
public class Hello {

    public static void main(String a[]) {

        // this are premitive data type
        int num = 13;
        byte y = 127;
        double d = 12.6;
        short sh = 558;
        long l = 588888l; // write always l at end
        float f = 8.8f; // also in the float we have to write this f
        boolean b = true;
        char c = 'k'; // keep it in single quoate or it will give error

        // literials
        int num1 = 0b101; // it take the binary value also it will give us 5 in output
        int num2 = 0x7e; // haxedecimal in int 126
        int num3 = 10_00_00_000; // helps to see zero properly in out - 10000000
        byte cc = 10;
        byte bb = 30;
        int result = cc * bb; // this is type promotion

        System.out.println(num);
        System.out.println(result);

        System.out.println(y);
        System.out.println(f);

    }
}
