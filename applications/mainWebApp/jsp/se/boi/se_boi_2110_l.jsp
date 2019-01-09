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
* 파일명 : se_boi_2110_l.jsp
* 기능 : 타지국전세보증금조회 - 상단조회
* 작성일자 : 2009-05-26
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
	SE_BOI_2110_LDataSet ds = (SE_BOI_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid1", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BOI_2110_LCURLISTRecord rec = (SE_BOI_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "slip_no", rec.slip_no);
			rx.add(record, "acct_slip_no", rec.acct_slip_no);
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			rx.add(record, "clos_yn", rec.clos_yn);
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
			<occr_dt/>
			<slip_clsf/>
			<seq/>
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<area_cd/>
			<slip_no/>
			<rcpm_amt/>
			<clos_yn/>
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

<% /* 작성시간 : Tue May 26 17:01:11 KST 2009 */ %>