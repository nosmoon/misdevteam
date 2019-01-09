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
* ���ϸ� : pl_rcp_3300_m.jsp
* ��� : 
* �ۼ����� : 2009-04-27
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
	PL_RCP_3300_MDataSet ds = (PL_RCP_3300_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** COLT_CLSFCUR BEGIN */
		int colt_clsf = rx.add(dataSet, "colt_clsf", "");
		for(int i = 0; i < ds.colt_clsfcur.size(); i++) {
			PL_RCP_3300_MCOLT_CLSFCURRecord rec = (PL_RCP_3300_MCOLT_CLSFCURRecord)ds.colt_clsfcur.get(i);
			int record = rx.add(colt_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** COLT_CLSFCUR END */

		/****** SETUP_STATCUR BEGIN */
		int setup_stat = rx.add(dataSet, "setup_stat", "");
		for(int i = 0; i < ds.setup_statcur.size(); i++) {
			PL_RCP_3300_MSETUP_STATCURRecord rec = (PL_RCP_3300_MSETUP_STATCURRecord)ds.setup_statcur.get(i);
			int record = rx.add(setup_stat, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** SETUP_STATCUR END */

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
	<COLT_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</COLT_CLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<SETUP_STATCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</SETUP_STATCUR>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Mon Apr 27 18:18:56 KST 2009 */ %>