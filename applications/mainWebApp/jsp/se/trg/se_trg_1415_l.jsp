<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_trg_1410_l.jsp
* ��� : ������ ���ذ���
* �ۼ����� : 2009-04-01
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
	SE_TRG_1410_LDataSet ds = (SE_TRG_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int grid2 = rx.add(root, "grid2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1410_LCURLISTRecord rec = (SE_TRG_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(grid2, "record", "");
			rx.add(record, "evlu_grp", rec.evlu_grp);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "thmmsendqty", rec.thmmsendqty);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
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
			<evlu_grp/>
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<thmmsendqty/>
			<chrg_flnm/>
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
		<schgb/>
		<colcnt/>
		<title/>
		<bo_grp/>
		<bo_cnt/>
		<bo_cnt_sum/>
		<real_bocnt/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Wed Apr 01 17:55:21 KST 2009 */ %>