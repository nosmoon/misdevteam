<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.ds.*
	,	chosun.ciis.se.bas.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_bas_1610_l.jsp
* ��� : �ҳ����Է�����-������ȸ
* �ۼ����� : 2009-07-17
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
	SE_BAS_1610_LDataSet ds = (SE_BAS_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BAS_1610_LCURLISTRecord rec = (SE_BAS_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "sell_net_clsf", rec.sell_net_clsf);
			rx.add(record, "sell_net_clsf_nm", rec.sell_net_clsf_nm);
			rx.add(record, "aply_mm", rec.aply_mm);
			rx.add(record, "aply_bgn_dd", rec.aply_bgn_dd);
			rx.add(record, "enty_rate", rec.enty_rate);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt", rec.chg_dt);
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
			<sell_net_clsf_nm/>
			<aply_mm/>
			<aply_bgn_dd/>
			<enty_rate/>
			<remk/>
			<chg_pers/>
			<chg_dt/>
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

<% /* �ۼ��ð� : Fri Jul 17 19:11:47 KST 2009 */ %>