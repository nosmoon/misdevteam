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
	TN_LNK_6080_ADataSet ds  = (TN_LNK_6080_ADataSet)request.getAttribute("ds");
	TN_LNK_6085_ADataSet ds2 = (TN_LNK_6085_ADataSet)request.getAttribute("ds2");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds2.errcode;
	String errmsg  = ds2.errmsg;
	dataSet = rx.add(root, "dataSet", "");

    rx.add(dataSet, "tot_okcnt",		ds2.tot_okcnt		);	//�� ��� �Ǽ�
    rx.add(dataSet, "tot_okamt",		ds2.tot_okamt		);	//�� ��� �ݾ�
    rx.add(dataSet, "tot_oktax",		ds2.tot_oktax		);	//�� ��� �ΰ���
    rx.add(dataSet, "tot_okfee",		ds2.tot_okfee		);	//�� ��� ������
    rx.add(dataSet, "tailresult",		ds2.tailresult		);	//TAIL ����ڵ�
    rx.add(dataSet, "tailresultmsg",	ds2.tailresultmsg	);	//TAIL ����޼��� 

	
	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			TN_LNK_6080_ACURLISTRecord rec = (TN_LNK_6080_ACURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "filedata", rec.filedata);
			//rx.add(record, "filedata", StringUtil.replaceToXml(rec.filedata));
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
TrustForm�� Instance ����ο� �����ؼ� ���
<tn_lnk_6080_a>
	<dataSet>
		<CURLIST>
			<record>
				<filedata/>
			</record>
		</CURLIST>
	</dataSet>
</tn_lnk_6080_a>
*/
%>

<% /* �ۼ��ð� : Tue Nov 08 16:00:26 KST 2016 */ %>