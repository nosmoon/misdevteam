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
* 파일명 : se_rcp_4110_l.jsp
* 기능 : 스포츠월입금율현황-리스트 조회
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
	SE_RCP_4110_LDataSet ds = (SE_RCP_4110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_4110_LCURLISTRecord rec = (SE_RCP_4110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			/*
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "rcpm_rate", rec.rcpm_rate);
			*/

			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "cyov_bal", rec.cyov_bal);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "sub_tot_amt", rec.sub_tot_amt);
			rx.add(record, "amt3", rec.amt3);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "amt4", rec.amt4);
			rx.add(record, "bal_amt", rec.bal_amt);
			//rx.add(record, "pre_bal_amt", rec.pre_bal_amt);
			rx.add(record, "rcpm_rate", rec.rcpm_rate);
			rx.add(record, "bo_ern", rec.bo_ern);

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
			<dept_nm/>
			<part_nm/>
			<area_nm/>
			<bo_nm/>
			<qty/>
			<net_sale_amt/>
			<amt1/>
			<rcpm_rate/>
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

<% /* 작성시간 : Mon May 11 13:24:17 KST 2009 */ %>
