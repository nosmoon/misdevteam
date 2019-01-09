<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>

<%
	boolean buf = true;	//버퍼링 할건지 말건지
	
	RwText rt= new RwText();
	
	MT_PAPINOUT_3009_LDataSet ds = (MT_PAPINOUT_3009_LDataSet)request.getAttribute("ds");
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String col_ecnt		= "";
	String col_ecnt_width	= "";
	String base_width		= "";

	try {
		arrTbl = new String[ds.curlist4.size()][ds.curlist3.size() + 3];

		if (ds.curlist3.size() == 3){
			base_width = "170";
		} else if (ds.curlist3.size() == 4){
			base_width = "140";
		} else if (ds.curlist3.size() == 5){
			base_width = "110";
		} else if (ds.curlist3.size() == 6){
			base_width = "100";
		} else if (ds.curlist3.size() == 7){
			base_width = "90";
		} else {
			base_width = "90";
		}
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPINOUT_3009_LCURLIST3Record rec = (MT_PAPINOUT_3009_LCURLIST3Record)ds.curlist3.get(i);
			if (rec.medi_sect_cd.equals("0")){
				col_ecnt += "^총파지량";
			} else {
				col_ecnt += "^" + rec.medi_sect_cd;
			}
			col_ecnt_width += ", " + base_width;
		}

		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist4.size());
		//column 갯수  정보 셋팅 		
		rt.setColCnt(ds.curlist3.size()  + 3);
		rt.setCaption("파지^파지^파지" + col_ecnt);
		rt.setColWidth("80, 80, 80" + col_ecnt_width);
		
		//column type 및 스타일 정보 추가.
		rt.addColumn("output","visibility:hidden;");
		rt.addColumn("output","");
		rt.addColumn("output","visibility:hidden;");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPINOUT_3009_LCURLIST3Record rec = (MT_PAPINOUT_3009_LCURLIST3Record)ds.curlist3.get(i);
			rt.addColumn("output","");
		}
		
		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_PAPINOUT_3009_LCURLIST4Record rec = (MT_PAPINOUT_3009_LCURLIST4Record)ds.curlist4.get(i);
			if (ds.curlist2.size() > 0){
				arrTbl[i][0] = rec.cd;
				arrTbl[i][1] = rec.cdnm;
				arrTbl[i][2] = rec.mang_cd_1;
			}
		}
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_3009_LCURLIST2Record rec = (MT_PAPINOUT_3009_LCURLIST2Record)ds.curlist2.get(i);
			
			if (i % (ds.curlist3.size()) == 0){
				rowCount++;
				colCount = 3;
			} else {
				colCount ++;
			}
			System.out.println("rec.cd=" + rec.cd);
			System.out.println("arrTbl[rowCount-1][0]=" + arrTbl[rowCount-1][0]);
			System.out.println("arrTbl[rowCount-1][2]=" + arrTbl[rowCount-1][2]);
			
			if (arrTbl[rowCount-1][0].equals(rec.cd)){
				if (arrTbl[rowCount-1][2].equals("Y")){
					arrTbl[rowCount-1][3] = rec.p_pj_qunt;
				} else {
					arrTbl[rowCount-1][3] = rec.p_pj_wgt;
				}
			}
		}
		
		/*
		for(int i = 0; i < ds.curlist3.size(); i++) {
		
			for(int ii = 0; ii < ds.curlist2.size(); ii++) {
				MT_PAPINOUT_3009_LCURLIST2Record rec = (MT_PAPINOUT_3009_LCURLIST2Record)ds.curlist2.get(ii);
						

				if (i == 3){
				System.out.println("rec.cd=" + rec.cd);
				System.out.println("arrTbl[rowCount-1][0]=" + arrTbl[rowCount-1][0]);
				System.out.println("arrTbl[rowCount-1][2]=" + arrTbl[rowCount-1][2]);
				if (arrTbl[rowCount-1][0].equals(rec.cd)){
					if (arrTbl[rowCount-1][2].equals("Y")){
						arrTbl[rowCount-1][3] = rec.p_pj_qunt;
					}
				}
			} else {
				if (arrTbl[rowCount-1][0].equals(rec.cd)){
					if (arrTbl[rowCount-1][2].equals("Y")){
						arrTbl[rowCount-1][(colCount)] = rec.m_pj_qunt;
					}
				}
			}
		}
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_3009_LCURLIST2Record rec = (MT_PAPINOUT_3009_LCURLIST2Record)ds.curlist2.get(i);
			
			if (i % (ds.curlist3.size()) == 0){
				rowCount++;
				colCount = 3;
			} else {
				colCount ++;
			}
			if (colCount == 3){
				if (arrTbl[rowCount-1][0].equals(rec.cd)){
					if (!arrTbl[rowCount-1][2].equals("Y")){
						arrTbl[rowCount-1][(colCount)] = rec.p_pj_wgt;
					}
				}
			} else {
				if (arrTbl[rowCount-1][0].equals(rec.cd)){
					if (!arrTbl[rowCount-1][2].equals("Y")){
						arrTbl[rowCount-1][(colCount)] = rec.m_pj_wgt;
					}
				}
			}
		}
		*/
		
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
<mt_papinout_3009_l>
	<dataSet>
		<CURLIST4>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST4>
	</dataSet>
</mt_papinout_3009_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_papinout_3009_l>
	<dataSet>
		<CURLIST3>
			<record>
				<medi_sect_cd/>
			</record>
		</CURLIST3>
	</dataSet>
</mt_papinout_3009_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_papinout_3009_l>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<p_pj_wgt/>
				<p_pj_qunt/>
				<medi_cd/>
				<sect_cd/>
				<m_pj_wgt/>
				<m_pj_qunt/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_papinout_3009_l>
*/
%>

<% /* 작성시간 : Tue Jun 30 23:16:00 KST 2009 */ %>