<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papmeda.rec.*
	,	chosun.ciis.mt.papmeda.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPMEDA_1301_LDataSet ds = (MT_PAPMEDA_1301_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	
	int iMedaCnt = 0;	//�������Cnt(Y��)
	int iPapCnt = 0;
	int iTot = 0;
	
	String sPapNode = "";
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet, "gridData", "");
		
		iMedaCnt = ds.curlist2.size();
		iPapCnt  = ds.curlist1.size() / ds.curlist2.size();
		
		
		for(int i=0; i < iMedaCnt; i++) {
			iTot = 0;
			MT_PAPMEDA_1301_LCURLIST2Record rec_y = (MT_PAPMEDA_1301_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "meda_yymm", rec_y.meda_yymm);
			
			for(int j = i*iPapCnt; j < iPapCnt * (i+1); j++) {
				MT_PAPMEDA_1301_LCURLIST1Record rec_d = (MT_PAPMEDA_1301_LCURLIST1Record)ds.curlist1.get(j);
				sPapNode = "pap_" + rec_d.papcmpy_cd;
				iTot = iTot + Integer.parseInt(rec_d.meda_amt);
				rx.add(record, sPapNode, rec_d.meda_amt);
			}
			rx.add(record, "total", iTot);
		}
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
<dataSet>
	<CURLIST2>
		<record>
			<meda_yymm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<meda_yymm/>
			<papcmpy_cd/>
			<meda_amt/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Sat May 09 16:45:53 KST 2009 */ %>