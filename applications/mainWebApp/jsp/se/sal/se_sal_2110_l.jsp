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
* 파일명 : se_sal_2110_l.jsp
* 기능 :   판매 - 지대관리 - 매출관리 - 순매출액산출현황
* 작성일자 : 2009-04-07
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SAL_2110_LDataSet ds = (SE_SAL_2110_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2110_LCURLISTRecord rec = (SE_SAL_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"			, "");
			rx.add(record, "dept_cd"		, rec.dept_cd			);
			rx.add(record, "dept_nm"		, rec.dept_nm			);
			rx.add(record, "sub_dept_cd"	, rec.sub_dept_cd		);
			rx.add(record, "sub_dept_nm"	, rec.sub_dept_nm		);
			rx.add(record, "area_cd"		, rec.area_cd			);
			rx.add(record, "area_nm"		, rec.area_nm			);
			rx.add(record, "bo_cd"			, rec.bo_cd				);
			rx.add(record, "bo_nm"			, rec.bo_nm				);
			rx.add(record, "net_sale_amt"	, rec.net_sale_amt		);
			rx.add(record, "val_qty"		, rec.val_qty			);
			rx.add(record, "icdc_calc_qty"	, rec.icdc_calc_qty		);
			rx.add(record, "spsl_qty"		, rec.spsl_qty			);
			rx.add(record, "cntr_qty"		, rec.cntr_qty			);
			rx.add(record, "basi_uprc"		, rec.basi_uprc			);
			rx.add(record, "rdff_rdu_uprc"	, rec.rdff_rdu_uprc		);
			rx.add(record, "cntr_uprc"		, rec.cntr_uprc			);
			rx.add(record, "sale_amt"		, rec.sale_amt			);
			rx.add(record, "fpymt_encur_amt", rec.fpymt_encur_amt	);
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
			<sub_dept_cd/>
			<sub_dept_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cd/>
			<bo_nm/>
			<net_sale_amt/>
			<val_qty/>
			<icdc_calc_qty/>
			<spsl_qty/>
			<cntr_qty/>
			<basi_uprc/>
			<rdff_rdu_uprc/>
			<cntr_uprc/>
			<sale_amt/>
			<fpymt_encur_amt/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Apr 07 13:14:22 KST 2009 */ %>