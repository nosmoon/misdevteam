<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.semuro.rec.*
	,	chosun.ciis.co.semuro.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SEMURO_1500_LDataSet ds = (CO_SEMURO_1500_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int gridSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "formData", "");
		CO_SEMURO_1500_LCURLISTRecord rec = (CO_SEMURO_1500_LCURLISTRecord)ds.curlist.get(0);

		//rx.add(recordSet, "fac_clsf_cd", "");
		//rx.add(recordSet, "ewh_dt", "");
		//rx.add(recordSet, "ewh_seq", "");
		rx.add(recordSet, "incmg_slip_dt", rec.issu_dt); //발행일자
		rx.add(recordSet, "ern", rec.send_pers_eps_no);      // 사업장 등록 번호
		rx.add(recordSet, "dlco_cd", rec.send_firm_custcd);;
		rx.add(recordSet, "dlco_nm", rec.send_pers_firmnm);  //사업장 명칭
		//rx.add(recordSet, "dlco_clsf_cd", "");    // 거래처 구분 코드
		rx.add(recordSet, "tot_suply_amt", rec.tot_suply_amt); //총곱급가액
		rx.add(recordSet, "suply_amt", rec.tot_amt); //공급가액
		rx.add(recordSet, "vat_amt", rec.tot_tax_amt);    // 부가세
		//rx.add(recordSet, "purc_clsf", ""); // 매입구분
		//rx.add(recordSet, "prof_type_cd", "");
		//rx.add(recordSet, "impt_yy", "");
		//rx.add(recordSet, "impt_seq", "");
		//rx.add(recordSet, "leas_clsf", "");
		//rx.add(recordSet, "make_dt",  "");
		//rx.add(recordSet, "rcpt_prof_clsf", "");     //영수증 증빙 여부
		//rx.add(recordSet, "slip_no", "");  //전표 번호

		//rx.add(record, "send_pers_presi_flnm", rec.send_pers_presi_flnm); 대표자 성명
		//rx.add(record, "send_pers_addr", rec.send_pers_addr);
		//rx.add(record, "send_pers_bizcond", rec.send_pers_bizcond);
		//rx.add(record, "send_pers_indt", rec.send_pers_indt);
		//rx.add(record, "send_pers_email", rec.send_pers_email);
		//rx.add(record, "tax_stmt_clsf", rec.tax_stmt_clsf);
		//rx.add(record, "rmsg_pers_semuro_id", rec.rmsg_pers_semuro_id); // 수신자 세무로 아이디
		//rx.add(record, "send_pers_id", rec.send_pers_id); // 송신자 세무로 아이디
		//rx.add(record, "cash", rec.cash);   현금
		//rx.add(record, "note", rec.note); 어음
		//rx.add(record, "chqe", rec.chqe); 수표
		//rx.add(record, "trust_unrcp_amt", rec.trust_unrcp_amt); 외상미수금
		//rx.add(record, "rcpt_clam_yn", rec.rcpt_clam_yn); 영수 청구 여부
		//rx.add(record, "stat_clsf", rec.stat_clsf);   상태 구분
	    //rx.add(record, "stat_clsf_dt_tm", rec.stat_clsf_dt_tm); 상태 변경 일자

		gridSet = rx.add(dataSet, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_SEMURO_1500_LCURLISTRecord recgrid = (CO_SEMURO_1500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridSet, "record", "");

			//rx.add(record, "item_dt", recgrid.item_dt);
			rx.add(record, "sub_seq", recgrid.subseq);
			rx.add(record, "matr_cd", recgrid.matr_cd);
			rx.add(record, "matr_nm", recgrid.matr_nm);
			rx.add(record, "ewh_qunt", recgrid.qunt); //수량
			rx.add(record, "ewh_amt", recgrid.item_suply_amt);
			rx.add(record, "ewh_vat", recgrid.item_tax_amt);
			rx.add(record, "purc_uprc", recgrid.uprc); //단가
			rx.add(record, "ewh_unit",recgrid.unit);
			rx.add(record, "ewh_budg_cd", recgrid.ewh_budg_cd);
 			rx.add(record, "owh_budg_cd", recgrid.owh_budg_cd);
 			rx.add(record, "medi_cd", "");
 			rx.add(record, "remk", "");
 			rx.add(record, "owh_yn", "");
 			rx.add(record, "usedept", "");
 			rx.add(record, "usedeptnm", "");
 			rx.add(record, "ewh_acct_cd", "");
 			rx.add(record, "owh_seq", "");
 			rx.add(record, "owh_sub_seq", "");
 			rx.add(record, "owh_no", "");
 			rx.add(record, "mc_flag", "");
 			rx.add(record, "bo_item_yn", "");
 			rx.add(record, "medi_ser_no", "");
 			rx.add(record, "purc_clsf", "");
 			rx.add(record, "dstb_rat_cd", recgrid.dstb_rat_cd);

		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
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
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<semuro_no/>
			<tax_stmt_clsf/>
			<rmsg_pers_semuro_id/>
			<send_pers_id/>
			<send_pers_eps_no/>
			<send_pers_presi_flnm/>
			<send_pers_firmnm/>
			<send_pers_addr/>
			<send_pers_bizcond/>
			<send_pers_indt/>
			<send_pers_email/>
			<issu_dt/>
			<tot_suply_amt/>
			<tot_amt/>
			<tot_tax_amt/>
			<cash/>
			<note/>
			<chqe/>
			<trust_unrcp_amt/>
			<rcpt_clam_yn/>
			<stat_clsf/>
			<stat_clsf_dt_tm/>
			<subseq/>
			<item_dt/>
			<std/>
			<qunt/>
			<uprc/>
			<item_suply_amt/>
			<item_tax_amt/>
			<matr_cd/>
			<matr_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Mar 05 20:26:29 KST 2009 */ %>