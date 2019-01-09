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
* 파일명 : se_boi_2020_l.jsp
* 기능 : 타지국인수인계 - 처리내역 조회
* 작성일자 : 2009-05-25
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
	SE_BOI_2020_LDataSet ds = (SE_BOI_2020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		if(ds.curlist.size() > 0) {
			SE_BOI_2020_LCURLISTRecord rec = (SE_BOI_2020_LCURLISTRecord)ds.curlist.get(0);
			rx.add(resform, "bo_cdseq1", rec.bo_cd1+rec.bo_seq1);
			rx.add(resform, "bo_nm1", rec.bo_nm1);
			rx.addCData(resform, "bo_head_nm1", rec.bo_head_nm1);
			rx.add(resform, "area_cd1", rec.area_cd1);
			rx.add(resform, "area_nm1", rec.area_nm1);
			rx.add(resform, "chrg_pers1", rec.chrg_pers1);
			rx.add(resform, "amt1_1", rec.amt1_1);
			rx.add(resform, "amt2_1", rec.amt2_1);
			rx.add(resform, "bo_cdseq2", rec.bo_cd2+rec.bo_seq2);
			rx.add(resform, "bo_nm2", rec.bo_nm2);
			rx.addCData(resform, "bo_head_nm2", rec.bo_head_nm2);
			rx.add(resform, "area_cd2", rec.area_cd2);
			rx.add(resform, "area_nm2", rec.area_nm2);
			rx.add(resform, "chrg_pers2", rec.chrg_pers2);
			rx.add(resform, "amt1_2", rec.amt1_2);
			rx.add(resform, "amt2_2", rec.amt2_2);
			rx.add(resform, "amt1", rec.amt1);
			rx.add(resform, "amt2", rec.amt2);
			rx.add(resform, "callgb", "");
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
			<bo_cd1/>
			<bo_seq1/>
			<bo_nm1/>
			<area_cd1/>
			<area_nm1/>
			<chrg_pers1/>
			<bo_cd2/>
			<bo_seq2/>
			<bo_nm2/>
			<area_cd2/>
			<area_nm2/>
			<chrg_pers2/>
			<amt1/>
			<amt2/>
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

<% /* 작성시간 : Mon May 25 17:01:39 KST 2009 */ %>
