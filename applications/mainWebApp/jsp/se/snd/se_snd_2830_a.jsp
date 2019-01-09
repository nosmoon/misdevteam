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
* 파일명 : se_snd_2830_a.jsp
* 기능 :   발송관리 - 마감관리 - 발송정보 DOWNLOAD
* 작성일자 : 2009-03-25
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
	SE_SND_2830_ADataSet ds = (SE_SND_2830_ADataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	int record				= 0;
	
	formData				= rx.add(root		, "downData"	, "");
	rx.add(formData			, "issu_dt"			, ds.issu_dt		);
	try {
		
		recordSet			= rx.add(formData	, "hlist"		, "");

		for(int i = 0; i < ds.hlist.size(); i++) {
			SE_SND_2830_AHLISTRecord rec = (SE_SND_2830_AHLISTRecord)ds.hlist.get(i);
			record	= rx.add(recordSet, "record"	, ""	);
			rx.add(record, "col"	, rec.col	);
		}
		
		recordSet			= rx.add(formData	, "dlist"		, "");
		for(int i = 0; i < ds.dlist.size(); i++) {
			SE_SND_2830_ADLISTRecord rec = (SE_SND_2830_ADLISTRecord)ds.dlist.get(i);
			record	= rx.add(recordSet, "record"	, ""	);
			rx.add(record, "col"	, rec.col	);
		}
		
		recordSet			= rx.add(formData	, "slist"		, "");
		for(int i = 0; i < ds.slist.size(); i++) {
			SE_SND_2830_ASLISTRecord rec = (SE_SND_2830_ASLISTRecord)ds.slist.get(i);
			record	= rx.add(recordSet, "record"	, ""	);
			rx.add(record, "col"	, rec.col	);
		}
		
		recordSet			= rx.add(formData	, "plist"		, "");
		for(int i = 0; i < ds.plist.size(); i++) {
			SE_SND_2830_APLISTRecord rec = (SE_SND_2830_APLISTRecord)ds.plist.get(i);
			record	= rx.add(recordSet, "record"	, ""	);
			rx.add(record, "col"	, rec.col	);
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
			<tmsg_seq/>
			<tmsg_dt_tm/>
			<incmg_pers/>
			<medi_nm/>
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

<% /* 작성시간 : Wed Mar 25 20:29:53 KST 2009 */ %>