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
			rx.add(record, "seq", rec.seq);  //�Ϸù�ȣ
			rx.add(record, "flor_cnt", rec.flor_cnt); //�Ѽ�
			rx.add(record, "ser_no", rec.ser_no); //ȣ��
			rx.add(record, "cntr_size", rec.cntr_size); //������
			rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd); //���հŷ�ó�ڵ�
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd); //�ŷ�ó�����ڵ�
			rx.add(record, "dlco_cd", rec.dlco_cd); //�ŷ�ó�ڵ�
			rx.add(record, "hire_firm_nm", rec.hire_firm_nm); //�����λ�ȣ(����)
			rx.add(record, "hire_dlco_ern", rec.hire_dlco_ern); //�����ε�Ϲ�ȣ
			rx.add(record, "leas_fr_dt", rec.leas_fr_dt); //�Ӵ�Ⱓ from
			rx.add(record, "leas_to_dt", rec.leas_to_dt); //�Ӵ�Ⱓ to
			rx.add(record, "cntr_gurt_amt", rec.cntr_gurt_amt); //����������
			rx.add(record, "cntr_leas_amt", rec.cntr_leas_amt); //�����Ӵ��
			rx.add(record, "cntr_mang_amt", rec.cntr_mang_amt); //����������
			rx.add(record, "rent_impt_amt", rec.rent_impt_amt); //�Ӵ����Աݾװ�(����ǥ��)
			rx.add(record, "rent_gurt_amt_int", rec.rent_gurt_amt_int); //�Ӵ�Ẹ��������
			rx.add(record, "rent_mms_rcpm_amt", rec.rent_mms_rcpm_amt); //�Ӵ����Աݾ׿��Ӵ��
			rx.add(record, "mang_rcpm_amt", rec.mang_rcpm_amt); //��������Աݾ�
			rx.add(record, "nwsp_dn_yn", rec.nwsp_dn_yn); //���Ͽ���
			rx.add(record, "leas_dlco_ern", rec.leas_dlco_ern); //�Ӵ��ε�Ϲ�ȣ : ���ϻ����� �����ʿ���
			rx.add(record, "dong", rec.dong); //��
			rx.add(record, "renw_dt", rec.renw_dt); //��������
			
		}
		rx.add(recordSet, "totalcnt", ds.cur_rlesleasptcr_list_1.size());
		/****** CUR_RLESLEASPTCR_LIST_1 END */
		resform = rx.add(dataSet, "resform", "");
		rx.add(resform, "erplace_cd", ds.erplace_cd);
		rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm);
		rx.add(resform, "vat_to_yymm", ds.vat_to_yymm);
		System.out.println("��ȣ�� fc_acct_6221_s.jsp ���� success");

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
TrustForm�� Instance ����ο� �����ؼ� ���
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

<% /* �ۼ��ð� : Sun Jun 22 15:14:06 KST 2014 */ %>