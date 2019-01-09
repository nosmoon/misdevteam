<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	boolean buf = true;	//���۸� �Ұ��� ������
	
	RwText rt= new RwText();
	
	PR_PAPMAKE_1053_LDataSet ds = (PR_PAPMAKE_1053_LDataSet)request.getAttribute("ds");
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String col_medi			= "";
//	String col_sect			= "";
	String colwidth			= "80";
	String base_width		= "";

	try {
		arrTbl = new String[ds.curlist1.size()][(ds.curlist3.size() * 3) + 2];
		System.out.println("x��=" + arrTbl[0].length + "y��=" + arrTbl.length);
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PAPMAKE_1053_LCURLIST1Record rec = (PR_PAPMAKE_1053_LCURLIST1Record)ds.curlist1.get(i);
			arrTbl[i][0] = rec.matr_cd;
			arrTbl[i][1] = rec.matr_nm;
		}
		System.out.println("curlist3.size=" + ds.curlist3.size());
		if (ds.curlist2.size() == 2){
			base_width = "100";
			System.out.println("2");
		} else if (ds.curlist2.size() == 3){
			base_width = "90";
			System.out.println("3");
		} else if (ds.curlist2.size() == 4){
			base_width = "80";
			System.out.println("4");
		} else {
			base_width = "70";
		}
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PAPMAKE_1053_LCURLIST3Record rec = (PR_PAPMAKE_1053_LCURLIST3Record)ds.curlist3.get(i);
			col_medi += "^" + rec.medi_nm + "^" + rec.medi_nm + "^" + rec.medi_nm;
			colwidth += "," + base_width + "," + base_width + "," + base_width;
		}

		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PAPMAKE_1053_LCURLIST3Record rec = (PR_PAPMAKE_1053_LCURLIST3Record)ds.curlist3.get(i);
//			col_sect += "^" + rec.medi_nm + " ^" + rec.sect_nm + " ^" + rec.sect_nm + " ^" + rec.sect_nm + " ";
//			colwidth += "," + base_width + "," + base_width + "," + base_width + "," + base_width;
			
			for(int ii = 0; ii < ds.curlist1.size(); ii++) {
				arrTbl[ii][(i*3)+2] = rec.medi_cd;
			}
		}
		rt.setBuffering(buf);
		rt.setRowCnt(-1);
		//column ����  ���� ���� 		
		rt.setColCnt((ds.curlist3.size() * 3) + 2);
		rt.setCaption("����^����" + col_medi);
		rt.setColWidth("80, " + colwidth);
		
		//column type �� ��Ÿ�� ���� �߰�.
		rt.addColumn("output","visibility:hidden;");
		rt.addColumn("output","");
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			rt.addColumn("input","visibility:hidden;");		// ��ü�ڵ�
			rt.addColumn("input","visibility:hidden;");		// SEQ
			rt.addColumn("input","format:#,###;");			// ��뷮
			
			//rt.addColumn("input","");		// ��ü�ڵ�
			//rt.addColumn("input","");		// �����ڵ�
			//rt.addColumn("input","");		// SEQ
			//rt.addColumn("input","format:#,###;");			// ��뷮
		}

		//column type �� ��Ÿ�� ���� ����
		rt.setColumn();
		System.out.println("000=" + ds.curlist1.size() + "_2 SIZE=" + ds.curlist2.size());
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PAPMAKE_1053_LCURLIST2Record rec = (PR_PAPMAKE_1053_LCURLIST2Record)ds.curlist2.get(i);
			if (ds.curlist3.size() > 0){
				if (i % (ds.curlist3.size()) == 0){
					rowCount++;
					colCount = 2;
				} else {
					//System.out.println(i + "=" + i + "_" + (ds.curlist3.size() + 1));
					colCount += 3;
				}
				//System.out.println("rowCount=" + rowCount + "    colCount=" + colCount);
				//arrTbl[rowCount-1][(colCount)] = rec.medi_cd;
				//arrTbl[rowCount-1][(colCount + 1)] = rec.sect_cd;
				arrTbl[rowCount-1][(colCount + 1)] = rec.seq;
				arrTbl[rowCount-1][(colCount + 2)] = rec.use_qunt_1;
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
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST4>
			<record>
				<matr_cd/>
				<matr_nm/>
				<use_qunt_1/>
				<use_qunt_2/>
				<seq/>
				<dlco_cd/>
				<dlco_nm/>
			</record>
		</CURLIST4>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST3>
			<record>
				<matr_cd/>
				<matr_nm/>
				<use_qunt_1/>
				<use_qunt_2/>
				<seq/>
				<dlco_cd/>
				<dlco_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST2>
			<record>
				<matr_cd/>
				<matr_nm/>
				<use_qunt_1/>
				<use_qunt_2/>
				<seq/>
				<dlco_cd/>
				<dlco_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST1>
			<record>
				<matr_cd/>
				<matr_nm/>
				<use_qunt_1/>
				<use_qunt_2/>
				<seq/>
				<dlco_cd/>
				<dlco_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST5>
			<record>
				<medi_cd/>
				<medi_nm/>
				<sect_cd/>
				<sect_nm/>
			</record>
		</CURLIST5>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<% /* �ۼ��ð� : Fri Jul 10 19:26:27 KST 2009 */ %>