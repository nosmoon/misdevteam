<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1310_LDataSet ds = (IS_DEP_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add( root , "resData" , "");

	try {
		String checked = "";
		int tot_suply_amt = 0;
		int tot_vat_amt = 0;
		int tot_unpaid_amt = 0;
		
		int gridData = rx.add( resData , "gridData" , "");
		for(int i = 0; i<ds.curlist.size(); i++) {
			IS_DEP_1310_LCURLISTRecord rec = (IS_DEP_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			if("6".equals(rec.bddb_proc_clsf) || "8".equals(rec.bddb_proc_clsf)){
				checked = "Y";
			}else{
				checked = "";
			}
			rx.add(record, "checked", checked); 
			
			rx.add(record, "bill_no", rec.bill_no);
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt_seq);
			rx.add(record, "sale_proc_dt", rec.sale_proc_dt);
			rx.addCData(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "suply_amt", rec.suply_amt);
			rx.add(record, "vat_amt", rec.vat_amt);
			rx.add(record, "unpaid_amt", rec.unpaid_amt);
			rx.add(record, "bddb_proc_clsf_nm", rec.bddb_proc_clsf_nm);
			
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "bddb_proc_clsf", rec.bddb_proc_clsf);
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "sale_dlco_li_seq", rec.sale_dlco_li_seq);
			
			
			rx.add(record, "slip_clsf_cd", rec.slip_clsf_cd);
			rx.add(record, "slip_occr_dt", rec.slip_occr_dt);
			rx.add(record, "slip_seq", rec.slip_seq);
			


			/**공급가액, 부가세, 미수액 총금액 연산**/
			tot_suply_amt += StringUtil.toNumber(rec.suply_amt);
			tot_vat_amt += StringUtil.toNumber(rec.vat_amt);
			tot_unpaid_amt += StringUtil.toNumber(rec.unpaid_amt);
		}	
		
		 rx.add( resData , "tot_advt_fee" , tot_suply_amt);
		 rx.add( resData , "tot_vat" , tot_vat_amt);
		 rx.add( resData , "tot_unpaid_amt" , tot_unpaid_amt);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
