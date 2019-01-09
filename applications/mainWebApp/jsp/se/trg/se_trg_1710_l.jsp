<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_trg_1710_l.jsp
* 기능 : 담당평가기준관리 - 평가내역조회
* 작성일자 : 2009-04-07
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_TRG_1710_LDataSet ds = (SE_TRG_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "evlulist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1710_LCURLISTRecord rec = (SE_TRG_1710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "yy", rec.yy);
			rx.add(record, "evlu_seq", rec.evlu_seq);
			rx.add(record, "evlu_dt", rec.evlu_dt);
			rx.add(record, "evlu_nm", rec.evlu_nm);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "clos_dt", rec.clos_dt);
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
			<yy/>
			<evlu_seq/>
			<evlu_dt/>
			<evlu_nm/>
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

<% /* 작성시간 : Tue Apr 07 20:05:28 KST 2009 */ %>