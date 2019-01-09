<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.cls.rec.*
	,	chosun.ciis.pl.cls.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PL_CLS_1810_LDataSet ds = (PL_CLS_1810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "gridData", "");

	try {

		recordSet = rx.add(resData, "grid", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PL_CLS_1810_LCURLISTRecord rec = (PL_CLS_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "rcpm_status", rec.rcpm_status);
			rx.add(record, "actu_slip_no", rec.actu_slip_no);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());

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
<pl_cls_1810_l>
	<dataSet>
		<CURLIST>
			<record>
				<bo_cd/>
				<bo_seq/>
				<bo_nm/>
				<val_qty/>
				<net_sale_amt/>
			</record>
		</CURLIST>
	</dataSet>
</pl_cls_1810_l>
*/
%>

<% /* 작성시간 : Tue Mar 21 18:47:08 KST 2017 */ %>