<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_PAPINOUT_2100_LDataSet ds = (MT_PAPINOUT_2100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	String[][] tbBody = null;


	try {
		tbBody = new String[5][3];
		// recordSet = rx.add(dataSet, "CURLIST1", "");   전체발행내역
		// recordSet = rx.add(dataSet, "CURLIST2", "");   본사 스포츠

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPINOUT_2100_LCURLIST1Record rec = (MT_PAPINOUT_2100_LCURLIST1Record)ds.curlist1.get(i);
			//int record = rx.add(recordSet, "record", "");
			//rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			//rx.add(record, "clos_clsf", rec.clos_clsf);
			tbBody[i][0] = rec.fac_clsf_nm;
			tbBody[i][1] = rec.clos_clsf;
		}

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_2100_LCURLIST2Record rec = (MT_PAPINOUT_2100_LCURLIST2Record)ds.curlist2.get(i);
			//int record = rx.add(recordSet, "record", "");
			//rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			//rx.add(record, "clos_clsf", rec.clos_clsf);
			for ( int ii = 0 ; ii < tbBody.length ; ii++){
			     if ( tbBody[i][0].equals(rec.fac_clsf_nm) ){
			    	 tbBody[i][2] = rec.clos_clsf;
			    	 break;
			     }
			}
		}

		recordSet = rx.add(dataSet, "gridData", "");
		for (int i = 0 ; i < tbBody.length; i++){
			int record = rx.add(recordSet, "record", "");

			rx.add(record, "fac_clsf_nm", tbBody[i][0]);
			rx.add(record, "issu_clsf", tbBody[i][1]);
			rx.add(record, "pap_clsf" , tbBody[i][2]);
		}

		for ( int i = 0 ; i < tbBody.length; i++){
			for( int ii = 0 ; ii < tbBody[i].length;  ii++){
System.out.println(tbBody[i][ii]);
			}
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
			<fac_clsf_nm/>
			<clos_clsf/>
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
			<fac_clsf_nm/>
			<clos_clsf/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 15 15:09:14 KST 2009 */ %>