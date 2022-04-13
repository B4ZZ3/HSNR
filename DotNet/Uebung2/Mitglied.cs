using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Uebung2
{
    public class Mitglied
    {
        public String name { get; set; }
        public String vorname { get; set; }
        public DateOnly geburtsdatum { get; set; }
        public String abteilung { get; set; }

        public Mitglied(String name, String vorname, DateOnly geburtsdatum, String abteilung)
        {
            this.name = name;
            this.vorname = vorname;
            this.geburtsdatum = geburtsdatum;
            this.abteilung = abteilung;
        }

        public void drucken()
        {
            Console.WriteLine(this.name + " " + this.vorname + " " + this.geburtsdatum + " " + this.abteilung);
        }
    }
}
