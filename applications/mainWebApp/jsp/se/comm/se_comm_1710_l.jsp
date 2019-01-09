<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.comm.ds.*
	,	chosun.ciis.se.comm.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_comm_1710_l.jsp
* 기능 : 
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
	SE_COMM_1710_LDataSet ds = (SE_COMM_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_COMM_1710_LCURLISTRecord rec = (SE_COMM_1710_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "tax_no", rec.tax_no);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "presi_nm", rec.presi_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
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
			<tax_no/>
			<dlco_nm/>
			<presi_nm/>
			<suply_amt/>
			<vat_amt/>
			<remk/>
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

<% /* 작성시간 : Wed Jul 22 14:03:02 KST 2009 */ %>