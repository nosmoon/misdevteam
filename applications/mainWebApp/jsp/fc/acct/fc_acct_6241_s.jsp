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
	FC_ACCT_6241_SDataSet ds = (FC_ACCT_6241_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int resform = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "output_Data", "");

	try {
		/****** CUR_REDMASETACQRPTCR_LIST_1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.cur_redmasetacqrptcr_list_1.size(); i++) {
			FC_ACCT_6241_SCUR_REDMASETACQRPTCR_LIST_1Record rec = (FC_ACCT_6241_SCUR_REDMASETACQRPTCR_LIST_1Record)ds.cur_redmasetacqrptcr_list_1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq", rec.seq);  //일련번호
			rx.add(record, "vat_aset_clsf", rec.vat_aset_clsf); //부가세자산구분
			rx.add(record, "acqr_dt", rec.acqr_dt);  //취득일자
			rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd); //통합거래처코드
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd); //거래처구분코드
			rx.add(record, "dlco_cd", rec.dlco_cd); //거래처코드
			rx.addCData(record, "dlco_nm", rec.dlco_nm); //거래처명
			rx.add(record, "ern", rec.ern); //사업자등록번호
			rx.addCData(record, "item", rec.item); //품목
			rx.add(record, "suply_amt", rec.suply_amt); //공급가액
			rx.add(record, "vat_amt", rec.vat_amt); //부가세액
			rx.add(record, "qunt", rec.qunt); //수량
		}
		rx.add(recordSet, "totalcnt", ds.cur_redmasetacqrptcr_list_1.size());
		/****** CUR_REDMASETACQRPTCR_LIST_1 END */
		resform = rx.add(dataSet, "resform", "");
			rx.add(resform, "erplace_cd", ds.erplace_cd);  //사업장코드
			rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm); //시작월
			rx.add(resform, "vat_to_yymm", ds.vat_to_yymm); //종료월
			rx.add(resform, "qunt_s", ds.qunt_s); //수량 합계
			rx.add(resform, "suply_amt_s", ds.suply_amt_s); //공급가액
			rx.add(resform, "vat_amt_s", ds.vat_amt_s); //부가세액
			rx.add(resform, "qunt_1", ds.qunt_1); //수량      건물_구축물   
			rx.add(resform, "suply_amt_1", ds.suply_amt_1); //공급가액
			rx.add(resform, "vat_amt_1", ds.vat_amt_1); //부가세액
			rx.add(resform, "qunt_2", ds.qunt_2); //수량      기계장치
			rx.add(resform, "suply_amt_2", ds.suply_amt_2); //공급가액
			rx.add(resform, "vat_amt_2", ds.vat_amt_2); //부가세액
			rx.add(resform, "qunt_3", ds.qunt_3); //수량      차량운반구     
			rx.add(resform, "suply_amt_3", ds.suply_amt_3); //공급가액
			rx.add(resform, "vat_amt_3", ds.vat_amt_3); //부가세액
			rx.add(resform, "qunt_4", ds.qunt_4); //수량      기타감가상각
			rx.add(resform, "suply_amt_4", ds.suply_amt_4); //공급가액
			rx.add(resform, "vat_amt_4", ds.vat_amt_4); //부가세액
			System.out.println("최호정 fc_acct_6241_s.jsp 정상 success");
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
<fc_acct_6241_s>
	<dataSet>
		<CUR_REDMASETACQRPTCR_LIST_1>
			<record>
				<seq/>
				<vat_aset_clsf/>
				<acqr_dt/>
				<intg_dlco_cd/>
				<dlco_clsf_cd/>
				<dlco_cd/>
				<dlco_nm/>
				<ern/>
				<item/>
				<suply_amt/>
				<vat_amt/>
				<qunt/>
			</record>
		</CUR_REDMASETACQRPTCR_LIST_1>
	</dataSet>
</fc_acct_6241_s>
*/
%>

<% /* 작성시간 : Mon Jun 23 14:04:34 KST 2014 */ %>