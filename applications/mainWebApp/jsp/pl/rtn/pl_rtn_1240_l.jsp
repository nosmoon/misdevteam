<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.rtn.rec.*
	,	chosun.ciis.pl.rtn.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pl_rtn_1240_l.jsp
* ��� : 
* �ۼ����� : 2009-09-16
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_RTN_1240_LDataSet ds = (PL_RTN_1240_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	int DEAL_PTCRCUR = rx.add(root, "DEAL_PTCRCUR", "");

	try {
		/****** DEAL_PTCRCUR BEGIN */
		for(int i = 0; i < ds.deal_ptcrcur.size(); i++) {
			PL_RTN_1240_LDEAL_PTCRCURRecord rec = (PL_RTN_1240_LDEAL_PTCRCURRecord)ds.deal_ptcrcur.get(i);
			int record = rx.add(DEAL_PTCRCUR, "record", "");
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_grp_seq", rec.deal_grp_seq);
			rx.add(record, "deal_seq", rec.deal_seq);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_ser_no", rec.medi_ser_no);
			rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "deal_uprc", rec.deal_uprc);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "deal_amt", rec.deal_amt);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "prv_deli_qty", rec.prv_deli_qty);
			rx.add(record, "prv_widr_qty", rec.prv_widr_qty);
			rx.add(record, "prv_retn_qty", rec.prv_retn_qty);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "medi_clsf", "20");
			rx.add(record, "absence_clsf", "");
			rx.add(record, "vexc_medi_ser_no", rec.vexc_medi_ser_no);
			
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<DEAL_PTCRCUR>
		<record>
			<deal_dt/>
			<deal_grp_seq/>
			<deal_seq/>
			<medi_cd/>
			<medi_ser_no/>
			<medi_nm/>
			<deal_qty/>
			<deal_uprc/>
			<dcrate/>
			<deal_amt/>
			<wh_cd/>
			<prv_deli_qty/>
			<prv_widr_qty/>
			<prv_retn_qty/>
			<remk/>
			<medi_clsf/>
		</record>
	</DEAL_PTCRCUR>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Sep 16 11:59:45 KST 2009 */ %>