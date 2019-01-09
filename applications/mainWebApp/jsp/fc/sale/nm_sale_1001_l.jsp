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
* 파일명 : nm_sale_1001_l.jsp
* 기능 :  컨텐츠판매수입결의
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
	NM_SALE_1001_LDataSet ds = (NM_SALE_1001_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			NM_SALE_1001_LCURLISTRecord rec = (NM_SALE_1001_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"	, ""	);
			rx.add(record, "yymm"			, rec.yymm			);
			rx.add(record, "seq"			, rec.seq			);
			rx.add(record, "dlco_cd"		, rec.dlco_cd		);
			rx.add(record, "dlco_nm"		, rec.dlco_nm		);
			rx.add(record, "medi_clsf"		, rec.medi_clsf		);
			rx.add(record, "clos_yn"		, rec.clos_yn		);
			rx.add(record, "actu_slip_no"	, rec.actu_slip_no	);
			rx.add(record, "tax_stmt_no"	, rec.tax_stmt_no	);
		}
		
		recordSet			= rx.add(formData	, "mediinfo"		, "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			NM_SALE_1001_LCURLIST2Record rec = (NM_SALE_1001_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet		, "record"	, ""	);
			rx.add(record, "medi_cd"			, rec.medi_cd			);
			rx.add(record, "dtls_medi_cd"		, rec.dtls_medi_cd		);
			rx.addCData(record, "dtls_medi_nm"		, rec.dtls_medi_nm		);
			rx.addCData(record, "orgn_dtls_medi_nm"	, rec.orgn_dtls_medi_nm	);			
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
			<yymm/>
			<seq/>
			<dlco_cd/>
			<dlco_nm/>
			<clos_yn/>
			<actu_slip_no/>
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

<% /* 작성시간 : Mon Mar 02 16:46:16 KST 2009 */ %>