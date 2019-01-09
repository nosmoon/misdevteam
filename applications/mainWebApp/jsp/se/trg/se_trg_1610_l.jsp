<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.trg.ds.*
	,	chosun.ciis.se.trg.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_trg_1610_l.jsp
* 기능 : 지국평가결과조회 - 순매출내역
* 작성일자 : 2009-04-06
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
	SE_TRG_1610_LDataSet ds = (SE_TRG_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab1list", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1610_LCURLISTRecord rec = (SE_TRG_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "evlu_grp_nm", rec.evlu_grp_nm);
			rx.add(record, "cmpt_acpn", rec.cmpt_acpn);
			rx.add(record, "borank", rec.borank);
			rx.add(record, "prz_amt", rec.prz_amt);
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
			<area_nm/>
			<chrg_flnm/>
			<bo_nm/>
			<bo_head_nm/>
			<evlu_grp_nm/>
			<cmpt_acpn/>
			<borank/>
			<prz_amt/>
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

<% /* 작성시간 : Mon Apr 06 15:30:13 KST 2009 */ %>