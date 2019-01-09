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
	FC_ACCT_6221_SDataSet ds = (FC_ACCT_6221_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int resform = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "output_Data", "");

	try {
		/****** CUR_RLESLEASPTCR_LIST_1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.cur_rlesleasptcr_list_1.size(); i++) {
			FC_ACCT_6221_SCUR_RLESLEASPTCR_LIST_1Record rec = (FC_ACCT_6221_SCUR_RLESLEASPTCR_LIST_1Record)ds.cur_rlesleasptcr_list_1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq);  //일련번호
			rx.add(record, "flor_cnt", rec.flor_cnt); //총수
			rx.add(record, "ser_no", rec.ser_no); //호수
			rx.add(record, "cntr_size", rec.cntr_size); //계약면적
			rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd); //통합거래처코드
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd); //거래처구분코드
			rx.add(record, "dlco_cd", rec.dlco_cd); //거래처코드
			rx.add(record, "hire_firm_nm", rec.hire_firm_nm); //임차인상호(성명)
			rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern); //임차인등록번호
			rx.add(record, "leas_fr_dt", rec.leas_fr_dt); //임대기간 from
			rx.add(record, "leas_to_dt", rec.leas_to_dt); //임대기간 to
			rx.add(record, "cntr_gurt_amt", rec.cntr_gurt_amt); //약정보증금
			rx.add(record, "cntr_leas_amt", rec.cntr_leas_amt); //약정임대료
			rx.add(record, "cntr_mang_amt", rec.cntr_mang_amt); //약정관리비
			rx.add(record, "rent_impt_amt", rec.rent_impt_amt); //임대료수입금액계(과세표준)
			rx.add(record, "rent_gurt_amt_int", rec.rent_gurt_amt_int); //임대료보증금이자
			rx.add(record, "rent_mms_rcpm_amt", rec.rent_mms_rcpm_amt); //임대료수입금액월임대료
			rx.add(record, "mang_rcpm_amt", rec.mang_rcpm_amt); //관리비수입금액
			rx.add(record, "nwsp_dn_yn", rec.nwsp_dn_yn); //지하여부
			rx.add(record, "leas_dlco_ern", rec.leas_dlco_ern); //임대인등록번호 : 파일생성시 조정필요함
			rx.add(record, "dong", rec.dong); //동
			rx.add(record, "renw_dt", rec.renw_dt); //갱신일자
			
		}
		rx.add(recordSet, "totalcnt", ds.cur_rlesleasptcr_list_1.size());
		/****** CUR_RLESLEASPTCR_LIST_1 END */
		resform = rx.add(dataSet, "resform", "");
		rx.add(resform, "erplace_cd", ds.erplace_cd);
		rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm);
		rx.add(resform, "vat_to_yymm", ds.vat_to_yymm);
		System.out.println("최호정 fc_acct_6221_s.jsp 정상 success");

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
<fc_acct_6221_s>
	<dataSet>
		<CUR_RLESLEASPTCR_LIST_1>
			<record>
				<seq/>
				<flor_cnt/>
				<ser_no/>
				<cntr_size/>
				<intg_dlco_cd/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<hire_firm_nm/>
				<hire_dlco_ern/>
				<leas_fr_dt/>
				<leas_to_dt/>
				<cntr_gurt_amt/>
				<cntr_leas_amt/>
				<cntr_mang_amt/>
				<rent_impt_amt/>
				<rent_gurt_amt_int/>
				<rent_mms_rcpm_amt/>
				<mang_rcpm_amt/>
				<nwsp_dn_yn/>
				<leas_dlco_ern/>
				<dong/>
				<renw_dt/>
			</record>
		</CUR_RLESLEASPTCR_LIST_1>
	</dataSet>
</fc_acct_6221_s>
*/
%>

<% /* 작성시간 : Sun Jun 22 15:14:06 KST 2014 */ %>