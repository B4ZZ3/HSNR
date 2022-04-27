using Microsoft.EntityFrameworkCore;

namespace KundenverwaltungEF
{
    public class KundenContext : DbContext
    {
        public DbSet<Kunde> Kunden { get; set; }

        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlite("Data Source=Kundenverwaltung.db");
        }

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            modelBuilder.Entity<Kunde>().HasKey(k => k.Kdnr);
            modelBuilder.Entity<Kunde>().ToTable("kunden");
        }
    }
}
