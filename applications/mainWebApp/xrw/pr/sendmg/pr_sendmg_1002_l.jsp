<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.sendmg.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.sendmg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_SENDMG_1000_LDataSet ds = (PR_SENDMG_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	
	recordSet = rx.add(root, "gridData3", "");

	try {		
		formData = rx.add(recordSet, "y_list", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_SENDMG_1000_LCURLIST4Record rec = (PR_SENDMG_1000_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cd_abrv_cdnm", rec.cd_abrv_cdnm);
		}
		/****** CURLIST4 END */

		formData = rx.add(recordSet, "x_list", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_SENDMG_1000_LCURLIST3Record rec = (PR_SENDMG_1000_LCURLIST3Record)ds.curlist3.get(i);
			for (int ii=0; ii<4; ii++){
				rx.add(formData, "ecnt", rec.ecnt + " 판");
			}
		}
		formData = rx.add(recordSet, "x_list_cnt", "");
		rx.add(formData, "cnt", ds.curlist3.size());
		/****** CURLIST3 END */

		formData = rx.add(recordSet, "a_list", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_SENDMG_1000_LCURLIST2Record rec = (PR_SENDMG_1000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "prt_plac_clsf", rec.prt_plac_clsf);
			rx.add(record, "ecnt", rec.ecnt);
			rx.add(record, "prt_bgn_tm", rec.prt_bgn_tm);
			rx.add(record, "prt_end_tm", rec.prt_end_tm);
			rx.add(record, "off_plat_tm", rec.off_plat_tm);
		}
		/****** CURLIST2 END */
		
		formData = rx.add(recordSet, "ns_info", "");
		for(int i = 0; i < ds.curlist6.size(); i++) {
			PR_SENDMG_1000_LCURLIST6Record rec = (PR_SENDMG_1000_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "fst_route", rec.fst_route);
			rx.add(record, "fst_route_tm", rec.fst_route_tm);
			rx.add(record, "last_route", rec.last_route);
			rx.add(record, "last_route_tm", rec.last_route_tm);
		}
		/****** CURLIST6 END */
		
		formData = rx.add(recordSet, "send_info", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_SENDMG_1000_LCURLIST1Record rec = (PR_SENDMG_1000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "make_pers", rec.make_pers);
			rx.add(record, "make_pers_nm", rec.make_pers_nm);
			rx.add(record, "weth", rec.weth);
			rx.add(record, "ser_no", rec.ser_no);
			rx.add(record, "side1_atic", rec.side1_atic);
			rx.add(record, "rept_matt", StringUtil.replaceToXml(rec.rept_matt));
			rx.add(record, "issu_pcnt", rec.issu_pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
			rx.add(record, "bk_pcnt", rec.bk_pcnt);
		}
		/****** CURLIST1 END */

		formData = rx.add(recordSet, "clos_clsf", "");
		rx.add(formData, "val", ds.clos_clsf);
		
		formData = rx.add(recordSet, "ecnt_clsf", "");
		rx.add(formData, "val", ds.ecnt_chk);
		/****** CURLIST1 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<send_dt/>
			<make_pers/>
			<make_pers_nm/>
			<rept_matt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 22 20:25:49 KST 2009 */ %>