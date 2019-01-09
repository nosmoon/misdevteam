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
* 파일명 : se_sal_2610_l.jsp
* 기능 :  판매 - 기타관리 - 본지일자별가판부수
* 작성일자 : 2010-05-26
* 작성자 : 이민효
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_SAL_2810_LDataSet ds = (SE_SAL_2810_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID; 
	int formData			= 0;
	int recordSet			= 0;
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(root		, "gridData2"		, "");
	
	try {
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2810_LCURLISTRecord rec = (SE_SAL_2810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"			, "");
			rx.add(record, "bo_cd"				, rec.bo_cd				);
			rx.add(record, "bo_seq"				, rec.bo_seq			);
			rx.add(record, "area_cd"			, rec.area_cd			);
			rx.add(record, "dept_cd"			, rec.dept_cd			);
			rx.add(record, "sub_dept_cd"		, rec.sub_dept_cd		);			
			rx.add(record, "bgn_mm"				, rec.bgn_mm			);
			rx.add(record, "end_mm"				, rec.end_mm			);
			rx.add(record, "damt_decid_amt"		, rec.damt_decid_amt	);
			rx.add(record, "widr_yn"			, rec.widr_yn			);
			rx.add(record, "widr_bgn_mm"		, rec.widr_bgn_mm		);
			rx.add(record, "widr_amt"			, rec.widr_amt			);
			//System.out.println("jsp.bong1::::"+rec.bgn_mm);
			//System.out.println("jsp.bong1::::"+rec.end_mm);
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
			<part_cd/>
			<part_nm/>
			<area_cd/>
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<trmrd_qty_0/>
			<dscn_rdr_qty_0/>
			<month_aft_qty_1/>
			<month_aft_qty_2/>
			<month_aft_qty_3/>
			<month_aft_qty_4/>
			<month_aft_qty_5/>
			<aft_qty/>
			<dnt_qty/>
			<avg_send_qty/>
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
		<trmrd_qty/>
		<dncn_qty/>
		<month_qty/>
		<aft_qty/>
		<real_qty/>
		<avg_qty/>
		<rate/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue May 26 13:55:15 KST 2009 */ %>