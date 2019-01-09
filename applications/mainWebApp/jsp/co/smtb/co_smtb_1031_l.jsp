<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.smtb.rec.*
	,	chosun.ciis.co.smtb.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	CO_SMTB_1031_LDataSet ds = (CO_SMTB_1031_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** TAX_STMTLIST BEGIN */
		recordSet = rx.add(dataSet, "TAX_STMTLIST", "");

		for(int i = 0; i < ds.tax_stmtlist.size(); i++) {
			CO_SMTB_1031_LTAX_STMTLISTRecord rec = (CO_SMTB_1031_LTAX_STMTLISTRecord)ds.tax_stmtlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "conversation_id", rec.conversation_id);
			rx.addCData(record, "supbuy_type", rec.supbuy_type);
			rx.addCData(record, "direction", rec.direction);
			rx.addCData(record, "dti_wdate", rec.dti_wdate);
			rx.addCData(record, "blank_cnt", rec.blank_cnt);
			rx.addCData(record, "dti_type", rec.dti_type);
			rx.addCData(record, "tax_demand", rec.tax_demand);
			rx.addCData(record, "seq_id", rec.seq_id);
			rx.addCData(record, "sup_com_id", rec.sup_com_id);
			rx.addCData(record, "sup_com_regno", rec.sup_com_regno);
			rx.addCData(record, "sup_rep_name", rec.sup_rep_name);
			rx.addCData(record, "sup_com_name", rec.sup_com_name);
			rx.addCData(record, "sup_com_type", rec.sup_com_type);
			rx.addCData(record, "sup_com_classify", rec.sup_com_classify);
			rx.addCData(record, "sup_com_addr", rec.sup_com_addr);
			rx.addCData(record, "sup_bizplace_code", rec.sup_bizplace_code);
			rx.addCData(record, "byr_com_regno", rec.byr_com_regno);
			rx.addCData(record, "byr_rep_name", rec.byr_rep_name);
			rx.addCData(record, "byr_com_name", rec.byr_com_name);
			rx.addCData(record, "byr_com_type", rec.byr_com_type);
			rx.addCData(record, "byr_com_classify", rec.byr_com_classify);
			rx.addCData(record, "byr_com_addr", rec.byr_com_addr);
			rx.addCData(record, "byr_tel_num", rec.byr_tel_num);
			rx.addCData(record, "byr_email", rec.byr_email);
			rx.addCData(record, "sup_amount", rec.sup_amount);
			rx.addCData(record, "tax_amount", rec.tax_amount);
			rx.addCData(record, "total_amount", rec.total_amount);
			rx.addCData(record, "dtt_yn", rec.dtt_yn);
			rx.addCData(record, "remark", rec.remark);
			rx.addCData(record, "dti_status", rec.dti_status);
			rx.addCData(record, "dti_status_nm", rec.dti_status_nm);
			rx.addCData(record, "return_code", rec.return_code);
			rx.addCData(record, "return_description", rec.return_description);
			rx.addCData(record, "sbdescription", rec.sbdescription);
			rx.addCData(record, "created_by", rec.created_by);
			rx.addCData(record, "creation_date", rec.creation_date);
			rx.addCData(record, "last_updated_by", rec.last_updated_by);
			rx.addCData(record, "last_update_date", rec.last_update_date);
			//rx.add(record, "conversation_id", StringUtil.replaceToXml(rec.conversation_id));
			//rx.add(record, "supbuy_type", StringUtil.replaceToXml(rec.supbuy_type));
			//rx.add(record, "direction", StringUtil.replaceToXml(rec.direction));
			//rx.add(record, "dti_wdate", StringUtil.replaceToXml(rec.dti_wdate));
			//rx.add(record, "blank_cnt", StringUtil.replaceToXml(rec.blank_cnt));
			//rx.add(record, "dti_type", StringUtil.replaceToXml(rec.dti_type));
			//rx.add(record, "tax_demand", StringUtil.replaceToXml(rec.tax_demand));
			//rx.add(record, "seq_id", StringUtil.replaceToXml(rec.seq_id));
			//rx.add(record, "sup_com_id", StringUtil.replaceToXml(rec.sup_com_id));
			//rx.add(record, "sup_com_regno", StringUtil.replaceToXml(rec.sup_com_regno));
			//rx.add(record, "sup_rep_name", StringUtil.replaceToXml(rec.sup_rep_name));
			//rx.add(record, "sup_com_name", StringUtil.replaceToXml(rec.sup_com_name));
			//rx.add(record, "sup_com_type", StringUtil.replaceToXml(rec.sup_com_type));
			//rx.add(record, "sup_com_classify", StringUtil.replaceToXml(rec.sup_com_classify));
			//rx.add(record, "sup_com_addr", StringUtil.replaceToXml(rec.sup_com_addr));
			//rx.add(record, "sup_bizplace_code", StringUtil.replaceToXml(rec.sup_bizplace_code));
			//rx.add(record, "byr_com_regno", StringUtil.replaceToXml(rec.byr_com_regno));
			//rx.add(record, "byr_rep_name", StringUtil.replaceToXml(rec.byr_rep_name));
			//rx.add(record, "byr_com_name", StringUtil.replaceToXml(rec.byr_com_name));
			//rx.add(record, "byr_com_type", StringUtil.replaceToXml(rec.byr_com_type));
			//rx.add(record, "byr_com_classify", StringUtil.replaceToXml(rec.byr_com_classify));
			//rx.add(record, "byr_com_addr", StringUtil.replaceToXml(rec.byr_com_addr));
			//rx.add(record, "byr_tel_num", StringUtil.replaceToXml(rec.byr_tel_num));
			//rx.add(record, "byr_email", StringUtil.replaceToXml(rec.byr_email));
			//rx.add(record, "sup_amount", StringUtil.replaceToXml(rec.sup_amount));
			//rx.add(record, "tax_amount", StringUtil.replaceToXml(rec.tax_amount));
			//rx.add(record, "total_amount", StringUtil.replaceToXml(rec.total_amount));
			//rx.add(record, "dtt_yn", StringUtil.replaceToXml(rec.dtt_yn));
			//rx.add(record, "remark", StringUtil.replaceToXml(rec.remark));
			//rx.add(record, "dti_status", StringUtil.replaceToXml(rec.dti_status));
			//rx.add(record, "dti_status_nm", StringUtil.replaceToXml(rec.dti_status_nm));
			//rx.add(record, "return_code", StringUtil.replaceToXml(rec.return_code));
			//rx.add(record, "return_description", StringUtil.replaceToXml(rec.return_description));
			//rx.add(record, "sbdescription", StringUtil.replaceToXml(rec.sbdescription));
			//rx.add(record, "created_by", StringUtil.replaceToXml(rec.created_by));
			//rx.add(record, "creation_date", StringUtil.replaceToXml(rec.creation_date));
			//rx.add(record, "last_updated_by", StringUtil.replaceToXml(rec.last_updated_by));
			//rx.add(record, "last_update_date", StringUtil.replaceToXml(rec.last_update_date));
		}
		rx.add(recordSet, "totalcnt", ds.tax_stmtlist.size());
		/****** TAX_STMTLIST END */

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
<co_smtb_1031_l>
	<dataSet>
		<TAX_STMTLIST>
			<record>
				<conversation_id/>
				<supbuy_type/>
				<direction/>
				<dti_wdate/>
				<blank_cnt/>
				<dti_type/>
				<tax_demand/>
				<seq_id/>
				<sup_com_id/>
				<sup_com_regno/>
				<sup_rep_name/>
				<sup_com_name/>
				<sup_com_type/>
				<sup_com_classify/>
				<sup_com_addr/>
				<sup_bizplace_code/>
				<byr_com_regno/>
				<byr_rep_name/>
				<byr_com_name/>
				<byr_com_type/>
				<byr_com_classify/>
				<byr_com_addr/>
				<byr_tel_num/>
				<byr_email/>
				<sup_amount/>
				<tax_amount/>
				<total_amount/>
				<dtt_yn/>
				<remark/>
				<dti_status/>
				<dti_status_nm/>
				<return_code/>
				<return_description/>
				<sbdescription/>
				<created_by/>
				<creation_date/>
				<last_updated_by/>
				<last_update_date/>
			</record>
		</TAX_STMTLIST>
	</dataSet>
</co_smtb_1031_l>
*/
%>

<% /* 작성시간 : Fri Mar 19 20:15:13 KST 2010 */ %>