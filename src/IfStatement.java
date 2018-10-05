public class IfStatement
{

    public static void main(String[] args)
    {
        int willekeurig = (int) Math.ceil( Math.random() * 10 );

        System.out.println(willekeurig);

        switch (willekeurig)
        {
            case 3:
                System.out.println("SWITCH 3");
            break;
            case 6:
                System.out.println("SWITCH 6");
            break;
            case 1: case 2:
            case 4: case 8:
                System.out.println("SWITCH IS 1, 2, 3, 4 OF 8!");
            break;
        }

        if (willekeurig >= 8)
        {
            System.out.println("Getal is 8 of hoger.");
        }
        else if (willekeurig == 7)
        {
            System.out.println("OMG, GELIJK AAN 7!!!");
        }
        else if (willekeurig > 3 && willekeurig < 7)
        {
            System.out.println("Het is een getal tussen de 3 en 7");
        }
        else
        {
            System.out.println("Het is een ander getal... :(");
        }

        if (willekeurig == 1 || willekeurig == 3)
        {
            System.out.println("Het getal is 1 of 3...");
        }



        System.out.println("Einde programma.");
    }
}
