<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
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
	FC_ACCT_6291_SDataSet ds = (FC_ACCT_6291_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int resform = 0;
	
	long mc_amt1_sum = 0; //매출세액_과세_과세표준 합계
	long mc_vat1_sum = 0; //매출세액_과세_세액 합계
	long mc_amt2_sum = 0; //매출세액_영세_과세표준 합계
	long mc_vat2_sum = 0; //매출세액_영세_세액 합계
	long mi_amt1_sum = 0; //매입세액_과세_과세표준 합계
	long mi_vat1_sum = 0; //매입세액_과세_세액 합계
	long mi_amt2_sum = 0; //매입세액_의제_과세표준
	long mi_vat2_sum = 0; //매입세액_의제_세액
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "output_Data", "");

	try {
		/****** CUR_REDMASETACQRPTCR_LIST_1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.cur_redmasetacqrptcr_list_1.size(); i++) {
			FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record rec1 = (FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record)ds.cur_redmasetacqrptcr_list_1.get(i);
			int record1 = rx.add(recordSet, "record", "");
			rx.add(record1, "ern", rec1.ern); //사업자등록번호
			rx.add(record1, "erplace_addr", rec1.erplace_addr); //사업장주소
			rx.add(record1, "erplace_mc_gubun", "과세"); //매출세액_구분_과세
			rx.add(record1, "mc_amt_01", rec1.mc_amt_01);//매출세액_과세_과세표준
			rx.add(record1, "mc_vat_01", rec1.mc_vat_01);//매출세액_과세_세액
			rx.add(record1, "erplace_mi_gubun", "과세"); //매입세액_구분_과세
			rx.add(record1, "mi_amt_01", rec1.mi_amt_01);//매입세액_과세_과세표준
			rx.add(record1, "mi_vat_01", rec1.mi_vat_01);//매입세액_과세_세액
			rx.add(record1, "me_vat_01", rec1.me_vat_01);//가산세
			rx.add(record1, "me_vat_02", rec1.me_vat_02);//공제세액
			rx.add(record1, "me_vat_03", rec1.me_vat_03);//납부(환급)세액    
			rx.add(record1, "mt_amt_01", rec1.mt_amt_01);//내부거래(판매목적)반출액
			rx.add(record1, "mt_amt_02", rec1.mt_amt_02);//내부거래(판매목적)반입액

			int record2 = rx.add(recordSet, "record", "");
			rx.add(record2, "ern", rec1.ern); //사업자등록번호
			rx.add(record2, "erplace_addr", rec1.erplace_addr); //사업장주소
			rx.add(record2, "erplace_mc_gubun", "영세율"); //매출세액_영세율
			rx.add(record2, "mc_amt_01", rec1.mc_amt_02);//매출세액_영세_과세표준
			rx.add(record2, "mc_vat_01", rec1.mc_vat_02);//매출세액_영세_세액
			rx.add(record2, "erplace_mi_gubun", "의제등"); //매입세액_의제등
			rx.add(record2, "mi_amt_01", rec1.mi_amt_02);//매입의제_과세표준
			rx.add(record2, "mi_vat_01", rec1.mi_vat_02);//매입의제_세액
			rx.add(record2, "me_vat_01", rec1.me_vat_01);//가산세
			rx.add(record2, "me_vat_02", rec1.me_vat_02);//공제세액
			rx.add(record2, "me_vat_03", rec1.me_vat_03);//납부(환급)세액    
			rx.add(record2, "mt_amt_01", rec1.mt_amt_01);//내부거래(판매목적)반출액
			rx.add(record2, "mt_amt_02", rec1.mt_amt_02);//내부거래(판매목적)반입액	
			
			mc_amt1_sum = mc_amt1_sum + Long.parseLong(rec1.mc_amt_01); //매출세액 과세 합계
			mc_vat1_sum = mc_vat1_sum + Long.parseLong(rec1.mc_vat_01); //매출세액 세액 합계
			mc_amt2_sum = mc_amt2_sum + Long.parseLong(rec1.mc_amt_02); //매출세액 영세율 합계
			mc_vat2_sum = mc_vat2_sum + Long.parseLong(rec1.mc_vat_02); //매출세액 영세율 세액 합계
			mi_amt1_sum = mi_amt1_sum + Long.parseLong(rec1.mi_amt_01); //매입세액 과세 합계
			mi_vat1_sum = mi_vat1_sum + Long.parseLong(rec1.mi_vat_01); //매입세액 세액 합계
			mi_amt2_sum = mi_amt2_sum + Long.parseLong(rec1.mi_amt_02); //매입세액 의제등 과세 합계
			mi_vat2_sum = mi_vat2_sum + Long.parseLong(rec1.mi_vat_02); //매입세액 의제등 합계
			
		}
		rx.add(recordSet, "totalcnt", ds.cur_redmasetacqrptcr_list_1.size());
		/****** CUR_REDMASETACQRPTCR_LIST_1 END */
		resform = rx.add(dataSet, "resform", "");
		rx.add(resform, "mc_amt1_sum", mc_amt1_sum);
		rx.add(resform, "mc_vat1_sum", mc_vat1_sum);
		rx.add(resform, "mc_amt2_sum", mc_amt2_sum);
		rx.add(resform, "mc_vat2_sum", mc_vat2_sum);
		rx.add(resform, "mi_amt1_sum", mi_amt1_sum);
		rx.add(resform, "mi_vat1_sum", mi_vat1_sum);
		rx.add(resform, "mi_amt2_sum", mi_amt2_sum);
		rx.add(resform, "mi_vat2_sum", mi_vat2_sum);
		rx.add(recordSet, "totalcnt", ds.cur_redmasetacqrptcr_list_1.size());		

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
<fc_acct_6291_s>
	<dataSet>
		<CUR_REDMASETACQRPTCR_LIST_1>
			<record>
				<ern/>
				<erplace_addr/>
				<mc_amt_01/>
				<mc_vat_01/>
				<mc_amt_02/>
				<mc_vat_02/>
				<mi_amt_01/>
				<mi_vat_01/>
				<mi_amt_02/>
				<mi_vat_02/>
				<me_vat_01/>
				<me_vat_02/>
				<me_vat_03/>
				<mt_amt_01/>
				<mt_amt_02/>
			</record>
		</CUR_REDMASETACQRPTCR_LIST_1>
	</dataSet>
</fc_acct_6291_s>
*/
%>

<% /* 작성시간 : Mon Jun 30 19:38:33 KST 2014 */ %>