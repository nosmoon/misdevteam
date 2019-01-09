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
	
	MT_PAPINOUT_9203_LDataSet ds = (MT_PAPINOUT_9203_LDataSet)request.getAttribute("ds");
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String col_ecnt			= "";
	String col_ecnt_sub		= "";
	String col_ecnt_width	= "";
	String base_width		= "";

	try {
		arrTbl = new String[ds.curlist2.size()][(ds.curlist3.size() * 2) + 1];
		System.out.println("x축=" + arrTbl[0].length + "y축=" + arrTbl.length);
		
		/****** CURLIST3 BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST3", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_9203_LCURLIST2Record rec = (MT_PAPINOUT_9203_LCURLIST2Record)ds.curlist2.get(i);
			arrTbl[i][0] = rec.ewh_dt;
		}

		if (ds.curlist2.size() == 2){
			base_width = "320";
		} else if (ds.curlist2.size() == 3){
			base_width = "280";
		} else if (ds.curlist2.size() == 4){
			base_width = "220";
		} else {
			base_width = "150";
		}

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPINOUT_9203_LCURLIST3Record rec = (MT_PAPINOUT_9203_LCURLIST3Record)ds.curlist3.get(i);
			col_ecnt_sub += "^구입량^구입금액";
			for (int ii=0; ii<2; ii++){
				col_ecnt += "^" + rec.matr_cd;
				col_ecnt_width += ", " + base_width;
			}
		}
		
		rt.setBuffering(buf);
		//rt.setRowCnt(ds.curlist4.size());
		rt.setRowCnt(ds.curlist2.size());
		//column 갯수  정보 셋팅 		
		rt.setColCnt((ds.curlist3.size() * 2) + 1);
		rt.setCaption("구분" + col_ecnt + "|구분" + col_ecnt_sub);
		rt.setColWidth("100" + col_ecnt_width);
		
		
		//column type 및 스타일 정보 추가.
		rt.addColumn("output","format:yyyy-mm-dd;");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			rt.addColumn("output","format:#,###;");
			rt.addColumn("output","format:#,###;");
		}
		
		//column type 및 스타일 정보 셋팅
		rt.setColumn();
		System.out.println("000=" + ds.curlist1.size() + "_2 SIZE=" + ds.curlist2.size());
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPINOUT_9203_LCURLIST1Record rec = (MT_PAPINOUT_9203_LCURLIST1Record)ds.curlist1.get(i);
			if (ds.curlist3.size() > 0){
				if (i % (ds.curlist3.size()) == 0){
					rowCount++;
					colCount = 1;
				} else {
					//System.out.println(i + "=" + i + "_" + (ds.curlist3.size() + 1));
					colCount += 2;
				}
//				arrTbl[rowCount-1][(colCount)] = rec.off_plat_tm;
				arrTbl[rowCount-1][colCount] = rec.ewh_wgt;
				arrTbl[rowCount-1][(colCount + 1)] = rec.ewh_amt;
			}
		}
		System.out.println("001");
		

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
	<CURLIST3>
		<record>
			<matr_cd/>
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
			<ewh_dt/>
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
			<ewh_dt/>
			<matr_cd/>
			<ewh_wgt/>
			<ewh_amt/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Wed May 20 08:58:24 KST 2009 */ %>