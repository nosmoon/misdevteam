<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.com.rec.*
	,	chosun.ciis.pl.com.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pl_com_1400_m.jsp
* ��� : 
* �ۼ����� : 2009-03-26
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
	PL_COM_1400_MDataSet ds = (PL_COM_1400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "comboSet", "");

	try {
		/****** DLCO_CLSFCUR BEGIN */
		int dlco_clsf = rx.add(dataSet, "dlco_clsf", "");	
		for(int i = 0; i < ds.dlco_clsfcur.size(); i++) {
			PL_COM_1400_MDLCO_CLSFCURRecord rec = (PL_COM_1400_MDLCO_CLSFCURRecord)ds.dlco_clsfcur.get(i);
			int record = rx.add(dlco_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** DLCO_CLSFCUR END */

		/****** AREACUR BEGIN */
		int area = rx.add(dataSet, "area", "");	
		for(int i = 0; i < ds.areacur.size(); i++) {
			PL_COM_1400_MAREACURRecord rec = (PL_COM_1400_MAREACURRecord)ds.areacur.get(i);
			int record = rx.add(area, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cd_abrv_nm);
		}
		/****** AREACUR END */

		/****** PRV_CURR_CLSFCUR BEGIN */
		int prv_curr_clsf = rx.add(dataSet, "prv_curr_clsf", "");	
		for(int i = 0; i < ds.prv_curr_clsfcur.size(); i++) {
			PL_COM_1400_MPRV_CURR_CLSFCURRecord rec = (PL_COM_1400_MPRV_CURR_CLSFCURRecord)ds.prv_curr_clsfcur.get(i);
			int record = rx.add(prv_curr_clsf, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
		}
		/****** PRV_CURR_CLSFCUR END */

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
	<DLCO_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</DLCO_CLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<PRV_CURR_CLSFCUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</PRV_CURR_CLSFCUR>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<AREACUR>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</AREACUR>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Mar 26 16:25:38 KST 2009 */ %>