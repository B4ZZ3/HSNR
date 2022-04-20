using System.Drawing;
using System.Drawing.Imaging;

//Circle Aufgabe1
//Bitmap b1 = new Bitmap(255, 255);
//Graphics g1 = Graphics.FromImage(b1);
//Pen myPen1 = new Pen(Color.Red, 5);
//int x1 = 5, y1 = 5, x2 = 249, y2 = 249;
//g1.FillRectangle(new SolidBrush(Color.White), 0, 0, 254, 254);
//g1.DrawLine(myPen1, x1, y1, x2, y2);
//Pen myPen2 = new Pen(Color.ForestGreen, 5);
//g1.DrawEllipse(myPen2, (127 - 50), (127 - 50), 100, 100);
//b1.Save(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\Aufgabe3-circle.jpg", ImageFormat.Jpeg);

//Aufgabe2 Karte zusammenbauen
Image img1 = Image.FromFile(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\kacheln\14_8484_5470.png");
Image img2 = Image.FromFile(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\kacheln\14_8484_5471.png");
Image img3 = Image.FromFile(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\kacheln\14_8484_5472.png");
Image img4 = Image.FromFile(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\kacheln\14_8485_5470.png");
Image img5 = Image.FromFile(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\kacheln\14_8485_5471.png");
Image img6 = Image.FromFile(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\kacheln\14_8485_5472.png");
Image img7 = Image.FromFile(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\kacheln\14_8486_5470.png");
Image img8 = Image.FromFile(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\kacheln\14_8486_5471.png");
Image img9 = Image.FromFile(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\kacheln\14_8486_5472.png");

Bitmap karte = new Bitmap(768, 768);
Graphics g = Graphics.FromImage(karte);
g.Clear(Color.White);

g.DrawImage(img1, 0, 0);
g.DrawImage(img2, 0, 256);
g.DrawImage(img3, 0, 512);

g.DrawImage(img4, 256, 0);
g.DrawImage(img5, 256, 256);
g.DrawImage(img6, 256, 512);

g.DrawImage(img7, 512, 0);
g.DrawImage(img8, 512, 256);
g.DrawImage(img9, 512, 512);

g.Dispose();

karte.Save(@"C:\Users\Bjarne\Documents\HSNR\HSNR-Code\DotNet\Uebung3\karte.jpg", ImageFormat.Jpeg);