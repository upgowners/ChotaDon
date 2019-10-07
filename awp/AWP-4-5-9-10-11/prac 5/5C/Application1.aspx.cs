using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class Application1 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            if (Application["Counter"] == null)
            {
                Application["Counter"] = 0;
            }
            TextBox1.Text = Application["Counter"].ToString();

        } 
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        if (Application["Counter"] != null)
        {
            int ApplicationCounter = (int)Application["Counter"] + 1;
            TextBox1.Text = ApplicationCounter.ToString();
            Application["Counter"] = ApplicationCounter;
        } 
    }
    protected void Button2_Click(object sender, EventArgs e)
    {
        Response.Redirect("Application2.aspx"); 
    }
}