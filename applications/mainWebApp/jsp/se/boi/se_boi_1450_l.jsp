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
* 파일명 : se_boi_1450_l.jsp
* 기능 : 지국장조회 - 지역이력탭 조회
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
	SE_BOI_1450_LDataSet ds = (SE_BOI_1450_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "tab4form", "");
	resform = rx.add(resData, "dtlgrid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_1450_LCURLISTRecord rec = (SE_BOI_1450_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resform, "record", "");
			rx.add(record, "aply_dt", rec.aply_dt);
			rx.add(record, "chg_prv_area_cd", rec.chg_prv_area_cd);
			rx.add(record, "chg_prv_srt_seq", rec.chg_prv_srt_seq);
			rx.add(record, "chg_prv_area_nm", rec.chg_prv_area_nm);
			rx.add(record, "chrg_nm1", rec.chrg_nm1);
			rx.add(record, "chrg_nm2", rec.chrg_nm2);
			rx.add(record, "chrg_nm3", rec.chrg_nm3);
			rx.add(record, "chg_aft_area_cd", rec.chg_aft_area_cd);
			rx.add(record, "chg_aft_srt_seq", rec.chg_aft_srt_seq);
			rx.add(record, "chg_aft_area_nm", rec.chg_aft_area_nm);
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
			<aply_dt/>
			<chg_prv_area_cd/>
			<chg_prv_srt_seq/>
			<chg_prv_area_nm/>
			<chrg_nm1/>
			<chrg_nm2/>
			<chrg_nm3/>
			<chg_aft_area_cd/>
			<chg_aft_srt_seq/>
			<chg_aft_area_nm/>
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

<% /* 작성시간 : Thu Feb 05 13:13:55 KST 2009 */ %>