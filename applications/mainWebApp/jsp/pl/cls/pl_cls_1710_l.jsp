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
	PL_CLS_1710_LDataSet ds = (PL_CLS_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** PTCRLIST BEGIN */
		recordSet = rx.add(dataSet, "resform", "");

		for(int i = 0; i < ds.ptcrlist.size(); i++) {
			PL_CLS_1710_LPTCRLISTRecord rec = (PL_CLS_1710_LPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "gnr_qty", rec.gnr_qty);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "tax_no", rec.tax_no);
			//rx.add(record, "bo_cd", StringUtil.replaceToXml(rec.bo_cd));
			//rx.add(record, "bo_seq", StringUtil.replaceToXml(rec.bo_seq));
			//rx.add(record, "bo_nm", StringUtil.replaceToXml(rec.bo_nm));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "net_sale_amt", StringUtil.replaceToXml(rec.net_sale_amt));
		}
		rx.add(recordSet, "totalcnt", ds.ptcrlist.size());
		/****** PTCRLIST END */

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
<pl_cls_1710_l>
	<dataSet>
		<PTCRLIST>
			<record>
				<bo_cd/>
				<bo_seq/>
				<bo_nm/>
				<amt/>
				<net_sale_amt/>
			</record>
		</PTCRLIST>
	</dataSet>
</pl_cls_1710_l>
*/
%>

<% /* 작성시간 : Wed Mar 22 16:55:47 KST 2017 */ %>