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
* 파일명 : se_qty_2310_l.jsp
* 기능 : 일일발송부수마감 - 발송내역 조회
* 작성일자 : 2009-03-10
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
	SE_QTY_2310_LDataSet ds = (SE_QTY_2310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		if(ds != null){
			rx.add(resform, "issu_dt", ds.issu_dt);
			rx.add(resform, "send_clos_grp_clsf", ds.send_clos_grp_clsf);
			rx.add(resform, "clos_yn", ds.clos_yn);
			rx.add(resform, "setl_stat_nm", ds.setl_stat_nm);
			rx.add(resform, "clos_dt", ds.clos_dt);
			rx.add(resform, "clos_tms", ds.clos_tms);
			rx.add(resform, "ser_no1", ds.ser_no1);
			rx.add(resform, "ser_no2", ds.ser_no2);
			rx.add(resform, "sect_remk", ds.sect_remk);
			rx.add(resform, "remk", ds.remk);
			rx.add(resform, "chg_matt", ds.chg_matt);
		}
		gridData = rx.add(resform, "tab1grid", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_2310_LCURLISTRecord rec = (SE_QTY_2310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "rstat", "");
			rx.add(record, "send_proc_seq", rec.send_proc_seq);
			rx.add(record, "prt_dt", rec.prt_dt);
			rx.add(record, "route_clsf", rec.route_clsf);
			rx.add(record, "route_clsf_nm", rec.route_clsf_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "add_prt_seq", rec.add_prt_seq);
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
			<send_proc_seq/>
			<prt_dt/>
			<route_clsf/>
			<route_clsf_nm/>
			<medi_cd/>
			<medi_nm/>
			<sect_cd/>
			<sect_nm/>
			<pcnt/>
			<clr_pcnt/>
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
		<issu_dt/>
		<send_clos_grp_clsf/>
		<clos_yn/>
		<setl_stat_nm/>
		<clos_dt/>
		<clos_tms/>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Tue Mar 10 13:11:09 KST 2009 */ %>