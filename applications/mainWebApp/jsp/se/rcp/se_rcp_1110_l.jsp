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
* ���ϸ� : se_rcp_1110_l.jsp
* ��� : (�������)�Ա���ȯ-��ȯ���� ��ȸ
* �ۼ����� : 2009-04-15
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
	SE_RCP_1110_LDataSet ds = (SE_RCP_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "mainlist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1110_LCURLISTRecord rec = (SE_RCP_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "acpt_bo_nm", rec.acpt_bo_nm);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "swit_dt", rec.swit_dt);
			rx.add(record, "swit_seq", rec.swit_seq);
			rx.add(record, "acct_bal", rec.acct_bal);
			rx.add(record, "acpt_trsf_amt", rec.acpt_trsf_amt);
			rx.add(record, "cnfm_yn", rec.cnfm_yn);
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
			<area_nm/>
			<bo_nm/>
			<chrg_flnm/>
			<bo_head_nm/>
			<acpt_clsf_nm/>
			<swit_dt/>
			<acct_bal/>
			<acpt_trsf_amt/>
			<cnfm_yn/>
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

<% /* �ۼ��ð� : Wed Apr 15 19:09:30 KST 2009 */ %>