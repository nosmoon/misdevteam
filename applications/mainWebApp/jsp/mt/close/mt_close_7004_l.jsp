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
	MT_CLOSE_7004_LDataSet ds = (MT_CLOSE_7004_LDataSet)request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap_1    = "자재코드^ 자재명^ 소모량^ 소모금액";
	String str_cap_2    = "자재코드^ 자재명^ 소모량^ 소모금액";
	String str_cap_3    = "자재코드^ 자재명^ 소모량^ 소모금액";
	String str_width    = "70, 150, 100, 100";
	
	try {
		if(ds.curlist2.size() > 0){
		    arrTbl = new String[ds.curlist2.size()][ds.curlist1.size() + 4];
		    System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
		    
		    
		    for(int i = 0; i < ds.curlist1.size(); i++) {
		        MT_CLOSE_7004_LCURLIST1Record rec = (MT_CLOSE_7004_LCURLIST1Record)ds.curlist1.get(i);
		        str_width += ", 100";
		        str_cap_1 += "^" + rec.medi_nm;
		        str_cap_2 += "^" + rec.sect_nm + " ";
		        str_cap_3 += "^" + rec.sonm + " ";
		    }
		    
		    for(int i = 0; i < ds.curlist2.size(); i++) {
		        MT_CLOSE_7004_LCURLIST2Record rec = (MT_CLOSE_7004_LCURLIST2Record)ds.curlist2.get(i);
		        arrTbl[i][0] = rec.matr_cd;
		        arrTbl[i][1] = rec.matr_nm;
		        arrTbl[i][2] = rec.be_qunt;
		        arrTbl[i][3] = rec.be_amt;
		        arrTbl[i][4] = rec.qunt1;
		        arrTbl[i][5] = rec.amt1;
		        arrTbl[i][6] = rec.qunt2;
		        arrTbl[i][7] = rec.amt2;
		        arrTbl[i][8] = rec.qunt3;
		        arrTbl[i][9] = rec.amt3;
		        arrTbl[i][10] = rec.qunt4;
		        arrTbl[i][11] = rec.amt4;
		        arrTbl[i][12] = rec.qunt5;
		        arrTbl[i][13] = rec.amt5;
		        arrTbl[i][14] = rec.qunt6;
		        arrTbl[i][15] = rec.amt6;
		        arrTbl[i][16] = rec.qunt7;
		        arrTbl[i][17] = rec.amt7;
		        arrTbl[i][18] = rec.qunt8;
		        arrTbl[i][19] = rec.amt8;
		        arrTbl[i][20] = rec.qunt9;
		        arrTbl[i][21] = rec.amt9;
		        arrTbl[i][22] = rec.qunt10;
		        arrTbl[i][23] = rec.amt10;
		        arrTbl[i][24] = rec.qunt11;
		        arrTbl[i][25] = rec.amt11;
		        arrTbl[i][26] = rec.qunt12;
		        arrTbl[i][27] = rec.amt12;
		        arrTbl[i][28] = rec.qunt13;
		        arrTbl[i][29] = rec.amt13;
		        arrTbl[i][30] = rec.qunt14;
		        arrTbl[i][31] = rec.amt14;
		        arrTbl[i][32] = rec.qunt15;
		        arrTbl[i][33] = rec.amt15;
		        arrTbl[i][34] = rec.qunt16;
		        arrTbl[i][35] = rec.amt16;
		        arrTbl[i][36] = rec.qunt17;
		        arrTbl[i][37] = rec.amt17;
		        arrTbl[i][38] = rec.qunt18;
		        arrTbl[i][39] = rec.amt18;
		        arrTbl[i][40] = rec.qunt19;
		        arrTbl[i][41] = rec.amt19;
		        arrTbl[i][42] = rec.qunt20;
		        arrTbl[i][43] = rec.amt20;
		    }
		    
		    rt.setBuffering(buf);
		    rt.setRowCnt(ds.curlist2.size());  
		    rt.setColCnt(ds.curlist1.size() + 4);
		    rt.setCaption(str_cap_1 + "|" + str_cap_2 + "|" + str_cap_3);
		    rt.setColWidth(str_width);
		    
		    rt.addColumn("output","");
		    rt.addColumn("output","");
		    rt.addColumn("output","format:#,###.##;ta:right;");
		    rt.addColumn("output","format:#,###;ta:right;");
		    for(int i = 1; i <= ds.curlist1.size(); i++) {
		    	if(i%2 == 0){
	                rt.addColumn("output","format:#,###;ta:right;");
	            }else{
	            	rt.addColumn("output","format:#,##0.################;ta:right;");   
	            }
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
            rt.setColCnt(4);
            rt.setCaption(str_cap_1 + "|" + str_cap_2 + "|" + str_cap_3);
            rt.setColWidth(str_width);
            rt.addColValue( "" );
            rt.addColValue( "" );
            rt.addColValue( "" );
            rt.addRowValue( "" );
            rt.setColumn();
		}
	
	}catch(Exception e){
	    out.print(rt.textFlush());
	}finally{
	    out.print(rt.textFlush());
	}

/*
	RwXml rx = new RwXml();
	MT_CLOSE_7004_LDataSet ds = (MT_CLOSE_7004_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN /
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_CLOSE_7004_LCURLIST2Record rec = (MT_CLOSE_7004_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "dstb_rat_cd", rec.dstb_rat_cd);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "be_qunt", rec.be_qunt);
			rx.add(record, "be_amt", rec.be_amt);
			rx.add(record, "qunt1", rec.qunt1);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "qunt2", rec.qunt2);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "qunt3", rec.qunt3);
			rx.add(record, "amt3", rec.amt3);
			rx.add(record, "qunt4", rec.qunt4);
			rx.add(record, "amt4", rec.amt4);
			rx.add(record, "qunt5", rec.qunt5);
			rx.add(record, "amt5", rec.amt5);
			rx.add(record, "qunt6", rec.qunt6);
			rx.add(record, "amt6", rec.amt6);
			rx.add(record, "qunt7", rec.qunt7);
			rx.add(record, "amt7", rec.amt7);
			rx.add(record, "qunt8", rec.qunt8);
			rx.add(record, "amt8", rec.amt8);
			rx.add(record, "qunt9", rec.qunt9);
			rx.add(record, "amt9", rec.amt9);
			rx.add(record, "qunt10", rec.qunt10);
			rx.add(record, "amt10", rec.amt10);
			rx.add(record, "qunt11", rec.qunt11);
			rx.add(record, "amt11", rec.amt11);
			rx.add(record, "qunt12", rec.qunt12);
			rx.add(record, "amt12", rec.amt12);
			rx.add(record, "qunt13", rec.qunt13);
			rx.add(record, "amt13", rec.amt13);
			rx.add(record, "qunt14", rec.qunt14);
			rx.add(record, "amt14", rec.amt14);
			rx.add(record, "qunt15", rec.qunt15);
			rx.add(record, "amt15", rec.amt15);
			rx.add(record, "qunt16", rec.qunt16);
			rx.add(record, "amt16", rec.amt16);
			rx.add(record, "qunt17", rec.qunt17);
			rx.add(record, "amt17", rec.amt17);
			rx.add(record, "qunt18", rec.qunt18);
			rx.add(record, "amt18", rec.amt18);
			rx.add(record, "qunt19", rec.qunt19);
			rx.add(record, "amt19", rec.amt19);
			rx.add(record, "qunt20", rec.qunt20);
			rx.add(record, "amt20", rec.amt20);
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "dstb_rat_cd", StringUtil.replaceToXml(rec.dstb_rat_cd));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "be_qunt", StringUtil.replaceToXml(rec.be_qunt));
			//rx.add(record, "be_amt", StringUtil.replaceToXml(rec.be_amt));
			//rx.add(record, "qunt1", StringUtil.replaceToXml(rec.qunt1));
			//rx.add(record, "amt1", StringUtil.replaceToXml(rec.amt1));
			//rx.add(record, "qunt2", StringUtil.replaceToXml(rec.qunt2));
			//rx.add(record, "amt2", StringUtil.replaceToXml(rec.amt2));
			//rx.add(record, "qunt3", StringUtil.replaceToXml(rec.qunt3));
			//rx.add(record, "amt3", StringUtil.replaceToXml(rec.amt3));
			//rx.add(record, "qunt4", StringUtil.replaceToXml(rec.qunt4));
			//rx.add(record, "amt4", StringUtil.replaceToXml(rec.amt4));
			//rx.add(record, "qunt5", StringUtil.replaceToXml(rec.qunt5));
			//rx.add(record, "amt5", StringUtil.replaceToXml(rec.amt5));
			//rx.add(record, "qunt6", StringUtil.replaceToXml(rec.qunt6));
			//rx.add(record, "amt6", StringUtil.replaceToXml(rec.amt6));
			//rx.add(record, "qunt7", StringUtil.replaceToXml(rec.qunt7));
			//rx.add(record, "amt7", StringUtil.replaceToXml(rec.amt7));
			//rx.add(record, "qunt8", StringUtil.replaceToXml(rec.qunt8));
			//rx.add(record, "amt8", StringUtil.replaceToXml(rec.amt8));
			//rx.add(record, "qunt9", StringUtil.replaceToXml(rec.qunt9));
			//rx.add(record, "amt9", StringUtil.replaceToXml(rec.amt9));
			//rx.add(record, "qunt10", StringUtil.replaceToXml(rec.qunt10));
			//rx.add(record, "amt10", StringUtil.replaceToXml(rec.amt10));
			//rx.add(record, "qunt11", StringUtil.replaceToXml(rec.qunt11));
			//rx.add(record, "amt11", StringUtil.replaceToXml(rec.amt11));
			//rx.add(record, "qunt12", StringUtil.replaceToXml(rec.qunt12));
			//rx.add(record, "amt12", StringUtil.replaceToXml(rec.amt12));
			//rx.add(record, "qunt13", StringUtil.replaceToXml(rec.qunt13));
			//rx.add(record, "amt13", StringUtil.replaceToXml(rec.amt13));
			//rx.add(record, "qunt14", StringUtil.replaceToXml(rec.qunt14));
			//rx.add(record, "amt14", StringUtil.replaceToXml(rec.amt14));
			//rx.add(record, "qunt15", StringUtil.replaceToXml(rec.qunt15));
			//rx.add(record, "amt15", StringUtil.replaceToXml(rec.amt15));
			//rx.add(record, "qunt16", StringUtil.replaceToXml(rec.qunt16));
			//rx.add(record, "amt16", StringUtil.replaceToXml(rec.amt16));
			//rx.add(record, "qunt17", StringUtil.replaceToXml(rec.qunt17));
			//rx.add(record, "amt17", StringUtil.replaceToXml(rec.amt17));
			//rx.add(record, "qunt18", StringUtil.replaceToXml(rec.qunt18));
			//rx.add(record, "amt18", StringUtil.replaceToXml(rec.amt18));
			//rx.add(record, "qunt19", StringUtil.replaceToXml(rec.qunt19));
			//rx.add(record, "amt19", StringUtil.replaceToXml(rec.amt19));
			//rx.add(record, "qunt20", StringUtil.replaceToXml(rec.qunt20));
			//rx.add(record, "amt20", StringUtil.replaceToXml(rec.amt20));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END /

		/****** CURLIST1 BEGIN /
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_CLOSE_7004_LCURLIST1Record rec = (MT_CLOSE_7004_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "irow", rec.irow);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "so_irow", rec.so_irow);
			rx.add(record, "sonm", rec.sonm);
			rx.add(record, "irow2", rec.irow2);
			//rx.add(record, "irow", StringUtil.replaceToXml(rec.irow));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
			//rx.add(record, "so_irow", StringUtil.replaceToXml(rec.so_irow));
			//rx.add(record, "sonm", StringUtil.replaceToXml(rec.sonm));
			//rx.add(record, "irow2", StringUtil.replaceToXml(rec.irow2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END /

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
*/	

%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_close_7004_l>
	<dataSet>
		<CURLIST2>
			<record>
				<fac_clsf/>
				<dstb_rat_cd/>
				<matr_cd/>
				<matr_nm/>
				<be_qunt/>
				<be_amt/>
				<qunt1/>
				<amt1/>
				<qunt2/>
				<amt2/>
				<qunt3/>
				<amt3/>
				<qunt4/>
				<amt4/>
				<qunt5/>
				<amt5/>
				<qunt6/>
				<amt6/>
				<qunt7/>
				<amt7/>
				<qunt8/>
				<amt8/>
				<qunt9/>
				<amt9/>
				<qunt10/>
				<amt10/>
				<qunt11/>
				<amt11/>
				<qunt12/>
				<amt12/>
				<qunt13/>
				<amt13/>
				<qunt14/>
				<amt14/>
				<qunt15/>
				<amt15/>
				<qunt16/>
				<amt16/>
				<qunt17/>
				<amt17/>
				<qunt18/>
				<amt18/>
				<qunt19/>
				<amt19/>
				<qunt20/>
				<amt20/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_close_7004_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_close_7004_l>
	<dataSet>
		<CURLIST1>
			<record>
				<irow/>
				<medi_cd/>
				<sect_cd/>
				<medi_nm/>
				<sect_nm/>
				<so_irow/>
				<sonm/>
				<irow2/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_close_7004_l>
*/
%>

<% /* 작성시간 : Wed Jul 15 13:52:30 KST 2009 */ %>