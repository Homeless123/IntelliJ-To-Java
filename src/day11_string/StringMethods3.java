package day11_string;

public class StringMethods3 {
    public static void main(String[] args) {
        String name ="I dont know what i want",
                name1="";
        name .isEmpty();
        boolean r2 = name.isEmpty();
        System.out.println(r2);
        System.out.println("Is empty? " + name.isEmpty());
        name1.isEmpty();
        boolean r3 = name1.isEmpty();
        System.out.println(r3);
        System.out.println("Is empty? " + name1.isEmpty());

        String str ="             ";
        str.isEmpty();
        boolean r4 = str.isEmpty();
        boolean r5 = str.isBlank();
        str.isBlank();
        System.out.println(r4);
        System.out.println("is blank "+r5);

        System.out.println("Is empty?"+str.isEmpty());
        System.out.println("Is blank?"+str.isBlank() );

        System.out.println("++++++++++++++++++++++++++++");

        /*
        dont use ' == ' method
         */

        String str1="java";
        String str2 = new String("java");
        System.out.println(str2==str1);
        System.out.println(str1.equals(str2));
        System.out.println("................");

        String j1 ="JAVA";
        String j2 ="java";
        System.out.println(j1.equals(j2));
        System.out.println(j2.equalsIgnoreCase(j1));

        System.out.println("??????????????????????????????????????????????????????");

        String students="Hasan , Natalia , Jo , Miguel ";

        boolean hasAhmet=students.contains("Ahmet");
        System.out.println("Has Ahmet ? "+hasAhmet);

        System.out.println(students.contains("Ahmet"));
        String sentence ="My favorite programming language is Java";
        boolean hasJava=sentence.contains("Java");
        System.out.println("Has Java ? "+hasJava);
        System.out.println(sentence.contains("Java"));

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        String Name = "Micheal";
        boolean l= Name.startsWith("Mi");
        System.out.println(l);
        System.out.println("*/*/*");

        String url ="www.google.com";
        System.out.println("starting with www ? "+url.startsWith("www."));
        System.out.println("ending with .com ? "+url.endsWith(".com"));
        boolean is = url.startsWith("www");
        System.out.println("start www ?"+is);
        boolean is1 = url.endsWith(".com");
        System.out.println("end .com ?"+is1);

        System.out.println("¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿");


        String email = "Tavernaiberia@gmail.com";
        System.out.println("hotmail ? "+email.endsWith("htomail.com"));
        System.out.println("gmail ? "+email.contains("gmail.com"));
        System.out.println("yahoo ? "+email.contains("yahoo.com"));

        // or

        boolean hotmail = email.contains("htomail.com");
        System.out.println("hotmail.com ? "+hotmail);
        boolean gmail = email.contains("gmail.com");
        System.out.println("gmail.com ? "+gmail);
        boolean yahoo = email.contains("yahoo.com");
        System.out.println("yahoo.com ? "+yahoo);





    }}
