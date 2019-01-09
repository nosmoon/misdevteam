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
* ���ϸ� : se_boi_2410_l.jsp
* ��� : �������´��ó�� - ��ȸ(ó������,ó�����)
* �ۼ����� : 2009-05-28
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
	SE_BOI_2410_LDataSet ds = (SE_BOI_2410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	String occr_dt = "";
	String slip_clsf = "";
	String seq = "";
	resform = rx.add(root, "resform", "");
	gridData = rx.add(resform, "grid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_2410_LCURLISTRecord rec = (SE_BOI_2410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			if(!"".equals(rec.occr_dt)){
				occr_dt = rec.occr_dt;
				slip_clsf = rec.slip_clsf;
				seq = rec.seq;
			}
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cdseq", rec.bo_cdseq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "amt3", rec.amt3);
			rx.add(record, "amt4", rec.amt4);
		}
	
		rx.add(resform, "occr_dt", occr_dt);
		rx.add(resform, "slip_clsf", slip_clsf);
		rx.add(resform, "seq", seq);
		
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
			<area_cd/>
			<area_nm/>
			<bo_cdseq/>
			<bo_nm/>
			<bo_head_nm/>
			<chrg_pers/>
			<chrg_flnm/>
			<occr_dt/>
			<slip_clsf/>
			<seq/>
			<amt1/>
			<amt2/>
			<amt3/>
			<amt4/>
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

<% /* �ۼ��ð� : Thu May 28 11:40:15 KST 2009 */ %>
