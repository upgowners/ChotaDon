<%@ Page Language="C#" AutoEventWireup="true" CodeFile="myweb1.aspx.cs" Inherits="myweb1" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
   <div>
        
        <asp:Label ID="Label1" runat="server" 
            Text="Thank you for clicking.This is My First Webpage.............."></asp:Label>
        <br />
        <br />
              
        <asp:Label ID="Label2" runat="server" Text="SiteMap:"></asp:Label>
              
        <asp:SiteMapPath ID="SiteMapPath1" runat="server">
        </asp:SiteMapPath>
        <br />
        <br />
              
        <asp:HyperLink ID="HyperLink1" runat="server" NavigateUrl="~/myweb2.aspx">click here to go to mywebpage2</asp:HyperLink>
    </div>

    </form>
</body>
</html>
