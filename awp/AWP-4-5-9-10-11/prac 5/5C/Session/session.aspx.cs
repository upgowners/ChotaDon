using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class session : System.Web.UI.Page
{


    protected void Page_Load(object sender, EventArgs e)
    {
        if (!IsPostBack)
        {
            if (Session["Counter"] == null)
            {
                Session["Counter"] = 0;
            }
            TextBox1.Text = Session["Counter"].ToString();

        }
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        if (Session["Counter"] != null)
        {
            int SessionCounter = (int)Session["Counter"] + 1;
            TextBox1.Text = SessionCounter.ToString();
            Session["Counter"] = SessionCounter;
        }
    }

    protected void Button2_Click(object sender, EventArgs e)
    {
        Response.Redirect("secondPage.aspx");
    } 
}