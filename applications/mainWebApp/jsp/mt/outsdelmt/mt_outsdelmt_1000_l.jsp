<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.outsdelmt.rec.*
	,	chosun.ciis.mt.outsdelmt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_OUTSDELMT_1000_LDataSet ds = (MT_OUTSDELMT_1000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	recordSet = rx.add(root, "tempData", "");
	try {
		formData = rx.add(recordSet, "outsd_elmt_clsf", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_OUTSDELMT_1000_LCURLIST1Record rec = (MT_OUTSDELMT_1000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdnm_cd);
		}
		
		formData = rx.add(recordSet, "comboSetNode", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_OUTSDELMT_1000_LCURLIST1Record rec = (MT_OUTSDELMT_1000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(formData, "combo", "", "id=\"" + rec.cd + "\"");
			
			for(int ii = 0; ii < ds.curlist2.size(); ii++) {
				MT_OUTSDELMT_1000_LCURLIST2Record rec2 = (MT_OUTSDELMT_1000_LCURLIST2Record)ds.curlist2.get(ii);
				
				if (rec.cd.equalsIgnoreCase(rec2.outsd_elmt_clsf)){
					int record2 = rx.add(record, "item", "");
					rx.add(record2, "value", rec2.cd);
					rx.add(record2, "label", rec2.cdnm_cd);
					rx.add(record2, "unit", rec2.unit);
				}
			}
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

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<cdnm_cd/>
			<cdabrvnm_cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Apr 30 20:24:26 KST 2009 */ %>