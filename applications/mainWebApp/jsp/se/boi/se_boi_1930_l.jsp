<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1930_l.jsp
* 기능 : 전세보증금인수인계 - 대상조회
* 작성일자 : 2009-05-22
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
	SE_BOI_1930_LDataSet ds = (SE_BOI_1930_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1930_LCURLISTRecord rec = (SE_BOI_1930_LCURLISTRecord)ds.curlist.get(i);
			rx.add(resform, "area_cd", rec.area_cd);
			rx.add(resform, "chrg_pers", rec.chrg_pers);
			rx.add(resform, "bo_cdseq1", rec.bo_cd1+rec.bo_seq1);
			rx.add(resform, "bo_nm1", rec.bo_nm1);
			rx.addCData(resform, "bo_head_nm1", rec.bo_head_nm1);
			rx.add(resform, "cntr_stat_nm1", rec.cntr_stat_nm1);
			rx.add(resform, "amt1", rec.amt1);
			rx.add(resform, "leas_sply_amt_unrcp_occr_dt1", rec.leas_sply_amt_unrcp_occr_dt1);
			rx.add(resform, "bo_cdseq2", rec.bo_cd2+rec.bo_seq2);
			rx.add(resform, "bo_nm2", rec.bo_nm2);
			rx.addCData(resform, "bo_head_nm2", rec.bo_head_nm2);
			rx.add(resform, "cntr_stat_nm2", rec.cntr_stat_nm2);
			rx.add(resform, "amt2", rec.amt2);
			rx.add(resform, "leas_sply_amt_unrcp_occr_dt2", rec.leas_sply_amt_unrcp_occr_dt2);
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
			<area_cd/>
			<chrg_pers/>
			<bo_cd1/>
			<bo_seq1/>
			<bo_nm1/>
			<bo_head_nm1/>
			<cntr_stat_nm1/>
			<amt1/>
			<leas_sply_amt_unrcp_occr_dt1/>
			<bo_cd2/>
			<bo_seq2/>
			<bo_nm2/>
			<bo_head_nm2/>
			<cntr_stat_nm2/>
			<amt2/>
			<leas_sply_amt_unrcp_occr_dt2/>
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

<% /* 작성시간 : Fri May 22 17:18:05 KST 2009 */ %>
