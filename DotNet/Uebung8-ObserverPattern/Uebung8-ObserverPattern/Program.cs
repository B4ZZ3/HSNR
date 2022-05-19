namespace Uebung8_ObserverPattern
{
    public class Program
    {
        static void Main(string[] args)
        {
            ConcreteSubject RedMI = new ConcreteSubject("Red MI Mobile", 10000, "Out Of Stock");

            ConcreteObserver user1 = new ConcreteObserver("Anurag", RedMI);
            ConcreteObserver user2 = new ConcreteObserver("Pranaya", RedMI);
            ConcreteObserver user3 = new ConcreteObserver("Priyanka", RedMI);

            Console.WriteLine("Red MI Mobile current state : " + RedMI.getAvailability());
            Console.WriteLine();

            RedMI.setAvailability("Available");
            Console.Read();
        }
    }
}