<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_1810_l.jsp
* 기능 :  판매 - 지대관리 - 매출관리 - 매출마감
* 작성일자 : 2009-04-10
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
	SE_SAL_1810_LDataSet ds = (SE_SAL_1810_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_1810_LCURLISTRecord rec = (SE_SAL_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"					, "");
			rx.add(record, "yymm"				, rec.yymm				);
			rx.add(record, "clos_yn_40"			, rec.clos_yn_40		);
			rx.add(record, "clos_dt_tm_40"		, rec.clos_dt_tm_40		);
			rx.add(record, "clos_yn_50"			, rec.clos_yn_50		);
			rx.add(record, "clos_dt_tm_50"		, rec.clos_dt_tm_50		);
			rx.add(record, "medi_110"			, "조선일보"				);
			rx.add(record, "qty_110"			, rec.qty_110			);
			rx.add(record, "avg_uprc_110"		, rec.avg_uprc_110		);
			rx.add(record, "sale_amt_110"		, rec.sale_amt_110		);
			rx.add(record, "net_sale_amt_110"	, rec.net_sale_amt_110	);
			rx.add(record, "fpymt_amt_110"		, rec.fpymt_amt_110		);
			rx.add(record, "medi_130"			, "어린이조선"				);
			rx.add(record, "qty_130"			, rec.qty_130			);
			rx.add(record, "avg_uprc_130"		, rec.avg_uprc_130		);
			rx.add(record, "sale_amt_130"		, rec.sale_amt_130		);
			rx.add(record, "net_sale_amt_130"	, rec.net_sale_amt_130	);
			rx.add(record, "fpymt_amt_130"		, rec.fpymt_amt_130		);
			rx.add(record, "medi_sum"			, "계"					);
			rx.add(record, "qty_sum"			, ""					);
			rx.add(record, "avg_uprc_sum"		, ""					);
			rx.add(record, "sale_amt"			, rec.sale_amt			);
			rx.add(record, "fpymt_amt"			, rec.fpymt_amt			);
			rx.add(record, "net_sale_amt"		, rec.net_sale_amt		);
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
			<clos_yn_40/>
			<clos_dt_tm_40/>
			<clos_yn_50/>
			<clos_dt_tm_50/>
			<qty_110/>
			<avg_uprc_110/>
			<sale_amt_110/>
			<net_sale_amt_110/>
			<fpymt_amt_110/>
			<qty_130/>
			<avg_uprc_130/>
			<sale_amt_130/>
			<net_sale_amt_130/>
			<fpymt_amt_130/>
			<sale_amt/>
			<fpymt_amt/>
			<net_sale_amt/>
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

<% /* 작성시간 : Fri Apr 10 16:13:39 KST 2009 */ %>