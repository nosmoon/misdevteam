<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_3100_m.jsp
* 기능 :   부수관리 - 발송부수 - 발송부수증감현황
* 작성일자 : 2009-03-10
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
	SE_QTY_3100_MDataSet ds = (SE_QTY_3100_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	String day		= String.valueOf(cal.get(cal.DATE) + 1);
	String bgn_issu_dt	= "";
	String end_issu_dt	= "";  
	
	if ( Integer.parseInt(day) < 11 ){
		cal.add(cal.MONTH, -1);
		bgn_issu_dt = "21";
		end_issu_dt = String.valueOf(cal.getActualMaximum((cal.DAY_OF_MONTH)));
	} else if ( Integer.parseInt(day) < 21 ){
		bgn_issu_dt = "01";
		end_issu_dt = "10";
	} else {
		bgn_issu_dt = "11";
		end_issu_dt = "20";
	}
	year			= String.valueOf(cal.get(cal.YEAR));
	month			= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() < 2 ? "0" + month : month;
	bgn_issu_dt		= year + month + bgn_issu_dt;
	end_issu_dt		= year + month + end_issu_dt;
	
	rx.add(root		, "bgn_issu_dt"	, bgn_issu_dt);
	rx.add(root		, "end_issu_dt"	, end_issu_dt);
		
	formData				= rx.add(root		, "comboSet"			, "");
	try {
		recordSet			= rx.add(formData	, "teamlist"			, "");
		for(int i = 0; i < ds.teamlist.size(); i++) {
			SE_QTY_3100_MTEAMLISTRecord rec = (SE_QTY_3100_MTEAMLISTRecord)ds.teamlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
		}
		
		recordSet			= rx.add(formData	, "arealist_temp"		, "");
		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_QTY_3100_MAREALISTRecord rec = (SE_QTY_3100_MAREALISTRecord)ds.arealist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "area_cd"		, rec.area_cd		);
			rx.add(record, "area_nm"		, rec.area_nm		);
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
		}
		
		recordSet			= rx.add(formData	, "partlist_temp"		, "");
		for(int i = 0; i < ds.partlist.size(); i++) {
			SE_QTY_3100_MPARTLISTRecord rec = (SE_QTY_3100_MPARTLISTRecord)ds.partlist.get(i);
			int record = rx.add(recordSet, "record"			, "");
			rx.add(record, "dept_cd"		, rec.dept_cd		);
			rx.add(record, "dept_nm"		, rec.dept_nm		);
			rx.add(record, "supr_dept_cd"	, rec.supr_dept_cd	);
		}
		
		recordSet			= rx.add(formData	, "medilist"			, "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_QTY_3100_MMEDILISTRecord rec = (SE_QTY_3100_MMEDILISTRecord)ds.medilist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"				, rec.cd			);
			rx.add(record, "cdnm"			, rec.cdnm			);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm	);
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
	<TEAMLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</TEAMLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<AREALIST>
		<record>
			<area_cd/>
			<area_nm/>
			<dept_cd/>
			<supr_dept_cd/>
		</record>
	</AREALIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<PARTLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
			<supr_dept_cd/>
		</record>
	</PARTLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<teamlist/>
		<partlist/>
		<arealist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Mar 10 16:26:41 KST 2009 */ %>