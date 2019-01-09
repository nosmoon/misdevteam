<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bns_1910_l.jsp
* 기능 :  판매 - 판촉물관리 - 판촉물(세금)계산서 생성
* 작성일자 : 2009-04-30
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
	SE_BNS_1910_LDataSet ds = (SE_BNS_1910_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1910_LCURLISTRecord rec = (SE_BNS_1910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "yymm"			, rec.yymm			);
			rx.add(record, "clos_yn_1"		, rec.clos_yn_1		);
			rx.add(record, "clos_yn_2"		, rec.clos_yn_2		);
			rx.add(record, "qunt"			, rec.qunt			);
			rx.add(record, "uprc"			, rec.uprc			);
			rx.add(record, "sale_amt"		, rec.sale_amt		);
			rx.add(record, "fpymt_amt"		, rec.fpymt_amt		);
			rx.add(record, "net_sale_amt"	, rec.net_sale_amt	);
			rx.add(record, "vat_amt"		, rec.vat_amt		);
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
			<yymm/>
			<clos_yn_1/>
			<clos_yn_2/>
			<qunt/>
			<uprc/>
			<sale_amt/>
			<fpymt_amt/>
			<net_sale_amt/>
			<vat_amt/>
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

<% /* 작성시간 : Thu Apr 30 20:37:39 KST 2009 */ %>