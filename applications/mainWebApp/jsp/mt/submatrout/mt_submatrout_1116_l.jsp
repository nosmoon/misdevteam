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
	
	MT_SUBMATROUT_1116_LDataSet ds = (MT_SUBMATROUT_1116_LDataSet)request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap	= "자재코드^자재코드";
	String str_width	= "1,110";
	String avg_width	= "";

	try {
		
		if (ds.curlist1.size() == 4){
			avg_width = "90";
		} else if (ds.curlist1.size() == 5){
			avg_width = "70";
		} else if (ds.curlist1.size() == 6){
			avg_width = "70";
		}
		arrTbl = new String[ds.curlist2.size() + 1][(ds.curlist1.size() * 3) + 3];
		System.out.println("y축=" + ds.curlist2.size() + "x축=" + ds.curlist1.size());
		System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATROUT_1116_LCURLIST1Record rec = (MT_SUBMATROUT_1116_LCURLIST1Record) ds.curlist1.get(i);
			str_width += "," + avg_width + ",1,1";
			//if (rec.medi_cd.equals("110")){
			//	str_cap += "^" + rec.sect_nm + "^" + rec.sect_nm + "^" + rec.sect_nm;
			//} else {
			//	str_cap += "^" + rec.medi_nm + "^" + rec.medi_nm + "^" + rec.medi_nm;
			//}
			str_cap += "^" + rec.medi_nm + "/" + rec.sect_nm + "^" + rec.medi_nm + "/" + rec.sect_nm + "^" + rec.medi_nm + "/" + rec.sect_nm;
		}
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATROUT_1116_LCURLIST2Record rec = (MT_SUBMATROUT_1116_LCURLIST2Record) ds.curlist2.get(i);
			arrTbl[i][0] =   rec.matr_cd;
			arrTbl[i][1] =   rec.matr_nm;
		}
		arrTbl[arrTbl.length-1][1] =   "합계";
		//System.out.println("..1");
		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist2.size() + 1);
		rt.setColCnt((ds.curlist1.size() * 3) + 3);
		rt.setCaption(str_cap + "^합계");
		rt.setColWidth(str_width + ",60");
		
		rt.addColumn("output","visibility:hidden;");
		rt.addColumn("output","");
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			rt.addColumn("output","format:#,###;");
			rt.addColumn("output","visibility:hidden;");
			rt.addColumn("output","visibility:hidden;");
		}
		rt.setColumn();

		//System.out.println("..2");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATROUT_1116_LCURLIST3Record rec = (MT_SUBMATROUT_1116_LCURLIST3Record)ds.curlist3.get(i);
			
			if (i % ds.curlist1.size() == 0){
				rowCount++;
				colCount = 2;
			} else {
				colCount+=3;
			}
			//System.out.println("rowCount=[" + rowCount + "]colCount=[" + colCount + "]");
			arrTbl[rowCount-1][colCount] = rec.qunt;
			arrTbl[rowCount-1][colCount + 1] = rec.medi_cd;
			arrTbl[rowCount-1][colCount + 2] = rec.sect_cd;
		}
		//System.out.println("..3");
		for(int i = 0; i < arrTbl.length; i++) {
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				if (ii < (arrTbl[i].length - 1)){
					rt.addColValue( arrTbl[i][ii] );
				} else {
					rt.addRowValue( arrTbl[i][ii] );
				}
			}
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
<dataSet>
	<CURLIST3>
		<record>
			<matr_clsf/>
			<matr_clsf_nm/>
			<matr_cd/>
			<matr_nm/>
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
			<matr_clsf/>
			<matr_clsf_nm/>
			<matr_nm/>
			<medi_cd/>
			<sect_cd/>
			<owh_qunt/>
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
			<medi_nm/>
			<sect_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jun 24 15:30:08 KST 2009 */ %>