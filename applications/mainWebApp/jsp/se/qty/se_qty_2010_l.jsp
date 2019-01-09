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
* 파일명 : se_qty_2010_l.jsp
* 기능 : 
* 작성일자 : 2009-03-02
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
	SE_QTY_2010_LDataSet ds = (SE_QTY_2010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");

	try {
		gridData = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2010_LCURLISTRecord rec = (SE_QTY_2010_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "team_nm", rec.team_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "prvdt_qty", rec.prvdt_qty);
			rx.add(record, "curdt_qty", rec.curdt_qty);
			rx.add(record, "diff_qty", rec.diff_qty);
			rx.add(record, "gnr_qty", rec.gnr_qty);
			rx.add(record, "spsl_qty", rec.spsl_qty);
			rx.add(record, "qty_tot", rec.qty_tot);
			rx.add(record, "gnr_addm_qty", rec.gnr_addm_qty);
			rx.add(record, "spsl_addm_qty", rec.spsl_addm_qty);
			rx.add(record, "addm_qty_tot", rec.addm_qty_tot);
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
			<team_nm/>
			<part_nm/>
			<area_nm/>
			<bo_nm/>
			<prvdt_qty/>
			<curdt_qty/>
			<diff_qty/>
			<gnr_qty/>
			<spsl_qty/>
			<qty_tot/>
			<gnr_addm_qty/>
			<spsl_addm_qty/>
			<addm_qty_tot/>
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

<% /* 작성시간 : Mon Mar 02 17:23:25 KST 2009 */ %>