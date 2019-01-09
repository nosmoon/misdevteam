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
* 파일명 : se_qty_3110_l.jsp
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
	SE_QTY_3110_LDataSet ds = (SE_QTY_3110_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_3110_LCURLISTRecord rec = (SE_QTY_3110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"				, "");
			rx.add(record, "issu_dt"		, rec.issu_dt			);
			rx.add(record, "before_qty"		, rec.before_qty		);
			rx.add(record, "qty"			, rec.qty				);
			rx.add(record, "after_qty"		, rec.after_qty			);
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

<% /* 작성시간 : Tue Mar 10 21:14:10 KST 2009 */ %>