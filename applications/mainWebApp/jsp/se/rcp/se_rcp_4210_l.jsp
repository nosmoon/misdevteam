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
* 파일명 : se_rcp_4210_l.jsp
* 기능 : 스포츠일입금현황-리스트조회
* 작성일자 : 2009-05-11
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
	SE_RCP_4210_LDataSet ds = (SE_RCP_4210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_4210_LCURLISTRecord rec = (SE_RCP_4210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "rcpm_dt", rec.rcpm_dt);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "rcpm_hang", rec.rcpm_hang);
			rx.add(record, "rcpm_gb", rec.rcpm_gb);
			rx.add(record, "slip_no", rec.slip_no);
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
			<rcpm_dt/>
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<bo_nm/>
			<amt/>
			<rcpm_hang/>
			<rcpm_gb/>
			<slip_no/>
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

<% /* 작성시간 : Mon May 11 13:23:06 KST 2009 */ %>