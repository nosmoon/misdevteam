<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.sale.rec.*
	,	chosun.ciis.fc.sale.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : nm_sale_1000_m.jsp
* 기능 :  컨텐츠판매
* 작성일자 : 
* 작성자 : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	NM_SALE_1000_MDataSet ds = (NM_SALE_1000_MDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;

	//-1 월
	cal.add(cal.MONTH,-1);

	String year2	=	String.valueOf(cal.get(cal.YEAR));
	String month2	=	String.valueOf(cal.get(cal.MONTH) + 1);
	month2			=	month2.length() == 1 ? "0" + month2 : month2;

	String fr_yymm	= year2 + month2;
	String to_yymm	= year + month;

	rx.add(root		, "bgn_yymm"	, fr_yymm);
	rx.add(root		, "end_yymm"	, to_yymm);

	formData				= rx.add(root		, "comboSet"		, "");
	try {
		recordSet			= rx.add(formData	, "medilist"			, "");
		for(int i = 0; i < ds.medilist.size(); i++) {
			NM_SALE_1000_MMEDILISTRecord rec = (NM_SALE_1000_MMEDILISTRecord)ds.medilist.get(i);
			int record 		= rx.add(recordSet, "record", "");
			rx.add(record, "cd"	, rec.cd);
			rx.add(record, "cd_nm"	, rec.cdnm);
		}
		
		recordSet			= rx.add(formData	, "mediclsflist"		, "");
		for(int i = 0; i < ds.mediclsflist.size(); i++) {
			NM_SALE_1000_MMEDICLSFLISTRecord rec = (NM_SALE_1000_MMEDICLSFLISTRecord)ds.mediclsflist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "cd"			, rec.cd		);
			rx.add(record, "cd_nm"		, rec.cdnm		);
			rx.add(record, "cd_abrv_nm"	, rec.cd_abrv_nm);
		}
		
		recordSet			= rx.add(formData	, "infolist"		, "");
		for(int i = 0; i < ds.infolist.size(); i++) {
			NM_SALE_1000_MINFOLISTRecord rec = (NM_SALE_1000_MINFOLISTRecord)ds.infolist.get(i);
			int record = rx.add(recordSet, "record"	, "");
			rx.add(record, "dtls_medi_cd" , rec.dtls_medi_cd		);
			rx.addCData(record, "dtls_medi_nm"		, rec.dtls_medi_nm		);
			rx.addCData(record, "orgn_dtls_medi_nm"	, rec.orgn_dtls_medi_nm);
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
	<DECIDLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</DECIDLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<dept_cd/>
			<dept_nm/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<BANKLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</BANKLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<MTHDLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</MTHDLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<OBJLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</OBJLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
		<mthdlist/>
		<objlist/>
		<decidlist/>
		<banklist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Mar 02 15:29:40 KST 2009 */ %>