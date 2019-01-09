/***************************************************************************************************
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.pl.rcp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rcp.dm.*;
import chosun.ciis.pl.rcp.rec.*;

/**
 * 
 */


public class PL_RCP_1120_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList crdt_ptcrcur = new ArrayList();
	public ArrayList closinfocur = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_1120_LDataSet(){}
	public PL_RCP_1120_LDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset4 = (ResultSet) cstmt.getObject(10);
		while(rset4.next()){
			PL_RCP_1120_LCLOSINFOCURRecord rec = new PL_RCP_1120_LCLOSINFOCURRecord();
			rec.medi_clsf = Util.checkString(rset4.getString("medi_clsf"));
			rec.medi_clsf_nm = Util.checkString(rset4.getString("medi_clsf_nm"));
			rec.basi_yymm = Util.checkString(rset4.getString("basi_yymm"));
			rec.cyov_bal = Util.checkString(rset4.getString("cyov_bal"));
			rec.sale_amt = Util.checkString(rset4.getString("sale_amt"));
			rec.rcpm_amt = Util.checkString(rset4.getString("rcpm_amt"));
			rec.thmm_bal = Util.checkString(rset4.getString("thmm_bal"));
			rec.meda_bal = Util.checkString(rset4.getString("meda_bal"));
			rec.tot_bal = Util.checkString(rset4.getString("tot_bal"));
			this.closinfocur.add(rec);
		}
		ResultSet rset5 = (ResultSet) cstmt.getObject(11);
		while(rset5.next()){
			PL_RCP_1120_LCRDT_PTCRCURRecord rec = new PL_RCP_1120_LCRDT_PTCRCURRecord();
			rec.budg_clsf = Util.checkString(rset5.getString("budg_clsf"));
			rec.basi_yymm = Util.checkString(rset5.getString("basi_yymm"));
			rec.amt = Util.checkString(rset5.getString("amt"));
			rec.slip_clsf = Util.checkString(rset5.getString("slip_clsf"));
			rec.seq = Util.checkString(rset5.getString("seq"));
			rec.subseq = Util.checkString(rset5.getString("subseq"));
			rec.dd_clos_yn = Util.checkString(rset5.getString("dd_clos_yn"));
			rec.remk = Util.checkString(rset5.getString("remk"));
			this.crdt_ptcrcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_RCP_1120_LDataSet ds = (PL_RCP_1120_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.closinfocur.size(); i++){
		PL_RCP_1120_LCLOSINFOCURRecord closinfocurRec = (PL_RCP_1120_LCLOSINFOCURRecord)ds.closinfocur.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.crdt_ptcrcur.size(); i++){
		PL_RCP_1120_LCRDT_PTCRCURRecord crdt_ptcrcurRec = (PL_RCP_1120_LCRDT_PTCRCURRecord)ds.crdt_ptcrcur.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClosinfocur()%>
<%= ds.getCrdt_ptcrcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= closinfocurRec.medi_clsf%>
<%= closinfocurRec.medi_clsf_nm%>
<%= closinfocurRec.basi_yymm%>
<%= closinfocurRec.cyov_bal%>
<%= closinfocurRec.sale_amt%>
<%= closinfocurRec.rcpm_amt%>
<%= closinfocurRec.thmm_bal%>
<%= closinfocurRec.meda_bal%>
<%= closinfocurRec.tot_bal%>
<%= crdt_ptcrcurRec.budg_clsf%>
<%= crdt_ptcrcurRec.basi_yymm%>
<%= crdt_ptcrcurRec.amt%>
<%= crdt_ptcrcurRec.slip_clsf%>
<%= crdt_ptcrcurRec.seq%>
<%= crdt_ptcrcurRec.subseq%>
<%= crdt_ptcrcurRec.dd_clos_yn%>
<%= crdt_ptcrcurRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 23 15:08:46 KST 2009 */