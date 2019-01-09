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
	MC_BUDG_6221_LDataSet ds = (MC_BUDG_6221_LDataSet)request.getAttribute("ds");
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
			MC_BUDG_6221_LCURLISTRecord rec = (MC_BUDG_6221_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_cdnm", rec.sect_cdnm);
			rx.add(record, "sect_nm_cd", rec.sect_nm_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "excl_clsf", rec.excl_clsf);
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "sect_cdnm", StringUtil.replaceToXml(rec.sect_cdnm));
			//rx.add(record, "sect_nm_cd", StringUtil.replaceToXml(rec.sect_nm_cd));
			//rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
			//rx.add(record, "excl_clsf", StringUtil.replaceToXml(rec.excl_clsf));
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
<mc_budg_6221_l>
	<dataSet>
		<CURLIST>
			<record>
				<sect_cd/>
				<sect_cdnm/>
				<sect_nm_cd/>
				<sect_nm/>
				<excl_clsf/>
			</record>
		</CURLIST>
	</dataSet>
</mc_budg_6221_l>
*/
%>

<% /* 작성시간 : Fri May 22 09:27:04 KST 2009 */ %>