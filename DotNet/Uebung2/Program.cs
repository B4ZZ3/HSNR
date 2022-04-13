using Uebung2;

//Aufgabe2
//int i, k;
//for (i = 1; i < 4; i = i + 3)
//{
//    k = 1;
//    while (k < 4)
//    {
//        k = k + 3;
//        Console.WriteLine(k + "\t" + i);
//    }
//}

//Aufgabe3
struct Mitglied
{

}

//Aufgabe4
var date = new DateOnly(1966, 11, 01);
Mitglied test1 = new Mitglied("Meier", "Walburga", date, "Handball");
test1.drucken();