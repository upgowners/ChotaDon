using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

public partial class MasterPage5B : System.Web.UI.MasterPage
{
    public bool ShowNavigationControls
    {
        get
        {
            return TreeView1.Visible;
        }
        set
        {
            TreeView1.Visible = value;
        }
    }

    protected void Page_Load(object sender, EventArgs e)
    {

    }
}
