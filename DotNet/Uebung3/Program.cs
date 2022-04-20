using System.Drawing;
using System.Drawing.Imaging;

//Circle Aufgabe
Bitmap b1 = new Bitmap(255, 255);
Graphics g1 = Graphics.FromImage(b1);
Pen myPen1 = new Pen(Color.Red, 5);
int x1 = 5, y1 = 5, x2 = 249, y2 = 249;
g1.FillRectangle(new SolidBrush(Color.White), 0, 0, 254, 254);
g1.DrawLine(myPen1, x1, y1, x2, y2);
Pen myPen2 = new Pen(Color.ForestGreen, 5);
g1.DrawEllipse(myPen2, (127 - 50), (127 - 50), 100, 100);
b1.Save(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\Aufgabe3-circle.jpg", ImageFormat.Jpeg);

//