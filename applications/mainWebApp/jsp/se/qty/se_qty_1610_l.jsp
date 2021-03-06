<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_qty_1610_l.jsp
* 기능 : 전월대비유가발송부수조회-리스트조회
* 작성일자 : 2009-02-20
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
	SE_QTY_1610_LDataSet ds = (SE_QTY_1610_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");

	try {
		gridData = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_1610_LCURLISTRecord rec = (SE_QTY_1610_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "team_nm", rec.team_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			//rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "prvmm_val_qty", rec.prvmm_val_qty);
			rx.add(record, "val_icdc_qty", rec.val_icdc_qty);
			rx.add(record, "curmm_val_qty", rec.curmm_val_qty);
			rx.add(record, "avg_qty", rec.avg_qty);
			rx.add(record, "val_rate", rec.val_rate+" %");
			rx.add(record, "icdc_qty", rec.icdc_qty);
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
			<medi_nm/>
			<prvmm_val_qty/>
			<val_icdc_qty/>
			<curmm_val_qty/>
			<avg_qty/>
			<val_rate/>
			<icdc_qty/>
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

<% /* 작성시간 : Fri Feb 20 14:01:01 KST 2009 */ %>