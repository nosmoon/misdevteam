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
	PL_CLS_1815_LDataSet ds = (PL_CLS_1815_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "gridData2", "");
	//dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(resData, "grid", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PL_CLS_1815_LCURLISTRecord rec = (PL_CLS_1815_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "ern", rec.ern);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		//System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>jsp::"+bo_nm);
		/****** CURLIST END */
		

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