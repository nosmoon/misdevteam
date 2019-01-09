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
* ���ϸ� : se_sal_1610_l.jsp
* ��� :  �Ǹ� - ������� - ������� - ��꼭 ����
* �ۼ����� : 2009-04-15
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
	SE_SAL_1610_LDataSet ds = (SE_SAL_1610_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_1610_LCURLISTRecord rec = (SE_SAL_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "bo_cd"			, rec.bo_cd			);
			rx.add(record, "bo_seq"			, rec.bo_seq		);
			rx.add(record, "slip_occr_dt"	, rec.slip_occr_dt	);
			rx.add(record, "slip_clsf_cd"	, rec.slip_clsf_cd	);
			rx.add(record, "slip_seq"		, rec.slip_seq		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "part_nm"		, rec.part_nm		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "bo_nm"			, rec.bo_nm			);
			rx.add(record, "bo_head_nm"		, rec.bo_head_nm	);
			rx.add(record, "ern_be"			, rec.ern_be		);
			rx.add(record, "make_dt"		, rec.make_dt		);
			rx.add(record, "issu_clsf"		, rec.issu_clsf		);
			rx.add(record, "ern"			, rec.ern			);
			rx.add(record, "bo_cd_seq"		, rec.bo_cd_seq		);
			rx.add(record, "prof_type_cd"	, rec.prof_type_cd	);
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
			<slip_occr_dt/>
			<slip_clsf_cd/>
			<slip_seq/>
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<bo_nm/>
			<bo_head_nm/>
			<ern_be/>
			<make_dt/>
			<issu_clsf/>
			<ern/>
			<bo_cd_seq/>
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

<% /* �ۼ��ð� : Wed Apr 15 10:11:29 KST 2009 */ %>