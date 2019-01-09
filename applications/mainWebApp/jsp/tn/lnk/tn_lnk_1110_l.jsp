<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%	System.out.println("jsp go");
	RwXml rx = new RwXml();
	TN_LNK_1110_LDataSet ds = (TN_LNK_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_1110_LCURLISTRecord rec = (TN_LNK_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "excl_pmnt_idx", rec.excl_pmnt_idx);
			rx.addCData(record, "excl_type_nm", rec.excl_type_nm);
			rx.addCData(record, "dept_idx_nm", rec.dept_idx_nm);
			rx.addCData(record, "title", rec.title);
			rx.add(record, "dtl_cnt", rec.dtl_cnt);
			rx.add(record, "insrt_dt", rec.insrt_dt);
			rx.add(record, "adminidx", rec.adminidx);
			rx.add(record, "excl_type", rec.excl_type);
			rx.add(record, "dept_idx", rec.dept_idx);
			rx.add(record, "isupload", rec.isupload);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_lnk_1110_l>
	<dataSet>
		<CURLIST>
			<record>
				<excl_pmnt_idx/>
				<excl_type/>
				<deptidx/>
				<title/>
				<dtl_cnt/>
				<insrt_dt/>
				<adminidx/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_1110_l>
*/
%>

<% /* 작성시간 : Mon Jul 04 16:03:34 KST 2016 */ %>