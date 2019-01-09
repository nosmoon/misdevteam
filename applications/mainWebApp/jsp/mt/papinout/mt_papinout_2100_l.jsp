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
	
	RwText rt= new RwText();
	
	MT_PAPINOUT_2100_LDataSet ds = (MT_PAPINOUT_2100_LDataSet)request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap	= "공장^공장";
	String str_width	= "200,200";


	try {
		arrTbl = new String[ds.curlist4.size()][(ds.curlist3.size() * 3) + 2];
		System.out.println("x축=" + arrTbl.length + "y축=" + arrTbl[0].length);
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPINOUT_2100_LCURLIST3Record rec = (MT_PAPINOUT_2100_LCURLIST3Record)ds.curlist3.get(i);
			//arrTbl[0][i + 1] = rec.descri;
			str_width += ", 200, 160, 160";
			str_cap += "^" + rec.descri + "^" + rec.descri + "^" + rec.descri;
		}
		
		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_PAPINOUT_2100_LCURLIST4Record rec = (MT_PAPINOUT_2100_LCURLIST4Record)ds.curlist4.get(i);
			arrTbl[i][0] = rec.fac_clsf;
			arrTbl[i][1] = rec.fac_clsf_nm;
		}
		
		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist4.size());	
		rt.setColCnt((ds.curlist3.size() * 3) + 2);
		rt.setCaption(str_cap);
		rt.setColWidth(str_width);
		
		rt.addColumn("output","visibility:hidden;");
		rt.addColumn("output","");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			rt.addColumn("output","");
			rt.addColumn("output","visibility:hidden;");
			rt.addColumn("output","visibility:hidden;");
		}
		rt.setColumn();
		
		for(int i = 0; i < ds.curlist5.size(); i++) {
			MT_PAPINOUT_2100_LCURLIST5Record rec = (MT_PAPINOUT_2100_LCURLIST5Record)ds.curlist5.get(i);
			
			if (i % ds.curlist3.size() == 0){
				rowCount++;
				colCount = 2;
			} else {
				colCount+=3;
			}
			//System.out.println("[" + (rowCount-1) + "][" + colCount + "]");
			
			arrTbl[rowCount-1][colCount] = rec.clos_yn_nm;
			arrTbl[rowCount-1][colCount + 1] = rec.cd;
			arrTbl[rowCount-1][colCount + 2] = rec.clos_yn;
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
	<CURLIST2>
		<record>
			<fac_clsf_nm/>
			<clos_clsf/>
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
			<fac_clsf_nm/>
			<clos_clsf/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 15 15:09:14 KST 2009 */ %>