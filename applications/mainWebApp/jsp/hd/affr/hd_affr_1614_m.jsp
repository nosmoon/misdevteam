<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_1614_MDataSet ds = (HD_AFFR_1614_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	//combo = rx.add(dataSet, "comboSet", "");

	try {
		/****** CURLIST1 BEGIN */

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_1614_MCURLIST1Record rec = (HD_AFFR_1614_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(dataSet, "dataSet", "");
			
			rx.add(record, "scl_exps_clsf", rec.scl_exps_clsf );
			rx.add(record, "fix_rate_clsf", rec.fix_rate_clsf );
			rx.add(record, "pay_ratio_emp", rec.pay_ratio_emp);
			rx.add(record, "pay_ratio_ofcr", rec.pay_ratio_ofcr);
			rx.add(record, "pay_amt", rec.pay_amt); 
		}
		//rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
//		rx.add(dataSet, "errcode", errcode);
//		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_affr_1614_m>
	<dataSet>
		<CURLIST1>
			<record>
				<scl_exps_clsf/>
				<fix_rate_clsf/>
				<pay_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_affr_1614_m>
*/
%>

<% /* 작성시간 : Fri Oct 12 11:47:32 KST 2012 */ %>