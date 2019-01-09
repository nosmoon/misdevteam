<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.card.rec.*
	,	chosun.ciis.hd.card.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_CARD_1101_LDataSet ds = (HD_CARD_1101_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String strEncodeImage = "";
	strEncodeImage = ds.getEncodeimage();  
	dataSet = rx.add(root, "tempData", "");
	//String sAAA[] = null;
	

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_CARD_1101_LCURLISTRecord rec = (HD_CARD_1101_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			//sAAA[i] = rec.getEncodeimage();
//			rx.add(record, "img", strEncodeImage, "type=\"xsd:base64Binary\"");;
			rx.add(record, "img", rec.getEncodeimage(), "type=\"xsd:base64Binary\"");
			rx.addCData(record, "nm_korn", rec.nm_korn);
			rx.addCData(record, "posi_nm", rec.posi_nm);
			rx.addCData(record, "tel_no", rec.tel_no);
			rx.addCData(record, "ptph_no", rec.ptph_no);
			rx.addCData(record, "email_id", rec.email_id);
			
			//rx.add(record, "phot", StringUtil.replaceToXml(rec.phot));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "tel_no", StringUtil.replaceToXml(rec.tel_no));
			//rx.add(record, "ptph_no", StringUtil.replaceToXml(rec.ptph_no));
			//rx.add(record, "email_id", StringUtil.replaceToXml(rec.email_id));
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
TrustForm의 Instance 선언부에 복사해서 사용
<hd_card_1101_l>
	<dataSet>
		<CURLIST>
			<record>
				<phot/>
				<nm_korn/>
				<posi_nm/>
				<tel_no/>
				<ptph_no/>
				<email_id/>
			</record>
		</CURLIST>
	</dataSet>
</hd_card_1101_l>
*/
%>

<% /* 작성시간 : Mon Jun 08 16:27:21 KST 2009 */ %>