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
* ���ϸ� : se_boi_2610_l.jsp
* ��� : �������°˻� - ������ȸ
* �ۼ����� : 2009-05-29
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
	SE_BOI_2610_LDataSet ds = (SE_BOI_2610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_2610_LCURLISTRecord rec = (SE_BOI_2610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "grp", 1);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_cd", rec.part_cd);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cdseq", rec.bo_cdseq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "cctr_dt", rec.cctr_dt);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "amt3", rec.amt3);
			rx.add(record, "amt4", rec.amt4);
			rx.add(record, "amt5", rec.amt5);
			rx.add(record, "amt6", rec.amt6);
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
			<dept_cd/>
			<dept_nm/>
			<part_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cdseq/>
			<bo_nm/>
			<bo_head_nm/>
			<cctr_dt/>
			<amt1/>
			<amt2/>
			<amt3/>
			<amt4/>
			<amt5/>
			<amt6/>
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

<% /* �ۼ��ð� : Fri May 29 15:11:17 KST 2009 */ %>
