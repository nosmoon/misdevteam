<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.ds.*
	,	chosun.ciis.se.qty.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_2410_l.jsp
* 기능 : 증감부수재마감 - 마감내역 조회
* 작성일자 : 2009-03-17
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
	SE_QTY_2410_LDataSet ds = (SE_QTY_2410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "closlist", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2410_LCURLISTRecord rec = (SE_QTY_2410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "send_clos_grp_clsf", rec.send_clos_grp_clsf);
			rx.add(record, "clos_tms", rec.clos_tms);
			rx.add(record, "clos_dt", rec.clos_dt);
			rx.add(record, "clos_pers", rec.clos_pers);
			rx.add(record, "clos_yn", rec.clos_yn);
			rx.add(record, "setl_stat_nm", rec.setl_stat_nm);
			rx.add(record, "remk", rec.remk);
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
			<issu_dt/>
			<send_clos_grp_clsf/>
			<clos_tms/>
			<clos_dt/>
			<clos_pers/>
			<clos_yn/>
			<setl_stat_nm/>
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

<% /* 작성시간 : Tue Mar 17 19:51:44 KST 2009 */ %>