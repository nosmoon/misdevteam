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
* 파일명 : se_qty_2500_m.jsp
* 기능 :  부수관리 - 발송부수 - 노선별발송부수현황
* 작성일자 : 2009-03-06
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
	SE_QTY_2500_MDataSet ds = (SE_QTY_2500_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "comboSet"		, "");
	
	try {
		recordSet			= rx.add(formData	, "arealist"		, "");
		for(int i = 0; i < ds.arealist.size(); i++) {
			SE_QTY_2500_MAREALISTRecord rec = (SE_QTY_2500_MAREALISTRecord)ds.arealist.get(i);
			int record = rx.add(recordSet, "record"		, "");
			rx.add(record, "area_cd"		, rec.area_cd	);
			rx.add(record, "area_nm"		, rec.area_nm	);
		}
		
		recordSet			= rx.add(formData	, "curlist"			, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2500_MCURLISTRecord rec = (SE_QTY_2500_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"		, "");
			rx.add(record, "cd"				, rec.cd		);
			rx.add(record, "cdnm"			, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
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
	<AREALIST>
		<record>
			<area_cd/>
			<area_nm/>
		</record>
	</AREALIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
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
		<arealist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri Mar 06 10:36:50 KST 2009 */ %>