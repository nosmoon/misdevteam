<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.co.bank.rec.*
                ,chosun.ciis.co.bank.ds.*
                ,chosun.ciis.co.base.util.*
                ,somo.framework.util.* " %>

<%
	CO_BANK_1010_LDataSet ds = (CO_BANK_1010_LDataSet)request.getAttribute("ds");
	
	RwXml rx = new RwXml();         // XML °´Ã¼ »ý¼º 
	
	int root     = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {  
		String current_clsf = "D";
		for(int i = 0; i < ds.curlist.size(); i++) {
			CO_BANK_1010_LCURLISTRecord rec = (CO_BANK_1010_LCURLISTRecord)ds.curlist.get(i);
			current_clsf = rec.current_clsf;
			break;
		}
		
		rx.add(gridData, "current_clsf", current_clsf);		  
		
		if("D".equals(current_clsf)){

			for(int i = 0; i < ds.curlist.size(); i++) {
				CO_BANK_1010_LCURLISTRecord rec = (CO_BANK_1010_LCURLISTRecord)ds.curlist.get(i);
	
				int record = rx.add(gridData, "record1", "");  
				rx.add(record, "bank_name", rec.bank_name);			  
				rx.add(record, "tran_date", rec.tran_date);  
				rx.add(record, "tran_amt", rec.tran_amt);
				rx.add(record, "extnc_amt", rec.tran_remain);
				//rx.add(record, "remain_amt", StringUtil.toNumber(rec.tran_amt) - StringUtil.toNumber(rec.tran_remain));
				rx.add(record, "remain_amt", StringUtil.toLong(rec.tran_amt) - StringUtil.toLong(rec.tran_remain));				
				rx.addCData(record, "tran_content", rec.tran_content);
				rx.addCData(record, "cms_code", rec.cms_code); 
				rx.add(record, "tran_branch", rec.tran_branch); 
				rx.add(record, "acct_tonghwa", rec.acct_tonghwa);   
				rx.add(record, "biz_reg_no", rec.biz_reg_no);  
				rx.add(record, "bank_id", rec.bank_id);
				rx.add(record, "acct_num", rec.acct_num);
				rx.add(record, "tran_date_seq",  rec.tran_date_seq);
				rx.add(record, "current_clsf",  rec.current_clsf);
				rx.addCData(record, "remark",  rec.remark);				
				  
			}
		}else if("F".equals(current_clsf)){

			for(int i = 0; i < ds.curlist.size(); i++) {
				CO_BANK_1010_LCURLISTRecord rec = (CO_BANK_1010_LCURLISTRecord)ds.curlist.get(i);
	
				int record = rx.add(gridData, "record2", "");  
				rx.add(record, "bank_name", rec.bank_name);			  
				rx.add(record, "tran_date", rec.tran_date);  
				rx.add(record, "tran_amt", rec.tran_amt);
				rx.add(record, "extnc_amt", rec.tran_remain);
				
				double remain_amt = StringUtil.toDouble(rec.tran_amt)- StringUtil.toDouble(rec.tran_remain);
				
				rx.add(record, "remain_amt", remain_amt);
				rx.addCData(record, "tran_content", rec.tran_content);
				rx.add(record, "cms_code", rec.cms_code); 
				rx.add(record, "tran_branch", rec.tran_branch); 
				rx.add(record, "acct_tonghwa", rec.acct_tonghwa);  
				rx.add(record, "biz_reg_no", rec.biz_reg_no);  
				rx.add(record, "bank_id", rec.bank_id);
				rx.add(record, "acct_num", rec.acct_num);
				rx.add(record, "tran_date_seq",  rec.tran_date_seq);
				rx.add(record, "current_clsf",  rec.current_clsf);
				rx.addCData(record, "remark",  rec.remark);
				  
			}		
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
