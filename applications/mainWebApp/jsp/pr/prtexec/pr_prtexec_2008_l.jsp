<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,chosun.ciis.pr.prtexec.rec.*,chosun.ciis.pr.prtexec.ds.*;"
%>

<%
	boolean buf = true;	//버퍼링 할건지 말건지

	RwText rt= new RwText();
	
	PR_PRTEXEC_2008_LDataSet ds = (PR_PRTEXEC_2008_LDataSet)request.getAttribute("ds");

	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap	= "발행일자";
	String str_width	= "55";
	
	try {
		System.out.println("ydata=" + ds.curlist_y.size() + "xdata=" + ds.curlist_x.size());
		arrTbl = new String[ds.curlist_y.size()][(ds.curlist_x.size() * 2) + 1];
		System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
		
		for(int i = 0; i < ds.curlist_x.size(); i++) {
			PR_PRTEXEC_2008_LCURLIST_XRecord rec = (PR_PRTEXEC_2008_LCURLIST_XRecord)ds.curlist_x.get(i);
			arrTbl[0][i + 1] = rec.fac_clsf_nm;
			str_width += ", 60, 30";
			str_cap += "^" + rec.fac_clsf_nm + "^" + rec.fac_clsf_nm;
		}
		
		for(int i = 0; i < ds.curlist_y.size(); i++) {
			PR_PRTEXEC_2008_LCURLIST_YRecord rec = (PR_PRTEXEC_2008_LCURLIST_YRecord)ds.curlist_y.get(i);
			arrTbl[i][0] = rec.issu_dt;
		}
		
		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist_y.size());	
		rt.setColCnt((ds.curlist_x.size() * 2) + 1);
		rt.setCaption(str_cap);
		rt.setColWidth(str_width);
		
		rt.addColumn("output","format:yyyy-mm-dd;");
		for(int i = 0; i < ds.curlist_x.size(); i++) {
			rt.addColumn("output","");
			rt.addColumn("output","visibility:hidden;");
		}
		rt.setColumn();
		
		
		for(int i = 0; i < ds.curlist_d.size(); i++) {
			PR_PRTEXEC_2008_LCURLIST_DRecord rec = (PR_PRTEXEC_2008_LCURLIST_DRecord)ds.curlist_d.get(i);
			
			if (i % ds.curlist_x.size() == 0){
				rowCount++;
				colCount = 1;
			} else {
				colCount = colCount + 2;
			}
			//System.out.println("rowCount=[" + rowCount + "]colCount=[" + colCount + "]");
			arrTbl[rowCount-1][colCount] = rec.end_clsf_nm;
			arrTbl[rowCount-1][colCount + 1] = rec.fac_clsf;
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
<dataSet>
	<CURLIST_X>
		<record>
			<fac_clsf/>
			<fac_clsf_nm/>
		</record>
	</CURLIST_X>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_D>
		<record>
			<end_clsf/>
			<fac_clsf/>
			<issu_dt/>
		</record>
	</CURLIST_D>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_Y>
		<record>
			<issu_dt/>
		</record>
	</CURLIST_Y>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 20 12:40:53 KST 2009 */ %>