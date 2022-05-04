namespace Uebung5_NimGameGUI
{
    public partial class Form1 : Form
    {
        int stones = 23, amount = 0;
        string player = "A";
        public Form1()
        {
            InitializeComponent();
            label4.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label4.Text = "";
            amount = Convert.ToInt32(textBox1.Text);

            if(stones > 1)
            {
                if (amount < 1 || amount > 3)
                    label4.Text = "Zu viele Steine gezogen, bitte noch mal eingeben";
                else {
                    stones -= amount;
                    label2.Text = "Eingabe der Steine-Anzahl (" + stones +")";

                    switch (player)
                    {
                        case "A":
                            player = "B";
                            break;
                        case "B":
                            player = "A";
                            break;
                        default:
                            break;
                    }
                    label1.Text = "Spieler " + player + " ist an der Reihe";
                }
                    
            }
            else
            {
                label4.Text = "Spieler " + player + " hat das Spiel gewonnen!";
            }
        }
    }
}