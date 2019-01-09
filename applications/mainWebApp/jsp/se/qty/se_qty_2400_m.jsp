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
* 파일명 : se_qty_2400_m.jsp
* 기능 : 마감후증감부수재마감
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
	SE_QTY_2400_MDataSet ds = (SE_QTY_2400_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int initData = 0;
	int comboSet = 0;
	int recordSet = 0;
	int item = 0;
	comboSet = rx.add(root, "comboSet", "");

	try {
		int send_clos_grp_clsf = rx.add(comboSet, "send_clos_grp_clsf", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			SE_QTY_2400_MCOMMCDCUR1Record rec = (SE_QTY_2400_MCOMMCDCUR1Record)ds.commcdcur1.get(i);
			item  = rx.add( send_clos_grp_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
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
	<COMMCDCUR1>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</COMMCDCUR1>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<commcdcur1/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Mar 17 19:51:08 KST 2009 */ %>