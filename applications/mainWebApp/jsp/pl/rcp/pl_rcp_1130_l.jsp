<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.rcp.rec.*
	,	chosun.ciis.pl.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pl_rcp_1130_l.jsp
* ��� : 
* �ۼ����� : 2009-04-23
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
	PL_RCP_1130_LDataSet ds = (PL_RCP_1130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resultData", "");

	try {
		/****** GURT_AMT BEGIN */
		rx.add(dataSet, "gurt_amt", ds.gurt_amt);
		/****** GURT_AMT END */

		/****** CLOSINFOCUR BEGIN */
		int CLOSINFOCUR = rx.add(dataSet, "CLOSINFOCUR", "");
		for(int i = 0; i < ds.closinfocur.size(); i++) {
			PL_RCP_1130_LCLOSINFOCURRecord rec = (PL_RCP_1130_LCLOSINFOCURRecord)ds.closinfocur.get(i);
			int record = rx.add(CLOSINFOCUR, "record", "");
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "medi_clsf_nm", StringUtil.replaceToXml(rec.medi_clsf_nm));
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "sale_amt", rec.sale_amt);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "thmm_bal", rec.thmm_bal);
			rx.add(record, "meda_bal", rec.meda_bal);
			rx.add(record, "tot_bal", rec.tot_bal);
		}
		/****** CLOSINFOCUR END */

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
	<CLOSINFOCUR>
		<record>
			<medi_clsf/>
			<medi_clsf_nm/>
			<basi_yymm/>
			<cyov_bal/>
			<sale_amt/>
			<rcpm_amt/>
			<thmm_bal/>
			<meda_bal/>
			<tot_bal/>
		</record>
	</CLOSINFOCUR>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Apr 23 15:08:46 KST 2009 */ %>