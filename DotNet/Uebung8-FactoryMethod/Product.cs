using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Uebung8_FactoryMethod
{
    public abstract class Product
    {
        private int basisState;

        public void prepare()
        {
            Console.WriteLine("preparing general Product");
        }

        public void setState(int state)
        {
            this.basisState = state;
        }

        public int getState()
        {
            return basisState;
        }

        public abstract int getPrice();
        //further code 
    }
}
