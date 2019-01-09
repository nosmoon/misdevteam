<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_COCD_1600_MDataSet ds = (CO_COCD_1600_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** COMMCDCUR2 BEGIN */
		recordSet = rx.add(dataSet, "COMMCDCUR2", "");

		for(int i = 0; i < ds.commcdcur2.size(); i++) {
			CO_COCD_1600_MCOMMCDCUR2Record rec = (CO_COCD_1600_MCOMMCDCUR2Record)ds.commcdcur2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm",rec.cd+" "+rec.cd_abrv_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.commcdcur2.size());
		/****** COMMCDCUR2 END */

		/****** COMMCDCUR1 BEGIN */
		recordSet = rx.add(dataSet, "COMMCDCUR1", "");

		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			CO_COCD_1600_MCOMMCDCUR1Record rec = (CO_COCD_1600_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd+" "+rec.cd_abrv_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.commcdcur1.size());
		/****** COMMCDCUR1 END */
		
		//BIS최종수정일자
		if(ds != null){
			rx.add(dataSet, "chg_dt", ds.rmsg_dt_tm);
		}
		 
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
<co_cocd_1600_m>
	<dataSet>
		<COMMCDCUR2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</COMMCDCUR2>
	</dataSet>
</co_cocd_1600_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<co_cocd_1600_m>
	<dataSet>
		<COMMCDCUR1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</COMMCDCUR1>
	</dataSet>
</co_cocd_1600_m>
*/
%>

<% /* 작성시간 : Mon Jan 16 16:41:09 KST 2012 */ %>