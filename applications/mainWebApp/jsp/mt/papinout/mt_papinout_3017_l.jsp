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
	boolean buf = true;	//버퍼링 할건지 말건지

	RwText rt = new RwText();

	MT_PAPINOUT_3017_LDataSet ds = (MT_PAPINOUT_3017_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int rowCount = 0;
	int colCount = 0;
	int tempCnt = 0;

	String[][] arrTbl = null;
	String str_cap_1      = "코드명";
	String str_cap_2      = "코드명";
	String str_width	= "70";


	try {

		System.out.println("ds.curlist2.size >>>" + ds.curlist2.size());
		System.out.println("ds.curlist3.size >>>" + ds.curlist3.size());

		/****** CURLIST3 BEGIN */
		arrTbl = new String[ds.curlist2.size()][ds.curlist3.size() * 2 + 1];
		tempCnt = (910 - 70) / (ds.curlist3.size() * 2);

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPINOUT_3017_LCURLIST3Record rec = (MT_PAPINOUT_3017_LCURLIST3Record)ds.curlist3.get(i);

			        str_cap_1 += "^" + rec.title + "^" + rec.title;
			        str_cap_2 += "^" + "개" + "^" + "중량";
			        str_width += ", " + tempCnt + ", " + tempCnt;
		}


		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_3017_LCURLIST2Record rec = (MT_PAPINOUT_3017_LCURLIST2Record)ds.curlist2.get(i);
			arrTbl[i][0] = rec.cdnm;
		}

		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist2.size());
		rt.setColCnt(ds.curlist3.size() * 2 + 1);
System.out.println(str_cap_1 + "|" + str_cap_2);
		rt.setCaption(str_cap_1 + "|" + str_cap_2);
		rt.setColWidth(str_width);

		for(int i = 0; i < ds.curlist3.size() * 2 + 1 ; i++) {
			rt.addColumn("output","format:#,###.##;");
		}

		rt.setColumn();
		colCount = 0;

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPINOUT_3017_LCURLIST1Record rec = (MT_PAPINOUT_3017_LCURLIST1Record)ds.curlist1.get(i);
			if (i % ds.curlist2.size() == 0){
				rowCount = 0;
				colCount = colCount + 2;
				//arrTbl[rowCount][colCount-1] =  "0";
			} else {
				rowCount++;
			}

			System.out.println(i + ">>>" + rowCount +"-"+ colCount +"<"+  rec.cnt +"-"+ rec.wgt + ">");
 			arrTbl[rowCount][colCount -1]	= rec.cnt;
 			arrTbl[rowCount][colCount ] 	= rec.wgt;

		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
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
		/*
		for( int i = 0 ; i < 2 ; i++){

				for(int ii = 0; ii < arrTbl[0].length; ii++) {
					if (ii < (arrTbl[i].length - 1)){

						if( ii == 0 ){
							if( i == 0 ){
								rt.addColValue( "합계 (KG)" );
							}
							else{
								rt.addColValue( "파지율" );
							}
						}
						else{
							rt.addColValue( "0" );
						}

		 			} else {
		 				rt.addRowValue( "0" );
		 			}
				}
		}
		*/
		System.out.println("---END --------------");
	}
	catch (Exception e) {
		out.print(rt.textFlush());
	}
	finally {
		out.print(rt.textFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<medi_cd/>
			<sect_cd/>
			<title/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
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
			<medi_cd/>
			<sect_cd/>
			<pj_kind/>
			<cnt/>
			<wgt/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Aug 14 17:01:25 KST 2009 */ %>