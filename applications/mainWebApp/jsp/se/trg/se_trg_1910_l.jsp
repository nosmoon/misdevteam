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
* ���ϸ� : se_trg_1910_l.jsp
* ��� : �ν�Ȯ���� - ������ȸ
* �ۼ����� : 2009-04-10
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
	SE_TRG_1910_LDataSet ds = (SE_TRG_1910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1910_LCURLISTRecord rec = (SE_TRG_1910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			//rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "ufth_dedu", rec.ufth_dedu);
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
			<yymm/>
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<chrg_pers_nm/>
			<dedu_rslt/>
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

<% /* �ۼ��ð� : Fri Apr 10 14:08:46 KST 2009 */ %>