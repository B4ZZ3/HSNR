using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Uebung8_FactoryMethod
{
    class ConcreteCreator : Creator
    {
        protected override Product factoryMethod()
        {
            ConcreteProduct concProd = new ConcreteProduct();
            //ggf. noch das ConcreateProductA bearbeiten... 
            return concProd;
        }
    }
}
