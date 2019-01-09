<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.snd.rec.*
	,	chosun.ciis.is.snd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_SND_1250_LDataSet ds = (IS_SND_1250_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData5 = rx.add(root, "", "");
	
	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_SND_1250_LCURLIST1Record rec = (IS_SND_1250_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData5, "record", "");
			rx.add(record, "send_cmpy_cd", rec.send_cmpy_cd);
			rx.addCData(record, "advcs_cd", rec.advcs_cd);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "std_cd", rec.std_cd);
			rx.addCData(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "scat_dt", rec.scat_dt);
			rx.add(record, "bnch_qty", rec.bnch_qty);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "bnch_qunt", rec.bnch_qunt);
			rx.add(record, "asnt_dstc_cd", rec.asnt_dstc_cd);
			rx.addCData(record, "asnt_dstc_cd_nm", rec.asnt_dstc_cd_nm);
			rx.add(record, "purc_dlco_no", rec.purc_dlco_no);
			rx.addCData(record, "purc_dlco_nm", rec.purc_dlco_nm);
			rx.add(record, "dstc_seqo", rec.dstc_seqo);
			rx.addCData(record, "cmpy_cd_nm", rec.cmpy_cd_nm);
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "sub_dept_cd", rec.sub_dept_cd);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "chrg_pers_nm", rec.chrg_pers_nm);
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "purc_reg_dt", rec.purc_reg_dt);
			rx.add(record, "purc_reg_seq", rec.purc_reg_seq);
			rx.add(record, "group_cnt", rec.group_cnt);
			rx.add(record, "group_order", rec.group_order);
			
			rx.add(record, "wh_cd2", ds.wh_cd);
			rx.add(record, "send_dt", ds.send_dt);			             
			rx.add(record, "send_dt", ds.send_dt);                
			rx.add(record, "send_seq", ds.send_seq);              
			rx.add(record, "send_atic_no", ds.send_atic_no);           
			rx.addCData(record, "send_atic_nm", ds.send_atic_nm);           
			rx.add(record, "sendclsf", ds.sendclsf);               
			rx.add(record, "serv_ref", ds.serv_ref);               
			rx.add(record, "cntc_plac", ds.cntc_plac);              
			rx.add(record, "send_fee", ds.send_fee);               
			rx.add(record, "start_tm", ds.start_tm);               
			rx.add(record, "end_tm", ds.end_tm);                 
			rx.addCData(record, "remk", ds.remk);   
			rx.add(record, "acwr_reg_seq1", rec.acwr_reg_dt+"-"+rec.acwr_reg_seq);
						
			
		}
		/****** CURLIST1 END */
		
		
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
