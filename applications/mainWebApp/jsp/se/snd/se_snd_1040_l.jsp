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
* 파일명 : se_snd_1040_l.jsp
* 기능 : 판매 - 발송관리 - 대표노선등록 - 대표노선 조회
* 작성일자 : 2009.07.04
* 작성자 : 이근탁
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_SND_1040_LDataSet ds = (SE_SND_1040_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	//formData 	= rx.add(root		, "code"		, "");
	recordSet 	= rx.add(root	, "code"	, "");
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1040_LCURLISTRecord rec = (SE_SND_1040_LCURLISTRecord)ds.curlist.get(i);
		
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "rptv_route_clsf"			, rec.rptv_route_clsf		);			
			rx.add(record, "rptv_route_cd"				, rec.rptv_route_cd			);			
			rx.add(record, "rptv_route_nm"				, rec.rptv_route_nm			);
		
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>


<% /* 작성시간 : Mon Feb 02 14:56:04 KST 2009 */ %>