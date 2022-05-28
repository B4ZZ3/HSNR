using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Uebung8_FactoryMethod
{
    public abstract class Creator
    { 
        public Product createProduct()
        {
            //holt konkretes Product, weiß nicht welches. 
            Product product = factoryMethod();

            //allgemeiner Productherstellungscode 
            product.setState(23);
            product.prepare();
            return product;
        }

        protected abstract Product factoryMethod();
    }
}
