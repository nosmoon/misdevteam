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
	FC_ACCT_8080_MDataSet ds = (FC_ACCT_8080_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int comboSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	comboSet = rx.add(root, "comboSet", "");
	dataSet = rx.add(root, "dataSet", "");
	
	rx.add(comboSet, "xx_acct_cd", ds.xx_acct_cd);
	rx.add(comboSet, "xx_c_sdgb_1", ds.xx_c_sdgb_1);
	rx.add(comboSet, "xx_c_sdgb_2", ds.xx_c_sdgb_2);
	rx.add(comboSet, "xx_c_sdgb_3", ds.xx_c_sdgb_3);
	rx.add(comboSet, "xx_c_sdgb_4", ds.xx_c_sdgb_4);
	rx.add(comboSet, "xx_buff_1", ds.xx_buff_1);
	rx.add(comboSet, "xx_buff_2", ds.xx_buff_2);
	rx.add(comboSet, "xx_buff_3", ds.xx_buff_3);

	try {
				/****** ERPLACE_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "ERPLACE_CD_CURLIST", "");

		for(int i = 0; i < ds.erplace_cd_curlist.size(); i++) {
			FC_ACCT_8080_MERPLACE_CD_CURLISTRecord rec = (FC_ACCT_8080_MERPLACE_CD_CURLISTRecord)ds.erplace_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.erplace_cd_curlist.size());
		
		/****** ERPLACE_CD_CURLIST END */

			/****** ERPLACE_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "XX_BUFF_3_CURLIST", "");

		for(int i = 0; i < ds.xx_buff_3_curlist.size(); i++) {
			FC_ACCT_8080_MXX_BUFF_3_CURLISTRecord rec = (FC_ACCT_8080_MXX_BUFF_3_CURLISTRecord)ds.xx_buff_3_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "ern", rec.ern);
			rx.add(record, "erplace_cd", rec.erplace_cd);
		}
		rx.add(recordSet, "totalcnt", ds.xx_buff_3_curlist.size());
		
		/****** ERPLACE_CD_CURLIST END */		
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

<% /* 작성시간 : Tue Feb 28 15:14:22 KST 2012 */ %>