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
* ���ϸ� : se_sal_1010_l.jsp
* ��� :  �Ǹ� - ������� - ������� - �����������������
* �ۼ����� : 2009-04-09
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
	SE_SAL_1010_LDataSet ds = (SE_SAL_1010_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_1010_LCURLISTRecord rec = (SE_SAL_1010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "yymm"			, rec.yymm			);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
			rx.add(record, "supr_dept_nm"	, rec.supr_dept_nm	);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "sido_cd"		, rec.sido_cd		);
			rx.add(record, "sido_nm"		, rec.sido_nm		);
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "chrg_pers"		, rec.chrg_pers		);
			rx.add(record, "flnm"			, rec.flnm			);
			rx.add(record, "gubun"			, rec.gubun			);
			rx.add(record, "crte_yn"		, rec.crte_yn		);
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
			<yymm/>
			<supr_dept_cd/>
			<supr_dept_nm/>
			<dept_cd/>
			<dept_nm/>
			<sido_cd/>
			<sido_nm/>
			<area_cd/>
			<area_nm/>
			<chrg_pers/>
			<flnm/>
			<gubun/>
			<crte_yn/>
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

<% /* �ۼ��ð� : Thu Apr 09 10:50:00 KST 2009 */ %>