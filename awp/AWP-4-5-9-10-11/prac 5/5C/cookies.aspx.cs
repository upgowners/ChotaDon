using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using System.Net; 


public partial class cookies : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        HttpCookie cookie = Request.Cookies["Preferences"];
        if (cookie == null)
        {
            lblWelcome.Text = "Unknown Customer <br/>";
        }
        else
        {
            lblWelcome.Text = "Cookie Found. <br/>";
            lblWelcome.Text += "Welcome, " + cookie["Name"];
        }
    }
    protected void Button1_Click(object sender, EventArgs e)
    {
        // Check for a cookie, and create a new one only if one doesn’t already exist.
 	// retrieve the cookie, which is named Preferences 
	        HttpCookie cookie = Request.Cookies["Preferences"];
         if (cookie == null) 
        { 	cookie = new HttpCookie("Preferences");        } 

        cookie["Name"] = txtName.Text;
         cookie.Expires = DateTime.Now.AddYears(1); 
        Response.Cookies.Add(cookie);
         lblWelcome.Text = "Cookie Created.<br/>"; 
        lblWelcome.Text += "New Customer: " + cookie["Name"]; 
} 
    }
