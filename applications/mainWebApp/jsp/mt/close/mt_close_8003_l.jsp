<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.close.rec.*
	,	chosun.ciis.mt.close.ds.*;
	"
%>

<%
	boolean buf = true; //버퍼링 할건지 말건지
	RwText rt= new RwText();
	MT_CLOSE_8003_LDataSet ds = (MT_CLOSE_8003_LDataSet)request.getAttribute("ds");
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap_1    = "자재코드^ 자재명^ 소모량합계^ 소모금액합계";
	String str_cap_2    = "자재코드^ 자재명^ 소모량합계^ 소모금액합계";
	String str_width    = "70, 150, 100, 100";
	
	try {
	        if(ds.curlist2.size() > 0){
	            arrTbl = new String[ds.curlist2.size()][ds.curlist1.size() + 4];
	            System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
	            
	            
	            for(int i = 0; i < ds.curlist1.size(); i++) {
	                MT_CLOSE_8003_LCURLIST1Record rec = (MT_CLOSE_8003_LCURLIST1Record)ds.curlist1.get(i);
	                str_width += ", 100";
	                str_cap_1 += "^" + rec.medi_nm;
	                str_cap_2 += "^" + rec.sonm + " ";
	            }
	            
	            for(int i = 0; i < ds.curlist2.size(); i++) {
	                MT_CLOSE_8003_LCURLIST2Record rec = (MT_CLOSE_8003_LCURLIST2Record)ds.curlist2.get(i);
	                arrTbl[i][0] = rec.matr_cd;
	                arrTbl[i][1] = rec.matr_nm;
	                arrTbl[i][2] = rec.be_qunt;
	                arrTbl[i][3] = rec.be_amt;
	                arrTbl[i][4] = rec.qunt1;
	                arrTbl[i][5] = rec.amt1;
	                arrTbl[i][6] = rec.qunt2;
	                arrTbl[i][7] = rec.amt2;
	                arrTbl[i][8] = rec.qunt3;
	                arrTbl[i][9] = rec.amt3;
	                arrTbl[i][10] = rec.qunt4;
	                arrTbl[i][11] = rec.amt4;
	                arrTbl[i][12] = rec.qunt5;
	                arrTbl[i][13] = rec.amt5;
	                arrTbl[i][14] = rec.qunt6;
	                arrTbl[i][15] = rec.amt6;
	                arrTbl[i][16] = rec.qunt7;
	                arrTbl[i][17] = rec.amt7;
	                arrTbl[i][18] = rec.qunt8;
	                arrTbl[i][19] = rec.amt8;
	                arrTbl[i][20] = rec.qunt9;
	                arrTbl[i][21] = rec.amt9;
	                arrTbl[i][22] = rec.qunt10;
	                arrTbl[i][23] = rec.amt10;
	                arrTbl[i][24] = rec.qunt11;
	                arrTbl[i][25] = rec.amt11;
	                arrTbl[i][26] = rec.qunt12;
	                arrTbl[i][27] = rec.amt12;
	                arrTbl[i][28] = rec.qunt13;
	                arrTbl[i][29] = rec.amt13;
	                arrTbl[i][30] = rec.qunt14;
	                arrTbl[i][31] = rec.amt14;
	                arrTbl[i][32] = rec.qunt15;
	                arrTbl[i][33] = rec.amt15;
	                arrTbl[i][34] = rec.qunt16;
	                arrTbl[i][35] = rec.amt16;
	                arrTbl[i][36] = rec.qunt17;
	                arrTbl[i][37] = rec.amt17;
	                arrTbl[i][38] = rec.qunt18;
	                arrTbl[i][39] = rec.amt18;
	                arrTbl[i][40] = rec.qunt19;
	                arrTbl[i][41] = rec.amt19;
	                arrTbl[i][42] = rec.qunt20;
	                arrTbl[i][43] = rec.amt20;
	            }
	            
	            rt.setBuffering(buf);
	            rt.setRowCnt(ds.curlist2.size());  
	            rt.setColCnt(ds.curlist1.size() + 4);
	            rt.setCaption(str_cap_1 + "|" + str_cap_2);
	            rt.setColWidth(str_width);
	            rt.addColumn("output","");
	            rt.addColumn("output","");
	            rt.addColumn("output","format:#,###;ta:right;");
	            rt.addColumn("output","format:#,###.##;ta:right;");
	            for(int i = 1; i <= ds.curlist1.size(); i++) {
	            	if(i%2 == 0){
                        rt.addColumn("output","format:#,###;ta:right;");
                    }else{
                        rt.addColumn("output","format:#,##0.################;ta:right;");   
                    }
	            }
	            rt.setColumn();
	                
	            for(int i = 0; i < arrTbl.length; i++) {
	                for(int ii = 0; ii < arrTbl[i].length; ii++) {
	                    if (ii < (arrTbl[i].length - 1)){
	                        rt.addColValue( arrTbl[i][ii] );
	                    } else {
	                        rt.addRowValue( arrTbl[i][ii] );
	                    }
	                }
	                //out.print(rt.textFlush());
	            }
	        }else{
	            rt.setBuffering(buf);
	            rt.setRowCnt(-1);  
	            rt.setColCnt(4);
	            rt.setCaption(str_cap_1 + "|" + str_cap_2);
	            rt.setColWidth(str_width);
	            rt.addColumn("output","");
                rt.addColumn("output","");
                rt.addColumn("output","format:#,###;ta:right;");
                rt.addColumn("output","format:#,###.##;ta:right;");
	            rt.setColumn();
	        }
	
	}catch(Exception e){
	    out.print(rt.textFlush());
	}finally{
	    out.print(rt.textFlush());
	}
%>

<% /* 작성시간 : Mon Aug 03 21:43:26 KST 2009 */ %>