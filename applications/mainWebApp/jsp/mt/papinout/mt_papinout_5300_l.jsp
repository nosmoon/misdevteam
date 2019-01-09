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
	MT_PAPINOUT_5300_LDataSet ds = (MT_PAPINOUT_5300_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	
	
	String issu_dt = "";
	String sFacNode = "";
	String pj = "";
	
	int iRowCnt = 0;
	int iFacCnt = 0;

	try {
		
		iRowCnt = ds.curlist_data.size();
		iFacCnt = ds.curlist_fac.size();
		
		recordSet = rx.add(dataSet, "gridData", "");
		
		int record = 0;
		
		
		
		for(int i=0; i < iRowCnt; i++) {
			MT_PAPINOUT_5300_LCURLIST_DATARecord rec_data = (MT_PAPINOUT_5300_LCURLIST_DATARecord)ds.curlist_data.get(i);
			
			if(i%iFacCnt == 0) {
				issu_dt    = rec_data.issu_dt;
				
				if(issu_dt.length() == 8) {
					issu_dt = issu_dt.substring(0,4) + "-" + issu_dt.substring(4,6) + "-" + issu_dt.substring(6,8);
				} else if(issu_dt.length() == 6) {
					issu_dt = issu_dt.substring(0,4) + "-" + issu_dt.substring(4,6);
				}
				
				record = rx.add(recordSet, "record", "");
				rx.add(record, "issu_dt", issu_dt);
				
			}
			
			sFacNode = "fac_" + rec_data.fac_clsf;
			
			rx.add(record, sFacNode, String.valueOf(rec_data.pj) + "%");
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
	<CURLIST_FAC>
		<record>
			<fac_clsf/>
			<fac_clsf_nm/>
		</record>
	</CURLIST_FAC>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_DATA>
		<record>
			<cmpy_cd/>
			<issu_dt/>
			<fac_clsf/>
			<pj/>
		</record>
	</CURLIST_DATA>
</dataSet>
*/
%>

<% /* 작성시간 : Fri May 15 21:27:35 KST 2009 */ %>