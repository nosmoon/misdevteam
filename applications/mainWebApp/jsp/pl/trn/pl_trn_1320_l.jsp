<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.trn.rec.*
	,	chosun.ciis.pl.trn.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : pl_trn_1320_l.jsp
* 기능 : 
* 작성일자 : 2009-04-01
* 작성자 : 김상옥
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_TRN_1320_LDataSet ds = (PL_TRN_1320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	int DEAL_PTCRCUR = rx.add(root, "DEAL_PTCRCUR", "");

	try {
		/****** DEAL_PTCRCUR BEGIN */
		for(int i = 0; i < ds.deal_ptcrcur.size(); i++) {
			PL_TRN_1320_LDEAL_PTCRCURRecord rec = (PL_TRN_1320_LDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);
			int record = rx.add(DEAL_PTCRCUR, "record", "");
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_grp_seq", rec.deal_grp_seq);
			rx.add(record, "deal_seq", rec.deal_seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "send_plac_seq", rec.send_plac_seq);
			rx.add(record, "send_plac_nm", StringUtil.replaceToXml(rec.send_plac_nm));
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "deal_uprc", rec.deal_uprc);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "deal_amt", rec.deal_amt);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "prv_deli_qty", rec.prv_deli_qty);
			rx.add(record, "prv_widr_qty", rec.prv_widr_qty);
			rx.add(record, "prv_retn_qty", rec.prv_retn_qty);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** DEAL_PTCRCUR END */

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
	<DEAL_PTCRCUR>
		<record>
			<deal_dt/>
			<deal_grp_seq/>
			<deal_seq/>
			<dlco_cd/>
			<dlco_seq/>
			<dlco_nm/>
			<send_plac_seq/>
			<send_plac_nm/>
			<deal_qty/>
			<deal_uprc/>
			<dcrate/>
			<deal_amt/>
			<wh_cd/>
			<prv_deli_qty/>
			<prv_widr_qty/>
			<prv_retn_qty/>
			<remk/>
		</record>
	</DEAL_PTCRCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 01 16:59:58 KST 2009 */ %>