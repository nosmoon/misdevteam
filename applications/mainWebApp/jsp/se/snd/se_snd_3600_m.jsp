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
* 파일명 : se_comm_3600_m.jsp
* 기능 : 판매 - 노선관리 - 인쇄처변경등록 - 초기화면
* 작성일자 : 2009.06.24
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
	SE_SND_3600_MDataSet ds = (SE_SND_3600_MDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int formData 	= 0;
	int recordSet 	= 0;
	
	//formData 		= rx.add(root		, "initData"	, "");
	formData 		= rx.add(root	, "comboSet"	, "");

	try {
		recordSet	= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_3600_MCURLISTRecord rec = (SE_SND_3600_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet	= rx.add(formData	, "routelist"	, "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_3600_MROUTELISTRecord rec = (SE_SND_3600_MROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet	= rx.add(formData	, "medilist"	, "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_SND_3600_MMEDILISTRecord rec = (SE_SND_3600_MMEDILISTRecord)ds.medilist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}		
	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<ROUTELIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</ROUTELIST>
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
		<routelist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Feb 02 12:10:07 KST 2009 */ %>