public class IfStatement
{

    public static void main(String[] args)
    {
        int willekeurig = (int) Math.ceil( Math.random() * 1000000.9 );

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

        if (willekeurig >= 2746)
        {
            System.out.println("Getal is 2746 of hoger.");
        }
        else if (willekeurig == 659237)
        {
            System.out.println("OMG, GELIJK AAN 659237!!!");
        }
        else if (willekeurig > 4378 && willekeurig < 7349)
        {
            System.out.println("Het is een getal tussen de 4378 en 7349");
        }
        else
        {
            System.out.println("Het is een ander getal... :(");
        }

        if (willekeurig == 23647 || willekeurig == 7634)
        {
            System.out.println("Het getal is 23647 of 7634...");
        }



        System.out.println("Einde programma.");
    }
}
