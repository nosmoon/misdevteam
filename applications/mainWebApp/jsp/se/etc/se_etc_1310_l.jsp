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
* 파일명 : se_etc_1310_l.jsp
* 기능 :  판매 - 기타관리 - 지국자체유가부수
* 작성일자 : 2009-05-26
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
	SE_ETC_1310_LDataSet ds = (SE_ETC_1310_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	rx.add(formData		, "trmrd_qty"			, ds.trmrd_qty		);
	rx.add(formData		, "dncn_qty"			, ds.dncn_qty		);
	rx.add(formData		, "month_qty"			, ds.month_qty		);
	rx.add(formData		, "aft_qty"				, ds.aft_qty		);
	rx.add(formData		, "real_qty"			, ds.real_qty		);
	rx.add(formData		, "avg_qty"				, ds.avg_qty		);
	rx.add(formData		, "rate"				, ds.rate			);
	rx.add(formData		, "fix_msg"				, ds.fix_msg		);
	rx.add(formData		, "fix_dt"				, ds.fix_dt			);
	rx.add(formData		, "totclos_yn"			, ds.totclos_yn		);
	rx.add(formData		, "areaclos_yn"			, ds.areaclos_yn	);
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_ETC_1310_LCURLISTRecord rec = (SE_ETC_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"			, "");
			//rx.add(record, "dept_cd"		, rec.dept_cd			);
			rx.add(record, "dept_nm"		, rec.dept_nm			);
			//rx.add(record, "part_cd"		, rec.part_cd			);
			rx.add(record, "part_nm"		, rec.part_nm			);
			rx.add(record, "area_nm"		, rec.area_nm			);		
			rx.add(record, "bo_nm"			, rec.bo_nm				);
			rx.add(record, "trmrd_qty_0"	, rec.trmrd_qty_0		);
			rx.add(record, "dscn_rdr_qty_0"	, rec.dscn_rdr_qty_0	);
			rx.add(record, "month_aft_qty_1", rec.month_aft_qty_1	);
			rx.add(record, "month_aft_qty_2", rec.month_aft_qty_2	);
			rx.add(record, "month_aft_qty_3", rec.month_aft_qty_3	);
			rx.add(record, "month_aft_qty_4", rec.month_aft_qty_4	);
			rx.add(record, "month_aft_qty_5", rec.month_aft_qty_5	);
			rx.add(record, "month_aft_qty_6", rec.month_aft_qty_6	);
			rx.add(record, "month_aft_qty_7", rec.month_aft_qty_7	);			
			rx.add(record, "aft_qty"		, rec.aft_qty			);
			rx.add(record, "dnt_qty"		, rec.dnt_qty			);
			rx.add(record, "avg_send_qty"	, rec.avg_send_qty		);
			rx.add(record, "remk"			, rec.remk		);
			rx.add(record, "yymm"			, rec.yymm				);
			rx.add(record, "bo_cd"			, rec.bo_cd				);
			rx.add(record, "bo_seq"			, rec.bo_seq			);
			rx.add(record, "area_cd"		, rec.area_cd			);
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