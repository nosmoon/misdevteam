<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_rcp_1620_l.jsp
* ��� : ������µ��-��ϴ����ȸ
* �ۼ����� : 2009-05-06
* �ۼ��� : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_RCP_1620_LDataSet ds = (SE_RCP_1620_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1620_LCURLISTRecord rec = (SE_RCP_1620_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "acct_no", rec.acct_no);
			rx.add(record, "cntr_stat_nm", rec.cntr_stat_nm);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<CURLIST>
		<record>
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<chrg_flnm/>
			<bo_head_nm/>
			<acct_no/>
			<cntr_stat_nm/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed May 06 09:49:12 KST 2009 */ %>
