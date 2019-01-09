<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.lang.*
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
* 파일명 : se_qty_1110_l.jsp
* 기능 : 지역별일계표작업-지국별 내역
* 작성일자 : 2009-02-13
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
	SE_QTY_1110_LDataSet ds = (SE_QTY_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	
	float prvmm_val_rate = 0;
	float curmm_val_rate = 0;
	
	
	resData = rx.add(root, "resData", "");

	try {
		resform = rx.add(resData, "resform", "");
		if(ds != null){
			rx.add(resform, "totclos_yn", ds.totclos_yn);
			rx.add(resform, "areaclos_yn", ds.areaclos_yn);
			rx.add(resform, "fix_msg", ds.fix_msg);
			rx.add(resform, "fix_dt", ds.fix_dt);
		}
		gridData = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_1110_LCURLISTRecord rec = (SE_QTY_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "team_nm", rec.team_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "prvmm_cntr_uprc", rec.prvmm_cntr_uprc);
			rx.add(record, "prvmm_val_qty", rec.prvmm_val_qty);
			rx.add(record, "prvmm_no_val_qty", rec.prvmm_no_val_qty);
			rx.add(record, "prvmm_qty_tot", rec.prvmm_qty_tot);

			if(rec.prvmm_qty_tot == 0){
				rx.add(record, "prvmm_val_rate", "0");
			}else{
				prvmm_val_rate = (float)Math.round((float)rec.prvmm_val_qty / rec.prvmm_qty_tot * 10000) / 100;
				rx.add(record, "prvmm_val_rate", prvmm_val_rate);
			}

			rx.add(record, "gnr_enty_qty", rec.gnr_enty_qty);
			rx.add(record, "isenty_qty", rec.isenty_qty);
			rx.add(record, "isicdc_qty", rec.isicdc_qty);
			rx.add(record, "rdr_extn_enty_qty", rec.rdr_extn_enty_qty);
			rx.add(record, "val_movm_qty", rec.val_movm_qty);
			rx.add(record, "val_icdc_qty", rec.val_icdc_qty);
			rx.add(record, "val_icdc_tot", rec.val_icdc_tot);
			rx.add(record, "curmm_val_qty", rec.curmm_val_qty);
			rx.add(record, "curmm_no_val_qty", rec.curmm_no_val_qty);
			rx.add(record, "curmm_issu_qty", rec.curmm_issu_qty);
			rx.add(record, "isenty_qty2", rec.isenty_qty2);
			rx.add(record, "rdr_extn_enty_qty2", rec.rdr_extn_enty_qty2);			

			if(rec.curmm_issu_qty == 0){
				rx.add(record, "curmm_val_rate", "0");
			}else{
				curmm_val_rate = (float)Math.round((float)rec.curmm_val_qty / rec.curmm_issu_qty * 10000) / 100;
				rx.add(record, "curmm_val_rate", curmm_val_rate);
			}

			rx.add(record, "no_val_icdc_qty", rec.no_val_icdc_qty);
			rx.add(record, "curmm_icdc_tot", rec.curmm_icdc_tot);
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
			<bo_cd/>
			<bo_seq/>
			<prvmm_cntr_uprc/>
			<prvmm_val_qty/>
			<prvmm_no_val_qty/>
			<prvmm_qty_tot/>
			<gnr_enty_qty/>
			<isenty_qty/>
			<isicdc_qty/>
			<rdr_extn_enty_qty/>
			<val_movm_qty/>
			<val_icdc_qty/>
			<val_icdc_tot/>
			<curmm_val_qty/>
			<curmm_no_val_qty/>
			<curmm_issu_qty/>
			<no_val_icdc_qty/>
			<curmm_icdc_tot/>
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
		<team_cdcur/>
		<part_cdcur/>
		<area_cdcur/>
		<commcdcur1/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri Feb 13 10:03:05 KST 2009 */ %>