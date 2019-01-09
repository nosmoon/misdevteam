<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_comm_2210_l.jsp
* 기능 :   구독료 지급내역 조회 팝업
* 작성일자 : 2009-03-05
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
	SE_COMM_2210_LDataSet ds = (SE_COMM_2210_LDataSet)request.getAttribute("ds");
	int root 					= RwXml.rootNodeID;
	int formData 				= 0;
	
	formData					= rx.add(root	,	"gridData"	, "");
	
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_2210_LCURLISTRecord rec = (SE_COMM_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record"			, "");
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
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "sub_dept_cd"	, rec.sub_dept_cd	);
			rx.add(record, "sub_dept_nm"	, rec.sub_dept_nm	);
			rx.add(record, "acct_no"		, rec.acct_no		);
			rx.add(record, "rcpm_main_nm"	, rec.rcpm_main_nm	);
			rx.add(record, "setl_bank"		, rec.setl_bank		);
			rx.add(record, "setl_bank_nm"	, rec.setl_bank_nm	);
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
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<dept_nm/>
			<sub_dept_cd/>
			<sub_dept_nm/>
			<acct_no/>
			<rcpm_main_nm/>
			<setl_bank/>
			<setl_bank_nm/>
			<dlco_no/>
			<rmks/>
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

<% /* 작성시간 : Thu Mar 05 19:39:36 KST 2009 */ %>