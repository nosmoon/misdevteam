<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_sal_2610_l.jsp
* ��� :  �Ǹ� - ��Ÿ���� - �������ں����Ǻμ�
* �ۼ����� : 2010-05-26
* �ۼ��� : �̹�ȿ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SAL_2815_LDataSet ds = (SE_SAL_2815_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID; 
	int formData			= 0;
	int recordSet			= 0;
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(root		, "gridData"		, "");
	
	try {
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2815_LCURLISTRecord rec = (SE_SAL_2815_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"			, "");
			rx.add(record, "widr_yymm"		, rec.widr_yymm				);
			rx.add(record, "widr_mm_amt"	, rec.widr_mm_amt			);		
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
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<trmrd_qty_0/>
			<dscn_rdr_qty_0/>
			<month_aft_qty_1/>
			<month_aft_qty_2/>
			<month_aft_qty_3/>
			<month_aft_qty_4/>
			<month_aft_qty_5/>
			<aft_qty/>
			<dnt_qty/>
			<avg_send_qty/>
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
		<trmrd_qty/>
		<dncn_qty/>
		<month_qty/>
		<aft_qty/>
		<real_qty/>
		<avg_qty/>
		<rate/>
	</resform>
</resData>
*/
%>

<% /* �ۼ��ð� : Tue May 26 13:55:15 KST 2009 */ %>