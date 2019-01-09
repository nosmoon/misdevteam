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
* ���ϸ� : se_etc_1110_l.jsp
* ��� :   �Ǹ�-��Ÿ����-Ȯ����� ���޳��� ��ȸ
* �ۼ����� : 2009-03-04
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
	SE_ETC_1110_LDataSet ds = (SE_ETC_1110_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ETC_1110_LCURLISTRecord rec = (SE_ETC_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "pay_obj_clsf"	, rec.pay_obj_clsf		);
			rx.add(record, "pay_obj_clsf_nm", rec.pay_obj_clsf_nm	);
			rx.add(record, "dept_cd"		, rec.dept_cd			);
			rx.add(record, "dept_nm"		, rec.dept_nm			);
			rx.add(record, "sub_dept_cd"	, rec.sub_dept_cd		);
			rx.add(record, "sub_dept_nm"	, rec.sub_dept_nm		);
			rx.add(record, "area_cd"		, rec.area_cd			);
			rx.add(record, "area_nm"		, rec.area_nm			);
			rx.add(record, "bo_cd"			, rec.bo_cd				);
			rx.add(record, "bo_nm"			, rec.bo_nm				);
			rx.addCData(record, "bo_head_nm"		, rec.bo_head_nm		);
			rx.add(record, "qty"			, rec.qty				);
			rx.add(record, "uprc"			, rec.uprc				);
			rx.add(record, "amt"			, rec.amt				);
			rx.add(record, "incm_tax"		, rec.incm_tax			);
			rx.add(record, "res_tax"		, rec.res_tax			);
			rx.add(record, "real_amt"		, rec.real_amt			);
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
			<pay_obj_clsf/>
			<pay_obj_clsf_nm/>
			<dept_cd/>
			<dept_nm/>
			<sub_dept_cd/>
			<sub_dept_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cd/>
			<bo_nm/>
			<bo_nm/>
			<qty/>
			<uprc/>
			<amt/>
			<incm_tax/>
			<res_tax/>
			<real_amt/>
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

<% /* �ۼ��ð� : Wed Mar 04 20:11:53 KST 2009 */ %>
