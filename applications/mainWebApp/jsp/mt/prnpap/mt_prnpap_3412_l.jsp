<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%
    boolean buf = true;	//버퍼링 할건지 말건지

    RwText rt = new RwText();
	MT_PRNPAP_3412_LDataSet ds = (MT_PRNPAP_3412_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int rowCount = 0;
	int colCount = 0;
	int tempCnt = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String[][] arrTbl = null;
	String str_cap_1  = "파지종류^총파지량";
	String str_cap_2  = "파지종류^총파지량";
	String str_cap_3  = "파지종류^총파지량";
	String str_width	= "70, 70";

	try {
		/****** CURLIST2 BEGIN */
		arrTbl = new String[ds.curlist1.size()][ds.curlist2.size() * 2 + 2];

		tempCnt = (890 - 140) / (ds.curlist2.size() * 2);

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PRNPAP_3412_LCURLIST2Record rec = (MT_PRNPAP_3412_LCURLIST2Record)ds.curlist2.get(i);

			str_width += ", " + tempCnt + ", " + tempCnt;
			str_cap_1 += "^" +  ( ( rec.cd.equals("A"))? "A.금일인쇄량" : (rec.cd.equals("B"))? "B.전일 선인쇄량" : "C.금일선인쇄량" ) + "^" +  ( ( rec.cd.equals("A"))? "A.금일인쇄량" : (rec.cd.equals("B"))? "B.전일 선인쇄량" : "C.금일선인쇄량" );
			str_cap_2 += "^" + rec.title + "^" + rec.title;
			str_cap_3 += "^" + "개" + "^" + "중량";
		}

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_3412_LCURLIST1Record rec = (MT_PRNPAP_3412_LCURLIST1Record)ds.curlist1.get(i);
			arrTbl[i][0] = rec.cdnm;
		}

System.out.println(str_cap_1 + "|" + str_cap_2);
System.out.println(str_width);
System.out.println(ds.curlist1.size() + " " + ds.curlist2.size());

		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist1.size());
		rt.setColCnt(ds.curlist2.size() * 2 + 2);
		rt.setCaption(str_cap_1 + "|" + str_cap_2+ "|" + str_cap_3);
		rt.setColWidth(str_width);


		for(int i = 0; i < ds.curlist2.size() * 2 + 2 ; i++) {
			rt.addColumn("output"," ");
		}
		rt.setColumn();
		colCount = 1;

		for(int i = 0; i < arrTbl.length; i++) {
			arrTbl[i][colCount] ="0";
		}
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3412_LCURLISTRecord rec = (MT_PRNPAP_3412_LCURLISTRecord)ds.curlist.get(i);
			if (i % ds.curlist1.size() == 0){
				rowCount = 0;
				colCount = colCount + 2;
				//arrTbl[rowCount][colCount-1] =  "0";
			} else {
				rowCount+=1;
			}
 			arrTbl[rowCount][colCount -1] =  rec.cnt;
 			arrTbl[rowCount][colCount   ] =    rec.wgt;
			//int record = rx.add(recordSet, "record", "");
			//rx.add(record, "gubun", rec.gubun);
			//rx.add(record, "title", rec.title);
			//rx.add(record, "medi_cd", rec.medi_cd);
			//rx.add(record, "sect_cd", rec.sect_cd);
			//rx.add(record, "issu_dt", rec.issu_dt);
			//rx.add(record, "prt_dt", rec.prt_dt);
			//rx.add(record, "hdqt_paper_clsf", rec.hdqt_paper_clsf);
			//rx.add(record, "cd", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cnt", rec.cnt);
			//rx.add(record, "wgt", rec.wgt);
		}


		for(int i = 0; i < arrTbl.length; i++) {
System.out.println("-----------------");
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				System.out.println(arrTbl[i][ii]);
	 			if (ii < (arrTbl[i].length - 1)){
	 				rt.addColValue( arrTbl[i][ii] );
	 			} else {
	 				rt.addRowValue( arrTbl[i][ii] );
	 			}
			}
			//out.print(rt.textFlush());
		}
	}
	catch(Exception e){
		out.print(rt.textFlush());
	}finally{
		out.print(rt.textFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
			<title/>
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
			<cd/>
			<cdnm/>
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
			<gubun/>
			<title/>
			<medi_cd/>
			<sect_cd/>
			<issu_dt/>
			<prt_dt/>
			<hdqt_paper_clsf/>
			<cd/>
			<cdnm/>
			<cnt/>
			<wgt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Aug 06 00:37:27 KST 2009 */ %>