<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>

<%
System.out.println("1093_l");
	SE_BOI_1093_LDataSet ds = (SE_BOI_1093_LDataSet)request.getAttribute("ds");
//	int root = RwXml.rootNodeID;
//	int dataSet = 0;
//	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
//	dataSet = rx.add(root, "dataSet", "");

	SE_BOI_1093_LPHOTLISTRecord rec = (SE_BOI_1093_LPHOTLISTRecord)ds.photlist.get(0);
	byte[] bytearray = ds.getImage();
 	String filenm = rec.getBo_cd();

	//filenm = "test";

 	//System.out.println("filenm="+filenm);

	try {

		System.out.println("1");
		 response.reset();
		 response.setContentType("application/x-msdownload");
		 response.setHeader("Content-Type", "application/x-msdownload");
		 response.setHeader("Content-Disposition", "attachment; filename=" + filenm + ".jpg;");
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

