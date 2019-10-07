using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class QueryString : System.Web.UI.Page
{
    protected void Page_Load(object sender, EventArgs e)
    {
        if (!this.IsPostBack)
        {
            // Add sample values.
            lstItems.Items.Add("Econo Sofa");
            lstItems.Items.Add("Supreme Leather Drapery");
            lstItems.Items.Add("Threadbare Carpet");
            lstItems.Items.Add("Antique Lamp");
            lstItems.Items.Add("Retro-Finish Jacuzzi");
        } 

    }
    protected void Button1_Click(object sender, EventArgs e)
    {
         if (lstItems.SelectedIndex == -1)
            {	 
             lblError.Text = "You must select an item.";
         } 
        else
         { 	// Forward the user to the information page, 
            // with the query string data. 
            string url = "QueryString2.aspx?"; 
            url += "Item=" + lstItems.SelectedItem.Text + "&";
             url += "Mode=" + chkDetails.Checked.ToString(); 
            Response.Redirect(url);
            }
 } 

    
}