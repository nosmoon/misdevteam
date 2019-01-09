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
	FC_ACCT_6261_SDataSet ds = (FC_ACCT_6261_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int resform = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "output_Data", "");

	try {
		/****** CUR_CRDTCARDACQPTCR_LIST_1 BEGIN */
		recordSet = rx.add(dataSet, "gridData", "");

		for(int i = 0; i < ds.cur_crdtcardacqptcr_list_1.size(); i++) {
			FC_ACCT_6261_SCUR_CRDTCARDACQPTCR_LIST_1Record rec = (FC_ACCT_6261_SCUR_CRDTCARDACQPTCR_LIST_1Record)ds.cur_crdtcardacqptcr_list_1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq); //일련번호
			rx.add(record, "acq_dt", rec.acq_dt); //수취일자
			rx.add(record, "qunt", rec.qunt); //수량
			rx.add(record, "suply_amt", rec.suply_amt); //공급가액
			rx.add(record, "vat_amt", rec.vat_amt); //부가세액
			rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd); //통합거래처코드
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd); //거래처구분코드
			rx.add(record, "dlco_cd", rec.dlco_cd); //거래처코드
			//rx.add(record, "dlco_nm", rec.dlco_nm); //거래처명
			rx.addCData(record, "dlco_nm", rec.dlco_nm); //거래처명
			rx.add(record, "ern", rec.ern); //사업자등록번호
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd); //관리구분코드
			rx.add(record, "crdt_card_nm", rec.crdt_card_nm); //신용카드명
			rx.add(record, "crdt_card_no", rec.crdt_card_no); //신용카드번호
		}
		rx.add(recordSet, "totalcnt", ds.cur_crdtcardacqptcr_list_1.size());
		/****** CUR_CRDTCARDACQPTCR_LIST_1 END */
		resform = rx.add(dataSet, "resform", "");
		rx.add(resform, "erplace_cd", ds.erplace_cd);
		rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm);
		rx.add(resform, "vat_to_yymm", ds.vat_to_yymm);
		System.out.println("최호정 fc_acct_6261_s.jsp 정상 success");

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
<fc_acct_6261_s>
	<dataSet>
		<CUR_CRDTCARDACQPTCR_LIST_1>
			<record>
				<seq/>
				<acq_dt/>
				<qunt/>
				<suply_amt/>
				<vat_amt/>
				<intg_dlco_cd/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<ern/>
				<mang_clsf_cd/>
				<crdt_card_nm/>
				<crdt_card_no/>
			</record>
		</CUR_CRDTCARDACQPTCR_LIST_1>
	</dataSet>
</fc_acct_6261_s>
*/
%>

<% /* 작성시간 : Tue Jun 17 13:54:08 KST 2014 */ %>