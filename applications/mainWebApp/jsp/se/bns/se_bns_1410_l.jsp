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
* 파일명 : se_bns_1410_l.jsp
* 기능 :   판매-판촉물관리 - 판촉물발송일자관리
* 작성일자 : 2009-04-29
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
	SE_BNS_1410_LDataSet ds = (SE_BNS_1410_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root		, "resData"		, "");
	formData				= rx.add(formData	, "gridData"	, "");

	try {
		
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1410_LCURLISTRecord rec = (SE_BNS_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record"		, "");
			rx.add(record, "dt"			, rec.dt			);
			rx.add(record, "day"		, rec.day			);
			rx.add(record, "send_yn"	, rec.send_yn		);
			rx.add(record, "medi_cd"	, rec.medi_cd		);
			rx.add(record, "basi_mm"	, rec.basi_mm		);
			rx.add(record, "bns_item_cd", rec.bns_item_cd	);
			rx.add(record, "bns_item_nm", rec.bns_item_nm	);
			rx.add(record, "divn_dt"	, rec.divn_dt		);
			rx.add(record, "chg_issu_dt", rec.chg_issu_dt	);
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
			<dt/>
			<day/>
			<medi_cd/>
			<basi_mm/>
			<bns_item_cd/>
			<bns_item_nm/>
			<divn_dt/>
			<chg_issu_dt/>
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

<% /* 작성시간 : Wed Apr 29 10:17:03 KST 2009 */ %>