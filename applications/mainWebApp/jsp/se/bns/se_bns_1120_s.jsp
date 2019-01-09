<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bns.rec.*
	,	chosun.ciis.se.bns.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bns_1120_s.jsp
* 기능 : 
* 작성일자 : 2009-03-16
* 작성자 : 이민효
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_BNS_1120_SDataSet ds = (SE_BNS_1120_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	formData  = rx.add(root , "tab1form" , "");

	try {
		if(ds != null){
			rx.add(formData, "bns_item_cd", ds.bns_item_cd);
			rx.add(formData, "bns_item_nm", ds.bns_item_nm);
			rx.add(formData, "bns_item_clas", ds.bns_item_clas);
			rx.add(formData, "medi_cd", ds.medi_cd);
			rx.add(formData, "yy_plan_stok_qunt", ds.yy_plan_stok_qunt);
			rx.add(formData, "stok_qunt", ds.stok_qunt);
			rx.add(formData, "unit", ds.unit);
			rx.add(formData, "stok_mang_yn", ds.stok_mang_yn);
			rx.add(formData, "rchps_clsf", ds.rchps_clsf);
			rx.add(formData, "clgps_clsf", ds.clgps_clsf);
			rx.add(formData, "stmt_issu_clsf", ds.stmt_issu_clsf);
			rx.add(formData, "send_clsf", ds.send_clsf);
			rx.add(formData, "aplc_frdt", ds.aplc_frdt);
			rx.add(formData, "aplc_todt", ds.aplc_todt);
			rx.add(formData, "aplc_clos_tm", ds.aplc_clos_tm);
			rx.add(formData, "remk", ds.remk);
			rx.add(formData, "stmt_item_clsf", ds.stmt_item_clsf);
			rx.add(formData, "use_yn", ds.use_yn);
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
	<resform>
		<bns_item_cd/>
		<bns_item_nm/>
		<bns_item_clas/>
		<medi_cd/>
		<yy_plan_stok_qunt/>
		<stok_qunt/>
		<unit/>
		<stok_mang_yn/>
		<stmt_issu_clsf/>
		<send_clsf/>
		<aplc_frdt/>
		<aplc_todt/>
		<aplc_clos_tm/>
		<remk/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Mar 16 16:01:43 KST 2009 */ %>