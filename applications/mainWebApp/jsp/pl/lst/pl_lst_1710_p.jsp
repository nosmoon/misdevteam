<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.lst.rec.*
	,	chosun.ciis.pl.lst.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pl_lst_1710_p.jsp
* ��� : 
* �ۼ����� : 2009-08-19
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
	PL_LST_1710_PDataSet ds = (PL_LST_1710_PDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "gridData", "");

	try {
		/****** PTCRLIST BEGIN */
		int PTCRLIST = rx.add(dataSet, "PTCRLIST", "");
		for(int i = 0; i < ds.ptcrlist.size(); i++) {
			PL_LST_1710_PPTCRLISTRecord rec = (PL_LST_1710_PPTCRLISTRecord)ds.ptcrlist.get(i);
			int record = rx.add(PTCRLIST, "record", "");
			rx.add(record, "chit_no", rec.chit_no);
			rx.add(record, "vexc_dlco_cd", rec.vexc_dlco_cd);
			rx.add(record, "sale_clsf", rec.sale_clsf);
			rx.add(record, "issu_clsf", rec.issu_clsf);
			rx.add(record, "sendclsf_nm", rec.sendclsf_nm);
			rx.add(record, "sell_type_nm", rec.sell_type_nm);
			rx.add(record, "wh_cd", rec.wh_cd);
			rx.add(record, "cont", StringUtil.replaceToXml(rec.cont));
			rx.add(record, "vexc_medi_ser_no", rec.vexc_medi_ser_no);
			rx.add(record, "deal_uprc", rec.deal_uprc);
			rx.add(record, "deal_qty", rec.deal_qty);
			rx.add(record, "dcrate", rec.dcrate);
			rx.add(record, "deal_amt", rec.deal_amt);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			rx.add(record, "serial_no", rec.serial_no);
			rx.add(record, "deal_dt", rec.deal_dt);
			rx.add(record, "deal_grp_seq", rec.deal_grp_seq);
			rx.add(record, "grp_no", rec.grp_no);
		}
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<PTCRLIST>
		<record>
			<chit_no/>
			<vexc_dlco_cd/>
			<sale_clsf/>
			<issu_clsf/>
			<sendclsf_nm/>
			<sell_type_nm/>
			<wh_cd/>
			<cont/>
			<vexc_medi_ser_no/>
			<deal_uprc/>
			<deal_qty/>
			<dcrate/>
			<deal_amt/>
			<remk/>
			<serial_no/>
		</record>
	</PTCRLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Aug 19 19:40:19 KST 2009 */ %>