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
* 파일명 : se_trg_1410_l.jsp
* 기능 : 지국평가 기준관리
* 작성일자 : 2009-04-01
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
	SE_TRG_1410_LDataSet ds = (SE_TRG_1410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int grid2 = rx.add(root, "grid2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_TRG_1410_LCURLISTRecord rec = (SE_TRG_1410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(grid2, "record", "");
			rx.add(record, "evlu_grp", rec.evlu_grp);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "thmmsendqty", rec.thmmsendqty);
			rx.add(record, "chrg_flnm", rec.chrg_flnm);
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
			<evlu_grp/>
			<area_nm/>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<thmmsendqty/>
			<chrg_flnm/>
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
		<schgb/>
		<colcnt/>
		<title/>
		<bo_grp/>
		<bo_cnt/>
		<bo_cnt_sum/>
		<real_bocnt/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Wed Apr 01 17:55:21 KST 2009 */ %>