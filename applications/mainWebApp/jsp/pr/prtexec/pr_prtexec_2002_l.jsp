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
	RwXml rx = new RwXml();
	PR_PRTEXEC_2002_LDataSet ds = (PR_PRTEXEC_2002_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int formData = 0;
	int recordSet = 0;
	String[][] arrTbl 	= null;
	String[] headTbl	= null;
	int rowCount = 0;
	int colCount = 0;
	String strData	= "";
	
	recordSet = rx.add(root, "gridData3", "");

	try {
		arrTbl = new String[ds.curlist_x.size()][(ds.curlist_y.size() * 4) + 4];
		headTbl = new String[ds.curlist_y.size() + 4];
		
		System.out.println("세로축=" + arrTbl.length + " 가로축=" + arrTbl[0].length);
		headTbl[0] = "매체";
		headTbl[1] = "매체";
		headTbl[2] = "섹션";
		headTbl[3] = "섹션";
		//arrTbl[0][0] = "매체";
		//arrTbl[0][1] = "섹션";
		
		formData = rx.add(recordSet, "x_data", "");
		for(int i = 0; i < ds.curlist_y.size(); i++) {
			PR_PRTEXEC_2002_LCURLIST_YRecord rec = (PR_PRTEXEC_2002_LCURLIST_YRecord)ds.curlist_y.get(i);
			int record = rx.add(formData, "record", "");
			//arrTbl[0][i + 2] = rec.issu_dt;
			headTbl[i + 4] = rec.issu_dt;
			//headTbl[i + 5] = rec.issu_dt;
			//headTbl[i + 6] = rec.issu_dt;
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "issu_wk", rec.issu_wk);
		}
		System.out.println("...." + headTbl.length);
		formData = rx.add(recordSet, "h_data", "");
		for(int i = 0; i < headTbl.length; i++) {
			//int record = rx.add(formData, "record", "");
			if (i > 3){
				System.out.println("==" + headTbl[i]);
				rx.add(formData, "h_info", headTbl[i].substring(0,4) + "-" + headTbl[i].substring(4,6) + "-" + headTbl[i].substring(6,8));
				rx.add(formData, "h_info", headTbl[i].substring(0,4) + "-" + headTbl[i].substring(4,6) + "-" + headTbl[i].substring(6,8));
				rx.add(formData, "h_info", headTbl[i].substring(0,4) + "-" + headTbl[i].substring(4,6) + "-" + headTbl[i].substring(6,8));
				rx.add(formData, "h_info", headTbl[i].substring(0,4) + "-" + headTbl[i].substring(4,6) + "-" + headTbl[i].substring(6,8));
			} else {
				rx.add(formData, "h_info", headTbl[i]);
				//rx.add(formData, "h_info", headTbl[i]);
			}
		}
		System.out.println("....0");
		formData = rx.add(recordSet, "a_data", "");
		for(int i = 0; i < ds.curlist_d.size(); i++) {
			PR_PRTEXEC_2002_LCURLIST_DRecord rec = (PR_PRTEXEC_2002_LCURLIST_DRecord)ds.curlist_d.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "new_flag", rec.new_flag);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "issu_dt", rec.issu_dt);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "pcnt", rec.pcnt);
			rx.add(record, "clr_pcnt", rec.clr_pcnt);
		}
		
		formData = rx.add(recordSet, "y_data", "");
		for(int i = 0; i < ds.curlist_x.size(); i++) {
			PR_PRTEXEC_2002_LCURLIST_XRecord rec = (PR_PRTEXEC_2002_LCURLIST_XRecord)ds.curlist_x.get(i);
			int record = rx.add(formData, "record", "");
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.addCData(record, "sect_nm", rec.sect_nm);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			
			arrTbl[i][0] = rec.medi_nm;
			arrTbl[i][1] = rec.sect_nm;
		}
		
		//formData = rx.add(recordSet, "s_data", "");
		//for(int i = 0; i < ds.curlist_1.size(); i++) {
		//	PR_PRTEXEC_2002_LCURLIST_1Record rec = (PR_PRTEXEC_2002_LCURLIST_1Record)ds.curlist_1.get(i);
		//	int record = rx.add(formData, "record", "");
		//	rx.add(record, "issu_dt", rec.issu_dt);
		//	rx.add(record, "same_yn", rec.same_yn);
		//}
		
		for(int i = 0; i < ds.curlist_x.size(); i++) {
			PR_PRTEXEC_2002_LCURLIST_XRecord rec = (PR_PRTEXEC_2002_LCURLIST_XRecord)ds.curlist_x.get(i);
			arrTbl[i][0] = rec.medi_nm;
			arrTbl[i][1] = rec.medi_cd;
			arrTbl[i][2] = rec.sect_nm;
			arrTbl[i][3] = rec.sect_cd;
		}
		System.out.println("....1"); 
		for(int i = 0; i < ds.curlist_d.size(); i++) {
			PR_PRTEXEC_2002_LCURLIST_DRecord rec = (PR_PRTEXEC_2002_LCURLIST_DRecord)ds.curlist_d.get(i);
			
			if (i % ds.curlist_y.size() == 0){
				rowCount++;
				colCount = 4;
			} else {
				colCount+=4;
			}
			if (rec.pcnt.equals("") && rec.clr_pcnt.equals("")){
				strData = "";
			} else {
				strData = rec.pcnt + "(" + rec.clr_pcnt + ")";
			}
			//System.out.println("[" + (rowCount-1) + "][" + colCount+ "]");
			arrTbl[rowCount-1][colCount] = strData;
			arrTbl[rowCount-1][colCount + 1] = rec.new_flag;
			arrTbl[rowCount-1][colCount + 2] = rec.issu_dt;
			arrTbl[rowCount-1][colCount + 3] = rec.issu_clsf;
		}
		
		
		System.out.println("....2");
		formData = rx.add(recordSet, "d_data", "");
		for(int i = 0; i < arrTbl.length; i++) {
			int record = rx.add(formData, "record", "");
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				//System.out.println("[" + i + "][" +ii + "]=" + arrTbl[i][ii]);
				if (ii == 0){
					rx.add(record, "medi_nm", arrTbl[i][ii]);
				} else if (ii == 1){
					rx.add(record, "medi_cd", arrTbl[i][ii]);
				} else if (ii == 2){
					rx.addCData(record, "sect_nm", arrTbl[i][ii]);
				} else if (ii == 3){
					rx.add(record, "sect_cd", arrTbl[i][ii]);
				} else {
					rx.add(record, "d_" + ii, arrTbl[i][ii]);
				}
			}
		}
	}
	catch (Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
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

<% /* 작성시간 : Sat Apr 18 14:23:27 KST 2009 */ %>