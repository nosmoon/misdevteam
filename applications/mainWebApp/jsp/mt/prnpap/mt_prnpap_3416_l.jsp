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


	String errcode = "";
	String errmsg = "";


    RwText rt = new RwText();
    MT_PRNPAP_3416_LDataSet ds = (MT_PRNPAP_3416_LDataSet)request.getAttribute("ds");
    boolean buf = true;	//버퍼링 할건지 말건지
    errcode = ds.errcode;
	errmsg = ds.errmsg;

	int root = RwXml.rootNodeID;
	int rowCount = 0;
	int colCount = 0;
	int tempCnt = 0;
	String[][] arrTbl = null;
	String str_cap_1  = "파지종류^총파지량";
	String str_cap_2  = "파지종류^총파지량";
	String str_cap_3  = "파지종류^총파지량";
	String str_width	= "70, 70";

	try {
		/****** CURLIST BEGIN */
//System.out.println("20090906-v0.1.6");

		arrTbl = new String[ds.curlist1.size()][ds.curlist2.size() * 2 + 2];

		tempCnt = (890 - 140) / (ds.curlist2.size() * 2);

//System.out.println("가로축 배역 SIZE" + ds.curlist2.size() + ")" );
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PRNPAP_3416_LCURLIST2Record rec = (MT_PRNPAP_3416_LCURLIST2Record)ds.curlist2.get(i);

			str_width += ", " + tempCnt + ", " + tempCnt;
			str_cap_1 += "^" +  ( ( rec.cd.equals("A"))? "A.당일분파지" : (rec.cd.equals("B"))? "B.전일 선인쇄분파지" : (rec.cd.equals("0"))? " " : "C.금일 선인쇄파지" ) + "^" +  ( ( rec.cd.equals("A"))? "A.당일분파지" : (rec.cd.equals("B"))? "B.전일 선인쇄분파지" : (rec.cd.equals("0"))? " " : "C.금일 선인쇄파지" );
			str_cap_2 += "^" + rec.title + "^" + rec.title;
			str_cap_3 += "^" + "개" + "^" + "중량";
		}
//System.out.println("세로축 배역 SIZE" + ds.curlist1.size() + ")" );

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_3416_LCURLIST1Record rec = (MT_PRNPAP_3416_LCURLIST1Record)ds.curlist1.get(i);
			arrTbl[i][0] = rec.cdnm;
		}

		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist1.size());
		rt.setColCnt(ds.curlist2.size() * 2 + 2);
		rt.setCaption(str_cap_1 + "|" + str_cap_2+ "|" + str_cap_3);

		rt.setColWidth(str_width);
		System.out.println("@@@@@@@@@@>>" + str_cap_1 + "|" + str_cap_2+ "|" + str_cap_3);
		System.out.println("@@@@@@@@@@>>" + str_width);
		for(int i = 0; i < ds.curlist2.size() * 2 + 2; i++) {
	 		rt.addColumn("output","");
	 	}

		rt.setColumn();

		out.print(rt.textFlush());

		/////////////////////////////////////////////////////////////end of grid caption title setting////////////////////////////////////////////////////////


		colCount = 1;
	//	System.out.println("STEP2" );
		for(int i = 0; i < arrTbl.length; i++) {
			arrTbl[i][colCount] ="0";
		}
	//	System.out.println("STEP3" );
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3416_LCURLISTRecord rec = (MT_PRNPAP_3416_LCURLISTRecord)ds.curlist.get(i);
			if (i % ds.curlist1.size() == 0){
				rowCount = 0;
				colCount = colCount + 2;
				//arrTbl[rowCount][colCount-1] =  "0";
			} else {
				rowCount+=1;
				//colCount=3;
			}

 			arrTbl[rowCount][colCount -1] =  rec.cnt;
 			arrTbl[rowCount][colCount   ] =    rec.wgt;

		}

System.out.println("Text Buff Start(" + arrTbl.length + ")");
		for(int i = 0; i < arrTbl.length; i++) {
 			for(int ii = 0; ii < arrTbl[i].length; ii++) {
 				System.out.println("&&&&&" + i + "=" + arrTbl[i][ii] );
 				 if (ii < (arrTbl[i].length - 1)){

	 				rt.addColValue( arrTbl[i][ii] );
	 			} else {
	 				rt.addRowValue( arrTbl[i][ii]  );
	 			}
			}
			//i값이 100 단위일때 한번씩 write해준다.
			if(i % 100 == 0)
				out.print(rt.textFlush());
		}
		System.out.println("Text Buff End");
	    out.print(rt.textFlush());
	}

	catch(Exception e){
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}finally{
		System.out.println("Text Buff End");
		//out.print(rt.textFlush());
	}
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

<% /* 작성시간 : Thu Aug 06 19:44:11 KST 2009 */ %>