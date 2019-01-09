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
* 파일명 : se_snd_2320_l.jsp
* 기능 : 
* 작성일자 : 2009-02-13
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
	SE_SND_2340_SDataSet ds = (SE_SND_2340_SDataSet)request.getAttribute("ds");
	int root 				= RwXml.rootNodeID;
	int recordSet 			= 0;

	recordSet				= rx.add(root	, "codeData"		, "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_2340_SCURLISTRecord rec = (SE_SND_2340_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet	, "record"		, "");
			rx.add(record, "dlco_no"		, rec.dlco_no		);
			rx.add(record, "zip"			, rec.zip			);
			rx.add(record, "addr"			, rec.addr			);
			rx.add(record, "dtls_addr"		, rec.dtls_addr		);
			rx.add(record, "tel_no"			, rec.tel_no		);
			rx.add(record, "natn_tel_no"	, rec.natn_tel_no	);
			rx.add(record, "corp_clsf"		, rec.corp_clsf		);
			rx.add(record, "setl_bank"		, rec.setl_bank		);
			rx.add(record, "acct_no"		, rec.acct_no		);
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
			<aply_dt/>
			<route_clsf_nm/>
			<route_clsf/>
			<route_cd/>
			<route_nm/>
			<cnsg_seqo/>
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

<% /* 작성시간 : Fri Feb 13 15:47:27 KST 2009 */ %>