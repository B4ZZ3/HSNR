using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Uebung8_ObserverPattern
{
    public class ConcreteObserver : IObserver
    {
        public string UserName { get; set; }
        public ConcreteObserver(string userName, ISubject subject)
        {
            UserName = userName;
            subject.registerObserver(this);
        }

        public void update(string availabiliy)
        {
            Console.WriteLine("Hello " + UserName + ", Product is now " + availabiliy + " on Amazon");
        }
    }
}
