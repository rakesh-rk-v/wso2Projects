<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleServiceImplProxyid" scope="session" class="com.knot.serviceimpl.ServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.knot.serviceimpl.ServiceImpl getServiceImpl10mtemp = sampleServiceImplProxyid.getServiceImpl();
if(getServiceImpl10mtemp == null){
%>
<%=getServiceImpl10mtemp %>
<%
}else{
        if(getServiceImpl10mtemp!= null){
        String tempreturnp11 = getServiceImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String str_1id=  request.getParameter("str16");
            java.lang.String str_1idTemp = null;
        if(!str_1id.equals("")){
         str_1idTemp  = str_1id;
        }
        java.lang.String returnStr13mtemp = sampleServiceImplProxyid.returnStr(str_1idTemp);
if(returnStr13mtemp == null){
%>
<%=returnStr13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(returnStr13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String id_2id=  request.getParameter("id27");
            java.lang.String id_2idTemp = null;
        if(!id_2id.equals("")){
         id_2idTemp  = id_2id;
        }
        com.knot.vo.Employee getById18mtemp = sampleServiceImplProxyid.getById(id_2idTemp);
if(getById18mtemp == null){
%>
<%=getById18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getById18mtemp != null){
java.lang.String typename21 = getById18mtemp.getName();
        String tempResultname21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename21));
        %>
        <%= tempResultname21 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mobile:</TD>
<TD>
<%
if(getById18mtemp != null){
java.lang.String typemobile23 = getById18mtemp.getMobile();
        String tempResultmobile23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemobile23));
        %>
        <%= tempResultmobile23 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getById18mtemp != null){
java.lang.String typeid25 = getById18mtemp.getId();
        String tempResultid25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid25));
        %>
        <%= tempResultid25 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>