<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.rec.*
	,	chosun.ciis.se.rcp.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_5210_l.jsp
* 기능 :  판매 
* 작성일자 : 2012-11-15
* 작성자 : 봉은정
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_RCP_5210_LDataSet ds = (SE_RCP_5210_LDataSet)request.getAttribute("ds");
	
	int root 				= RwXml.rootNodeID; 
	int formData			= 0;
	int recordSet			= 0;
	formData				= rx.add(root		, "resData"		, "");
	rx.add(formData		, "fix_msg"				, ds.fix_msg		);
	rx.add(formData		, "fix_dt"				, ds.fix_dt			);
	rx.add(formData		, "totclos_yn"		   	, ds.totclos_yn		);
	rx.add(formData		, "areaclos_yn"		    , ds.areaclos_yn	);
	rx.add(formData		, "issu_dt_cnt"			, ds.issu_dt_cnt	);
	rx.add(formData		, "avg_uprc"			, ds.avg_uprc		);
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_5210_LCURLISTRecord rec = (SE_RCP_5210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"			, "");
			rx.add(record, "dept_nm"		, rec.dept_nm			);
			rx.add(record, "dept_cd"		, rec.dept_cd			);
			rx.add(record, "sub_dept_cd"	, rec.sub_dept_cd		);
			rx.add(record, "part_nm"		, rec.part_nm			);
			rx.add(record, "part_cd"		, rec.part_cd			);
			rx.add(record, "area_nm"		, rec.area_nm			);	
			rx.add(record, "area_cd"		, rec.area_cd			);
			rx.add(record, "bo_cd"			, rec.bo_cd				);
			rx.add(record, "bo_seq"			, rec.bo_seq			);	
			rx.add(record, "bo_nm"			, rec.bo_nm				);
			rx.add(record, "pdlv_rdr_qty"	, rec.pdlv_rdr_qty		);
			rx.add(record, "qty"			, rec.qty				);
			rx.add(record, "pdlv_fee"		, rec.pdlv_fee			);
			rx.add(record, "uprc"			, rec.uprc				);
			rx.add(record, "pdlv_altn_amt"	, rec.pdlv_altn_amt		);
			rx.addCData(record, "bo_head_nm"		, rec.bo_head_nm		);
			rx.add(record, "bo_telno"		, rec.bo_telno			);
			rx.add(record, "qty_uprc"		, rec.qty_uprc			);
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
