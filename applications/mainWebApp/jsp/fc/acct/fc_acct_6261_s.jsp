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
			rx.add(record, "seq", rec.seq); //�Ϸù�ȣ
			rx.add(record, "acq_dt", rec.acq_dt); //��������
			rx.add(record, "qunt", rec.qunt); //����
			rx.add(record, "suply_amt", rec.suply_amt); //���ް���
			rx.add(record, "vat_amt", rec.vat_amt); //�ΰ�����
			rx.add(record, "intg_dlco_cd", rec.intg_dlco_cd); //���հŷ�ó�ڵ�
			rx.add(record, "dlco_clsf_cd", rec.dlco_clsf_cd); //�ŷ�ó�����ڵ�
			rx.add(record, "dlco_cd", rec.dlco_cd); //�ŷ�ó�ڵ�
			//rx.add(record, "dlco_nm", rec.dlco_nm); //�ŷ�ó��
			rx.addCData(record, "dlco_nm", rec.dlco_nm); //�ŷ�ó��
			rx.add(record, "ern", rec.ern); //����ڵ�Ϲ�ȣ
			rx.add(record, "mang_clsf_cd", rec.mang_clsf_cd); //���������ڵ�
			rx.add(record, "crdt_card_nm", rec.crdt_card_nm); //�ſ�ī���
			rx.add(record, "crdt_card_no", rec.crdt_card_no); //�ſ�ī���ȣ
		}
		rx.add(recordSet, "totalcnt", ds.cur_crdtcardacqptcr_list_1.size());
		/****** CUR_CRDTCARDACQPTCR_LIST_1 END */
		resform = rx.add(dataSet, "resform", "");
		rx.add(resform, "erplace_cd", ds.erplace_cd);
		rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm);
		rx.add(resform, "vat_to_yymm", ds.vat_to_yymm);
		System.out.println("��ȣ�� fc_acct_6261_s.jsp ���� success");

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

<% /* �ۼ��ð� : Tue Jun 17 13:54:08 KST 2014 */ %>