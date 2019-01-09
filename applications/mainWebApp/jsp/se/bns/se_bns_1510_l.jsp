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
* 파일명 : se_bns_1510_l.jsp
* 기능 :  판매 - 판촉물관리 - 판촉물배분처리
* 작성일자 : 2009-05-06
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
	SE_BNS_1510_LDataSet ds = (SE_BNS_1510_LDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int formData			= 0;
	int recordSet			= 0;
	
	formData				= rx.add(root	, "gridData"	, "");
	
	try {
		rx.add(formData	, "yymm"		, ds.yymm	);
		rx.add(formData	, "tms"			, ds.tms	);
		rx.add(formData	, "bgn_dt"		, ds.bgn_dt	);
		rx.add(formData	, "end_dt"		, ds.end_dt	);
		rx.add(formData	, "divn_dt"		, ds.divn_dt);
		recordSet			= rx.add(formData	, "curlist"		, "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BNS_1510_LCURLISTRecord rec = (SE_BNS_1510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "bns_item_cd"	, rec.bns_item_cd	);
			rx.add(record, "bns_item_nm"	, rec.bns_item_nm	);
			rx.add(record, "send_qunt"		, rec.send_qunt		);
			rx.add(record, "qunt"			, rec.qunt			);
			rx.add(record, "divn_dt"		, rec.divn_dt		);
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
			<bns_item_cd/>
			<bns_item_nm/>
			<send_qunt/>
			<qunt/>
			<divn_dt/>
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
		<yymm/>
		<tms/>
		<bgn_dt/>
		<end_dt/>
		<divn_dt/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed May 06 19:56:46 KST 2009 */ %>