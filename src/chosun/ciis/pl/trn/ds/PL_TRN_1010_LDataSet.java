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


package chosun.ciis.pl.trn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.trn.dm.*;
import chosun.ciis.pl.trn.rec.*;

/**
 * 
 */


public class PL_TRN_1010_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deal_ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_TRN_1010_LDataSet(){}
	public PL_TRN_1010_LDataSet(String errcode, String errmsg){
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

		ResultSet rset4 = (ResultSet) cstmt.getObject(9);
		while(rset4.next()){
			PL_TRN_1010_LDEAL_PTCRLISTRecord rec = new PL_TRN_1010_LDEAL_PTCRLISTRecord();
			rec.deal_dt = Util.checkString(rset4.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset4.getString("deal_grp_seq"));
			rec.dlco_cd = Util.checkString(rset4.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset4.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset4.getString("dlco_nm"));
			rec.basi_yymm = Util.checkString(rset4.getString("basi_yymm"));
			rec.basi_dt = Util.checkString(rset4.getString("basi_dt"));
			rec.clos_yn = Util.checkString(rset4.getString("clos_yn"));
			rec.deal_qty = Util.checkString(rset4.getString("deal_qty"));
			rec.deal_amt = Util.checkString(rset4.getString("deal_amt"));
			this.deal_ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_TRN_1010_LDataSet ds = (PL_TRN_1010_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.deal_ptcrlist.size(); i++){
		PL_TRN_1010_LDEAL_PTCRLISTRecord deal_ptcrlistRec = (PL_TRN_1010_LDEAL_PTCRLISTRecord)ds.deal_ptcrlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getDeal_ptcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= deal_ptcrlistRec.deal_dt%>
<%= deal_ptcrlistRec.deal_grp_seq%>
<%= deal_ptcrlistRec.dlco_cd%>
<%= deal_ptcrlistRec.dlco_seq%>
<%= deal_ptcrlistRec.dlco_nm%>
<%= deal_ptcrlistRec.basi_yymm%>
<%= deal_ptcrlistRec.basi_dt%>
<%= deal_ptcrlistRec.clos_yn%>
<%= deal_ptcrlistRec.deal_qty%>
<%= deal_ptcrlistRec.deal_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Apr 01 16:59:58 KST 2009 */