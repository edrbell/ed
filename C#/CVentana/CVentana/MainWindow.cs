using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        buttonAceptar.Clicked += delegate {
            string nombre = entryName.Text;
            saludo.Text = "Hola " + nombre;
            Console.WriteLine("Click en button Aceptar con nombre = " + nombre);
        };
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
