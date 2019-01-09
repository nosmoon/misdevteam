<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_6251_SDataSet ds = (FC_ACCT_6251_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int resform = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "output_Data", "");

	try {
		/****** CUR_NONDDUCPTCR_LIST_1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.cur_nondducptcr_list_1.size(); i++) {
			FC_ACCT_6251_SCUR_NONDDUCPTCR_LIST_1Record rec = (FC_ACCT_6251_SCUR_NONDDUCPTCR_LIST_1Record)ds.cur_nondducptcr_list_1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "non_dduc_resn_clsf", rec.non_dduc_resn_clsf);
			rx.add(record, "non_dduc_resn_clsf_nm", rec.non_dduc_resn_clsf_nm);
			rx.add(record, "tax_stmt_num_shet", rec.tax_stmt_num_shet);
			rx.add(record, "suply_amt", rec.suply_amt); 
			rx.add(record, "vat_amt", rec.vat_amt);      
			//rx.add(record, "non_dduc_resn_clsf", StringUtil.replaceToXml(rec.non_dduc_resn_clsf));
			//rx.add(record, "non_dduc_resn_clsf_nm", StringUtil.replaceToXml(rec.non_dduc_resn_clsf_nm));
			//rx.add(record, "tax_stmt_num_shet", StringUtil.replaceToXml(rec.tax_stmt_num_shet));
			//rx.add(record, "suply_amt", StringUtil.replaceToXml(rec.suply_amt));
			//rx.add(record, "vat_amt", StringUtil.replaceToXml(rec.vat_amt));
		}
		rx.add(recordSet, "totalcnt", ds.cur_nondducptcr_list_1.size());
		/****** CUR_NONDDUCPTCR_LIST_1 END */ 
		resform = rx.add(dataSet, "resform", "");
		rx.add(resform, "erplace_cd", ds.erplace_cd); //사업장코드
		rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm); //부가세시작일
		rx.add(resform, "vat_to_yymm", ds.vat_to_yymm); //부가세종료일
		rx.add(resform, "ernm_tax", ds.ernm_tax); //상호
		rx.add(resform, "ern", ds.ern); //사업자등록번호
		rx.add(resform, "presi_nm", ds.presi_nm); //대표자명
		rx.add(resform, "comn_purc_suply_amt", ds.comn_purc_suply_amt); //공통매입공급가액     3.예정신고
		rx.add(resform, "comn_purc_vat_amt", ds.comn_purc_vat_amt); //공통매입세액         3.예정신고  
		rx.add(resform, "suply_amt_etc", ds.suply_amt_etc); //공급가액등           3.예정신고 
		rx.add(resform, "rtax_suply_amt_etc", ds.rtax_suply_amt_etc); //면세공급가액등       3.예정신고
		rx.add(resform, "rtax_enpr_ratio", ds.rtax_enpr_ratio); //면세사업비율         3.예정신고 -임의생성
		//System.out.println("6251jsp 에서 rtax_enpr_ratio =>"+ds.rtax_enpr_ratio);
		rx.add(resform, "non_dduc_purc_vat_amt", ds.non_dduc_purc_vat_amt); //불공제매입세액       3.예정신고
		rx.add(resform, "calc_aft_suply_amt", ds.calc_aft_suply_amt); //안분후공급가액       3.예정신고 -임의생성
		rx.add(resform, "tot_comn_purc_vat_amt", ds.tot_comn_purc_vat_amt); //총공통매입세액       4.확정신고
		rx.add(resform, "tot_suply_amt_etc", ds.tot_suply_amt_etc); //총공급가액등         4.확정신고 -임의생성
		rx.add(resform, "tot_rtax_suply_amt_etc", ds.tot_rtax_suply_amt_etc); //총면세공급가액등     4.확정신고 -임의생성
		rx.add(resform, "rtax_enpr_fix_ratio", ds.rtax_enpr_fix_ratio); //면세사업확정비율     4.확정신고 
		rx.add(resform, "tot_non_dduc_purc_vat_amt", ds.tot_non_dduc_purc_vat_amt); //총불공제매입세액     4.확정신고 
		rx.add(resform, "pre_non_dduc_purc_vat_amt", ds.pre_non_dduc_purc_vat_amt); //기불공제매입세액     4.확정신고
		rx.add(resform, "add_non_dduc_purc_vat_amt", ds.add_non_dduc_purc_vat_amt); //가산공제매입세액     4.확정신고   
		rx.add(resform, "tot_calc_aft_suply_amt", ds.tot_calc_aft_suply_amt); //총안분후공급가액     4.확정신고 -임의생성
		rx.add(resform, "gds_purc_vat_amt", ds.gds_purc_vat_amt); //재화매입세액         5.정산
		rx.add(resform, "ck_rate", ds.ck_rate); //체감률               5.정산 - 임의생성     
		rx.add(resform, "txn_prd_cnt", ds.txn_prd_cnt); //과세기간수           5.정산 - 임의생성
		rx.add(resform, "redu_ratio_pymt_re_calc", ds.redu_ratio_pymt_re_calc); //경감률_납부재계산    5.정산
		rx.add(resform, "incr_redu_rtax_enpr_ratio", ds.incr_redu_rtax_enpr_ratio); //증가감소면세비율     5.정산
		rx.add(resform, "adjm_add_non_dduc_purc_vat", ds.adjm_add_non_dduc_purc_vat); //정산가산공제매입세액 5.정산
		rx.add(resform, "adjm_calc_aft_suply_amt", ds.adjm_calc_aft_suply_amt); //정산계산후공급가액   5.정산 - 임의생성 
		rx.add(resform, "data_cnt", ds.data_cnt); //조회결과 cnt
		rx.add(resform, "tot_suply_amt", ds.tot_suply_amt); //총계(공급가액)
		rx.add(resform, "tot_vat_amt", ds.tot_vat_amt); //총계(세액)
		rx.add(resform, "ptcr_suply_amt", ds.ptcr_suply_amt); //공제받지못할 매입세액 총계(공급가액)
		rx.add(resform, "ptcr_vat_amt", ds.ptcr_vat_amt); //공제받지못할 매입세액 총계(세)
		
		//System.out.println("최호정 fc_acct_6251_s.jsp 정상 success");
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
<fc_acct_6251_s>
	<dataSet>
		<CUR_NONDDUCPTCR_LIST_1>
			<record>
				<non_dduc_resn_clsf/>
				<non_dduc_resn_clsf_nm/>
				<tax_stmt_num_shet/>
				<suply_amt/>
				<vat_amt/>
			</record>
		</CUR_NONDDUCPTCR_LIST_1>
	</dataSet>
</fc_acct_6251_s>
*/
%>

<% /* 작성시간 : Tue Jun 17 19:37:04 KST 2014 */ %>