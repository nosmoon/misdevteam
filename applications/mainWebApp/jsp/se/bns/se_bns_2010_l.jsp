<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bns_2010_l.jsp
* 기능 :  판매 - 판촉물관리 - 판촉물세금계산서정정
* 작성일자 : 2009-05-01
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
	SE_BNS_2010_LDataSet ds = (SE_BNS_2010_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_2010_LCURLISTRecord rec = (SE_BNS_2010_LCURLISTRecord)ds.curlist.get(i);
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
			rx.addCData(record, "bo_head_nm"		, rec.bo_head_nm	);
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
TrustForm의 Instance 선언부에 복사해서 사용
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
			<prof_type_cd/>
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

<% /* 작성시간 : Fri May 01 16:10:26 KST 2009 */ %>
