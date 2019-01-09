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
* 파일명 : se_qty_2210_l.jsp
* 기능 : 특판신청관리-신청내역
* 작성일자 : 2009-03-05
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
	SE_QTY_2210_LDataSet ds = (SE_QTY_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	gridData = rx.add(root, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2210_LCURLISTRecord rec = (SE_QTY_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "chk_yn", "N");
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "reg_seq", rec.reg_seq);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "qty", rec.qty);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "cnfm_msg", rec.cnfm_msg);
			rx.add(record, "cnfm_stat_clsf_nm", rec.cnfm_stat_clsf_nm);
			rx.add(record, "clos_aft_cnfm_yn", rec.clos_aft_cnfm_yn);
			rx.add(record, "acpn_chrg_pers_dept_nm", rec.acpn_chrg_pers_dept_nm);
			rx.add(record, "acpn_chrg_pers_nm", rec.acpn_chrg_pers_nm);
			rx.add(record, "arvl_clsf_nm", rec.arvl_clsf_nm);
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
			<reg_dt/>
			<reg_seq/>
			<issu_dt/>
			<medi_nm/>
			<qty/>
			<amt/>
			<cnfm_msg/>
			<cnfm_stat_clsf_nm/>
			<clos_aft_cnfm_yn/>
			<acpn_chrg_pers_dept_nm/>
			<acpn_chrg_pers_nm/>
			<arvl_clsf_nm/>
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

<% /* 작성시간 : Thu Mar 05 15:30:28 KST 2009 */ %>