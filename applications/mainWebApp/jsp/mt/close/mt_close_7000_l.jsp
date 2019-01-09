<%@ page contentType="text/xml; charset=EUC-KR" %>

<%@ page import="
        java.io.*
    ,   java.sql.*
    ,   java.util.*
    ,   kr.co.comsquare.rwXmlLib.*
    ,   kr.co.comsquare.db.*
    ,   kr.co.comsquare.util.Tokenizer
    ,   chosun.ciis.mt.close.rec.*
    ,   chosun.ciis.mt.close.ds.*;
    "
%>

<%

    boolean buf = true; //버퍼링 할건지 말건지
    RwText rt= new RwText();
    MT_CLOSE_7000_LDataSet ds = (MT_CLOSE_7000_LDataSet)request.getAttribute("ds");
    
    String[][] arrTbl = null;
    int rowCount = 0;
    int colCount = 0;
    String str_cap_1    = "공장^ 배부비^ 배부비명^ 소모금액^ 소모량";
    String str_cap_2    = "공장^ 배부비^ 배부비명^ 소모금액^ 소모량";
    String str_width    = "70,70,120,100,100";
    
    try {

    	if(ds.curlist2.size() > 0){
	        arrTbl = new String[ds.curlist2.size()][ds.curlist1.size() + 5];
	        
	        System.out.println("y축=" + arrTbl.length + "x축=" + arrTbl[0].length);
	        
	        
	        for(int i = 0; i < ds.curlist1.size(); i++) {
	            MT_CLOSE_7000_LCURLIST1Record rec = (MT_CLOSE_7000_LCURLIST1Record)ds.curlist1.get(i);
	            str_width += ", 70";
	            str_cap_1 += "^" + rec.medi_nm;
	            str_cap_2 += "^" + rec.sect_nm + " ";
	        }

	        for(int i = 0; i < ds.curlist2.size(); i++) {
	            MT_CLOSE_7000_LCURLIST2Record rec = (MT_CLOSE_7000_LCURLIST2Record)ds.curlist2.get(i);
	            arrTbl[i][0] = rec.fac_clsf + "  " + rec.fac_clsf_nm;
	            arrTbl[i][1] = rec.dstb_rat_cd;
	            arrTbl[i][2] = rec.medi_nm;
	            arrTbl[i][3] = rec.be_amt;
	            arrTbl[i][4] = rec.be_qunt;
	            arrTbl[i][5] = rec.amt1 + "%";
	            arrTbl[i][6] = rec.amt2 + "%";
	            arrTbl[i][7] = rec.amt3 + "%";
	            arrTbl[i][8] = rec.amt4 + "%";
	            arrTbl[i][9] = rec.amt5 + "%";
	            arrTbl[i][10] = rec.amt6 + "%";
	            arrTbl[i][11] = rec.amt7 + "%";
	            arrTbl[i][12] = rec.amt8 + "%";
	            arrTbl[i][13] = rec.amt9 + "%";
	            arrTbl[i][14] = rec.amt10 + "%";
	            arrTbl[i][15] = rec.amt11 + "%";
	            arrTbl[i][16] = rec.amt12 + "%";
	            arrTbl[i][17] = rec.amt13 + "%";
	            arrTbl[i][18] = rec.amt14 + "%";
	            arrTbl[i][19] = rec.amt15 + "%";
	            arrTbl[i][20] = rec.amt16 + "%";
	            arrTbl[i][21] = rec.amt17 + "%";
	            arrTbl[i][22] = rec.amt18 + "%";
	            arrTbl[i][23] = rec.amt19 + "%";
	            arrTbl[i][24] = rec.amt20 + "%";
	            arrTbl[i][25] = rec.amt21 + "%";
	            arrTbl[i][26] = rec.amt22 + "%";
	            arrTbl[i][27] = rec.amt23 + "%";
	            arrTbl[i][28] = rec.amt24 + "%";
	            arrTbl[i][29] = rec.amt25 + "%";
	            arrTbl[i][30] = rec.amt26 + "%";
	            arrTbl[i][31] = rec.amt27 + "%";
	            arrTbl[i][32] = rec.amt28 + "%";
	            arrTbl[i][33] = rec.amt29 + "%";
	            arrTbl[i][34] = rec.amt30 + "%";
	        }
	        
	        rt.setBuffering(buf);
	        rt.setRowCnt(ds.curlist2.size());  
	        rt.setColCnt(ds.curlist1.size() + 5);
	        rt.setCaption(str_cap_1 + "|" + str_cap_2);
	        rt.setColWidth(str_width);

	        rt.addColumn("output","");
	        rt.addColumn("output","");
	        rt.addColumn("output","");
	        rt.addColumn("output","format:#,###;ta:right;");
	        rt.addColumn("output","format:#,##0.################;ta:right;");
	        for(int i = 0; i < ds.curlist1.size(); i++) {
	            rt.addColumn("output","");
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
            rt.setColCnt(5);
            rt.setCaption(str_cap_1 + "|" + str_cap_2);
            rt.setColWidth(str_width);	
            rt.addColumn("output","");
            rt.addColumn("output","");
            rt.addColumn("output","");
            rt.addColumn("output","format:#,###;ta:right;");
            rt.addColumn("output","format:#,###.##;ta:right;");
            rt.setColumn();
    	}
    }catch(Exception e){
        out.print(rt.textFlush());
    }finally{
        out.print(rt.textFlush());
    }

/*
    RwXml rx = new RwXml();
    MT_CLOSE_7000_LDataSet ds = (MT_CLOSE_7000_LDataSet)request.getAttribute("ds");
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
            MT_CLOSE_7000_LCURLIST2Record rec = (MT_CLOSE_7000_LCURLIST2Record)ds.curlist2.get(i);
            int record = rx.add(recordSet, "record", "");
            rx.add(record, "fac_clsf", rec.fac_clsf);
            rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
            rx.add(record, "dstb_rat_cd", rec.dstb_rat_cd);
            rx.add(record, "medi_nm", rec.medi_nm);
            rx.add(record, "be_amt", rec.be_amt);
            rx.add(record, "be_qunt", rec.be_qunt);
            rx.add(record, "amt1", rec.amt1);
            rx.add(record, "amt2", rec.amt2);
            rx.add(record, "amt3", rec.amt3);
            rx.add(record, "amt4", rec.amt4);
            rx.add(record, "amt5", rec.amt5);
            rx.add(record, "amt6", rec.amt6);
            rx.add(record, "amt7", rec.amt7);
            rx.add(record, "amt8", rec.amt8);
            rx.add(record, "amt9", rec.amt9);
            rx.add(record, "amt10", rec.amt10);
            rx.add(record, "amt11", rec.amt11);
            rx.add(record, "amt12", rec.amt12);
            rx.add(record, "amt13", rec.amt13);
            rx.add(record, "amt14", rec.amt14);
            rx.add(record, "amt15", rec.amt15);
            rx.add(record, "amt16", rec.amt16);
            rx.add(record, "amt17", rec.amt17);
            rx.add(record, "amt18", rec.amt18);
            rx.add(record, "amt19", rec.amt19);
            rx.add(record, "amt20", rec.amt20);
            rx.add(record, "amt21", rec.amt21);
            rx.add(record, "amt22", rec.amt22);
            rx.add(record, "amt23", rec.amt23);
            rx.add(record, "amt24", rec.amt24);
            rx.add(record, "amt25", rec.amt25);
            rx.add(record, "amt26", rec.amt26);
            rx.add(record, "amt27", rec.amt27);
            rx.add(record, "amt28", rec.amt28);
            rx.add(record, "amt29", rec.amt29);
            rx.add(record, "amt30", rec.amt30);
            //rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
            //rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
            //rx.add(record, "dstb_rat_cd", StringUtil.replaceToXml(rec.dstb_rat_cd));
            //rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
            //rx.add(record, "be_amt", StringUtil.replaceToXml(rec.be_amt));
            //rx.add(record, "be_qunt", StringUtil.replaceToXml(rec.be_qunt));
            //rx.add(record, "amt1", StringUtil.replaceToXml(rec.amt1));
            //rx.add(record, "amt2", StringUtil.replaceToXml(rec.amt2));
            //rx.add(record, "amt3", StringUtil.replaceToXml(rec.amt3));
            //rx.add(record, "amt4", StringUtil.replaceToXml(rec.amt4));
            //rx.add(record, "amt5", StringUtil.replaceToXml(rec.amt5));
            //rx.add(record, "amt6", StringUtil.replaceToXml(rec.amt6));
            //rx.add(record, "amt7", StringUtil.replaceToXml(rec.amt7));
            //rx.add(record, "amt8", StringUtil.replaceToXml(rec.amt8));
            //rx.add(record, "amt9", StringUtil.replaceToXml(rec.amt9));
            //rx.add(record, "amt10", StringUtil.replaceToXml(rec.amt10));
            //rx.add(record, "amt11", StringUtil.replaceToXml(rec.amt11));
            //rx.add(record, "amt12", StringUtil.replaceToXml(rec.amt12));
            //rx.add(record, "amt13", StringUtil.replaceToXml(rec.amt13));
            //rx.add(record, "amt14", StringUtil.replaceToXml(rec.amt14));
            //rx.add(record, "amt15", StringUtil.replaceToXml(rec.amt15));
            //rx.add(record, "amt16", StringUtil.replaceToXml(rec.amt16));
            //rx.add(record, "amt17", StringUtil.replaceToXml(rec.amt17));
            //rx.add(record, "amt18", StringUtil.replaceToXml(rec.amt18));
            //rx.add(record, "amt19", StringUtil.replaceToXml(rec.amt19));
            //rx.add(record, "amt20", StringUtil.replaceToXml(rec.amt20));
            //rx.add(record, "amt21", StringUtil.replaceToXml(rec.amt21));
            //rx.add(record, "amt22", StringUtil.replaceToXml(rec.amt22));
            //rx.add(record, "amt23", StringUtil.replaceToXml(rec.amt23));
            //rx.add(record, "amt24", StringUtil.replaceToXml(rec.amt24));
            //rx.add(record, "amt25", StringUtil.replaceToXml(rec.amt25));
            //rx.add(record, "amt26", StringUtil.replaceToXml(rec.amt26));
            //rx.add(record, "amt27", StringUtil.replaceToXml(rec.amt27));
            //rx.add(record, "amt28", StringUtil.replaceToXml(rec.amt28));
            //rx.add(record, "amt29", StringUtil.replaceToXml(rec.amt29));
            //rx.add(record, "amt30", StringUtil.replaceToXml(rec.amt30));
        }
        rx.add(recordSet, "totalcnt", ds.curlist2.size());
        /****** CURLIST2 END */

        /****** CURLIST1 BEGIN /
        recordSet = rx.add(dataSet, "CURLIST1", "");

        for(int i = 0; i < ds.curlist1.size(); i++) {
            MT_CLOSE_7000_LCURLIST1Record rec = (MT_CLOSE_7000_LCURLIST1Record)ds.curlist1.get(i);
            int record = rx.add(recordSet, "record", "");
            rx.add(record, "irow", rec.irow);
            rx.add(record, "medi_cd", rec.medi_cd);
            rx.add(record, "sect_cd", rec.sect_cd);
            rx.add(record, "medi_nm", rec.medi_nm);
            rx.add(record, "sect_nm", rec.sect_nm);
            rx.add(record, "irow2", rec.irow2);
            //rx.add(record, "irow", StringUtil.replaceToXml(rec.irow));
            //rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
            //rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
            //rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
            //rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
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
<mt_close_7000_l>
    <dataSet>
        <CURLIST2>
            <record>
                <fac_clsf/>
                <fac_clsf_nm/>
                <dstb_rat_cd/>
                <medi_nm/>
                <be_amt/>
                <be_qunt/>
                <amt1/>
                <amt2/>
                <amt3/>
                <amt4/>
                <amt5/>
                <amt6/>
                <amt7/>
                <amt8/>
                <amt9/>
                <amt10/>
                <amt11/>
                <amt12/>
                <amt13/>
                <amt14/>
                <amt15/>
                <amt16/>
                <amt17/>
                <amt18/>
                <amt19/>
                <amt20/>
                <amt21/>
                <amt22/>
                <amt23/>
                <amt24/>
                <amt25/>
                <amt26/>
                <amt27/>
                <amt28/>
                <amt29/>
                <amt30/>
            </record>
        </CURLIST2>
    </dataSet>
</mt_close_7000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_close_7000_l>
    <dataSet>
        <CURLIST1>
            <record>
                <irow/>
                <medi_cd/>
                <sect_cd/>
                <medi_nm/>
                <sect_nm/>
                <irow2/>
            </record>
        </CURLIST1>
    </dataSet>
</mt_close_7000_l>
*/
%>

<% /* 작성시간 : Tue Jul 14 13:56:01 KST 2009 */ %>