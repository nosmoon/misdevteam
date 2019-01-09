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
* 파일명 : se_snd_2500_m.jsp
* 기능 :  판매-발송관리-발송비청구
* 작성일자 : 2009-02-24
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
	SE_SND_2500_MDataSet ds = (SE_SND_2500_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	int detailRecord		= 0;
	String gubun			= "";
	
	Calendar cal 			= Calendar.getInstance();
	String year 			= String.valueOf(cal.get(cal.YEAR));
	String month 			= String.valueOf(cal.get(cal.MONTH) + 1);
	month					= month.length() == 1 ? "0" + month : month;
	String day				= String.valueOf(cal.get(cal.DATE));
	day						= day.length() == 1 ? "0" + day : day;
	
	String today			= year + month + day;
	rx.add(root		, "bgn_pay_dt"		, today		);
	rx.add(root		, "end_pay_dt"		, today		);

	formData				= rx.add(root		, "comboSet"		, "");
	
	try {
		recordSet			= rx.add(formData	, "curlist"			, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2500_MCURLISTRecord rec = (SE_SND_2500_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "routelist"		, "");
		for(int i = 0; i < ds.routelist.size(); i++) {
			SE_SND_2500_MROUTELISTRecord rec = (SE_SND_2500_MROUTELISTRecord)ds.routelist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "prtlist"			, "");
		for(int i = 0; i < ds.prtlist.size(); i++) {
			SE_SND_2500_MPRTLISTRecord rec = (SE_SND_2500_MPRTLISTRecord)ds.prtlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "medilist"		, "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_SND_2500_MMEDILISTRecord rec = (SE_SND_2500_MMEDILISTRecord)ds.medilist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "cmpylist"		, "");
		for(int i = 0; i < ds.cmpylist.size(); i++) {
			SE_SND_2500_MCMPYLISTRecord rec = (SE_SND_2500_MCMPYLISTRecord)ds.cmpylist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "stmtlist"		, "");
		for(int i = 0; i < ds.stmtlist.size(); i++) {
			SE_SND_2500_MSTMTLISTRecord rec = (SE_SND_2500_MSTMTLISTRecord)ds.stmtlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "rcptlist"		, "");
		for(int i = 0; i < ds.rcptlist.size(); i++) {
			SE_SND_2500_MRCPTLISTRecord rec = (SE_SND_2500_MRCPTLISTRecord)ds.rcptlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "mthdlist"		, "");
		for(int i = 0; i < ds.mthdlist.size(); i++) {
			SE_SND_2500_MMTHDLISTRecord rec = (SE_SND_2500_MMTHDLISTRecord)ds.mthdlist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "banklist"		, "");
		for(int i = 0; i < ds.banklist.size(); i++) {
			SE_SND_2500_MBANKLISTRecord rec = (SE_SND_2500_MBANKLISTRecord)ds.banklist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "sectlist"		, "");
		int record		= 0;
		for(int i = 0; i < ds.sectlist.size(); i++) {
			SE_SND_2500_MSECTLISTRecord rec = (SE_SND_2500_MSECTLISTRecord)ds.sectlist.get(i);

			if ( !gubun.equals(rec.mang_cd_1)){
				gubun 			= rec.mang_cd_1;
				detailRecord 	= rx.add(recordSet		, "sectlist_" + gubun	, "");
				record 			= rx.add(detailRecord	, "record"				, "");
			}
			
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cdnm"		, rec.cdnm		);
			rx.add(record, "mang_cd_1"	, rec.mang_cd_1	);
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
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Feb 24 19:54:16 KST 2009 */ %>