<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.semuro.rec.*
	,	chosun.ciis.co.semuro.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SEMURO_1500_LDataSet ds = (CO_SEMURO_1500_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int gridSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "formData", "");
		CO_SEMURO_1500_LCURLISTRecord rec = (CO_SEMURO_1500_LCURLISTRecord)ds.curlist.get(0);

		//rx.add(recordSet, "fac_clsf_cd", "");
		//rx.add(recordSet, "ewh_dt", "");
		//rx.add(recordSet, "ewh_seq", "");
		rx.add(recordSet, "incmg_slip_dt", rec.issu_dt); //��������
		rx.add(recordSet, "ern", rec.send_pers_eps_no);      // ����� ��� ��ȣ
		rx.add(recordSet, "dlco_cd", rec.send_firm_custcd);;
		rx.add(recordSet, "dlco_nm", rec.send_pers_firmnm);  //����� ��Ī
		//rx.add(recordSet, "dlco_clsf_cd", "");    // �ŷ�ó ���� �ڵ�
		rx.add(recordSet, "tot_suply_amt", rec.tot_suply_amt); //�Ѱ��ް���
		rx.add(recordSet, "suply_amt", rec.tot_amt); //���ް���
		rx.add(recordSet, "vat_amt", rec.tot_tax_amt);    // �ΰ���
		//rx.add(recordSet, "purc_clsf", ""); // ���Ա���
		//rx.add(recordSet, "prof_type_cd", "");
		//rx.add(recordSet, "impt_yy", "");
		//rx.add(recordSet, "impt_seq", "");
		//rx.add(recordSet, "leas_clsf", "");
		//rx.add(recordSet, "make_dt",  "");
		//rx.add(recordSet, "rcpt_prof_clsf", "");     //������ ���� ����
		//rx.add(recordSet, "slip_no", "");  //��ǥ ��ȣ

		//rx.add(record, "send_pers_presi_flnm", rec.send_pers_presi_flnm); ��ǥ�� ����
		//rx.add(record, "send_pers_addr", rec.send_pers_addr);
		//rx.add(record, "send_pers_bizcond", rec.send_pers_bizcond);
		//rx.add(record, "send_pers_indt", rec.send_pers_indt);
		//rx.add(record, "send_pers_email", rec.send_pers_email);
		//rx.add(record, "tax_stmt_clsf", rec.tax_stmt_clsf);
		//rx.add(record, "rmsg_pers_semuro_id", rec.rmsg_pers_semuro_id); // ������ ������ ���̵�
		//rx.add(record, "send_pers_id", rec.send_pers_id); // �۽��� ������ ���̵�
		//rx.add(record, "cash", rec.cash);   ����
		//rx.add(record, "note", rec.note); ����
		//rx.add(record, "chqe", rec.chqe); ��ǥ
		//rx.add(record, "trust_unrcp_amt", rec.trust_unrcp_amt); �ܻ�̼���
		//rx.add(record, "rcpt_clam_yn", rec.rcpt_clam_yn); ���� û�� ����
		//rx.add(record, "stat_clsf", rec.stat_clsf);   ���� ����
	    //rx.add(record, "stat_clsf_dt_tm", rec.stat_clsf_dt_tm); ���� ���� ����

		gridSet = rx.add(dataSet, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_SEMURO_1500_LCURLISTRecord recgrid = (CO_SEMURO_1500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridSet, "record", "");

			//rx.add(record, "item_dt", recgrid.item_dt);
			rx.add(record, "sub_seq", recgrid.subseq);
			rx.add(record, "matr_cd", recgrid.matr_cd);
			rx.add(record, "matr_nm", recgrid.matr_nm);
			rx.add(record, "ewh_qunt", recgrid.qunt); //����
			rx.add(record, "ewh_amt", recgrid.item_suply_amt);
			rx.add(record, "ewh_vat", recgrid.item_tax_amt);
			rx.add(record, "purc_uprc", recgrid.uprc); //�ܰ�
			rx.add(record, "ewh_unit",recgrid.unit);
			rx.add(record, "ewh_budg_cd", recgrid.ewh_budg_cd);
 			rx.add(record, "owh_budg_cd", recgrid.owh_budg_cd);
 			rx.add(record, "medi_cd", "");
 			rx.add(record, "remk", "");
 			rx.add(record, "owh_yn", "");
 			rx.add(record, "usedept", "");
 			rx.add(record, "usedeptnm", "");
 			rx.add(record, "ewh_acct_cd", "");
 			rx.add(record, "owh_seq", "");
 			rx.add(record, "owh_sub_seq", "");
 			rx.add(record, "owh_no", "");
 			rx.add(record, "mc_flag", "");
 			rx.add(record, "bo_item_yn", "");
 			rx.add(record, "medi_ser_no", "");
 			rx.add(record, "purc_clsf", "");
 			rx.add(record, "dstb_rat_cd", recgrid.dstb_rat_cd);

		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<dataSet>
	<CURLIST>
		<record>
			<cmpy_cd/>
			<occr_dt/>
			<seq/>
			<semuro_no/>
			<tax_stmt_clsf/>
			<rmsg_pers_semuro_id/>
			<send_pers_id/>
			<send_pers_eps_no/>
			<send_pers_presi_flnm/>
			<send_pers_firmnm/>
			<send_pers_addr/>
			<send_pers_bizcond/>
			<send_pers_indt/>
			<send_pers_email/>
			<issu_dt/>
			<tot_suply_amt/>
			<tot_amt/>
			<tot_tax_amt/>
			<cash/>
			<note/>
			<chqe/>
			<trust_unrcp_amt/>
			<rcpt_clam_yn/>
			<stat_clsf/>
			<stat_clsf_dt_tm/>
			<subseq/>
			<item_dt/>
			<std/>
			<qunt/>
			<uprc/>
			<item_suply_amt/>
			<item_tax_amt/>
			<matr_cd/>
			<matr_nm/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Mar 05 20:26:29 KST 2009 */ %>