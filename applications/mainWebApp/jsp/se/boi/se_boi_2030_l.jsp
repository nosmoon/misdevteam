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
* ���ϸ� : se_boi_2030_l.jsp
* ��� : Ÿ�����μ��ΰ� - ����������� ��ȸ
* �ۼ����� : 2009-05-25
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
	SE_BOI_2030_LDataSet ds = (SE_BOI_2030_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "boinfo", "");

	try {
		if(ds.curlist.size() > 0) {
			SE_BOI_2030_LCURLISTRecord rec = (SE_BOI_2030_LCURLISTRecord)ds.curlist.get(0);
			rx.add(resform, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(resform, "bo_nm", rec.bo_nm);
			rx.addCData(resform, "bo_head_nm", rec.bo_head_nm);
			rx.add(resform, "area_cd", rec.area_cd);
			rx.add(resform, "area_nm", rec.area_nm);
			rx.add(resform, "chrg_pers", rec.chrg_pers);
			rx.add(resform, "amt1", rec.amt1);
			rx.add(resform, "amt2", rec.amt2);
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
			<amt1/>
			<amt2/>
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

<% /* �ۼ��ð� : Mon May 25 17:02:11 KST 2009 */ %>
