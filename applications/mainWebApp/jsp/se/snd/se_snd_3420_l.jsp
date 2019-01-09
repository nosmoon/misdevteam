<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_3420_l.jsp
* 기능 :   판매 - 발송관리 - 대표노선, 노선 설정
* 작성일자 : 2009-05-14
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
	SE_SND_3420_LDataSet ds = (SE_SND_3420_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root	, "gridData2"	, "");

	try {
		
		recordSet			= rx.add(formData	, "inlist"		, "");
		for(int i = 0; i < ds.inlist.size(); i++) {
			SE_SND_3420_LINLISTRecord rec = (SE_SND_3420_LINLISTRecord)ds.inlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "route_clsf"		, rec.route_clsf	);
			rx.add(record, "rptv_route_cd"	, rec.rptv_route_cd	);
			rx.add(record, "rptv_route_nm"	, rec.rptv_route_nm	);
			rx.add(record, "route_cd"		, rec.route_cd		);
			rx.add(record, "route_nm"		, rec.route_nm		);
		}
		
		recordSet			= rx.add(formData	, "nolist"		, "");
		for(int i = 0; i < ds.nolist.size(); i++) {
			SE_SND_3420_LNOLISTRecord rec = (SE_SND_3420_LNOLISTRecord)ds.nolist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "route_clsf"		, rec.route_clsf	);
			rx.add(record, "rptv_route_cd"	, rec.rptv_route_cd	);
			rx.add(record, "rptv_route_nm"	, rec.rptv_route_nm	);
			rx.add(record, "route_cd"		, rec.route_cd		);
			rx.add(record, "route_nm"		, rec.route_nm		);
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
	<INLIST>
		<record>
			<route_clsf/>
			<rptv_route_cd/>
			<rptv_route_nm/>
			<route_cd/>
			<route_nm/>
		</record>
	</INLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<NOLIST>
		<record>
			<route_clsf/>
			<rptv_route_cd/>
			<rptv_route_nm/>
			<route_cd/>
			<route_nm/>
		</record>
	</NOLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<inlist/>
		<nolist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Thu May 14 17:12:53 KST 2009 */ %>