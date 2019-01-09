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
	
	long mc_amt1_sum = 0; //���⼼��_����_����ǥ�� �հ�
	long mc_vat1_sum = 0; //���⼼��_����_���� �հ�
	long mc_amt2_sum = 0; //���⼼��_����_����ǥ�� �հ�
	long mc_vat2_sum = 0; //���⼼��_����_���� �հ�
	long mi_amt1_sum = 0; //���Լ���_����_����ǥ�� �հ�
	long mi_vat1_sum = 0; //���Լ���_����_���� �հ�
	long mi_amt2_sum = 0; //���Լ���_����_����ǥ��
	long mi_vat2_sum = 0; //���Լ���_����_����
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "output_Data", "");

	try {
		/****** CUR_REDMASETACQRPTCR_LIST_1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.cur_redmasetacqrptcr_list_1.size(); i++) {
			FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record rec1 = (FC_ACCT_6291_SCUR_REDMASETACQRPTCR_LIST_1Record)ds.cur_redmasetacqrptcr_list_1.get(i);
			int record1 = rx.add(recordSet, "record", "");
			rx.add(record1, "ern", rec1.ern); //����ڵ�Ϲ�ȣ
			rx.add(record1, "erplace_addr", rec1.erplace_addr); //������ּ�
			rx.add(record1, "erplace_mc_gubun", "����"); //���⼼��_����_����
			rx.add(record1, "mc_amt_01", rec1.mc_amt_01);//���⼼��_����_����ǥ��
			rx.add(record1, "mc_vat_01", rec1.mc_vat_01);//���⼼��_����_����
			rx.add(record1, "erplace_mi_gubun", "����"); //���Լ���_����_����
			rx.add(record1, "mi_amt_01", rec1.mi_amt_01);//���Լ���_����_����ǥ��
			rx.add(record1, "mi_vat_01", rec1.mi_vat_01);//���Լ���_����_����
			rx.add(record1, "me_vat_01", rec1.me_vat_01);//���꼼
			rx.add(record1, "me_vat_02", rec1.me_vat_02);//��������
			rx.add(record1, "me_vat_03", rec1.me_vat_03);//����(ȯ��)����    
			rx.add(record1, "mt_amt_01", rec1.mt_amt_01);//���ΰŷ�(�ǸŸ���)�����
			rx.add(record1, "mt_amt_02", rec1.mt_amt_02);//���ΰŷ�(�ǸŸ���)���Ծ�

			int record2 = rx.add(recordSet, "record", "");
			rx.add(record2, "ern", rec1.ern); //����ڵ�Ϲ�ȣ
			rx.add(record2, "erplace_addr", rec1.erplace_addr); //������ּ�
			rx.add(record2, "erplace_mc_gubun", "������"); //���⼼��_������
			rx.add(record2, "mc_amt_01", rec1.mc_amt_02);//���⼼��_����_����ǥ��
			rx.add(record2, "mc_vat_01", rec1.mc_vat_02);//���⼼��_����_����
			rx.add(record2, "erplace_mi_gubun", "������"); //���Լ���_������
			rx.add(record2, "mi_amt_01", rec1.mi_amt_02);//��������_����ǥ��
			rx.add(record2, "mi_vat_01", rec1.mi_vat_02);//��������_����
			rx.add(record2, "me_vat_01", rec1.me_vat_01);//���꼼
			rx.add(record2, "me_vat_02", rec1.me_vat_02);//��������
			rx.add(record2, "me_vat_03", rec1.me_vat_03);//����(ȯ��)����    
			rx.add(record2, "mt_amt_01", rec1.mt_amt_01);//���ΰŷ�(�ǸŸ���)�����
			rx.add(record2, "mt_amt_02", rec1.mt_amt_02);//���ΰŷ�(�ǸŸ���)���Ծ�	
			
			mc_amt1_sum = mc_amt1_sum + Long.parseLong(rec1.mc_amt_01); //���⼼�� ���� �հ�
			mc_vat1_sum = mc_vat1_sum + Long.parseLong(rec1.mc_vat_01); //���⼼�� ���� �հ�
			mc_amt2_sum = mc_amt2_sum + Long.parseLong(rec1.mc_amt_02); //���⼼�� ������ �հ�
			mc_vat2_sum = mc_vat2_sum + Long.parseLong(rec1.mc_vat_02); //���⼼�� ������ ���� �հ�
			mi_amt1_sum = mi_amt1_sum + Long.parseLong(rec1.mi_amt_01); //���Լ��� ���� �հ�
			mi_vat1_sum = mi_vat1_sum + Long.parseLong(rec1.mi_vat_01); //���Լ��� ���� �հ�
			mi_amt2_sum = mi_amt2_sum + Long.parseLong(rec1.mi_amt_02); //���Լ��� ������ ���� �հ�
			mi_vat2_sum = mi_vat2_sum + Long.parseLong(rec1.mi_vat_02); //���Լ��� ������ �հ�
			
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
TrustForm�� Instance ����ο� �����ؼ� ���
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

<% /* �ۼ��ð� : Mon Jun 30 19:38:33 KST 2014 */ %>