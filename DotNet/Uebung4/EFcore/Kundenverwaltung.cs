using System;
using System.Collections.Generic;

namespace KundenverwaltungEF
{
    class Kundenverwaltung
    {
        private static KundenContext context;

        static void Main(string[] args)
        {
            context = new KundenContext();
            context.Database.EnsureCreated();

            List<Kunde> kunden = new List<Kunde>() {
                new Kunde() { Kdnr = 4711, Vorname = "Heinz", Nachname = "Müller" },
                new Kunde() { Kdnr = 4712, Vorname = "Angelika", Nachname = "Meier" },
                new Kunde() { Kdnr = 4713, Vorname = "Jürgen", Nachname = "Neumann" },
                new Kunde() { Kdnr = 4714, Vorname = "Thorsten", Nachname = "Grothe" },
                new Kunde() { Kdnr = 4715, Vorname = "Sebastian", Nachname = "Flock" },
            };

            foreach (Kunde k in kunden)
            {
                context.Kunden.Add(k);
                Console.WriteLine("Kunde zur DB hinzugefügt: {0}", k);
            }
            context.SaveChanges();

            Kunde kd = context.Kunden.Find(4711);
            Console.WriteLine("Kunde aus DB gelesen: {0}", kd);
            PrintKundenliste();

            if (kd != null)
            {
                kd.Nachname = "Meier";
                context.Kunden.Update(kd);
                Console.WriteLine("Kunde in DB geändert: {0}", kd);
                context.SaveChanges();
                PrintKundenliste();
            }

            Console.WriteLine("Kunde aus DB löschen: {0}", kd);
            context.Kunden.Remove(kd);
            context.SaveChanges();
            PrintKundenliste();

            foreach (Kunde k in context.Kunden)
            {
                context.Kunden.Remove(k);
            }
            context.SaveChanges();
        }

        private static void PrintKundenliste()
        {
            Console.WriteLine("");
            Console.WriteLine("Kundenliste:");
            foreach (Kunde k in context.Kunden)
            {
                Console.WriteLine(k);
            }
            Console.WriteLine("");
        }
    }
}
