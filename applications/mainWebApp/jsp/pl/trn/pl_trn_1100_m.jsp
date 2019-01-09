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
* 파일명 : pl_trn_1100_m.jsp
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
	PL_TRN_1100_MDataSet ds = (PL_TRN_1100_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** WH_CDCUR BEGIN */
		int wh_cd = rx.add(dataSet, "wh_cd", "");
		for(int i = 0; i < ds.wh_cdcur.size(); i++) {
			PL_TRN_1100_MWH_CDCURRecord rec = (PL_TRN_1100_MWH_CDCURRecord)ds.wh_cdcur.get(i);
			int record = rx.add(wh_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** WH_CDCUR END */

		/****** MEDI_CDCUR BEGIN */
		int medi_cd = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.medi_cdcur.size(); i++) {
			PL_TRN_1100_MMEDI_CDCURRecord rec = (PL_TRN_1100_MMEDI_CDCURRecord)ds.medi_cdcur.get(i);
			int record = rx.add(medi_cd, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** MEDI_CDCUR END */

		/****** DEAL_PTCRCUR BEGIN */
		int DEAL_PTCRCUR = rx.add(dataSet, "DEAL_PTCRCUR", "");
		for(int i = 0; i < ds.deal_ptcrcur.size(); i++) {
			PL_TRN_1100_MDEAL_PTCRCURRecord rec = (PL_TRN_1100_MDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);
			int record = rx.add(DEAL_PTCRCUR, "record", "");
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_grp_seq", rec.deal_grp_seq);
			rx.add(record, "deal_seq", rec.deal_seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
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
	<WH_CDCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</WH_CDCUR>
</dataSet>
*/
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

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDI_CDCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</MEDI_CDCUR>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 01 16:59:58 KST 2009 */ %>