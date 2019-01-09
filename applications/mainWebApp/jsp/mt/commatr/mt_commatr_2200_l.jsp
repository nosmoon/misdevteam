<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.commatr.rec.*
	,	chosun.ciis.mt.commatr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_COMMATR_2200_LDataSet ds = (MT_COMMATR_2200_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String[][] tbBody = null;
	String[]   tbhead  = null;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST2", "");
		tbhead = new String[ds.curlist1.size() + 2];
		tbhead[0] = "발생일자";
		tbhead[1] = "거래처";

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_COMMATR_2200_LCURLIST1Record rec = (MT_COMMATR_2200_LCURLIST1Record)ds.curlist1.get(i);
			//int record = rx.add(recordSet, "record", "");
			//rx.add(record, "matr_cd", rec.matr_cd);

			tbhead[ i+ 2 ] = rec.matr_cd;
		}

		String strCaption = "";
		for ( int i = 0 ; i < tbhead.length ; i++ ){
			if ( i == 0 ) strCaption = tbhead[i];
			else {
				strCaption = strCaption + "^" + tbhead[i];
			}
System.out.println(tbhead[i]);

		}
		recordSet = rx.add(dataSet, "caption_x", strCaption);
		recordSet = rx.add(dataSet, "caption_size", ds.curlist1.size() + 2);

		tbBody = new String[ds.curlist2.size()][ds.curlist1.size() + 2];

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_COMMATR_2200_LCURLIST2Record rec = (MT_COMMATR_2200_LCURLIST2Record)ds.curlist2.get(i);
			//rx.add(record, "dlco_eps_no", rec.dlco_eps_no);
			//rx.add(record, "uprc_meda_dt", rec.uprc_meda_dt);

			tbBody[i][0] = rec.uprc_meda_dt;
			tbBody[i][1] = rec.dlco_eps_no;
		}

		for( int i = 0 ; i < tbBody.length ; i++){
			String meda_dt =  tbBody[i][0];
			String dlco_eps_no = tbBody[i][1].substring(0,tbBody[i][1].indexOf(" ") );

			for(int ii = 2 ; ii < tbhead.length ; ii++){
				String matr_cd = tbhead[ii].substring(0, 7);

				for(int iii = 0; iii < ds.curlist.size(); iii++) {
					MT_COMMATR_2200_LCURLISTRecord rec = (MT_COMMATR_2200_LCURLISTRecord)ds.curlist.get(iii);

					String rec_meda_dt = rec.uprc_meda_dt;
					String rec_dlco_eps_no = rec.dlco_eps_no;
					String rec_matr_cd = rec.matr_cd;

System.out.println(meda_dt + " " + dlco_eps_no + " " + matr_cd + "-" + rec_meda_dt + " " + rec_dlco_eps_no + " " + rec_matr_cd);
					if( meda_dt.equals(rec_meda_dt) && dlco_eps_no.equals(rec_dlco_eps_no) && matr_cd.equals(rec_matr_cd) ){
						System.out.println("OK");
						tbBody[i][ii] = rec.purc_uprc;
					}
				}
			}
		}
		recordSet = rx.add(dataSet, "data_y", "");
		for( int i = 0 ; i < tbBody.length ; i++){
			int record = rx.add(recordSet, "record", "");
			for( int ii = 0 ; ii < tbBody[i].length ; ii++){
				rx.add(record, "row_" + ii,   tbBody[i][ii]);
//System.out.println( i + "-" + ii + 	tbBody[i][ii]);
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
			<dlco_eps_no/>
			<uprc_meda_dt/>
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
			<matr_cd/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<uprc_meda_dt/>
			<dlco_eps_no/>
			<matr_cd/>
			<purc_uprc/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Jul 07 21:17:21 KST 2009 */ %>