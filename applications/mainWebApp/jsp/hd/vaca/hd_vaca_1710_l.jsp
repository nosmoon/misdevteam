<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,   java.lang.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1710_LDataSet ds = (HD_VACA_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** curlist BEGIN */
		recordSet = rx.add(dataSet, "VACA_CLSF", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1710_LCURLISTRecord rec = (HD_VACA_1710_LCURLISTRecord)ds.curlist.get(i);
			if ("VACA_CLSF".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_46", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1710_LCURLISTRecord rec = (HD_VACA_1710_LCURLISTRecord)ds.curlist.get(i);
			if ("VACA_DTLS_46".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_42", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1710_LCURLISTRecord rec = (HD_VACA_1710_LCURLISTRecord)ds.curlist.get(i);
			if ("VACA_DTLS_42".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_51", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1710_LCURLISTRecord rec = (HD_VACA_1710_LCURLISTRecord)ds.curlist.get(i);
			if ("VACA_DTLS_51".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_49", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1710_LCURLISTRecord rec = (HD_VACA_1710_LCURLISTRecord)ds.curlist.get(i);
			if ("VACA_DTLS_49".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
		
		recordSet = rx.add(dataSet, "VACA_DTLS_41", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1710_LCURLISTRecord rec = (HD_VACA_1710_LCURLISTRecord)ds.curlist.get(i);
			if ("VACA_DTLS_41".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			}
		}
	 	
	 	recordSet = rx.add(dataSet, "VACA_DTLS_44", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1710_LCURLISTRecord rec = (HD_VACA_1710_LCURLISTRecord)ds.curlist.get(i);
			if ("VACA_DTLS_44".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
		       //System.out.println(rec.mang_cd_4 );
			}
		}
	   recordSet = rx.add(dataSet, "VACA_DTLS_50", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1710_LCURLISTRecord rec = (HD_VACA_1710_LCURLISTRecord)ds.curlist.get(i);
			if ("VACA_DTLS_50".equals(rec.getCd_type())){
				int record = rx.add(recordSet, "item", "");
				rx.add(record, "cd_type", rec.cd_type);
				rx.add(record, "cd", rec.cd);
				rx.add(record, "cdnm", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_3", rec.mang_cd_3);	
				rx.add(record, "mang_cd_4", rec.mang_cd_4);	
		System.out.println(rec.mang_cd_4 );
			}
		}

	    recordSet = rx.add(dataSet, "VACA_DTLS_60", "");

			for(int i = 0; i < ds.curlist.size(); i++) {
				HD_VACA_1710_LCURLISTRecord rec = (HD_VACA_1710_LCURLISTRecord)ds.curlist.get(i);
				if ("VACA_DTLS_60".equals(rec.getCd_type())){
					int record = rx.add(recordSet, "item", "");
					rx.add(record, "cd_type", rec.cd_type);
					rx.add(record, "cd", rec.cd);
					rx.add(record, "cdnm", rec.cdnm);
					rx.add(record, "remk", rec.remk);
					rx.add(record, "mang_cd_3", rec.mang_cd_3);	
					rx.add(record, "mang_cd_4", rec.mang_cd_4);	
			System.out.println(rec.mang_cd_4 );
				}
			}
		/****** curlist END */

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
<hd_vaca_1710_l>
	<dataSet>
		<CURLIST>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
				<remk/>
				<mang_cd_3/>
				<mang_cd_4/>
			</record>
		</CURLIST>
	</dataSet>
</hd_vaca_1710_l>
*/
%>

<% /* 작성시간 : Fri Dec 03 10:51:20 KST 2010 */ %>