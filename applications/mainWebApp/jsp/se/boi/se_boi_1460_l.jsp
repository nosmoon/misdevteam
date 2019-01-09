<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1460_l.jsp
* 기능 : 지국장조회 - 부수이력탭 조회
* 작성일자 : 2009-02-06
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
	SE_BOI_1460_LDataSet ds = (SE_BOI_1460_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab5form", "");
	resform = rx.add(resData, "dtlgrid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1460_LCURLISTRecord rec = (SE_BOI_1460_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resform, "record", "");
			rx.add(record, "yymm", rec.yymm);
			rx.add(record, "thmmsendqty", rec.thmmsendqty);
			rx.add(record, "thmmvalqty", rec.thmmvalqty);
			rx.add(record, "aftcnt", rec.aftcnt);
			rx.add(record, "real_qty", rec.real_qty);
		}
	}
	catch (Exception e) {
	}
	finally {
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
			<thmmsendqty/>
			<thmmvalqty/>
			<aftcnt/>
			<real_qty/>
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

<% /* 작성시간 : Wed Feb 04 21:25:55 KST 2009 */ %>