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
	SE_SAL_2610_LDataSet ds = (SE_SAL_2610_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID; 
	int formData			= 0;
	int recordSet			= 0;
	formData				= rx.add(root		, "resData"		, "");
	rx.add(formData		, "fix_msg"				, ds.fix_msg		);
	rx.add(formData		, "fix_dt"				, ds.fix_dt			);
	rx.add(formData		, "clos_yn"		    	, ds.clos_yn		);
	rx.add(formData		, "issu_dt_cnt"			, ds.issu_dt_cnt	);
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2610_LCURLISTRecord rec = (SE_SAL_2610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"			, "");
			rx.add(record, "issu_dt"		, rec.yymm		    	);
			rx.add(record, "dept_nm"		, rec.dept_nm			);
			rx.add(record, "part_nm"		, rec.part_nm			);
			rx.add(record, "area_nm"		, rec.area_nm			);	
			rx.add(record, "area_cd"		, rec.area_cd			);	
			rx.add(record, "bo_cd"			, rec.bo_cd				);
			rx.add(record, "bo_seq"			, rec.bo_seq			);	
			rx.add(record, "bo_nm"			, rec.bo_nm				);
			rx.add(record, "bo_head_nm"	    , rec.bo_head_nm		); //bo_head_nm
			rx.add(record, "sum"	        , rec.sum            	); //sum
			rx.add(record, "bal"	        , rec.bal           	); //bal
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