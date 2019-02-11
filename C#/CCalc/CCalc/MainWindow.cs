using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    int a, b, c;
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnButton1Pressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "1";
    }

    protected void OnButton2Pressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "2";
    }

    protected void OnButton3Pressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "3";
    }

    protected void OnButton4Pressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "4";
    }

    protected void OnButton5Pressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "5";
    }

    protected void OnButton6Pressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "6";
    }

    protected void OnButton7Pressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "7";
    }

    protected void OnButton8Pressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "8";
    }

    protected void OnButton9Pressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "9";
    }

    protected void OnButtonSumaPressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "\n+ ";
    }

    protected void OnButtonRestaPressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "\n- ";
    }

    protected void OnButtonResultadoPressed(object sender, EventArgs e)
    {
        if (resultado.Buffer.Text.Equals(""))
            resultado.Buffer.Text = "N/A";
        else {
            string[] s = resultado.Buffer.Text.Split('\n', ' ');
            a = Convert.ToInt32(s[0]);
            b = Convert.ToInt32(s[2]);
            switch (s[1])
            {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    c = a / b;
                    break;
                default:
                    break;
            }
            resultado.Buffer.Text += "\n= " + c.ToString();
        }
     }

    protected void OnButtonDividirPressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "\n/ ";
    }

    protected void OnButtonMultiplicarPressed(object sender, EventArgs e)
    {
        resultado.Buffer.Text += "\n* ";
    }
}
