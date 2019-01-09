<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_trg_1810_l.jsp
* ��� : ����򰡴���ڼ���-����� ������ȸ
* �ۼ����� : 2009-04-07
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
	SE_TRG_1810_LDataSet ds = (SE_TRG_1810_LDataSet)request.getAttribute("ds");
	String callgb = request.getParameter("callgb");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1810_LCURLISTRecord rec = (SE_TRG_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "team_cd", rec.team_cd);
			rx.add(record, "team_nm", rec.team_nm);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "evlu_yn", rec.evlu_yn);
			rx.add(record, "evlu_grp", rec.evlu_grp);
			rx.add(record, "remk", rec.remk);
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
			<team_cd/>
			<team_nm/>
			<part_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<chrg_pers/>
			<chrg_pers_nm/>
			<evlu_yn/>
			<evlu_grp/>
			<remk/>
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

<% /* �ۼ��ð� : Tue Apr 07 20:07:37 KST 2009 */ %>