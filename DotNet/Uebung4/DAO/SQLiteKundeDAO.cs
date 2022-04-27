using System.Collections.Generic;
using System.Collections.Specialized;
using System.Data.SQLite;

namespace KundenverwaltungDAO
{
    class SQLiteKundeDAO : KundeDAO
    {
        private SQLiteConnection db;

        public SQLiteKundeDAO()
        {
            db = new SQLiteConnection("Data Source=Kundenverwaltung.db");
            string sql = "CREATE TABLE IF NOT EXISTS kunden (" +
                "kdnr INT NOT NULL, " +
                "vorname VARCHAR NOT NULL, " +
                "nachname VARCHAR NOT NULL, " +
                "PRIMARY KEY (kdnr)" +
                ")";
            ExecuteNonQuery(sql);
        }

        public Kunde GetKunde(int kdnr)
        {
            string sql = string.Format("SELECT * FROM kunden WHERE kdnr='{0}'", kdnr);
            List<NameValueCollection> result = ExecuteReader(sql);
            Kunde kd = null;
            if (result.Count > 0)
            {
                NameValueCollection row = result[0];
                kd = new Kunde()
                {
                    Kdnr = int.Parse(row.Get("kdnr")),
                    Vorname = row.Get("vorname"),
                    Nachname = row.Get("nachname")
                };
            }
            return kd;
        }

        public List<Kunde> GetKunden()
        {
            string sql = "SELECT * FROM kunden ORDER BY kdnr ASC";
            List<NameValueCollection> result = ExecuteReader(sql);
            List<Kunde> kunden = new List<Kunde>();
            foreach (NameValueCollection row in result)
            {
                kunden.Add(new Kunde()
                {
                    Kdnr = int.Parse(row.Get("kdnr")),
                    Vorname = row.Get("vorname"),
                    Nachname = row.Get("nachname"),
                });
            }
            return kunden;
        }

        public void SetKunde(Kunde kd)
        {
            string sql = string.Format("UPDATE kunden " +
                "SET vorname='{1}', nachname='{2}' " +
                "WHERE kdnr={0}",
                kd.Kdnr, kd.Vorname, kd.Nachname);
            ExecuteNonQuery(sql);
        }

        public void AddKunde(Kunde kd)
        {
            string sql = string.Format("INSERT INTO kunden (kdnr, vorname, nachname) " +
                "VALUES ({0}, '{1}', '{2}')",
                kd.Kdnr, kd.Vorname, kd.Nachname);
            ExecuteNonQuery(sql);
        }

        public void DeleteKunde(Kunde kd)
        {
            string sql = string.Format("DELETE FROM kunden " +
                "WHERE kdnr={0}",
                kd.Kdnr);
            ExecuteNonQuery(sql);
        }

        public void Clear()
        {
            string sql = "DROP TABLE kunden";
            ExecuteNonQuery(sql);
        }

        private int ExecuteNonQuery(string sql)
        {
            int result;
            db.Open();
            using (SQLiteTransaction transaction = db.BeginTransaction())
            {
                SQLiteCommand command = new SQLiteCommand(sql, db);
                result = command.ExecuteNonQuery();
                command.Dispose();
                transaction.Commit();
            }
            db.Close();
            return result;
        }

        private List<NameValueCollection> ExecuteReader(string sql)
        {
            List<NameValueCollection> result = new List<NameValueCollection>();
            db.Open();
            using (SQLiteTransaction transaction = db.BeginTransaction())
            {
                SQLiteCommand command = new SQLiteCommand(sql, db);
                SQLiteDataReader reader = command.ExecuteReader();
                while (reader.Read())
                {
                    result.Add(reader.GetValues());
                }
                reader.Close();
                command.Dispose();
                transaction.Commit();
            }
            db.Close();
            return result;
        }
    }
}
