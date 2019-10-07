<%@ Page Language="C#" AutoEventWireup="true" CodeFile="QueryString.aspx.cs" Inherits="QueryString" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <asp:ListBox ID="lstItems" runat="server"></asp:ListBox>

        <br />
        <asp:CheckBox ID="chkDetails" runat="server" Text="Show full details" />

        <br />
        <asp:Button ID="Button1" runat="server" Text="Button" onclick="Button1_Click" />
        <br />
        <asp:Label ID="lblError" runat="server" ></asp:Label>
    </div>
    </form>
</body>
</html>
