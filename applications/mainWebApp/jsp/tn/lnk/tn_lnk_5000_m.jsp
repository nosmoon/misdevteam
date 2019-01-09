<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.lnk.rec.*
	,	chosun.ciis.tn.lnk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_LNK_5000_MDataSet ds = (TN_LNK_5000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int comboSet = 0;
	int dataSet = 0;
	int recordSet = 0;
	int codeData = 0;
	int uid = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;	
	codeData = rx.add(root, "codeData", "");
	uid      = rx.add(codeData, "uid", (String)request.getAttribute("uid"));
	
	comboSet = rx.add(root, "comboSet", "");	
	dataSet  = rx.add(comboSet, "dataSet", "");
	
	try {
		/****** SUPPORTLIST BEGIN */
		recordSet = rx.add(dataSet, "supportlist", "");

		for(int i = 0; i < ds.supportlist.size(); i++) {
			TN_LNK_5000_MSUPPORTLISTRecord rec = (TN_LNK_5000_MSUPPORTLISTRecord)ds.supportlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.supportlist.size());
		/****** SUPPORTLIST END */

		/****** PYMTMMLIST BEGIN */
		recordSet = rx.add(dataSet, "pymtmmlist", "");

		for(int i = 0; i < ds.pymtmmlist.size(); i++) {
			TN_LNK_5000_MPYMTMMLISTRecord rec = (TN_LNK_5000_MPYMTMMLISTRecord)ds.pymtmmlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.pymtmmlist.size());
		/****** PYMTMMLIST END */

		/****** RESULTLIST BEGIN */
		recordSet = rx.add(dataSet, "resultlist", "");

		for(int i = 0; i < ds.resultlist.size(); i++) {
			TN_LNK_5000_MRESULTLISTRecord rec = (TN_LNK_5000_MRESULTLISTRecord)ds.resultlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.resultlist.size());
		/****** RESULTLIST END */

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
<tn_lnk_5000_m>
	<dataSet>
		<SUPPORTLIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</SUPPORTLIST>
	</dataSet>
</tn_lnk_5000_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<tn_lnk_5000_m>
	<dataSet>
		<PYMTMMLIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</PYMTMMLIST>
	</dataSet>
</tn_lnk_5000_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<tn_lnk_5000_m>
	<dataSet>
		<RESULTLIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</RESULTLIST>
	</dataSet>
</tn_lnk_5000_m>
*/
%>

<% /* �ۼ��ð� : Tue Sep 20 15:11:38 KST 2016 */ %>