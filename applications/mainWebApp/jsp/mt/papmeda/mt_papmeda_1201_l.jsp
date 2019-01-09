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
	MT_PAPMEDA_1201_LDataSet ds = (MT_PAPMEDA_1201_LDataSet)request.getAttribute("ds");
	
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int iMedaCnt = 0;	//조정년월Cnt(Y축)
	int iFacCnt = 0;
	int iTot = 0;
	
	String sFacNode = "";
	
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		recordSet = rx.add(dataSet, "gridData", "");
		
		iMedaCnt = ds.curlist2.size();
		iFacCnt  = ds.curlist1.size() / ds.curlist2.size();
		
		for(int i=0; i < iMedaCnt; i++) {
			iTot = 0;
			MT_PAPMEDA_1201_LCURLIST2Record rec_y = (MT_PAPMEDA_1201_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "meda_yymm", rec_y.meda_yymm);
			
			for(int j = i*iFacCnt; j < iFacCnt * (i+1); j++) {
				MT_PAPMEDA_1201_LCURLIST1Record rec_d = (MT_PAPMEDA_1201_LCURLIST1Record)ds.curlist1.get(j);
				sFacNode = "fac_" + rec_d.fac_clsf;
				iTot = iTot + Integer.parseInt(rec_d.meda_amt);
				rx.add(record, sFacNode, rec_d.meda_amt);
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
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<fac_clsf/>
			<cdnm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cmpy_cd/>
			<meda_yymm/>
			<fac_clsf/>
			<meda_amt/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 08 19:16:28 KST 2009 */ %>