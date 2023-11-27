<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleEmployeeServiceImplProxyid" scope="session" class="com.wso2.employee.serviceimpl.EmployeeServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleEmployeeServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleEmployeeServiceImplProxyid.getEndpoint();
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
        sampleEmployeeServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.wso2.employee.serviceimpl.EmployeeServiceImpl getEmployeeServiceImpl10mtemp = sampleEmployeeServiceImplProxyid.getEmployeeServiceImpl();
if(getEmployeeServiceImpl10mtemp == null){
%>
<%=getEmployeeServiceImpl10mtemp %>
<%
}else{
        if(getEmployeeServiceImpl10mtemp!= null){
        String tempreturnp11 = getEmployeeServiceImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String id_1id=  request.getParameter("id26");
            java.lang.String id_1idTemp = null;
        if(!id_1id.equals("")){
         id_1idTemp  = id_1id;
        }
        com.wso2.employee.vivo.Employee getDetails13mtemp = sampleEmployeeServiceImplProxyid.getDetails(id_1idTemp);
if(getDetails13mtemp == null){
%>
<%=getDetails13mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">address:</TD>
<TD>
<%
if(getDetails13mtemp != null){
java.lang.String typeaddress16 = getDetails13mtemp.getAddress();
        String tempResultaddress16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddress16));
        %>
        <%= tempResultaddress16 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getDetails13mtemp != null){
java.lang.String typename18 = getDetails13mtemp.getName();
        String tempResultname18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename18));
        %>
        <%= tempResultname18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mobile:</TD>
<TD>
<%
if(getDetails13mtemp != null){
java.lang.String typemobile20 = getDetails13mtemp.getMobile();
        String tempResultmobile20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemobile20));
        %>
        <%= tempResultmobile20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dept:</TD>
<TD>
<%
if(getDetails13mtemp != null){
java.lang.String typedept22 = getDetails13mtemp.getDept();
        String tempResultdept22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedept22));
        %>
        <%= tempResultdept22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(getDetails13mtemp != null){
java.lang.String typeid24 = getDetails13mtemp.getId();
        String tempResultid24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid24));
        %>
        <%= tempResultid24 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        String address_3id=  request.getParameter("address43");
            java.lang.String address_3idTemp = null;
        if(!address_3id.equals("")){
         address_3idTemp  = address_3id;
        }
        String name_4id=  request.getParameter("name45");
            java.lang.String name_4idTemp = null;
        if(!name_4id.equals("")){
         name_4idTemp  = name_4id;
        }
        String mobile_5id=  request.getParameter("mobile47");
            java.lang.String mobile_5idTemp = null;
        if(!mobile_5id.equals("")){
         mobile_5idTemp  = mobile_5id;
        }
        String dept_6id=  request.getParameter("dept49");
            java.lang.String dept_6idTemp = null;
        if(!dept_6id.equals("")){
         dept_6idTemp  = dept_6id;
        }
        String id_7id=  request.getParameter("id51");
            java.lang.String id_7idTemp = null;
        if(!id_7id.equals("")){
         id_7idTemp  = id_7id;
        }
        %>
        <jsp:useBean id="com1wso21employee1vivo1Employee_2id" scope="session" class="com.wso2.employee.vivo.Employee" />
        <%
        com1wso21employee1vivo1Employee_2id.setAddress(address_3idTemp);
        com1wso21employee1vivo1Employee_2id.setName(name_4idTemp);
        com1wso21employee1vivo1Employee_2id.setMobile(mobile_5idTemp);
        com1wso21employee1vivo1Employee_2id.setDept(dept_6idTemp);
        com1wso21employee1vivo1Employee_2id.setId(id_7idTemp);
        com.wso2.employee.vivo.Employee insert28mtemp = sampleEmployeeServiceImplProxyid.insert(com1wso21employee1vivo1Employee_2id);
if(insert28mtemp == null){
%>
<%=insert28mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">address:</TD>
<TD>
<%
if(insert28mtemp != null){
java.lang.String typeaddress31 = insert28mtemp.getAddress();
        String tempResultaddress31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddress31));
        %>
        <%= tempResultaddress31 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(insert28mtemp != null){
java.lang.String typename33 = insert28mtemp.getName();
        String tempResultname33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename33));
        %>
        <%= tempResultname33 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">mobile:</TD>
<TD>
<%
if(insert28mtemp != null){
java.lang.String typemobile35 = insert28mtemp.getMobile();
        String tempResultmobile35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typemobile35));
        %>
        <%= tempResultmobile35 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">dept:</TD>
<TD>
<%
if(insert28mtemp != null){
java.lang.String typedept37 = insert28mtemp.getDept();
        String tempResultdept37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedept37));
        %>
        <%= tempResultdept37 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(insert28mtemp != null){
java.lang.String typeid39 = insert28mtemp.getId();
        String tempResultid39 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid39));
        %>
        <%= tempResultid39 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 53:
        gotMethod = true;
        String id_8id=  request.getParameter("id56");
            java.lang.String id_8idTemp = null;
        if(!id_8id.equals("")){
         id_8idTemp  = id_8id;
        }
        java.lang.String delete53mtemp = sampleEmployeeServiceImplProxyid.delete(id_8idTemp);
if(delete53mtemp == null){
%>
<%=delete53mtemp %>
<%
}else{
        String tempResultreturnp54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(delete53mtemp));
        %>
        <%= tempResultreturnp54 %>
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