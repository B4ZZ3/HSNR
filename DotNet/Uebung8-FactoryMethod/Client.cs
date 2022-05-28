using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Uebung8_FactoryMethod
{
    internal class Client
    {
        public static void Main(String[] args)
        {
            Creator creator = new ConcreteCreator();
            Product product = creator.createProduct();
            Console.WriteLine(product.getPrice());
        }
    }
}
