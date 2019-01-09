<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mc.budg.rec.*
	,	chosun.ciis.mc.budg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MC_BUDG_5072_LDataSet ds = (MC_BUDG_5072_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MC_BUDG_5072_LCURLISTRecord rec = (MC_BUDG_5072_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "amt", rec.amt);
			rx.addCData(record, "rmks1", rec.rmks1);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_cd_nm", rec.medi_cd_nm);
			rx.addCData(record, "dtls_medi_cd", rec.dtls_medi_cd);
			rx.addCData(record, "dtls_medi_cd_nm", rec.dtls_medi_cd_nm);
			//rx.add(record, "slip_no", StringUtil.replaceToXml(rec.slip_no));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			//rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<mc_budg_5072_l>
	<dataSet>
		<CURLIST>
			<record>
				<slip_no/>
				<amt/>
				<rmks1/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_5072_l>
*/
%>

<% /* 작성시간 : Mon May 18 11:00:00 KST 2009 */ %>