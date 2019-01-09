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
* 파일명 : se_snd_2300_m.jsp
* 기능 :  발송관리 - 수송업자등록
* 작성일자 : 2009-02-13
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
	SE_SND_2300_MDataSet ds = (SE_SND_2300_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;
	int recordSet 			= 0;

	formData				= rx.add(root		, "comboSet"	, "");
	try {
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2300_MCURLISTRecord rec = (SE_SND_2300_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "routelist"		, "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_2300_MROUTELISTRecord rec = (SE_SND_2300_MROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "cmpylist"		, "");
		for(int i = 0; i < ds.cmpylist.size(); i++) {
			SE_SND_2300_MCMPYLISTRecord rec = (SE_SND_2300_MCMPYLISTRecord)ds.cmpylist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}

		recordSet			= rx.add(formData	, "tran_uprclist"		, "");
		for(int i = 0; i < ds.tran_uprclist.size(); i++) {
			SE_SND_2300_MTRAN_UPRCLISTRecord rec = (SE_SND_2300_MTRAN_UPRCLISTRecord)ds.tran_uprclist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}

		recordSet			= rx.add(formData	, "setl_banklist"		, "");
		for(int i = 0; i < ds.setl_banklist.size(); i++) {
			SE_SND_2300_MSETL_BANKLISTRecord rec = (SE_SND_2300_MSETL_BANKLISTRecord)ds.setl_banklist.get(i);
			
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
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
	<CMPYLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CMPYLIST>
</resData>
*/
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
		<cmpylist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri Feb 13 10:33:15 KST 2009 */ %>