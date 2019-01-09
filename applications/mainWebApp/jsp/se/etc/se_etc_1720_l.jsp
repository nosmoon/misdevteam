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
* 파일명 : se_etc_1020_l.jsp
* 기능 :  판매-기타관리-확장수당등록
* 작성일자 : 2009-03-03
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
	SE_ETC_1720_LDataSet ds = (SE_ETC_1720_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "chglist"		, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ETC_1720_LCURLISTRecord rec = (SE_ETC_1720_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record"			, "");
			rx.add(record, "yymm"			, rec.yymm			);
			rx.add(record, "pay_seq"		, rec.pay_seq		);
			rx.add(record, "pay_ptcr_seq"	, rec.pay_ptcr_seq	);
			rx.add(record, "bo_cd"			, rec.bo_cd			);
			rx.add(record, "bo_seq"			, rec.bo_seq		);
			rx.add(record, "bo_nm"			, rec.bo_nm			);
			rx.addCData(record, "bo_head_nm"		, rec.bo_head_nm	);
			rx.add(record, "prn"			, rec.prn			);
			rx.add(record, "qty"			, rec.qty			);
			rx.add(record, "uprc"			, rec.uprc			);
			rx.add(record, "amt"			, rec.amt			);
			rx.add(record, "incm_tax"		, rec.incm_tax		);
			rx.add(record, "res_tax"		, rec.res_tax		);
			rx.add(record, "real_amt"		, rec.real_amt		);
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "supr_dept_nm"	, rec.supr_dept_nm	);
			rx.add(record, "sub_dept_cd"	, rec.sub_dept_cd	);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "chrg_pers"		, rec.chrg_pers		);
			rx.add(record, "acct_no"		, rec.acct_no		);
			rx.add(record, "rmks"			, rec.rmks			);
			rx.add(record, "recp_pers_nm"	, rec.recp_pers_nm	);
			rx.add(record, "tax_yn"			, rec.tax_yn		);
			rx.add(record, "chrg_flnm"		, rec.chrg_flnm		);
			rx.add(record, "dlco_no"		, rec.dlco_no		);
			rx.add(record, "bank_cd"		, rec.bank_cd		);			
			rx.add(record, "vat"			, rec.vat			);
			rx.add(record, "rcpt_clsf"		, rec.rcpt_clsf		);
			rx.add(record, "stmt_clsf"		, rec.stmt_clsf		);	
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
			<incm_tax/>
			<res_tax/>
			<real_amt/>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_nm/>
			<sub_dept_cd/>
			<dept_nm/>
			<chrg_pers/>
			<acct_no/>
			<rmks/>
			<rcpm_main_nm/>
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

<% /* 작성시간 : Tue Mar 03 09:50:21 KST 2009 */ %>
