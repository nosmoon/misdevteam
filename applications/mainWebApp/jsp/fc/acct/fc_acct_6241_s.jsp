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
			rx.add(record, "seq", rec.seq);  //�Ϸù�ȣ
			rx.add(record, "vat_aset_clsf", rec.vat_aset_clsf); //�ΰ����ڻ걸��
			rx.add(record, "acqr_dt", rec.acqr_dt);  //�������
			rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd); //���հŷ�ó�ڵ�
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd); //�ŷ�ó�����ڵ�
			rx.add(record, "dlco_cd", rec.dlco_cd); //�ŷ�ó�ڵ�
			rx.addCData(record, "dlco_nm", rec.dlco_nm); //�ŷ�ó��
			rx.add(record, "ern", rec.ern); //����ڵ�Ϲ�ȣ
			rx.addCData(record, "item", rec.item); //ǰ��
			rx.add(record, "suply_amt", rec.suply_amt); //���ް���
			rx.add(record, "vat_amt", rec.vat_amt); //�ΰ�����
			rx.add(record, "qunt", rec.qunt); //����
		}
		rx.add(recordSet, "totalcnt", ds.cur_redmasetacqrptcr_list_1.size());
		/****** CUR_REDMASETACQRPTCR_LIST_1 END */
		resform = rx.add(dataSet, "resform", "");
			rx.add(resform, "erplace_cd", ds.erplace_cd);  //������ڵ�
			rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm); //���ۿ�
			rx.add(resform, "vat_to_yymm", ds.vat_to_yymm); //�����
			rx.add(resform, "qunt_s", ds.qunt_s); //���� �հ�
			rx.add(resform, "suply_amt_s", ds.suply_amt_s); //���ް���
			rx.add(resform, "vat_amt_s", ds.vat_amt_s); //�ΰ�����
			rx.add(resform, "qunt_1", ds.qunt_1); //����      �ǹ�_���๰   
			rx.add(resform, "suply_amt_1", ds.suply_amt_1); //���ް���
			rx.add(resform, "vat_amt_1", ds.vat_amt_1); //�ΰ�����
			rx.add(resform, "qunt_2", ds.qunt_2); //����      �����ġ
			rx.add(resform, "suply_amt_2", ds.suply_amt_2); //���ް���
			rx.add(resform, "vat_amt_2", ds.vat_amt_2); //�ΰ�����
			rx.add(resform, "qunt_3", ds.qunt_3); //����      ������ݱ�     
			rx.add(resform, "suply_amt_3", ds.suply_amt_3); //���ް���
			rx.add(resform, "vat_amt_3", ds.vat_amt_3); //�ΰ�����
			rx.add(resform, "qunt_4", ds.qunt_4); //����      ��Ÿ������
			rx.add(resform, "suply_amt_4", ds.suply_amt_4); //���ް���
			rx.add(resform, "vat_amt_4", ds.vat_amt_4); //�ΰ�����
			System.out.println("��ȣ�� fc_acct_6241_s.jsp ���� success");
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

<% /* �ۼ��ð� : Mon Jun 23 14:04:34 KST 2014 */ %>