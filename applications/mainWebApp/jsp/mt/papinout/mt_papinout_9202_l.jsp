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
	boolean buf = true;	//���۸� �Ұ��� ������

	RwText rt= new RwText();

	MT_PAPINOUT_9202_LDataSet ds = (MT_PAPINOUT_9202_LDataSet)request.getAttribute("ds");
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String col_ecnt			= "����";
	String col_ecnt_sub		= "��������";
	String col_ecnt_width	= "70";
	String base_width		= "60";
    int    tmpWidth   = 0;

	try {

		arrTbl = new String[ds.curlist2.size()][(ds.curlist3.size() * 2) + 1];
		System.out.println("x��=" + arrTbl[0].length + "y��=" + arrTbl.length);

		/****** CURLIST3 BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST3", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_PAPINOUT_9202_LCURLIST2Record rec = (MT_PAPINOUT_9202_LCURLIST2Record)ds.curlist2.get(i);
			arrTbl[i][0] = rec.ewh_dt;
		}

		//tmpWidth = (850 - 70) / (ds.curlist3.size() * 2);

		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_PAPINOUT_9202_LCURLIST3Record rec = (MT_PAPINOUT_9202_LCURLIST3Record)ds.curlist3.get(i);
			col_ecnt_sub  =  col_ecnt_sub + "^���Է�^���Աݾ�";
			col_ecnt      =  col_ecnt + "^"  + rec.fac_clsf + "^" + rec.fac_clsf;

			base_width    = base_width + " , " + 50  + " , " + 70;
		}

		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist2.size());
		rt.setColCnt((ds.curlist3.size() * 2) + 1);
		rt.setCaption(col_ecnt + "|" + col_ecnt_sub);
		rt.setColWidth(base_width);

System.out.println(col_ecnt + "|" + col_ecnt_sub);
System.out.println(base_width);
		//column type �� ��Ÿ�� ���� �߰�.

		rt.addColumn("output","format:yyyy-mm-dd;");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			rt.addColumn("output","format:#,###;");
			rt.addColumn("output","format:#,###;");
		}

		//column type �� ��Ÿ�� ���� ����
		rt.setColumn();
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_PAPINOUT_9202_LCURLIST1Record rec = (MT_PAPINOUT_9202_LCURLIST1Record)ds.curlist1.get(i);
			if (ds.curlist2.size() > 0){
				if (i % ds.curlist2.size() == 0){
					rowCount  = 0;
					colCount  += 2;
				} else {
					rowCount += 1;
				}
				System.out.println("row :" + rowCount + "col :" + colCount);

//				arrTbl[rowCount-1][(colCount)] = rec.off_plat_tm;
				arrTbl[rowCount][colCount -1] = rec.ewh_wgt;
				arrTbl[rowCount][colCount] = rec.ewh_amt;
			}
		}
		System.out.println("001");

		for(int i = 0; i < arrTbl.length; i++) {
			for(int ii = 0; ii < arrTbl[i].length; ii++) {
				System.out.println(">"+ i + ">>>>"+ ii + ">>>>>>>>" + arrTbl[i][ii]);
				if (ii < (arrTbl[i].length - 1)){
					rt.addColValue( arrTbl[i][ii] );
				} else {
					rt.addRowValue( arrTbl[i][ii] );
				}
			}
			//out.print(rt.textFlush());
			System.out.println("END");
		}
	}catch(Exception e){
		out.print(rt.textFlush());
	}finally{
		out.print(rt.textFlush());
	}
%>
<% /* �ۼ��ð� : Wed May 20 08:58:24 KST 2009 */ %>