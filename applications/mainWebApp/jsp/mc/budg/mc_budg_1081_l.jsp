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
	MC_BUDG_1081_LDataSet ds = (MC_BUDG_1081_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_1081_LCURLISTRecord rec = (MC_BUDG_1081_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "clas_cd1", rec.clas_cd1);
			rx.add(record, "clas_cd2", rec.clas_cd2);
			rx.add(record, "clas_cd3", rec.clas_cd3);
			rx.add(record, "clas_cd4", rec.clas_cd4);
			rx.add(record, "clas_nm", rec.clas_nm);
			rx.add(record, "abrv_nm", rec.abrv_nm);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "dtls_medi_dstb_cd", rec.dtls_medi_dstb_cd);
			//rx.add(record, "clas_cd1", StringUtil.replaceToXml(rec.clas_cd1));
			//rx.add(record, "clas_cd2", StringUtil.replaceToXml(rec.clas_cd2));
			//rx.add(record, "clas_cd3", StringUtil.replaceToXml(rec.clas_cd3));
			//rx.add(record, "clas_cd4", StringUtil.replaceToXml(rec.clas_cd4));
			//rx.add(record, "clas_nm", StringUtil.replaceToXml(rec.clas_nm));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "dtls_medi_dstb_cd", StringUtil.replaceToXml(rec.dtls_medi_dstb_cd));
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
<mc_budg_1081_l>
	<dataSet>
		<CURLIST>
			<record>
				<clas_cd1/>
				<clas_cd2/>
				<clas_cd3/>
				<clas_cd4/>
				<clas_nm/>
				<abrv_nm/>
				<budg_cdnm/>
				<dtls_medi_dstb_cd/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_1081_l>
*/
%>

<% /* 작성시간 : Thu Apr 09 16:26:01 KST 2009 */ %>