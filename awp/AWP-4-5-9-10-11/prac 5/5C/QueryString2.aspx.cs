using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class QueryString2 : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        lblInfo.Text = "Item: " + Request.QueryString["Item"]; 
             lblInfo.Text += "<br/>Show Full Record: ";
             lblInfo.Text += Request.QueryString["Mode"]; 

    }
}