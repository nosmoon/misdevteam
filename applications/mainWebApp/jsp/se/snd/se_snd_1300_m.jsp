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
* 파일명 : se_snd_1300_m.jsp
* 기능 : 판매 - 발송관리 - 노선별인쇄처변경 - 초기화면
* 작성일자 : 2009.01.30
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
	SE_SND_1300_MDataSet ds = (SE_SND_1300_MDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;
	int formData 	= 0;
	int recordSet 	= 0;
	//formData 		= rx.add(root		, "initData"	, "");
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	String day		= String.valueOf(cal.get(cal.DATE));
	day				= day.length() == 1 ? "0" + day : day;
	
	String today	= year + month + day;
	rx.add(root		, "bgn_reg_dt"	, today);
	rx.add(root		, "end_reg_dt"	, today);
	
	formData 		= rx.add(root	, "comboSet"	, "");
	
	try {
		/****** CURLIST START */	
		recordSet 	= rx.add(formData	, "curlist"	, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1300_MCURLISTRecord rec = (SE_SND_1300_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		/****** MEDILIST START */			
		recordSet 	= rx.add(formData	, "medilist", "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			SE_SND_1300_MMEDILISTRecord rec = (SE_SND_1300_MMEDILISTRecord)ds.medilist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.medilist.size());
		/****** MEDILIST END */
		
		/****** PRTLIST START */			
		recordSet 	= rx.add(formData	, "prtlist", "");
		for(int i = 0; i < ds.prtlist.size(); i++) {
			SE_SND_1300_MPRTLISTRecord rec = (SE_SND_1300_MPRTLISTRecord)ds.prtlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd"			, rec.cd);
			rx.add(record, "cdnm"		, rec.cdnm);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		rx.add(recordSet, "totalcnt", ds.prtlist.size());
		/****** PRTILIST END */
		
		
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
<dataSet>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jan 29 20:43:48 KST 2009 */ %>