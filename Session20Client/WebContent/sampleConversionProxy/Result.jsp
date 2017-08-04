<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleConversionProxyid" scope="session" class="co.edureka.ConversionProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleConversionProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleConversionProxyid.getEndpoint();
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
        sampleConversionProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        co.edureka.Conversion getConversion10mtemp = sampleConversionProxyid.getConversion();
if(getConversion10mtemp == null){
%>
<%=getConversion10mtemp %>
<%
}else{
        if(getConversion10mtemp!= null){
        String tempreturnp11 = getConversion10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String mtr_1id=  request.getParameter("mtr16");
        int mtr_1idTemp  = Integer.parseInt(mtr_1id);
        int mtrToCm13mtemp = sampleConversionProxyid.mtrToCm(mtr_1idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(mtrToCm13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 18:
        gotMethod = true;
        String name_2id=  request.getParameter("name21");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        java.lang.String sayHello18mtemp = sampleConversionProxyid.sayHello(name_2idTemp);
if(sayHello18mtemp == null){
%>
<%=sayHello18mtemp %>
<%
}else{
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHello18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
}
break;
case 23:
        gotMethod = true;
        String name_3id=  request.getParameter("name26");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        String email_4id=  request.getParameter("email28");
            java.lang.String email_4idTemp = null;
        if(!email_4id.equals("")){
         email_4idTemp  = email_4id;
        }
        String password_5id=  request.getParameter("password30");
            java.lang.String password_5idTemp = null;
        if(!password_5id.equals("")){
         password_5idTemp  = password_5id;
        }
        String age_6id=  request.getParameter("age32");
        int age_6idTemp  = Integer.parseInt(age_6id);
        java.lang.String registerUser23mtemp = sampleConversionProxyid.registerUser(name_3idTemp,email_4idTemp,password_5idTemp,age_6idTemp);
if(registerUser23mtemp == null){
%>
<%=registerUser23mtemp %>
<%
}else{
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(registerUser23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
}
break;
case 34:
        gotMethod = true;
        String feet_7id=  request.getParameter("feet37");
        int feet_7idTemp  = Integer.parseInt(feet_7id);
        int feetToInches34mtemp = sampleConversionProxyid.feetToInches(feet_7idTemp);
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(feetToInches34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
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