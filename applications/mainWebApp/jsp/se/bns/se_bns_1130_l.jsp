<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_bns_1130_l.jsp
* ��� : 
* �ۼ����� : 2009-03-11
* �ۼ��� : �̹�ȿ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BNS_1130_LDataSet ds = (SE_BNS_1130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "dtlgrid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1130_LCURLISTRecord rec = (SE_BNS_1130_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "divn_uprc", rec.divn_uprc);
			rx.add(record, "insd_divn_uprc", rec.insd_divn_uprc);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
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
			<bns_item_cd/>
			<bns_item_nm/>
			<bns_item_clas/>
			<uprc/>
			<divn_uprc/>
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

<% /* �ۼ��ð� : Wed Mar 11 21:28:16 KST 2009 */ %>