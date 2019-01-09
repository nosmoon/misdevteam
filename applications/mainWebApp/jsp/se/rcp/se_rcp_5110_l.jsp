<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.rec.*
	,	chosun.ciis.se.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_rcp_5110_l.jsp
* ��� :  �Ǹ� - �Աݰ��� - �������� - ��ǥ����
* �ۼ����� : 2009-05-19
* �ۼ��� : �����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_RCP_5110_LDataSet ds = (SE_RCP_5110_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_5110_LCURLISTRecord rec = (SE_RCP_5110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd", rec.cmpy_cd	);
			rx.add(record, "occr_dt", rec.occr_dt	);
			rx.add(record, "dept_cd", rec.dept_cd	);
			rx.add(record, "dept_nm", rec.dept_nm	);
			rx.add(record, "clos_yn", rec.clos_yn	);
			rx.add(record, "cnt_11"	, rec.cnt_11	);
			rx.add(record, "amt_11"	, rec.amt_11	);
			rx.add(record, "cnt_13"	, rec.cnt_13	);
			rx.add(record, "amt_13"	, rec.amt_13	);
			rx.add(record, "cnt_33"	, rec.cnt_33	);
			rx.add(record, "amt_33"	, rec.amt_33	);
			rx.add(record, "cnt_97"	, rec.cnt_97	);
			rx.add(record, "amt_97"	, rec.amt_97	);
			rx.add(record, "cnt_etc", rec.cnt_etc	);
			rx.add(record, "amt_etc", rec.amt_etc	);
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
			<cmpy_cd/>
			<occr_dt/>
			<dept_cd/>
			<dept_nm/>
			<clos_yn/>
			<cnt_11/>
			<amt_11/>
			<cnt_13/>
			<amt_13/>
			<cnt_33/>
			<amt_33/>
			<cnt_97/>
			<amt_97/>
			<cnt_etc/>
			<amt_etc/>
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

<% /* �ۼ��ð� : Tue May 19 13:52:02 KST 2009 */ %>