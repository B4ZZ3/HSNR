using System.Collections.Generic;

namespace KundenverwaltungDAO
{
    interface KundeDAO
    {
        Kunde GetKunde(int kdnr);
        List<Kunde> GetKunden();
        void SetKunde(Kunde kd);
        void AddKunde(Kunde kd);
        void DeleteKunde(Kunde kd);
        void Clear();
    }
}
