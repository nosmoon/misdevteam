<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.edu.rec.*
	,	chosun.ciis.hd.edu.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_EDU_5000_MDataSet ds = (HD_EDU_5000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	
	try {
	
		rx.add(dataSet, "xx_emp_no_010", ds.getXx_emp_no_010());
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "combo2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_EDU_5000_MCURLIST2Record rec = (HD_EDU_5000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_12", StringUtil.replaceToXml(rec.mang_cd_12));
		}
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "combo1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_EDU_5000_MCURLIST1Record rec = (HD_EDU_5000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_12", StringUtil.replaceToXml(rec.mang_cd_12));
		}
		/****** CURLIST1 END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_edu_5000_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_12/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_edu_5000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_edu_5000_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_12/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_edu_5000_m>
*/
%>

<% /* 작성시간 : Thu Sep 22 15:40:00 KST 2016 */ %>