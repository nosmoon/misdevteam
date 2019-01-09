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
		rx.add(resform, "erplace_cd", ds.erplace_cd); //������ڵ�
		rx.add(resform, "vat_fr_yymm", ds.vat_fr_yymm); //�ΰ���������
		rx.add(resform, "vat_to_yymm", ds.vat_to_yymm); //�ΰ���������
		rx.add(resform, "ernm_tax", ds.ernm_tax); //��ȣ
		rx.add(resform, "ern", ds.ern); //����ڵ�Ϲ�ȣ
		rx.add(resform, "presi_nm", ds.presi_nm); //��ǥ�ڸ�
		rx.add(resform, "comn_purc_suply_amt", ds.comn_purc_suply_amt); //������԰��ް���     3.�����Ű�
		rx.add(resform, "comn_purc_vat_amt", ds.comn_purc_vat_amt); //������Լ���         3.�����Ű�  
		rx.add(resform, "suply_amt_etc", ds.suply_amt_etc); //���ް��׵�           3.�����Ű� 
		rx.add(resform, "rtax_suply_amt_etc", ds.rtax_suply_amt_etc); //�鼼���ް��׵�       3.�����Ű�
		rx.add(resform, "rtax_enpr_ratio", ds.rtax_enpr_ratio); //�鼼�������         3.�����Ű� -���ǻ���
		//System.out.println("6251jsp ���� rtax_enpr_ratio =>"+ds.rtax_enpr_ratio);
		rx.add(resform, "non_dduc_purc_vat_amt", ds.non_dduc_purc_vat_amt); //�Ұ������Լ���       3.�����Ű�
		rx.add(resform, "calc_aft_suply_amt", ds.calc_aft_suply_amt); //�Ⱥ��İ��ް���       3.�����Ű� -���ǻ���
		rx.add(resform, "tot_comn_purc_vat_amt", ds.tot_comn_purc_vat_amt); //�Ѱ�����Լ���       4.Ȯ���Ű�
		rx.add(resform, "tot_suply_amt_etc", ds.tot_suply_amt_etc); //�Ѱ��ް��׵�         4.Ȯ���Ű� -���ǻ���
		rx.add(resform, "tot_rtax_suply_amt_etc", ds.tot_rtax_suply_amt_etc); //�Ѹ鼼���ް��׵�     4.Ȯ���Ű� -���ǻ���
		rx.add(resform, "rtax_enpr_fix_ratio", ds.rtax_enpr_fix_ratio); //�鼼���Ȯ������     4.Ȯ���Ű� 
		rx.add(resform, "tot_non_dduc_purc_vat_amt", ds.tot_non_dduc_purc_vat_amt); //�ѺҰ������Լ���     4.Ȯ���Ű� 
		rx.add(resform, "pre_non_dduc_purc_vat_amt", ds.pre_non_dduc_purc_vat_amt); //��Ұ������Լ���     4.Ȯ���Ű�
		rx.add(resform, "add_non_dduc_purc_vat_amt", ds.add_non_dduc_purc_vat_amt); //����������Լ���     4.Ȯ���Ű�   
		rx.add(resform, "tot_calc_aft_suply_amt", ds.tot_calc_aft_suply_amt); //�ѾȺ��İ��ް���     4.Ȯ���Ű� -���ǻ���
		rx.add(resform, "gds_purc_vat_amt", ds.gds_purc_vat_amt); //��ȭ���Լ���         5.����
		rx.add(resform, "ck_rate", ds.ck_rate); //ü����               5.���� - ���ǻ���     
		rx.add(resform, "txn_prd_cnt", ds.txn_prd_cnt); //�����Ⱓ��           5.���� - ���ǻ���
		rx.add(resform, "redu_ratio_pymt_re_calc", ds.redu_ratio_pymt_re_calc); //�氨��_��������    5.����
		rx.add(resform, "incr_redu_rtax_enpr_ratio", ds.incr_redu_rtax_enpr_ratio); //�������Ҹ鼼����     5.����
		rx.add(resform, "adjm_add_non_dduc_purc_vat", ds.adjm_add_non_dduc_purc_vat); //���갡��������Լ��� 5.����
		rx.add(resform, "adjm_calc_aft_suply_amt", ds.adjm_calc_aft_suply_amt); //�������İ��ް���   5.���� - ���ǻ��� 
		rx.add(resform, "data_cnt", ds.data_cnt); //��ȸ��� cnt
		rx.add(resform, "tot_suply_amt", ds.tot_suply_amt); //�Ѱ�(���ް���)
		rx.add(resform, "tot_vat_amt", ds.tot_vat_amt); //�Ѱ�(����)
		rx.add(resform, "ptcr_suply_amt", ds.ptcr_suply_amt); //������������ ���Լ��� �Ѱ�(���ް���)
		rx.add(resform, "ptcr_vat_amt", ds.ptcr_vat_amt); //������������ ���Լ��� �Ѱ�(��)
		
		//System.out.println("��ȣ�� fc_acct_6251_s.jsp ���� success");
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

<% /* �ۼ��ð� : Tue Jun 17 19:37:04 KST 2014 */ %>