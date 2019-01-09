<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_1530_l.jsp
* 기능 : 입금정정 - 대상지국정보 조회
* 작성일자 : 2009-05-04
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
	SE_RCP_1530_LDataSet ds = (SE_RCP_1530_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resform", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1530_LCURLISTRecord rec = (SE_RCP_1530_LCURLISTRecord)ds.curlist.get(i);
			rx.add(resData, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(resData, "bo_nm", rec.bo_nm);
			rx.add(resData, "area_cd", rec.area_cd);
			rx.add(resData, "area_nm", rec.area_nm);
			rx.add(resData, "chrg_pers", rec.chrg_pers);
			rx.add(resData, "amt1", "0");
			rx.add(resData, "atm1_r", rec.amt1);
			rx.add(resData, "amt2", "0");
			rx.add(resData, "atm2_r", rec.amt2);
			rx.add(resData, "amt3", "0");
			rx.add(resData, "atm3_r", rec.amt3);
			rx.add(resData, "tot_amt", rec.tot_amt);
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
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<area_cd/>
			<area_nm/>
			<chrg_pers/>
			<amt1/>
			<amt2/>
			<amt3/>
			<tot_amt/>
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

<% /* 작성시간 : Mon May 04 09:46:11 KST 2009 */ %>