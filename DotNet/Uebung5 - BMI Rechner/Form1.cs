namespace Uebung5___BMI_Rechner
{
    public partial class Form1 : Form
    {
        float kg = 0, cm = 0, bmi = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            kg = Convert.ToSingle(textBox1.Text);
            cm = Convert.ToSingle(textBox2.Text);
            bmi = kg / cm / cm * 100 * 100;
            textBox3.Text = bmi.ToString();
        }
    }
}