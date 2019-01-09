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
* 파일명 : se_snd_2010_l.jsp
* 기능 : 판매-발송관리-노선순위변경
* 작성일자 : 2009-02-12
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
	SE_SND_2010_LDataSet ds = (SE_SND_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	
	formData		= rx.add(root		, "resData"		, "");
	formData		= rx.add(formData	, "gridData"	, "");
	try {
		recordSet	= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2010_LCURLISTRecord rec = (SE_SND_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"		, rec.cmpy_cd);
			rx.add(record, "prt_plac_cd"	, rec.prt_plac_cd);
			rx.add(record, "route_clsf"		, rec.route_clsf);
			rx.add(record, "route_cd"		, rec.route_cd);
			rx.add(record, "route_nm"		, rec.route_nm);
			rx.add(record, "route_rank"		, rec.route_rank);
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
			<cmpy_cd/>
			<prt_plac_cd/>
			<route_clsf/>
			<route_cd/>
			<route_nm/>
			<route_rank/>
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

<% /* 작성시간 : Thu Feb 12 17:16:24 KST 2009 */ %>