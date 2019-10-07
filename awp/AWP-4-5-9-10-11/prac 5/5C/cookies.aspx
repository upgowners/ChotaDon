<%@ Page Language="C#" AutoEventWireup="true" CodeFile="cookies.aspx.cs" Inherits="cookies" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:Label ID="lblWelcome" runat="server" ></asp:Label>
        <br />
        Name:<asp:TextBox ID="txtName" runat="server"></asp:TextBox>
        <asp:Button ID="Button1" runat="server" onclick="Button1_Click" 
            Text="Create Cookies" />
        <br />

    </div>
    </form>
</body>
</html>
