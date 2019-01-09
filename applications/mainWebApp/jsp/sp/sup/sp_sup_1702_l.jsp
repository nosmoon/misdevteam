<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
//	RwXml rx = new RwXml();
	SP_SUP_1702_LDataSet ds = (SP_SUP_1702_LDataSet)request.getAttribute("ds");
//	int root = RwXml.rootNodeID;
//	int dataSet = 0;
//	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
//	dataSet = rx.add(root, "dataSet", "");

	SP_SUP_1702_LCURLISTRecord rec = (SP_SUP_1702_LCURLISTRecord)ds.curlist.get(0);
	byte[] bytearray = ds.getImage();
 	String dlco_no = rec.getDlco_no();

	try {
		 response.reset();
		 response.setContentType("application/x-msdownload");
		 response.setHeader("Content-Type", "application/x-msdownload");
		 response.setHeader("Content-Disposition", "attachment; filename=" + dlco_no + ".jpg;");
		 response.setContentLength((int)bytearray.length);
		 //mime = "application/vnd.ms-excel";
		
		// response.setContentLength((int)bytearray..length());
		 ServletOutputStream sout = response.getOutputStream(); 

		 if(sout != null) {
		  //sout.write(bytearray,0,bytearray.length-1);  
			sout.write(bytearray,0,bytearray.length);
		 } else {
		  	out.println("../../images/knowbrd/organ_noimg.gif");
		 }
		 sout.close();
	}catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
//		rx.add(dataSet, "errcode", errcode);
//		rx.add(dataSet, "errmsg", errmsg);
//		out.println(rx.xmlFlush());
//		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<emp_no/>
			<phot/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Jun 08 22:29:41 KST 2009 */ %>