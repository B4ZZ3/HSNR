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
//public struct Mitglied
//{
//    public String name { get; set; }
//    public String vorname { get; set; }
//    public DateOnly geburtsdatum { get; set; }
//    public String abteilung { get; set; }

//    public Mitglied(String name, String vorname, DateOnly geburtsdatum, String abteilung)
//    {
//        this.name = name;
//        this.vorname = vorname;
//        this.geburtsdatum = geburtsdatum;
//        this.abteilung = abteilung;
//    }
//}

//var date = new DateOnly(1966, 11, 01);
//Mitglied test1 = new Mitglied("Meier", "Walburga", date, "Handball");

//Aufgabe4
//var date = new DateOnly(1966, 11, 01);
//Mitglied test1 = new Mitglied("Meier", "Walburga", date, "Handball");
//test1.drucken();

//Aufgabe5 - Nim-Spiel
int stones = 23;
string player = "A";

while(stones > 1)
{
    Console.WriteLine("Restliche Steine im Spiel: " + stones);
    play();

    //switch player
    switch(player)
    {
        case "A":
            player = "B";
            break;
        case "B":
            player = "A";
            break;
        default:
            break;
    }
}

Console.WriteLine("Spiel beendet: Spieler " + player + " hat das Spiel gewonnen!");

void play()
{
    Console.WriteLine("Spieler " + player + ": Eingabe der Anzahl an Steinen die Sie nehmen wollen (1 - 3)");
    int stoneAmount = Convert.ToInt32(Console.ReadLine());

    if(stoneAmount < 1 || stoneAmount > 3)
    {
        Console.WriteLine("Zu viele oder zu wenige Steine!");
        Console.ReadLine();
        play();
    }

    stones -= stoneAmount;
}