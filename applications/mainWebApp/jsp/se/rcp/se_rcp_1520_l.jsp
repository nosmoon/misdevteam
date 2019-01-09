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
* 파일명 : se_rcp_1520_l.jsp
* 기능 : 입금정정 - 정정내역 하단조회
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
	SE_RCP_1520_LDataSet ds = (SE_RCP_1520_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_1520_LCURLISTRecord rec = (SE_RCP_1520_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "atm1_r", rec.atm1_r);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "atm2_r", rec.atm2_r);
			rx.add(record, "amt3", rec.amt3);
			rx.add(record, "atm3_r", rec.atm3_r);
			rx.add(record, "tot_amt", rec.tot_amt);
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
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<area_cd/>
			<area_nm/>
			<chrg_pers/>
			<amt1/>
			<atm1_r/>
			<amt2/>
			<atm2_r/>
			<amt3/>
			<atm3_r/>
			<tot_amt/>
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

<% /* 작성시간 : Mon May 04 09:45:47 KST 2009 */ %>