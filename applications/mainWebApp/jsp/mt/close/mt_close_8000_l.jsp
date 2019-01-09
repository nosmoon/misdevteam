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
	MT_CLOSE_8000_LDataSet ds = (MT_CLOSE_8000_LDataSet)request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap_1    = "공장^ 예산코드^ 예산명^ 소모량합계^ 소모금액합계";
	String str_cap_2    = "공장^ 예산코드^ 예산명^ 소모량합계^ 소모금액합계";
	String str_width    = "70,70,120,100,100";
	
	try {
		if(ds.curlist2.size() > 0){
		    arrTbl = new String[ds.curlist2.size()][ds.curlist1.size() + 5];
		    System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
		    
		    
		    for(int i = 0; i < ds.curlist1.size(); i++) {
		        MT_CLOSE_8000_LCURLIST1Record rec = (MT_CLOSE_8000_LCURLIST1Record)ds.curlist1.get(i);
		        str_width += ", 70";
		        str_cap_1 += "^" + rec.medi_nm;
		        str_cap_2 += "^" + rec.sect_nm + " ";
		    }
		    
		    for(int i = 0; i < ds.curlist2.size(); i++) {
		        MT_CLOSE_8000_LCURLIST2Record rec = (MT_CLOSE_8000_LCURLIST2Record)ds.curlist2.get(i);
		        arrTbl[i][0] = rec.fac_clsf + "  " + rec.fac_clsf_nm;
		        arrTbl[i][1] = rec.owh_budg_cd;
		        arrTbl[i][2] = rec.budg_cdnm;
		        arrTbl[i][3] = rec.be_qunt;
		        arrTbl[i][4] = rec.be_amt;
		        arrTbl[i][5] = rec.amt1 + "%";
		        arrTbl[i][6] = rec.amt2 + "%";
		        arrTbl[i][7] = rec.amt3 + "%";
		        arrTbl[i][8] = rec.amt4 + "%";
		        arrTbl[i][9] = rec.amt5 + "%";
		        arrTbl[i][10] = rec.amt6 + "%";
		        arrTbl[i][11] = rec.amt7 + "%";
		        arrTbl[i][12] = rec.amt8 + "%";
		        arrTbl[i][13] = rec.amt9 + "%";
		        arrTbl[i][14] = rec.amt10 + "%";
		        arrTbl[i][15] = rec.amt11 + "%";
		        arrTbl[i][16] = rec.amt12 + "%";
		        arrTbl[i][17] = rec.amt13 + "%";
		        arrTbl[i][18] = rec.amt14 + "%";
		        arrTbl[i][19] = rec.amt15 + "%";
		        arrTbl[i][20] = rec.amt16 + "%";
		        arrTbl[i][21] = rec.amt17 + "%";
		        arrTbl[i][22] = rec.amt18 + "%";
		        arrTbl[i][23] = rec.amt19 + "%";
		        arrTbl[i][24] = rec.amt20 + "%";
		        arrTbl[i][25] = rec.amt21 + "%";
		        arrTbl[i][26] = rec.amt22 + "%";
		        arrTbl[i][27] = rec.amt23 + "%";
		        arrTbl[i][28] = rec.amt24 + "%";
		        arrTbl[i][29] = rec.amt25 + "%";
		        arrTbl[i][30] = rec.amt26 + "%";
		        arrTbl[i][31] = rec.amt27 + "%";
		        arrTbl[i][32] = rec.amt28 + "%";
		        arrTbl[i][33] = rec.amt29 + "%";
		        arrTbl[i][34] = rec.amt30 + "%";
		    }
		    
		    rt.setBuffering(buf);
		    rt.setRowCnt(ds.curlist2.size());  
		    rt.setColCnt(ds.curlist1.size() + 5);
		    rt.setCaption(str_cap_1 + "|" + str_cap_2);
		    rt.setColWidth(str_width);
		    
		    rt.addColumn("output","");
		    rt.addColumn("output","");
		    rt.addColumn("output","");
		    rt.addColumn("output","format:#,###;ta:right;");
		    rt.addColumn("output","format:#,##0.################;ta:right;");
		    for(int i = 0; i < ds.curlist1.size(); i++) {
		        rt.addColumn("output","");
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
            rt.setColCnt(5);
            rt.setCaption(str_cap_1 + "|" + str_cap_2);
            rt.setColWidth(str_width);
            rt.addColumn("output","");
            rt.addColumn("output","");
            rt.addColumn("output","");
            rt.addColumn("output","format:#,###;ta:right;");
            rt.addColumn("output","format:#,##0.################;ta:right;");
            rt.setColumn();
		}
	
	}catch(Exception e){
	    out.print(rt.textFlush());
	}finally{
	    out.print(rt.textFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_close_8000_l>
	<dataSet>
		<CURLIST2>
			<record>
				<fac_clsf/>
				<fac_clsf_nm/>
				<owh_budg_cd/>
				<budg_cdnm/>
				<be_amt/>
				<be_qunt/>
				<amt1/>
				<amt2/>
				<amt3/>
				<amt4/>
				<amt5/>
				<amt6/>
				<amt7/>
				<amt8/>
				<amt9/>
				<amt10/>
				<amt11/>
				<amt12/>
				<amt13/>
				<amt14/>
				<amt15/>
				<amt16/>
				<amt17/>
				<amt18/>
				<amt19/>
				<amt20/>
				<amt21/>
				<amt22/>
				<amt23/>
				<amt24/>
				<amt25/>
				<amt26/>
				<amt27/>
				<amt28/>
				<amt29/>
				<amt30/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_close_8000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_close_8000_l>
	<dataSet>
		<CURLIST1>
			<record>
				<irow/>
				<medi_cd/>
				<sect_cd/>
				<medi_nm/>
				<sect_nm/>
				<irow2/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_close_8000_l>
*/
%>

<% /* 작성시간 : Thu Jul 16 10:39:13 KST 2009 */ %>