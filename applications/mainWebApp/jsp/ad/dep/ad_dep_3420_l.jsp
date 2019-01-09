<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_3420_LDataSet ds = (AD_DEP_3420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData2", "");;
	//변수 선언//
	long misu1 = 0;
	long misu2 = 0;
	long misu3 = 0;
	long misu4 = 0;
	long misu5 = 0;
	long misu6 = 0;
	long misu7 = 0;
	long misu8 = 0;
	long misu9 = 0;
	long misu10 = 0;
	long misu11 = 0;
	long misu12 = 0;
	int n = 0;
	//변수 선언//

	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_3420_LCURLISTRecord rec = (AD_DEP_3420_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			long tot = 0;
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "misu_amt1", "0".equals(rec.misu_amt1) ? "" : rec.misu_amt1);
			String str_misu1 = "".equals(rec.misu_amt1) ? "0" : rec.misu_amt1;
			misu1 += Long.parseLong(str_misu1);
			tot += Long.parseLong(str_misu1);
			rx.add(record, "misu_amt2", "0".equals(rec.misu_amt2) ? "" : rec.misu_amt2);
			String str_misu2 = "".equals(rec.misu_amt2) ? "0" : rec.misu_amt2;
			misu2 += Long.parseLong(str_misu2);
			tot += Long.parseLong(str_misu2);
			rx.add(record, "misu_amt3", "0".equals(rec.misu_amt3) ? "" : rec.misu_amt3);
			String str_misu3 = "".equals(rec.misu_amt3) ? "0" : rec.misu_amt3;
			misu3 += Long.parseLong(str_misu3);
			tot += Long.parseLong(str_misu3);			
			rx.add(record, "misu_amt4", "0".equals(rec.misu_amt4) ? "" : rec.misu_amt4);
			String str_misu4 = "".equals(rec.misu_amt4) ? "0" : rec.misu_amt4;
			misu4 += Long.parseLong(str_misu4);
			tot += Long.parseLong(str_misu4);		
			rx.add(record, "misu_amt5", "0".equals(rec.misu_amt5) ? "" : rec.misu_amt5);
			String str_misu5 = "".equals(rec.misu_amt5) ? "0" : rec.misu_amt5;
			misu5 += Long.parseLong(str_misu5);
			tot += Long.parseLong(str_misu5);		
			rx.add(record, "misu_amt6", "0".equals(rec.misu_amt6) ? "" : rec.misu_amt6);
			String str_misu6 = "".equals(rec.misu_amt6) ? "0" : rec.misu_amt6;
			misu6 += Long.parseLong(str_misu6);
			tot += Long.parseLong(str_misu6);		
			rx.add(record, "misu_amt7", "0".equals(rec.misu_amt7) ? "" : rec.misu_amt7);
			String str_misu7 = "".equals(rec.misu_amt7) ? "0" : rec.misu_amt7;
			misu7 += Long.parseLong(str_misu7);
			tot += Long.parseLong(str_misu7);
			rx.add(record, "misu_amt8", "0".equals(rec.misu_amt8) ? "" : rec.misu_amt8);
			String str_misu8 = "".equals(rec.misu_amt8) ? "0" : rec.misu_amt8;
			misu8 += Long.parseLong(str_misu8);
			tot += Long.parseLong(str_misu8);		
			rx.add(record, "misu_amt9", "0".equals(rec.misu_amt9) ? "" : rec.misu_amt9);
			String str_misu9 = "".equals(rec.misu_amt9) ? "0" : rec.misu_amt9;
			misu9 += Long.parseLong(str_misu9);
			tot += Long.parseLong(str_misu9);		
			rx.add(record, "misu_amt10", "0".equals(rec.misu_amt10) ? "" : rec.misu_amt10);
			String str_misu10 = "".equals(rec.misu_amt10) ? "0" : rec.misu_amt10;
			misu10 += Long.parseLong(str_misu10);
			tot += Long.parseLong(str_misu10);
			rx.add(record, "misu_amt11", "0".equals(rec.misu_amt11) ? "" : rec.misu_amt11);
			String str_misu11 = "".equals(rec.misu_amt11) ? "0" : rec.misu_amt11;
			misu11 += Long.parseLong(str_misu11);
			tot += Long.parseLong(str_misu11);			
			rx.add(record, "misu_amt12", "0".equals(rec.misu_amt12) ? "" : rec.misu_amt12);
			String str_misu12 = "".equals(rec.misu_amt12) ? "0" : rec.misu_amt12;
			misu12 += Long.parseLong(str_misu12);
			tot += Long.parseLong(str_misu12);		
			rx.add(record, "tot", tot );
			n++;
		}
		/****** CURLIST END */
		if(n != 0){
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cd_nm", "합    계");
			rx.add(record, "misu_amt1", misu1);
			rx.add(record, "misu_amt2", misu2);
			rx.add(record, "misu_amt3", misu3);
			rx.add(record, "misu_amt4", misu4);
			rx.add(record, "misu_amt5", misu5);
			rx.add(record, "misu_amt6", misu6);
			rx.add(record, "misu_amt7", misu7);
			rx.add(record, "misu_amt8", misu8);
			rx.add(record, "misu_amt9", misu9);
			rx.add(record, "misu_amt10", misu10);
			rx.add(record, "misu_amt11", misu11);
			rx.add(record, "misu_amt12", misu12);
			long all_tot =  misu1+misu2+misu3+misu4+misu5+misu6+misu7+misu8+misu9+misu10+misu11+misu12;
			rx.add(record, "tot", all_tot);
		}
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
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cd_nm/>
			<misu_amt1/>
			<misu_amt2/>
			<misu_amt3/>
			<misu_amt4/>
			<misu_amt5/>
			<misu_amt6/>
			<misu_amt7/>
			<misu_amt8/>
			<misu_amt9/>
			<misu_amt10/>
			<misu_amt11/>
			<misu_amt12/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Apr 14 15:26:42 KST 2009 */ %>