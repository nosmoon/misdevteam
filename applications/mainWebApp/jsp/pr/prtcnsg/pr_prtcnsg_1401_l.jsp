<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	boolean buf = true;	//버퍼링 할건지 말건지
	
	RwText rt= new RwText();
	
	PR_PRTCNSG_1401_LDataSet ds = (PR_PRTCNSG_1401_LDataSet)request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap	= "구분";
	String str_width	= "130";
	String base_width	= "100";
	int col_Total		= 0;
	try {
		arrTbl = new String[8][ds.curlist2.size() + 1];
		System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
		
		if (ds.curlist2.size() == 1){
			base_width = "400";
		} else if (ds.curlist2.size() == 2){
			base_width = "300";
		} else if (ds.curlist2.size() == 3){
			base_width = "250";
		} else if (ds.curlist2.size() == 4){
			base_width = "190";
		} else if (ds.curlist2.size() == 5){
			base_width = "150";
		} else {
			base_width = "120";
		}
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PRTCNSG_1401_LCURLIST2Record rec = (PR_PRTCNSG_1401_LCURLIST2Record)ds.curlist2.get(i);
			arrTbl[0][i + 1] = rec.fac_clsf_nm;
			str_width += ", " + base_width;
			str_cap += "^" + rec.fac_clsf_nm;
		}
		
		arrTbl[0][0] = "인쇄비";
		arrTbl[1][0] = "용지대";
		arrTbl[2][0] = "PS판비";
		arrTbl[3][0] = "소부비";
		arrTbl[4][0] = "필름제작비";
		arrTbl[5][0] = "포장비";
		arrTbl[6][0] = "운송비";
		arrTbl[7][0] = "합계";
		
		rt.setBuffering(buf);
		rt.setRowCnt(8);	
		rt.setColCnt(ds.curlist2.size() + 1);
		rt.setCaption(str_cap);
		rt.setColWidth(str_width);
		
		rt.addColumn("output","");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			rt.addColumn("output","ta:right; format:#,###;");
		}
		rt.setColumn();
 		
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTCNSG_1401_LCURLIST1Record rec = (PR_PRTCNSG_1401_LCURLIST1Record)ds.curlist1.get(i);
			
			if (i % ds.curlist2.size() == 0){
				rowCount++;
				colCount = 1;
			} else {
				colCount++;
			}
			System.out.println("rowCount=" + rowCount + "_________colCount=" + colCount);
			arrTbl[rowCount-1][colCount] = rec.prt_fee;
			if (arrTbl[7][colCount] == null){
				col_Total = Integer.parseInt(rec.prt_fee) + 0;
			} else {
				col_Total = Integer.parseInt(rec.prt_fee) + Integer.parseInt(arrTbl[7][colCount]);
			}
			arrTbl[7][colCount] = Integer.toString(col_Total);
		}
		
		
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
		//rx.add(recordSet, "totalcnt", ds.curlist_y.size());
		/****** CURLIST_Y END */

	}catch(Exception e){
		out.print(rt.textFlush());
	}finally{
		out.print(rt.textFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1401_l>
	<dataSet>
		<CURLIST1>
			<record>
				<seq/>
				<cd/>
				<prt_fee/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_prtcnsg_1401_l>
*/
%>

<% /* 작성시간 : Wed May 27 15:06:10 KST 2009 */ %>