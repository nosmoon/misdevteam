<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	boolean buf = true;	//���۸� �Ұ��� ������
	
	RwText rt= new RwText();
	
	MT_SUBMATROUT_1116_LDataSet ds = (MT_SUBMATROUT_1116_LDataSet)request.getAttribute("ds");
	
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String str_cap	= "�����ڵ�^�����ڵ�^�����ڵ�^�����ڵ�";
	String str_width	= "1,150,1,150";
	String avg_width	= "";

	try {
		
		if (ds.curlist1.size() == 4){
			avg_width = "150";
		} else if (ds.curlist1.size() == 5){
			avg_width = "130";
		} else if (ds.curlist1.size() == 6){
			avg_width = "100";
		}
		arrTbl = new String[ds.curlist3.size()][(ds.curlist1.size() * 3) + 4];
		System.out.println("y��=" + arrTbl.length + "x��=" + arrTbl[0].length);
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATROUT_1116_LCURLIST1Record rec = (MT_SUBMATROUT_1116_LCURLIST1Record) ds.curlist1.get(i);
			str_width += "," + avg_width + ",1,1";
			str_cap += "^" + rec.medi_nm + "/" + rec.sect_nm + "^" + rec.medi_nm + "/" + rec.sect_nm + "^" + rec.medi_nm + "/" + rec.sect_nm;

		}
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATROUT_1116_LCURLIST3Record rec = (MT_SUBMATROUT_1116_LCURLIST3Record) ds.curlist3.get(i);
			arrTbl[i][0] =   rec.matr_cd;
			arrTbl[i][1] =   rec.matr_clsf_nm;
			arrTbl[i][2] =   rec.matr_clsf;
			arrTbl[i][3] =   rec.matr_nm;
		}
		System.out.println("..1");
		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist3.size());	
		rt.setColCnt((ds.curlist1.size() * 3) + 4);
		rt.setCaption(str_cap);
		rt.setColWidth(str_width);
		
		rt.addColumn("output","visibility:hidden;");
		rt.addColumn("output","");
		rt.addColumn("output","visibility:hidden;");
		rt.addColumn("output","");
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			rt.addColumn("output","format:#,###;");
			rt.addColumn("output","visibility:hidden;");
			rt.addColumn("output","visibility:hidden;");
		}
		rt.setColumn();

		System.out.println("..2");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATROUT_1116_LCURLIST2Record rec = (MT_SUBMATROUT_1116_LCURLIST2Record)ds.curlist2.get(i);
			
			if (i % ds.curlist1.size() == 0){
				rowCount++;
				colCount = 4;
			} else {
				colCount+=3;
			}
			System.out.println("rowCount=[" + rowCount + "]colCount=[" + colCount + "]");
			arrTbl[rowCount-1][colCount] = rec.owh_qunt;
			arrTbl[rowCount-1][colCount + 1] = rec.medi_cd;
			arrTbl[rowCount-1][colCount + 2] = rec.sect_cd;
		}
		System.out.println("..3");
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST3>
		<record>
			<matr_clsf/>
			<matr_clsf_nm/>
			<matr_cd/>
			<matr_nm/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST2>
		<record>
			<matr_clsf/>
			<matr_clsf_nm/>
			<matr_nm/>
			<medi_cd/>
			<sect_cd/>
			<owh_qunt/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST1>
		<record>
			<medi_cd/>
			<sect_cd/>
			<medi_nm/>
			<sect_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Jun 24 15:30:08 KST 2009 */ %>