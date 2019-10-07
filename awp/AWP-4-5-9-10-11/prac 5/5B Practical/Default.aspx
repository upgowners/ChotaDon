<%@ Page Title="" Language="C#" MasterPageFile="~/MasterPage5B.master" AutoEventWireup="true" CodeFile="Default.aspx.cs" Inherits="_Default"  Theme = "SkinFile" %>

<asp:Content ID="Content1" ContentPlaceHolderID="head" Runat="Server">
</asp:Content>
<asp:Content ID="Content2" ContentPlaceHolderID="MainContent" Runat="Server">
    your content goes here<br />
&nbsp;<asp:ListBox ID="ListBox1" runat="server">
        <asp:ListItem>BMS</asp:ListItem>
        <asp:ListItem>BScIT</asp:ListItem>
        <asp:ListItem>BMM</asp:ListItem>
    </asp:ListBox>



    <br />
    <asp:Button ID="Button1" runat="server" onclick="Button1_Click" Text="Show" />
    <asp:Button ID="Button2" runat="server" onclick="Button2_Click" Text="Hide" />
    <br />



</asp:Content>
<asp:Content ID="Content3" ContentPlaceHolderID="AdditionalContent" Runat="Server">

additional content
</asp:Content>

