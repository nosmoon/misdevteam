<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	boolean buf = true;	//버퍼링 할건지 말건지
	
	RwText rt= new RwText();
	
	MT_SUBMATROUT_1115_LDataSet ds = (MT_SUBMATROUT_1115_LDataSet) request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap	= "자재코드^자재코드";
	//String str_width	= "1,150,1,150";
	String str_width	= "50,130";
	String avg_width	= "";
	
	try {
		if (ds.curlist1.size() == 4){
			avg_width = "70";
		} else if (ds.curlist1.size() == 5){
			avg_width = "60";
		} else {
			avg_width = "50";
		}
		arrTbl = new String[ds.curlist4.size() + 1][(ds.curlist1.size() * 3) + 3];
		System.out.println("x축=" + arrTbl.length + "y축=" + arrTbl[0].length);
		
		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_SUBMATROUT_1115_LCURLIST4Record rec = (MT_SUBMATROUT_1115_LCURLIST4Record) ds.curlist4.get(i);
			arrTbl[i][0] =   rec.matr_cd;
//			arrTbl[i][1] =   rec.matr_clsf_nm;
//			arrTbl[i][2] =   rec.matr_clsf;
			arrTbl[i][1] =   rec.matr_nm;
		}
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATROUT_1115_LCURLIST1Record rec = (MT_SUBMATROUT_1115_LCURLIST1Record) ds.curlist1.get(i);
			//str_width += "," + avg_width + ",1,1";
			str_width += "," + avg_width + ",50,50";
			//if (rec.medi_cd.equals("110")){
			//	str_cap += "^" + rec.sect_nm + "^" + rec.sect_nm + "^" + rec.sect_nm;
			//} else {
			//	str_cap += "^" + rec.medi_nm + "^" + rec.medi_nm + "^" + rec.medi_nm;
			//}
			str_cap += "^" + rec.medi_nm + "/" + rec.sect_nm + "^" + rec.medi_nm + "/" + rec.sect_nm + "^" + rec.medi_nm + "/" + rec.sect_nm;
			//if (rec.sect_nm.equals("")){
			//	str_cap += "^" + rec.medi_nm + "^" + rec.medi_nm + "^" + rec.medi_nm;
			//} else {
			//	str_cap += "^" + rec.sect_nm + "^" + rec.sect_nm + "^" + rec.sect_nm;
			//}
		}
		
		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist4.size() + 1);	
		rt.setColCnt((ds.curlist1.size() * 3) + 3);
		rt.setCaption(str_cap + "^합계");
		rt.setColWidth(str_width + ",60");
		
		//rt.addColumn("output","visibility:hidden;");
		//rt.addColumn("output","");
		//rt.addColumn("output","visibility:hidden;");
		//rt.addColumn("output","");
		
		rt.addColumn("output","visibility:hidden;");
		rt.addColumn("output","");
		
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			rt.addColumn("input","format:#,###;");
			rt.addColumn("input","visibility:hidden;");
			rt.addColumn("input","visibility:hidden;");
		}
		rt.setColumn();
		//out.print(rt.textFlush());
		
		
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATROUT_1115_LCURLIST2Record rec = (MT_SUBMATROUT_1115_LCURLIST2Record)ds.curlist2.get(i);
			
			if (i % ds.curlist1.size() == 0){
				rowCount++;
				colCount = 2;
			} else {
				colCount+=3;
			}
			arrTbl[rowCount-1][colCount] = "";
			arrTbl[rowCount-1][colCount + 1] = rec.medi_cd;
			arrTbl[rowCount-1][colCount + 2] = rec.sect_cd;
		}
		/*
		colCount = 0;
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATROUT_1115_LCURLIST3Record rec = (MT_SUBMATROUT_1115_LCURLIST3Record)ds.curlist3.get(i);
			
			if (i % ds.curlist1.size() == 0){
				rowCount++;
				colCount = 2;
			} else {
				colCount+=3;
			}
			arrTbl[rowCount-1][colCount] = "";
			arrTbl[rowCount-1][colCount + 1] = rec.medi_cd;
			arrTbl[rowCount-1][colCount + 2] = rec.sect_cd;
		}
		*/
		for(int i = 0; i < arrTbl.length; i++) {
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				if (ii < (arrTbl[i].length - 1)){
					if (arrTbl[i][ii] == null){
						rt.addColValue("");
					} else {
						rt.addColValue( arrTbl[i][ii] );
					}
				} else {
					if (arrTbl[i][ii] == null){
						rt.addRowValue( "" );
					} else {
						rt.addRowValue( arrTbl[i][ii] );
					}
				}
			}
		}
		

	}catch(Exception e){
		out.print(rt.textFlush());
	}finally{
		out.print(rt.textFlush());
	}
%>
<% /* 작성시간 : Sat Jun 20 14:56:37 KST 2009 */ %>