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
* 파일명 : se_qty_3120_l.jsp
* 기능 :   부수관리 - 발송부수 - 발송부수증감현황
* 작성일자 : 2009-03-11
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
	SE_QTY_3120_LDataSet ds = (SE_QTY_3120_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;

	formData				= rx.add(root	, "chglist"		, "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_3120_LCURLISTRecord rec = (SE_QTY_3120_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(formData, "record"		, "");
			rx.add(record, "dept_nm"	, rec.dept_nm		);
			rx.add(record, "sub_dept_nm", rec.sub_dept_nm	);
			rx.add(record, "area_nm"	, rec.area_nm		);
			rx.add(record, "bo_nm"		, rec.bo_nm			);
			rx.add(record, "before_qty"	, rec.before_qty	);
			rx.add(record, "qty"		, rec.qty			);
			rx.add(record, "after_qty"	, rec.after_qty		);
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
			<dept_nm/>
			<sub_dept_nm/>
			<area_nm/>
			<bo_nm/>
			<before_qty/>
			<qty/>
			<after_qty/>
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

<% /* 작성시간 : Wed Mar 11 13:56:42 KST 2009 */ %>