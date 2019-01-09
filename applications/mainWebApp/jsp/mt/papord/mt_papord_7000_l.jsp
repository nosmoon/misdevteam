<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papord.rec.*
	,	chosun.ciis.mt.papord.ds.*;
	"
%>

<%
	boolean buf = true;	//버퍼링 할건지 말건지
	
	RwText rt= new RwText();
	
	MT_PAPORD_7000_LDataSet ds = (MT_PAPORD_7000_LDataSet)request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap	= "^공장^용지종류";
	String sub_cap	= "^공장^용지종류";
	String str_width	= "1,90,90";
	String avg_width	= "";

	try {
		
		if (ds.curlist1.size() >= 7){
			avg_width = "50";
		} else if (ds.curlist1.size() == 6){
			avg_width = "50";
		} else if (ds.curlist1.size() == 5){
			avg_width = "50";
		}
		arrTbl = new String[ds.curlist3.size()][(ds.curlist1.size() * 2) + 3];
		System.out.println("y축=" + ds.curlist3.size() + "x축=" + ds.curlist1.size());
		System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPORD_7000_LCURLIST1Record rec = (MT_PAPORD_7000_LCURLIST1Record) ds.curlist1.get(i);
			str_width += "," + avg_width + ",90";
			str_cap += "^" + rec.issu_dt + "^" + rec.issu_dt;
			sub_cap += "^롤^중량";
		}
		
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPORD_7000_LCURLIST3Record rec = (MT_PAPORD_7000_LCURLIST3Record) ds.curlist3.get(i);
			arrTbl[i][0] =   Integer.toString(i+1);
			arrTbl[i][1] =   rec.fac_clsf;
			arrTbl[i][2] =   rec.roll_wgt;
		}
		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist3.size());
		rt.setColCnt((ds.curlist1.size() * 2) + 3);
		rt.setCaption(str_cap + "|" + sub_cap);
		rt.setColWidth(str_width);
		
		rt.addColumn("output","");
		rt.addColumn("output","");
		rt.addColumn("output","");
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			rt.addColumn("output","format:#,###;");
			rt.addColumn("output","format:#,###;");
		}
		rt.setColumn();
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPORD_7000_LCURLIST2Record rec = (MT_PAPORD_7000_LCURLIST2Record)ds.curlist2.get(i);
			
			if (i % ds.curlist1.size() == 0){
				rowCount++;
				colCount = 3;
			} else {
				colCount+=2;
			}
			//System.out.println("rowCount=[" + rowCount + "]colCount=[" + colCount + "]");
			arrTbl[rowCount-1][colCount] = rec.ordr_roll;
			arrTbl[rowCount-1][colCount + 1] = rec.ordr_wgt;
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
	<CURLIST>
		<record>
			<cmpy_cd/>
			<fac_clsf/>
			<fac_clsf_nm/>
			<roll_wgt/>
			<ordr_roll_cnt_1/>
			<ordr_wgt_1/>
			<ordr_roll_cnt_2/>
			<ordr_wgt_2/>
			<ordr_roll_cnt_3/>
			<ordr_wgt_3/>
			<ordr_roll_cnt_4/>
			<ordr_wgt_4/>
			<ordr_roll_cnt_5/>
			<ordr_wgt_5/>
			<ordr_roll_cnt_6/>
			<ordr_wgt_6/>
			<ordr_roll_cnt_7/>
			<ordr_wgt_7/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 17 17:47:02 KST 2009 */ %>