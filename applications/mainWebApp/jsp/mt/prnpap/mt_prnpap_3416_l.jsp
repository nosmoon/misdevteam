<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.prnpap.rec.*
	,	chosun.ciis.mt.prnpap.ds.*;
	"
%>

<%


	String errcode = "";
	String errmsg = "";


    RwText rt = new RwText();
    MT_PRNPAP_3416_LDataSet ds = (MT_PRNPAP_3416_LDataSet)request.getAttribute("ds");
    boolean buf = true;	//���۸� �Ұ��� ������
    errcode = ds.errcode;
	errmsg = ds.errmsg;

	int root = RwXml.rootNodeID;
	int rowCount = 0;
	int colCount = 0;
	int tempCnt = 0;
	String[][] arrTbl = null;
	String str_cap_1  = "��������^��������";
	String str_cap_2  = "��������^��������";
	String str_cap_3  = "��������^��������";
	String str_width	= "70, 70";

	try {
		/****** CURLIST BEGIN */
//System.out.println("20090906-v0.1.6");

		arrTbl = new String[ds.curlist1.size()][ds.curlist2.size() * 2 + 2];

		tempCnt = (890 - 140) / (ds.curlist2.size() * 2);

//System.out.println("������ �迪 SIZE" + ds.curlist2.size() + ")" );
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PRNPAP_3416_LCURLIST2Record rec = (MT_PRNPAP_3416_LCURLIST2Record)ds.curlist2.get(i);

			str_width += ", " + tempCnt + ", " + tempCnt;
			str_cap_1 += "^" +  ( ( rec.cd.equals("A"))? "A.���Ϻ�����" : (rec.cd.equals("B"))? "B.���� ���μ������" : (rec.cd.equals("0"))? " " : "C.���� ���μ�����" ) + "^" +  ( ( rec.cd.equals("A"))? "A.���Ϻ�����" : (rec.cd.equals("B"))? "B.���� ���μ������" : (rec.cd.equals("0"))? " " : "C.���� ���μ�����" );
			str_cap_2 += "^" + rec.title + "^" + rec.title;
			str_cap_3 += "^" + "��" + "^" + "�߷�";
		}
//System.out.println("������ �迪 SIZE" + ds.curlist1.size() + ")" );

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PRNPAP_3416_LCURLIST1Record rec = (MT_PRNPAP_3416_LCURLIST1Record)ds.curlist1.get(i);
			arrTbl[i][0] = rec.cdnm;
		}

		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist1.size());
		rt.setColCnt(ds.curlist2.size() * 2 + 2);
		rt.setCaption(str_cap_1 + "|" + str_cap_2+ "|" + str_cap_3);

		rt.setColWidth(str_width);
		System.out.println("@@@@@@@@@@>>" + str_cap_1 + "|" + str_cap_2+ "|" + str_cap_3);
		System.out.println("@@@@@@@@@@>>" + str_width);
		for(int i = 0; i < ds.curlist2.size() * 2 + 2; i++) {
	 		rt.addColumn("output","");
	 	}

		rt.setColumn();

		out.print(rt.textFlush());

		/////////////////////////////////////////////////////////////end of grid caption title setting////////////////////////////////////////////////////////


		colCount = 1;
	//	System.out.println("STEP2" );
		for(int i = 0; i < arrTbl.length; i++) {
			arrTbl[i][colCount] ="0";
		}
	//	System.out.println("STEP3" );
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PRNPAP_3416_LCURLISTRecord rec = (MT_PRNPAP_3416_LCURLISTRecord)ds.curlist.get(i);
			if (i % ds.curlist1.size() == 0){
				rowCount = 0;
				colCount = colCount + 2;
				//arrTbl[rowCount][colCount-1] =  "0";
			} else {
				rowCount+=1;
				//colCount=3;
			}

 			arrTbl[rowCount][colCount -1] =  rec.cnt;
 			arrTbl[rowCount][colCount   ] =    rec.wgt;

		}

System.out.println("Text Buff Start(" + arrTbl.length + ")");
		for(int i = 0; i < arrTbl.length; i++) {
 			for(int ii = 0; ii < arrTbl[i].length; ii++) {
 				System.out.println("&&&&&" + i + "=" + arrTbl[i][ii] );
 				 if (ii < (arrTbl[i].length - 1)){

	 				rt.addColValue( arrTbl[i][ii] );
	 			} else {
	 				rt.addRowValue( arrTbl[i][ii]  );
	 			}
			}
			//i���� 100 �����϶� �ѹ��� write���ش�.
			if(i % 100 == 0)
				out.print(rt.textFlush());
		}
		System.out.println("Text Buff End");
	    out.print(rt.textFlush());
	}

	catch(Exception e){
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}finally{
		System.out.println("Text Buff End");
		//out.print(rt.textFlush());
	}
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<gubun/>
			<title/>
			<medi_cd/>
			<sect_cd/>
			<issu_dt/>
			<prt_dt/>
			<hdqt_paper_clsf/>
			<cd/>
			<cdnm/>
			<cnt/>
			<wgt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Aug 06 19:44:11 KST 2009 */ %>