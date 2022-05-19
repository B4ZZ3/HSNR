using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Uebung8_ObserverPattern
{
    public interface IObserver
    {
        void update(string availability);
    }
}
