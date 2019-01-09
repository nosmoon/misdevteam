<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.com.rec.*
	,	chosun.ciis.is.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_COM_1201_SDataSet ds = (IS_COM_1201_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	int record		= 0;
	formData = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			IS_COM_1201_SCURLISTRecord rec = (IS_COM_1201_SCURLISTRecord)ds.curlist.get(i);
			record = rx.add(formData, "record", "");
			rx.add(record, "advcs_cd", rec.advcs_cd);
			rx.add(record, "advcs_nm", rec.advcs_nm);
			rx.add(record, "indt_cd", rec.indt_cd);		/**업종코드명_3자리**/			
			rx.add(record, "indt_cd_nm", rec.indt_cd_nm); /**업종명**/
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "sms_ptph_no", rec.sms_ptph_no);
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
