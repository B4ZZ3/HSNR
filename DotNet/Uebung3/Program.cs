using System.Drawing;
using System.Drawing.Imaging;
using System.IO;
using System.Collections.Generic;

//personal path for your code
String path = "C:\\Users\\Bjarne\\Documents\\HSNR\\HSNR-Code\\DotNet\\Uebung3\\";

//Circle Aufgabe1
//Bitmap b1 = new Bitmap(255, 255);
//Graphics g1 = Graphics.FromImage(b1);
//Pen myPen1 = new Pen(Color.Red, 5);
//int x1 = 5, y1 = 5, x2 = 249, y2 = 249;
//g1.FillRectangle(new SolidBrush(Color.White), 0, 0, 254, 254);
//g1.DrawLine(myPen1, x1, y1, x2, y2);
//Pen myPen2 = new Pen(Color.ForestGreen, 5);
//g1.DrawEllipse(myPen2, (127 - 50), (127 - 50), 100, 100);
//b1.Save(@path + "Aufgabe3-circle.jpg", ImageFormat.Jpeg);

//Aufgabe2 Karte zusammenbauen
var images = new List<Bitmap>();
var files = Directory.GetFiles(path + "kacheln");
var posX = 0; 
var posY = 0;
var step = 256;
var imagePos = 0;

//Load all files from directory
for (int i = 0; i < files.Count(); i++)
{
    String nextImage = files[i];
    Bitmap bitmap = Bitmap.FromFile(nextImage) as Bitmap;
    images.Add(bitmap);
}

//create bitmap to draw on
Bitmap karte = new Bitmap(768, 768);
Graphics g = Graphics.FromImage(karte);
g.Clear(Color.White);


//draw all 9 images on correct position
for(int i = 0; i < 3; i++)
{
    posY = 0;
    for(int j = 0; j < 3; j++)
    {
        g.DrawImage(images[imagePos], posX, posY);
        imagePos++;
        posY += step;
    }
    posX += step;
}

g.Dispose();

karte.Save(@path + "karte.jpg", ImageFormat.Jpeg);