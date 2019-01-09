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
* 파일명 : se_bns_2210_l.jsp
* 기능 :  판매 - 판촉물관리 - 판촉물매출마감
* 작성일자 : 2009-05-25
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
	SE_BNS_2210_LDataSet ds = (SE_BNS_2210_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_2210_LCURLISTRecord rec = (SE_BNS_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "divn_dt"		, rec.divn_dt		);
			rx.add(record, "clos_yn"		, rec.clos_yn		);
			rx.add(record, "net_sale_amt_1"	, rec.net_sale_amt_1);
			rx.add(record, "fpymt_amt_1"	, rec.fpymt_amt_1	);
			rx.add(record, "sale_amt_1"		, rec.sale_amt_1	);
			rx.add(record, "net_sale_amt_2"	, rec.net_sale_amt_2);
			rx.add(record, "fpymt_amt_2"	, rec.fpymt_amt_2	);
			rx.add(record, "sale_amt_2"		, rec.sale_amt_2	);
			rx.add(record, "vat_amt_2"		, rec.vat_amt_2		);
			rx.add(record, "sale_amt_3"		, rec.sale_amt_3	);
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
			<divn_dt/>
			<clos_yn/>
			<net_sale_amt_1/>
			<fpymt_amt_1/>
			<sale_amt_1/>
			<net_sale_amt_2/>
			<fpymt_amt_2/>
			<sale_amt_2/>
			<vat_amt_2/>
			<sale_amt_3/>
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

<% /* 작성시간 : Mon May 25 16:04:08 KST 2009 */ %>