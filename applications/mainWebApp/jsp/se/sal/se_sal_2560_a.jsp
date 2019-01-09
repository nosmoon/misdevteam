<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.ds.*
	,	chosun.ciis.se.sal.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_2560_a.jsp
* 기능 : 계산서단건등록-전자계산서 전송
* 작성일자 : 2009-07-22
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
	SE_SAL_2560_ADataSet ds = (SE_SAL_2560_ADataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "allsendlist", "");

	try {
		for(int i = 0; i < ds.sendlist.size(); i++) {
			SE_SAL_2560_ASENDLISTRecord rec = (SE_SAL_2560_ASENDLISTRecord)ds.sendlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "col", rec.col);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_occr_cd", rec.slip_occr_cd);
			rx.add(record, "slip_seq", rec.slip_seq);
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
	<SENDLIST>
		<record>
			<col/>
			<slip_occr_dt/>
			<slip_occr_cd/>
			<slip_seq/>
		</record>
	</SENDLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<sendlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Jul 22 20:30:58 KST 2009 */ %>