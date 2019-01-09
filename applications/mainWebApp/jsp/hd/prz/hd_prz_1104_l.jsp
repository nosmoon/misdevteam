<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.prz.rec.*
	,	chosun.ciis.hd.prz.ds.*;
	"
%>

<%
//	RwXml rx = new RwXml();
	HD_PRZ_1104_LDataSet ds = (HD_PRZ_1104_LDataSet)request.getAttribute("ds");
//	int root = RwXml.rootNodeID;
//	int dataSet = 0;
//	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
//	dataSet = rx.add(root, "dataSet", "");

	HD_PRZ_1104_LCURLISTRecord rec = (HD_PRZ_1104_LCURLISTRecord)ds.curlist.get(0);
	byte[] bytearray = ds.getImage();
	String atic_add_file_nm = rec.getAtic_add_file_nm();

	try {
		 response.reset();
		 response.setContentType("application/x-msdownload");
		 response.setHeader("Content-Type", "application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment; filename=" + atic_add_file_nm + ";");
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
<hd_prz_1104_l>
	<dataSet>
		<CURLIST>
			<record>
				<atic_add_file/>
			</record>
		</CURLIST>
	</dataSet>
</hd_prz_1104_l>
*/
%>

<% /* 작성시간 : Wed Aug 19 20:05:34 KST 2009 */ %>