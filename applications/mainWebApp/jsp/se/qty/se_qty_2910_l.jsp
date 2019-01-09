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
* 파일명 : se_qty_2910_l.jsp
* 기능 :  부수관리 - 발송부수 - 발송부수변동현황
* 작성일자 : 2009-03-09
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
	SE_QTY_2910_LDataSet ds = (SE_QTY_2910_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2910_LCURLISTRecord rec = (SE_QTY_2910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "dept_cd"	, rec.dept_cd	);
			rx.add(record, "dept_nm"	, rec.dept_nm	);
			rx.add(record, "part_cd"	, rec.part_cd	);
			rx.add(record, "part_nm"	, rec.part_nm	);
			rx.add(record, "area_cd"	, rec.area_cd	);
			rx.add(record, "area_nm"	, rec.area_nm	);
			rx.add(record, "bo_cd"  	, rec.bo_cd	    );
			rx.add(record, "bo_seq" 	, rec.bo_seq	);
			rx.add(record, "bo_nm"  	, rec.bo_nm 	);
			rx.add(record, "issu_dt"	, rec.issu_dt	);
			rx.add(record, "icdc_qty"	, rec.icdc_qty	);
			rx.add(record, "send_qty"	, rec.send_qty	);
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
			<issu_dt/>
			<icdc_qty/>
			<send_qty/>
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

<% /* 작성시간 : Mon Mar 09 15:32:49 KST 2009 */ %>