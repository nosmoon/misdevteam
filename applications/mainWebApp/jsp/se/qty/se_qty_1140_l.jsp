<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.lang.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_qty_1140_l.jsp
* ��� : �������ϰ�ǥ�۾�-
* �ۼ����� : 
* �ۼ��� : ������
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_QTY_1140_LDataSet ds = (SE_QTY_1140_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");
	try {
		gridData = rx.add(resData, "gridData2", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_1140_LCURLISTRecord rec = (SE_QTY_1140_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "yymm"				, rec.yymm);
			rx.add(record, "bo_cd"				, rec.bo_cd);
			rx.add(record, "bo_seq"				, rec.bo_seq);
			rx.add(record, "rdr_extn_enty_qty"	, rec.rdr_extn_enty_qty);
			rx.add(record, "isenty_qty"			, rec.isenty_qty);
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
			<team_nm/>
			<part_nm/>
			<area_nm/>
			<bo_nm/>
			<bo_cd/>
			<bo_seq/>
			<prvmm_cntr_uprc/>
			<prvmm_val_qty/>
			<prvmm_no_val_qty/>
			<prvmm_qty_tot/>
			<gnr_enty_qty/>
			<isenty_qty/>
			<isicdc_qty/>
			<rdr_extn_enty_qty/>
			<val_movm_qty/>
			<val_icdc_qty/>
			<val_icdc_tot/>
			<curmm_val_qty/>
			<curmm_no_val_qty/>
			<curmm_issu_qty/>
			<no_val_icdc_qty/>
			<curmm_icdc_tot/>
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
		<team_cdcur/>
		<part_cdcur/>
		<area_cdcur/>
		<commcdcur1/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Fri Feb 13 10:03:05 KST 2009 */ %>