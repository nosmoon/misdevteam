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
* ���ϸ� : pl_rcp_3200_m.jsp
* ��� : 
* �ۼ����� : 2009-04-24
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
	PL_RCP_3200_MDataSet ds = (PL_RCP_3200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** BUDG_CLSFCUR BEGIN */
		int budg_clsf = rx.add(dataSet, "budg_clsf", "");
		for(int i = 0; i < ds.budg_clsfcur.size(); i++) {
			PL_RCP_3200_MBUDG_CLSFCURRecord rec = (PL_RCP_3200_MBUDG_CLSFCURRecord)ds.budg_clsfcur.get(i);
			int record = rx.add(budg_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		/****** BUDG_CLSFCUR END */

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
	<BUDG_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</BUDG_CLSFCUR>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Fri Apr 24 17:49:59 KST 2009 */ %>