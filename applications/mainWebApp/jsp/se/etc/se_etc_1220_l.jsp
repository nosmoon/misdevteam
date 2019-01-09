<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.etc.rec.*
	,	chosun.ciis.se.etc.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : se_etc_1220_l.jsp
* ��� :   �Ǹ�-��Ÿ����-������ ���޵��
* �ۼ����� : 2009-03-05
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
	SE_ETC_1220_LDataSet ds = (SE_ETC_1220_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "chglist"		, "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ETC_1220_LCURLISTRecord rec = (SE_ETC_1220_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData	, "record"		, "");
			rx.add(record, "yymm"			, rec.yymm			);
			rx.add(record, "pay_seq"		, rec.pay_seq		);
			rx.add(record, "pay_ptcr_seq"	, rec.pay_ptcr_seq	);
			rx.add(record, "bo_cd"			, rec.bo_cd			);
			rx.add(record, "bo_seq"			, rec.bo_seq		);
			rx.add(record, "bo_nm"			, rec.bo_nm			);
			rx.add(record, "recp_pers_nm"	, rec.recp_pers_nm	);
			rx.add(record, "prn"			, rec.prn			);
			rx.add(record, "qty"			, rec.qty			);
			rx.add(record, "uprc"			, rec.uprc			);
			rx.add(record, "amt"			, rec.amt			);
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "supr_dept_nm"	, rec.supr_dept_nm	);
			rx.add(record, "sub_dept_cd"	, rec.sub_dept_cd	);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "acct_no"		, rec.acct_no		);
			rx.add(record, "rcpm_main_nm"	, rec.rcpm_main_nm	);
			rx.add(record, "setl_bank"		, rec.setl_bank		);
			rx.add(record, "dlco_no"		, rec.dlco_no		);
			rx.add(record, "rmks"			, rec.rmks			);
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
			<pay_seq/>
			<pay_ptcr_seq/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<recp_pers_nm/>
			<prn/>
			<qty/>
			<uprc/>
			<amt/>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_nm/>
			<sub_dept_cd/>
			<dept_nm/>
			<acct_no/>
			<rcpm_main_nm/>
			<setl_bank/>
			<dlco_no/>
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

<% /* �ۼ��ð� : Thu Mar 05 13:39:42 KST 2009 */ %>