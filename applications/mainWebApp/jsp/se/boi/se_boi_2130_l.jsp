<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_boi_2130_l.jsp
* ��� : 
* �ۼ����� : 2009-05-26
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
	SE_BOI_2130_LDataSet ds = (SE_BOI_2130_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "boinfo", "");

	try {
		if(ds.curlist.size() > 0) {
			SE_BOI_2130_LCURLISTRecord rec = (SE_BOI_2130_LCURLISTRecord)ds.curlist.get(0);
			rx.add(resData, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(resData, "bo_nm", rec.bo_nm);
			rx.addCData(resData, "bo_head_nm", rec.bo_head_nm);
			rx.add(resData, "area_cd", rec.area_cd);
			rx.add(resData, "area_nm", rec.area_nm);
			rx.add(resData, "chrg_pers", rec.chrg_pers);
			rx.add(resData, "amt1", rec.leas_sply_amt);
			rx.add(resData, "amt2", rec.leas_sply_amt_exch_in_amt);
			rx.add(resData, "misudt", rec.leas_sply_amt_unrcp_occr_dt);
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
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<bo_head_nm/>
			<area_cd/>
			<area_nm/>
			<chrg_pers/>
			<leas_sply_amt/>
			<leas_sply_amt_exch_in_amt/>
			<rem_amt/>
			<leas_sply_amt_unrcp_occr_dt/>
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

<% /* �ۼ��ð� : Tue May 26 17:02:10 KST 2009 */ %>
