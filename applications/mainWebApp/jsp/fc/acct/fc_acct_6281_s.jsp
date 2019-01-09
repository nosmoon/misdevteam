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
	FC_ACCT_6281_SDataSet ds = (FC_ACCT_6281_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int resform = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "output_Data", "");

	try {
		/****** CUR_VATDECLSTMT_LIST_1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.cur_vatdeclstmt_list_1.size(); i++) {
			FC_ACCT_6281_SCUR_VATDECLSTMT_LIST_1Record rec = (FC_ACCT_6281_SCUR_VATDECLSTMT_LIST_1Record)ds.cur_vatdeclstmt_list_1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "decl_unit_clsf_cd", rec.decl_unit_clsf_cd); //����ڴ��� ����
			rx.add(record, "erplace_cd", rec.erplace_cd); //�����
			rx.add(record, "ernm_tax", rec.ernm_tax); //������
			rx.add(record, "ern", rec.ern); //������Ϲ�ȣ
			rx.add(record, "clos_yn", rec.clos_yn); //��������
			rx.add(record, "chkGubon_g1", "N");
		}
		
		rx.add(recordSet, "totalcnt", ds.cur_vatdeclstmt_list_1.size());
		/****** CUR_VATDECLSTMT_LIST_1 END */
		resform = rx.add(dataSet, "resform", "");
			rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm); //�ΰ������ۿ�
			rx.add(resform, "vat_to_yymm", ds.vat_to_yymm); //�ΰ��������
			rx.add(resform, "clos_yn", ds.clos_yn);
			System.out.println("��ȣ�� fc_acct_6281_s.jsp ���� success");

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
<fc_acct_6281_s>
	<dataSet>
		<CUR_VATDECLSTMT_LIST_1>
			<record>
				<decl_unit_clsf_cd/>
				<erplace_cd/>
				<ernm_tax/>
				<ern/>
				<clos_yn/>
			</record>
		</CUR_VATDECLSTMT_LIST_1>
	</dataSet>
</fc_acct_6281_s>
*/
%>

<% /* �ۼ��ð� : Mon Jun 23 20:18:13 KST 2014 */ %>