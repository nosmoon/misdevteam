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
	IS_SND_1230_LDataSet ds = (IS_SND_1230_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData3 = rx.add(root, "", "");

	try {
		/****** CURLIST BEGIN */
		System.out.println("ds.curlist.size():"+ds.curlist.size());
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_SND_1230_LCURLISTRecord rec = (IS_SND_1230_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");
			rx.add(record, "checked", "N");
			rx.add(record, "cmpy_cd", rec.cmpy_cd);
			rx.add(record, "advcs_cd", rec.advcs_cd);
			rx.addCData(record, "advcs_cd_nm", rec.advcs_cd_nm);
			rx.addCData(record, "advt_nm", rec.advt_nm);
			rx.add(record, "std_cd", rec.std_cd);
			rx.add(record, "std_cd_nm", rec.std_cd_nm);
			rx.add(record, "bnch_qty", rec.bnch_qty);
			rx.add(record, "acwr_reg_dt", rec.acwr_reg_dt);
			rx.add(record, "acwr_reg_seq", rec.acwr_reg_seq);
			rx.add(record, "acwr_reg_dt_seq", rec.acwr_reg_dt+"-"+rec.acwr_reg_seq); /**½Â³«¼­¹øÈ£**/			
			rx.add(record, "cmpy_cd_nm", rec.cmpy_cd_nm);
			
			
		}
		/****** CURLIST END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
