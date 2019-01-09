<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	HD_INFO_2404_LDataSet ds = (HD_INFO_2404_LDataSet)request.getAttribute("ds");
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	try {
		//for(int i = 0; i < ds.curlist.size(); i++) {
			HD_INFO_2404_LCURLISTRecord rec = (HD_INFO_2404_LCURLISTRecord)ds.curlist.get(0);
			byte[] bytePhot = rec.getPhot();
			String emp_no = rec.getEmp_no();
			response.reset();
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Type", "application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment; filename=" + emp_no + ".jpg;");
			response.setContentLength((int)bytePhot.length);
			ServletOutputStream sout = response.getOutputStream(); 

			 if(sout != null) {
				sout.write(bytePhot,0,bytePhot.length);
			 } else {
			  	out.println("../../images/knowbrd/organ_noimg.gif");
			 }
			 sout.close();
			 //System.out.println("@@ : "+i+"@@@ :"+ds.curlist.size());
		//}
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		//rx.add(dataSet, "errcode", errcode);
		//rx.add(dataSet, "errmsg", errmsg);
		//out.println(rx.xmlFlush());
		//out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_2404_l>
	<dataSet>
		<CURLIST>
			<record>
				<emp_no/>
				<phot/>
			</record>
		</CURLIST>
	</dataSet>
</hd_info_2404_l>
*/
%>

<% /* 작성시간 : Tue Aug 24 10:23:55 KST 2010 */ %>