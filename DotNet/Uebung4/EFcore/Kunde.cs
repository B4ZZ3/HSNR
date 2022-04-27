namespace KundenverwaltungEF
{
    public class Kunde
    {
        public int Kdnr { get; set; }
        public string Vorname { get; set; }
        public string Nachname { get; set; }

        public override string ToString()
        {
            return string.Format("KDNR: {0}, Vorname: {1}, Nachname: {2}", Kdnr, Vorname, Nachname);
        }
    }
}
