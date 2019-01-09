<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.base.util.*
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_boi_1310_l.jsp
* ��� : ������Ȳ��ȸ - ������Ȳ�� ��ȸ
* �ۼ����� : 2009-02-06
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
	SE_BOI_1310_LDataSet ds = (SE_BOI_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab1list", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1310_LCURLISTRecord rec = (SE_BOI_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_nm", rx.replaceToEscape(rec.area_nm));
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "bo_head_prn", rec.bo_head_prn);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "bo_zip", rec.bo_zip);
			rx.add(record, "bo_addr", StringUtil.replaceString(rec.bo_addr,"&","&#38;"));
			rx.add(record, "bo_telno", rec.bo_telno);
			rx.add(record, "bo_cntr_dt", rec.bo_cntr_dt);
			rx.add(record, "fst_jd_yymm", rec.fst_jd_yymm);
			rx.add(record, "bo_feat_nm", rec.bo_feat_nm);
			rx.add(record, "bo_mang_grad_clasnm", rec.bo_mang_grad_clasnm);
			rx.add(record, "qty_sell_net_nm", rec.qty_sell_net_nm);
			rx.add(record, "sido_nm", rec.sido_nm);
			rx.add(record, "adms_dstc_nm", rec.adms_dstc_nm);
		}
		System.out.println(rx.toString());
	}
	catch (Exception e) {
		System.out.println(e.getStackTrace());
	}
	finally {
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
			<bo_head_nm/>
			<bo_head_prn/>
			<chrg_flnm/>
			<dept_nm/>
			<bo_zip/>
			<bo_addr/>
			<bo_telno/>
			<bo_cntr_dt/>
			<fst_jd_yymm/>
			<bo_feat_nm/>
			<bo_mang_grad_clasnm/>
			<qty_sell_net_nm/>
			<sido_nm/>
			<adms_dstc_nm/>
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

<% /* �ۼ��ð� : Tue Feb 03 10:01:21 KST 2009 */ %>
