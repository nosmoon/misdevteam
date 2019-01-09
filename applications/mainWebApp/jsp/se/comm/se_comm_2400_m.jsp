<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.rec.*
	,	chosun.ciis.se.comm.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_comm_2400_m.jsp
* 기능 :  수송업자 조회 초기화면
* 작성일자 : 2009-06-09
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
	SE_COMM_2400_MDataSet ds = (SE_COMM_2400_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData 			= 0;
	int recordSet			= 0;

	formData				= rx.add(root		, "initData"		, "");
	formData				= rx.add(formData	, "comboSet"		, "");

	try {
		recordSet			= rx.add(formData	, "curlist"			, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_2400_MCURLISTRecord rec = (SE_COMM_2400_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "routelist"		, "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_COMM_2400_MROUTELISTRecord rec = (SE_COMM_2400_MROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "prtlist"			, "");
		for(int i = 0; i < ds.prtlist.size(); i++) {
			SE_COMM_2400_MPRTLISTRecord rec = (SE_COMM_2400_MPRTLISTRecord)ds.prtlist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "corplist"			, "");
		for(int i = 0; i < ds.corplist.size(); i++) {
			SE_COMM_2400_MCORPLISTRecord rec = (SE_COMM_2400_MCORPLISTRecord)ds.corplist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "banklist"			, "");
		for(int i = 0; i < ds.banklist.size(); i++) {
			SE_COMM_2400_MBANKLISTRecord rec = (SE_COMM_2400_MBANKLISTRecord)ds.banklist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "medilist"			, "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_COMM_2400_MMEDILISTRecord rec = (SE_COMM_2400_MMEDILISTRecord)ds.medilist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
			rx.add(record, "cd_abrv_nm"		, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "sectlist"			, "");
		for(int i = 0; i < ds.sectlist.size(); i++) {
			SE_COMM_2400_MSECTLISTRecord rec = (SE_COMM_2400_MSECTLISTRecord)ds.sectlist.get(i);
			int record = rx.add(recordSet	, "record", "");
			rx.add(record, "cd"				, rec.cd);
			rx.add(record, "cdnm"			, rec.cdnm);
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
	<PRTLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</PRTLIST>
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
		<prtlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Feb 18 09:12:20 KST 2009 */ %>