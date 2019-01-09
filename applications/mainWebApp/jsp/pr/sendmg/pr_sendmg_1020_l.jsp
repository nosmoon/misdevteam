<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.sendmg.rec.*
	,	chosun.ciis.pr.sendmg.ds.*;
	"
%>

<%
	boolean buf = true;	//���۸� �Ұ��� ������
	
	RwText rt= new RwText();
	
	PR_SENDMG_1020_LDataSet ds = (PR_SENDMG_1020_LDataSet)request.getAttribute("ds");
	String[][] arrTbl = null;
	int rowCount = 0;
	int colCount = 0;
	String col_ecnt			= "";
	String col_ecnt_sub		= "";
	String col_ecnt_width	= "";
	String base_width		= "";

	try {

		arrTbl = new String[ds.curlist3.size()][(ds.curlist2.size() * 5) + 7];
		System.out.println("x��=" + arrTbl[0].length + "y��=" + arrTbl.length);
		
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_SENDMG_1020_LCURLIST3Record rec = (PR_SENDMG_1020_LCURLIST3Record)ds.curlist3.get(i);
			arrTbl[i][0] = rec.cd_abrv_cdnm;
			arrTbl[i][1] = rec.cd;
		}
		System.out.println("curlist2.size=" + ds.curlist2.size());
		if (ds.curlist2.size() == 2){
			base_width = "85";
			System.out.println("2");
		} else if (ds.curlist2.size() == 3){
			base_width = "70";
			System.out.println("3");
		} else if (ds.curlist2.size() == 4){
			base_width = "60";
			System.out.println("4");
		}
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_SENDMG_1020_LCURLIST2Record rec = (PR_SENDMG_1020_LCURLIST2Record)ds.curlist2.get(i);
			col_ecnt_sub += "^����^�ü�^����^�Ǽ�^����";
			for (int ii=0; ii<5; ii++){
				col_ecnt += "^" + rec.ecnt + "��";
				col_ecnt_width += ", " + base_width;
			}
		}

		rt.setBuffering(buf);
		//rt.setRowCnt(ds.curlist4.size());
		rt.setRowCnt(ds.curlist3.size());
		//column ����  ���� ���� 		
		rt.setColCnt((ds.curlist2.size() * 5) + 7);
		rt.setCaption("����^����^������" + col_ecnt + "^�߼���Ȳ(�����Ǳ���)^�߼���Ȳ(�����Ǳ���)^�߼���Ȳ(�����Ǳ���)^�߼���Ȳ(�����Ǳ���)|����^����^������" + col_ecnt_sub + "^ù��߳뼱^ù��߳뼱^�����뼱^�����뼱");
		rt.setColWidth("80, " + base_width + ", " + base_width + col_ecnt_width + ", " + base_width + ", " + base_width + ", " + base_width + ", " + base_width);
		
		//column type �� ��Ÿ�� ���� �߰�.
		rt.addColumn("output","");
		rt.addColumn("input","visibility:hidden;");
		rt.addColumn("input","");
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			rt.addColumn("input","visibility:hidden;");
			rt.addColumn("input","format:hh\\:nn;");
			rt.addColumn("input","format:hh\\:nn;");
			rt.addColumn("input","visibility:hidden;");
			rt.addColumn("input","visibility:hidden;");
		}
		
		rt.addColumn("input","");
		rt.addColumn("input","format:hh\\:nn;");
		rt.addColumn("input","");
		rt.addColumn("input","format:hh\\:nn;");
		//column type �� ��Ÿ�� ���� ����
		rt.setColumn();
		System.out.println("000=" + ds.curlist1.size() + "_2 SIZE=" + ds.curlist2.size());
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_SENDMG_1020_LCURLIST1Record rec = (PR_SENDMG_1020_LCURLIST1Record)ds.curlist1.get(i);
			if (ds.curlist2.size() > 0){
				if (i % (ds.curlist2.size()) == 0){
					rowCount++;
					colCount = 3;
				} else {
					//System.out.println(i + "=" + i + "_" + (ds.curlist3.size() + 1));
					colCount += 5;
				}
//				arrTbl[rowCount-1][(colCount)] = rec.off_plat_tm;
				arrTbl[rowCount-1][(colCount + 1)] = rec.prt_bgn_tm;
				arrTbl[rowCount-1][(colCount + 2)] = rec.prt_end_tm;
				arrTbl[rowCount-1][(colCount + 3)] = rec.ecnt;
			}
		}
		System.out.println("001");
		/*
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_SENDMG_1020_LCURLIST4Record rec = (PR_SENDMG_1020_LCURLIST4Record)ds.curlist4.get(i);
			
			System.out.println("arrTbl[i][1]=" + arrTbl[i][1]);
			if (arrTbl[i][1].equals(rec.jbincode)){
				arrTbl[i][((ds.curlist2.size() * 5) + 3)] = rec.jbbalcha_jbcode;
				arrTbl[i][((ds.curlist2.size() * 5) + 4)] = rec.jbbalcha;
				arrTbl[i][((ds.curlist2.size() * 5) + 5)] = rec.jbdotime_jbcode;
				arrTbl[i][((ds.curlist2.size() * 5) + 6)] = rec.jbdotime;
			}
		}
		System.out.println("002");
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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST>
		<record>
			<medi_nm/>
			<prt_plac_clsf/>
			<ecnt/>
			<off_plat_tm/>
			<prt_ex_tm/>
			<prt_end_tm/>
			<card_qty/>
			<dqty/>
			<cmpy_cd/>
			<medi_cd/>
			<issu_dt/>
			<excp_qty/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Apr 29 16:42:00 KST 2009 */ %>