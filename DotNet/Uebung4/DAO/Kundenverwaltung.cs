using System;
using System.Collections.Generic;

namespace KundenverwaltungDAO
{
    class Kundenverwaltung
    {
        private static KundeDAO kundeDAO;

        static void Main(string[] args)
        {
            kundeDAO = new SQLiteKundeDAO();

            List<Kunde> kunden = new List<Kunde>() {
                new Kunde() { Kdnr = 4711, Vorname = "Heinz", Nachname = "Müller" },
                new Kunde() { Kdnr = 4712, Vorname = "Angelika", Nachname = "Meier" },
                new Kunde() { Kdnr = 4713, Vorname = "Jürgen", Nachname = "Neumann" },
                new Kunde() { Kdnr = 4714, Vorname = "Thorsten", Nachname = "Grothe" },
                new Kunde() { Kdnr = 4715, Vorname = "Sebastian", Nachname = "Flock" },
            };

            foreach (Kunde k in kunden)
            {
                kundeDAO.AddKunde(k);
                Console.WriteLine("Kunde zur DB hinzugefügt: {0}", k);
            }

            Kunde kd = kundeDAO.GetKunde(4711);
            Console.WriteLine("Kunde aus DB gelesen: {0}", kd);
            PrintKundenliste();

            if (kd != null)
            {
                kd.Nachname = "Meier";
                kundeDAO.SetKunde(kd);
                Console.WriteLine("Kunde in DB geändert: {0}", kd);
                PrintKundenliste();
            }

            Console.WriteLine("Kunde aus DB löschen: {0}", kd);
            kundeDAO.DeleteKunde(kd);
            PrintKundenliste();

            kundeDAO.Clear();
        }

        private static void PrintKundenliste()
        {
            Console.WriteLine("");
            Console.WriteLine("Kundenliste:");
            List<Kunde> kunden = kundeDAO.GetKunden();
            foreach (Kunde k in kunden)
            {
                Console.WriteLine(k);
            }
            Console.WriteLine("");
        }
    }
}
