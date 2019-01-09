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


package chosun.ciis.pl.rtn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.rtn.dm.*;
import chosun.ciis.pl.rtn.rec.*;

/**
 * 
 */


public class PL_RTN_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deal_ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RTN_1310_LDataSet(){}
	public PL_RTN_1310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			PL_RTN_1310_LDEAL_PTCRLISTRecord rec = new PL_RTN_1310_LDEAL_PTCRLISTRecord();
			rec.deal_dt = Util.checkString(rset1.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset1.getString("deal_grp_seq"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset1.getString("medi_ser_no"));
			rec.medi_nm = Util.checkString(rset1.getString("medi_nm"));
			rec.basi_yymm = Util.checkString(rset1.getString("basi_yymm"));
			rec.basi_dt = Util.checkString(rset1.getString("basi_dt"));
			rec.clos_yn = Util.checkString(rset1.getString("clos_yn"));
			rec.deal_qty = Util.checkString(rset1.getString("deal_qty"));
			rec.deal_amt = Util.checkString(rset1.getString("deal_amt"));
			this.deal_ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_RTN_1310_LDataSet ds = (PL_RTN_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.deal_ptcrlist.size(); i++){
		PL_RTN_1310_LDEAL_PTCRLISTRecord deal_ptcrlistRec = (PL_RTN_1310_LDEAL_PTCRLISTRecord)ds.deal_ptcrlist.get(i);%>
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
<%= deal_ptcrlistRec.medi_cd%>
<%= deal_ptcrlistRec.medi_ser_no%>
<%= deal_ptcrlistRec.medi_nm%>
<%= deal_ptcrlistRec.basi_yymm%>
<%= deal_ptcrlistRec.basi_dt%>
<%= deal_ptcrlistRec.clos_yn%>
<%= deal_ptcrlistRec.deal_qty%>
<%= deal_ptcrlistRec.deal_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 31 20:56:57 KST 2009 */