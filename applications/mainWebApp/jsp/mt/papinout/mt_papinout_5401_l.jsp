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

	MT_PAPINOUT_5401_LDataSet ds = (MT_PAPINOUT_5401_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int rowCount = 0;
	int colCount = 0;
	int tempCnt = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String[][] arrTbl = null;
	String str_cap_1  = "발생일자^파지종류";
	String str_cap_2  = "발생일자^파지종류";
	String str_width	= "70, 70";
	String tmpDate = "";

	try {
		/****** CURLIST_FAC BEGIN */
		arrTbl = new String[ds.curlist_data.size() / ds.curlist_fac.size()][ds.curlist_fac.size() * 3 + 2];

		tempCnt = (890 - 140) / (ds.curlist_fac.size() * 2);
System.out.println("----1-------------");
		for(int i = 0; i < ds.curlist_fac.size(); i++) {
			MT_PAPINOUT_5401_LCURLIST_FACRecord rec = (MT_PAPINOUT_5401_LCURLIST_FACRecord)ds.curlist_fac.get(i);
			str_width += ", " + tempCnt + ", " + tempCnt + ", " + tempCnt;
			str_cap_1 += "^" +  rec.fac_clsf_nm +"^" +  rec.fac_clsf_nm + "^" +  rec.fac_clsf_nm;
			str_cap_2 += "^" + "중량" + "^" + "단가" + "^" + "금액";
	    }
		System.out.println("-------2----------");
		for(int i = 0; i < ds.curlist_data.size(); i+=ds.curlist_fac.size()) {
			MT_PAPINOUT_5401_LCURLIST_DATARecord rec = (MT_PAPINOUT_5401_LCURLIST_DATARecord)ds.curlist_data.get(i);

			tmpDate = rec.somodat;

			if( tmpDate.length() == 8 ) {
				tmpDate = tmpDate.substring(0, 4) + "-" + tmpDate.substring(4, 6) + "-" + tmpDate.substring(6, 8);
			}
			else if (tmpDate.length() == 6 ) {
				tmpDate = tmpDate.substring(0, 4) + "-" + tmpDate.substring(4, 6) ;
			}

			arrTbl[rowCount][0] = tmpDate;
			arrTbl[rowCount][1] = rec.pj_kind_nm;
			rowCount+=1;
		}

		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist_data.size() / ds.curlist_fac.size());
		rt.setColCnt(ds.curlist_fac.size() * 3 + 2);
		rt.setCaption(str_cap_1 + "|" + str_cap_2 );
		rt.setColWidth(str_width);

		for(int i = 0; i < ds.curlist_fac.size() * 3 + 2 ; i++) {

			if( i > 1 ) {
				rt.addColumn("output","format:#,###;text-align:right;");
			}
			else {rt.addColumn("output","");}
		}
		rt.setColumn();
		System.out.println("--------3---------");
		rowCount = 0;

		for(int i = 0; i < ds.curlist_data.size(); i++) {
			MT_PAPINOUT_5401_LCURLIST_DATARecord rec = (MT_PAPINOUT_5401_LCURLIST_DATARecord)ds.curlist_data.get(i);
			if (i % ds.curlist_fac.size() == 0){
				if( i == 0 ){
					rowCount = 0;
				}
				else {
					rowCount+=1;
				}
				colCount = 4;

				//arrTbl[rowCount][colCount-1] =  "0";
			} else {

				colCount = colCount + 3;
			}
			System.out.println("--------" + i + rec.somodat + "##" + rec.fac_clsf + "## " + rec.pj_kind);
			arrTbl[rowCount][colCount-2] = rec.val;
			arrTbl[rowCount][colCount-1] = rec.uprc;
			arrTbl[rowCount][colCount]   = rec.amt;
		}
		System.out.println("--------4---------");
		for(int i = 0; i < arrTbl.length; i++) {
	System.out.println("-----------------");
				for(int ii = 0; ii < arrTbl[i].length; ii++) {
					if (ii < (arrTbl[i].length - 1)){
		 				rt.addColValue( arrTbl[i][ii] );
		 			} else {
		 				rt.addRowValue( arrTbl[i][ii] );
		 			}
				}
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
	<CURLIST_FAC>
		<record>
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
			<somodat/>
			<fac_clsf/>
			<pj_kind/>
			<pj_kind_nm/>
			<val/>
			<uprc/>
			<amt/>
		</record>
	</CURLIST_DATA>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Aug 20 21:35:14 KST 2009 */ %>