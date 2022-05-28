using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Uebung8_FactoryMethod
{
    internal class ConcreteProduct : Product
    {
        public override int getPrice()
        {
            return 1400;
        }
    }
}
