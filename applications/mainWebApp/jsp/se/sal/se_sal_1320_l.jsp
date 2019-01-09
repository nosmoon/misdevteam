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
* 파일명 : se_sal_1320_l.jsp
* 기능 :   판매 - 지대관리 - 매출관리 - 지국별 순매출액 조정
* 작성일자 : 2009-04-01
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
	SE_SAL_1320_LDataSet ds = (SE_SAL_1320_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_1320_LCURLISTRecord rec = (SE_SAL_1320_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet		, "record"			, "");
			rx.add(record, "grp"				, "1"					);
			rx.add(record, "yymm"				, rec.yymm				);
			rx.add(record, "dept_cd"			, rec.dept_cd			);
			rx.add(record, "dept_nm"			, rec.dept_nm			);
			rx.add(record, "sub_dept_cd"		, rec.sub_dept_cd		);
			rx.add(record, "sub_dept_nm"		, rec.sub_dept_nm		);
			rx.add(record, "area_cd"			, rec.area_cd			);
			rx.add(record, "area_nm"			, rec.area_nm			);
			rx.add(record, "bo_cd"				, rec.bo_cd				);
			rx.add(record, "bo_nm"				, rec.bo_nm				);
			rx.add(record, "jd_sell_net_clsf"	, rec.jd_sell_net_clsf	);
			rx.add(record, "medi_cd"			, rec.medi_cd			);
			rx.add(record, "bo_seq"				, rec.bo_seq			);
			rx.add(record, "yymm"				, rec.yymm				);
			rx.add(record, "prvmm_val_qty"		, rec.prvmm_val_qty		);
			rx.add(record, "cntr_uprc_be"		, rec.cntr_uprc_be		);
			rx.add(record, "net_sale_amt_be"	, rec.net_sale_amt_be	);
			rx.add(record, "qty"				, rec.qty				);
			rx.add(record, "icdc_uprc"			, rec.icdc_uprc			);
			rx.add(record, "cntr_uprc"			, rec.cntr_uprc			);
			rx.add(record, "dnt_amt"			, rec.dnt_amt			);
			rx.add(record, "fpymt_encur_amt"	, rec.fpymt_encur_amt	);
			rx.add(record, "net_sale_amt"		, rec.net_sale_amt		);
			rx.add(record, "rdff_rdu_uprc"		, rec.rdff_rdu_uprc		);
			rx.add(record, "rdff_rdu_uprc_be"	, rec.rdff_rdu_uprc_be	);
			rx.add(record, "basi_uprc"			, rec.basi_uprc			);
			rx.add(record, "icdc_net_sale_amt"	, rec.icdc_net_sale_amt	);
			rx.add(record, "icdc_area"			, rec.icdc_area			);
			rx.add(record, "basi_amt"			, rec.basi_amt			);
			rx.add(record, "surplus_amt"		, rec.surplus_amt		);
			rx.add(record, "subs_uprc"			, rec.subs_uprc			);
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
			<yymm/>
			<dept_nm/>
			<sub_dept_cd/>
			<sub_dept_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cd/>
			<bo_nm/>
			<medi_cd/>
			<yymm/>
			<prvmm_val_qty/>
			<cntr_uprc_be/>
			<net_sale_amt/>
			<qty/>
			<icdc_uprc/>
			<cntr_uprc/>
			<dnt_amt/>
			<fpymt_encur_amt/>
			<net_sale_amt/>
			<rdff_rdu_uprc/>
			<rdff_rdu_uprc_be/>
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

<% /* 작성시간 : Wed Apr 01 15:37:43 KST 2009 */ %>