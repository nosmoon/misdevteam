<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.rec.*
	,	chosun.ciis.se.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_bas_1210_l.jsp
* ��� : 
* �ۼ����� : 2009-02-09
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
	SE_BAS_1210_LDataSet ds = (SE_BAS_1210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "mediData", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BAS_1210_LCURLISTRecord rec = (SE_BAS_1210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sell_net_clsf", rec.sell_net_clsf);
			rx.add(record, "aply_yymm", rec.aply_yymm);
			rx.add(record, "uprc_amt", rec.uprc_amt);
			rx.add(record, "uprc_aply_clsf", rec.uprc_aply_clsf);
			rx.add(record, "remk", rec.remk);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
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
			<medi_cd/>
			<sell_net_clsf/>
			<aply_yymm/>
			<uprc_amt/>
			<remk/>
			<incmg_pers/>
			<incmg_dt_tm/>
			<chg_pers/>
			<chg_dt_tm/>
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
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Mon Feb 09 15:29:10 KST 2009 */ %>