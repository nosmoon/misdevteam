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
* ���ϸ� : se_boi_2120_l.jsp
* ��� : Ÿ����������������ȸ - ����ȸ
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
	SE_BOI_2120_LDataSet ds = (SE_BOI_2120_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_2120_LCURLISTRecord rec = (SE_BOI_2120_LCURLISTRecord)ds.curlist.get(i);
			if(i==0){
				rx.add(resform, "bogb", "");
				rx.add(resform, "bo_cdseq", rec.bo_cd+rec.bo_seq);
				rx.add(resform, "bo_nm", rec.bo_nm);
				rx.addCData(resform, "bo_head_nm", rec.bo_head_nm);
				rx.add(resform, "area_cd", rec.area_cd);
				rx.add(resform, "area_nm", rec.area_nm);
				rx.add(resform, "chrg_pers", rec.chrg_pers);
				rx.add(resform, "amt1", rec.leas_sply_amt);
				rx.add(resform, "amt2", rec.leas_sply_amt_exch_in_amt);
				rx.add(resform, "misudt", rec.leas_sply_amt_unrcp_occr_dt);				
				gridData = rx.add(resform, "grid2", "");
			}else{
				int record = rx.add(gridData, "record", "");
				rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
				rx.add(record, "bo_nm", rec.bo_nm);
				rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
				rx.add(record, "area_cd", rec.area_cd);
				rx.add(record, "area_nm", rec.area_nm);
				rx.add(record, "chrg_pers", rec.chrg_pers);
				rx.add(record, "amt1", rec.leas_sply_amt);
				rx.add(record, "amt2", rec.amt);
			}
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
			<amt/>
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

<% /* �ۼ��ð� : Tue May 26 17:01:42 KST 2009 */ %>
