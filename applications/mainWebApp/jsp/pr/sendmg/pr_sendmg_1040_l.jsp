<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.sendmg.rec.*
	,	chosun.ciis.pr.sendmg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_SENDMG_1040_LDataSet ds = (PR_SENDMG_1040_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			PR_SENDMG_1040_LCURLISTRecord rec = (PR_SENDMG_1040_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cprdate", rec.cprdate);
			rx.add(record, "cdmedia", rec.cdmedia);
			rx.add(record, "cpansu", rec.cpansu);
			rx.add(record, "cdcntry", rec.cdcntry);
			rx.add(record, "iseqno", rec.iseqno);
			rx.add(record, "ifdno", rec.ifdno);
			rx.add(record, "cnmedia", rec.cnmedia);
			rx.add(record, "cncntry", rec.cncntry);
			rx.add(record, "iprpage", rec.iprpage);
			rx.add(record, "cprout", rec.cprout);
			rx.add(record, "cprfin", rec.cprfin);
			rx.add(record, "lhdbusu", rec.lhdbusu);
			rx.add(record, "laddbusu", rec.laddbusu);
			rx.add(record, "lprbusu", rec.lprbusu);
			rx.add(record, "lbabusu", rec.lbabusu);
			rx.add(record, "laddo", rec.laddo);
			rx.add(record, "lmins", rec.lmins);
			rx.add(record, "cdfact", rec.cdfact);
			rx.add(record, "ctrans", rec.ctrans);
			rx.add(record, "inpause", rec.inpause);
			rx.add(record, "crpause", rec.crpause);
			rx.add(record, "inabn", rec.inabn);
			rx.add(record, "crabn", rec.crabn);
			rx.add(record, "cpabn", rec.cpabn);
			rx.add(record, "idanres1", rec.idanres1);
			rx.add(record, "ijungres1", rec.ijungres1);
			rx.add(record, "idanres2", rec.idanres2);
			rx.add(record, "ijungres2", rec.ijungres2);
			rx.add(record, "cdummy", rec.cdummy);

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
<dataSet>
	<CURLIST>
		<record>
			<medi_nm/>
			<prt_plac_clsf/>
			<ecnt/>
			<off_plat_tm/>
			<prt_ex_tm/>
			<prt_end_tm/>
			<card_qty/>
			<dqty/>
			<cmpy_cd/>
			<medi_cd/>
			<issu_dt/>
			<excp_qty/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 29 16:42:00 KST 2009 */ %>