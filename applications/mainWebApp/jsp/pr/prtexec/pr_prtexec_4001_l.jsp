<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	boolean buf = true;	//버퍼링 할건지 말건지
	RwText rt= new RwText();
	PR_PRTEXEC_4001_LDataSet ds = (PR_PRTEXEC_4001_LDataSet)request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap_1	= "발행일자";
	String str_cap_2	= "발행일자";
	String str_width	= "70";

	try {
		arrTbl = new String[ds.curlist_y.size()][(ds.curlist_x.size() * 3) + 1];
		System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
		
		
		for(int i = 0; i < ds.curlist_x.size(); i++) {
			PR_PRTEXEC_4001_LCURLIST_XRecord rec = (PR_PRTEXEC_4001_LCURLIST_XRecord)ds.curlist_x.get(i);
			str_width += ", 60,60,60";
			str_cap_1 += "^" + rec.medi_nm + "^" + rec.medi_nm + "^" + rec.medi_nm;
			str_cap_2 += "^" + rec.sect_nm + " ^" + rec.sect_nm + " ^" + rec.sect_nm + " ";
		}
		
		for(int i = 0; i < ds.curlist_y.size(); i++) {
			PR_PRTEXEC_4001_LCURLIST_YRecord rec = (PR_PRTEXEC_4001_LCURLIST_YRecord)ds.curlist_y.get(i);
			arrTbl[i][0] = rec.issu_dt;
		}
		
		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist_y.size());	
		rt.setColCnt((ds.curlist_x.size() * 3) + 1);
		rt.setCaption(str_cap_1 + "|" + str_cap_2);
		rt.setColWidth(str_width);
		
		rt.addColumn("output","format:yyyy-mm-dd;");
		for(int i = 0; i < ds.curlist_x.size(); i++) {
			rt.addColumn("output","");
			rt.addColumn("output","visibility:hidden;");
			rt.addColumn("output","visibility:hidden;");
		}
		rt.setColumn();
		
		for(int i = 0; i < ds.curlist_d.size(); i++) {
			PR_PRTEXEC_4001_LCURLIST_DRecord rec = (PR_PRTEXEC_4001_LCURLIST_DRecord)ds.curlist_d.get(i);
			
			if (i % ds.curlist_x.size() == 0){
				rowCount++;
				colCount = 1;
			} else {
				colCount+=3;
			}
			//System.out.println("rowCount=" + rowCount + "colCount=" + colCount);
			if (rec.pcnt.equals("") && rec.clr_pcnt.equals("")){
				
			} else {
				arrTbl[rowCount-1][colCount] = rec.pcnt + "(" + rec.clr_pcnt + ")";
				arrTbl[rowCount-1][colCount + 1] = rec.add_prt_yn;
				arrTbl[rowCount-1][colCount + 2] = rec.add_prt_seq;
			}
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
	<CURLIST_X>
		<record>
			<medi_cd/>
			<sect_cd/>
			<medi_nm/>
			<sect_nm/>
			<medi_clsf/>
		</record>
	</CURLIST_X>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_2>
		<record>
			<issu_dt/>
			<medi_nm/>
			<sect_nm/>
			<pcnt/>
			<clr_pcnt/>
			<prt_dt/>
			<prt_tm/>
			<dual_out_nm/>
			<tm_in_yn/>
			<remk/>
		</record>
	</CURLIST_2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_1>
		<record>
			<issu_dt/>
			<add_prt_seq/>
			<pcnt/>
			<clr_pcnt/>
			<prt_dt/>
			<prt_tm/>
			<dual_out_nm/>
			<tm_in_yn/>
			<rdata/>
		</record>
	</CURLIST_1>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST_D>
		<record>
			<new_flag/>
			<medi_cd/>
			<issu_dt/>
			<sect_cd/>
			<pcnt/>
			<clr_pcnt/>
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
			<issu_wk/>
		</record>
	</CURLIST_Y>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Apr 29 00:12:22 KST 2009 */ %>