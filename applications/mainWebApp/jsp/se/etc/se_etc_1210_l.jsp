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
* 파일명 : se_etc_1210_l.jsp
* 기능 :   판매-기타관리-구독료 지급등록
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
	SE_ETC_1210_LDataSet ds = (SE_ETC_1210_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ETC_1210_LCURLISTRecord rec = (SE_ETC_1210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "yymm"			, rec.yymm			);
			rx.add(record, "pay_seq"		, rec.pay_seq		);
			rx.add(record, "pay_descri"		, rec.pay_descri	);
			rx.add(record, "pay_mthd_clsf"	, rec.pay_mthd_clsf	);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "uprc"			, rec.uprc			);
			rx.add(record, "draft_doc_no"	, rec.draft_doc_no	);
			rx.add(record, "pay_dt"			, rec.pay_dt		);
			rx.add(record, "decid_stat"		, rec.decid_stat	);
			rx.add(record, "clos_yn"		, rec.clos_yn		);
			rx.add(record, "actu_slip_no"	, rec.actu_slip_no	);
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
			<pay_descri/>
			<pay_mthd_clsf/>
			<dept_cd/>
			<uprc/>
			<draft_doc_no/>
			<pay_dt/>
			<decid_stat/>
			<clos_yn/>
			<actu_slip_no/>
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

<% /* 작성시간 : Thu Mar 05 10:50:54 KST 2009 */ %>