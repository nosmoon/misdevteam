<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtexec.rec.*
	,	chosun.ciis.pr.prtexec.ds.*;
	"
%>

<%
	boolean buf = true;	//���۸� �Ұ��� ������
	RwText rt= new RwText();
	PR_PRTEXEC_4004_LDataSet ds = (PR_PRTEXEC_4004_LDataSet)request.getAttribute("ds");
//	String[][] arrTbl = null;
//	int rowCount = 0;
//	int colCount = 0;
	String[] add_medi_arr = null;
	String[] add_pcnt_arr = null;
	String[] add_clr_arr = null;
	String str_cap	= "";
	String str_width	= "";

	try {
		for(int i = 0; i < ds.curlist_1.size(); i++) {
			PR_PRTEXEC_4004_LCURLIST_1Record rec = (PR_PRTEXEC_4004_LCURLIST_1Record)ds.curlist_1.get(i);
			System.out.println("rec.clr_pcnt.substring(1, rec.clr_pcnt.length())=" + rec.clr_pcnt.substring(1, rec.clr_pcnt.length()));
			add_medi_arr = rec.rdata.substring(1, rec.rdata.length()).split("\\|");
			add_pcnt_arr = rec.pcnt.substring(1, rec.pcnt.length()).split("\\|");
			add_clr_arr = rec.clr_pcnt.substring(1, rec.clr_pcnt.length()).split("\\|");
		}
		System.out.println("add_medi_arr.size()=" + add_medi_arr.length);
		System.out.println("add_clr_arr.size()=" + add_clr_arr.length);
//		arrTbl = new String[ds.curlist_1.size()][add_prt_arr.length + 6];
//		System.out.println("y��=" + arrTbl.length + "x��=" + arrTbl[0].length);
		str_cap 	= "��������";
		str_width	= "80";
		for (int i=0; i<add_medi_arr.length; i++){
			str_cap += "^�ռ��ü^������^Į����";
			str_width += ",120,65,65";
			System.out.println("add_medi_arr[" + i + "]= " + add_medi_arr[i]);
			System.out.println("add_pcnt_arr[" + i + "]= " + add_pcnt_arr[i]);
			System.out.println("add_clr_arr[" + i + "]= " + add_clr_arr[i]);
		}
		str_cap += "^�԰�^�μ�����^�μ�ð�^�ð���^���ⱸ��^�������";
		str_width += ",50,80,70,60,70,100";
		
		rt.setBuffering(buf);
		rt.setRowCnt(ds.curlist_1.size());
		//column ����  ���� ���� 		
		rt.setColCnt((add_medi_arr.length * 3) + 7);
		rt.setCaption(str_cap);
		rt.setColWidth(str_width);
		
		rt.addColumn("output","format:yyyy-mm-dd;");
		for (int i=0; i<add_medi_arr.length; i++){
			rt.addColumn("output","");
			rt.addColumn("output","");
			rt.addColumn("output","");
		}
		rt.addColumn("output","");
		rt.addColumn("output","format:yyyy-mm-dd;");
		rt.addColumn("output","format:hh:\\nn;");
		rt.addColumn("output","");
		rt.addColumn("output","");
		rt.addColumn("output","");
		rt.setColumn();
		
		for(int i = 0; i < ds.curlist_1.size(); i++) {
			PR_PRTEXEC_4004_LCURLIST_1Record rec = (PR_PRTEXEC_4004_LCURLIST_1Record)ds.curlist_1.get(i);
			rt.addColValue(rec.issu_dt);
			for (int ii=0; ii<add_medi_arr.length; ii++){
				rt.addColValue(add_medi_arr[ii]);
				rt.addColValue(add_pcnt_arr[ii].equals("") ? " " : add_pcnt_arr[ii]);
				rt.addColValue(add_clr_arr[ii].equals("") ? " " : add_clr_arr[ii]);
			}
			rt.addColValue(rec.std);
			rt.addColValue(rec.prt_dt);
			rt.addColValue(rec.prt_tm);
			rt.addColValue(rec.tm_in_yn);
			rt.addColValue(rec.dual_out_nm);
			rt.addRowValue(rec.remk);
			
		}
		/****** CURLIST_1 END */

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
	<CURLIST_2>
		<record>
			<issu_dt/>
			<medi_nm/>
			<sect_nm/>
			<pcnt/>
			<clr_pcnt/>
			<std/>
			<prt_dt/>
			<prt_tm/>
			<dual_out_nm/>
			<tm_in_yn/>
			<remk/>
		</record>
	</CURLIST_2>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST_1>
		<record>
			<issu_dt/>
			<add_prt_seq/>
			<prt_dt/>
			<prt_tm/>
			<std/>
			<dual_out_nm/>
			<tm_in_yn/>
			<remk/>
			<add_prt_cnt/>
			<rdata/>
			<pcnt/>
			<clr_pcnt/>
		</record>
	</CURLIST_1>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Wed Jun 10 18:51:42 KST 2009 */ %>