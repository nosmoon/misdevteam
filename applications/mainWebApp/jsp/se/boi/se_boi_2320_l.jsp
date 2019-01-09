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
* ���ϸ� : se_boi_2320_l.jsp
* ��� : ���������̿� - �����ȸ
* �ۼ����� : 2009-05-27
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
	SE_BOI_2320_LDataSet ds = (SE_BOI_2320_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_2320_LCURLISTRecord rec = (SE_BOI_2320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "amt3", rec.amt3);
			rx.add(record, "clos_yn", rec.clos_yn);
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
			<area_cd/>
			<area_nm/>
			<bo_cd/>
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
			<clos_yn/>
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

<% /* �ۼ��ð� : Wed May 27 16:50:30 KST 2009 */ %>
