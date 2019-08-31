/*

Type	|    Size in Bytes	 |  Range
--------|--------------------|-------------------------------
byte	|   1 byte	         |  -128 to 127
short	    2 bytes	            -32,768 to 32,767
int	        4 bytes	            -2,147,483,648 to 2,147,483, 647
long	    8 bytes	            -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	    4 bytes	            approximately ±3.40282347E+38F (6-7 significant decimal digits)
double	    8 bytes	            approximately ±1.79769313486231570E+308 (15 significant decimal digits)
char	    2 byte	            0 to 65,536 (unsigned)
boolean	    not precisely       true or false
            defined

*/

public class DataTypeRange {
    public static void main(String[] args) {
        byte a = 30;
        short b = -4500;
        int c = 300000000;
        long d = 9079878789798798744l;
        float e = 3.1234567894444444948984548089840598450948849854058405859849058490584484759475497549748547958474754895745744444f;
        double f = 8099999454549584958495849584958498594438954398574895743895748957498534759843758975948754853479573485749543758943.759843754893758394574389753849574398754398754983758943754938753975348957349574895743964935734857948574389574397394857347548395738947598347589437584375984375934857398579347583495734985783497584395783497594835734985793487589347589437548957489578439579435789759435734987589347589347589437598475894758973489574389758934758947589475938475847583497548957843975849754375943598743859743895748975894375894578493758947589437589475983475987439873985739759834759834574365439647583497593487598437598347589347584758475849375893475984375894735897345897348957834975893759834759834758934758934759834759834758;
        char g = 33853;
        boolean h = true;
        System.out.println("Byte "+a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g +" Wow");
        System.out.println(h);
        byte m= (byte) "We are the best".length();
        System.out.println(m);
        System.out.println("enjoy in java".toUpperCase());
        System.out.println(d);
        System.out.println("jdksfjkfjsdkljfl");

    }
}
