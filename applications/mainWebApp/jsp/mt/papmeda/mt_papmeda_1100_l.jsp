<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papmeda.rec.*
	,	chosun.ciis.mt.papmeda.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPMEDA_1100_LDataSet ds = (MT_PAPMEDA_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** 기준금액 BEGIN */
		if(ds.curlist2.size()>0){
			MT_PAPMEDA_1100_LCURLIST2Record rec = (MT_PAPMEDA_1100_LCURLIST2Record)ds.curlist2.get(0);
			rx.add(dataSet, "paper_amt", rec.paper_amt);
		}else {
			rx.add(dataSet, "paper_amt", "0");
		}
		/****** 기준금액 END */

		/****** 사업자등록번호 BEGIN */
		if(ds.curlist1.size() > 0) {
			MT_PAPMEDA_1100_LCURLIST1Record rec1 = (MT_PAPMEDA_1100_LCURLIST1Record)ds.curlist1.get(0);
			rx.add(dataSet, "eps_no", rec1.eps_no);
		} else {
			rx.add(dataSet, "eps_no", "");
		}
		/****** 사업자등록번호 END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<eps_no/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 06 20:22:21 KST 2009 */ %>