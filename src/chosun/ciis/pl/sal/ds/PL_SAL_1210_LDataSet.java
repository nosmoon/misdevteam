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


package chosun.ciis.pl.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.pl.sal.dm.*;
import chosun.ciis.pl.sal.rec.*;

/**
 * 
 */


public class PL_SAL_1210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList deal_ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_SAL_1210_LDataSet(){}
	public PL_SAL_1210_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			PL_SAL_1210_LDEAL_PTCRLISTRecord rec = new PL_SAL_1210_LDEAL_PTCRLISTRecord();
			rec.deal_dt = Util.checkString(rset0.getString("deal_dt"));
			rec.deal_grp_seq = Util.checkString(rset0.getString("deal_grp_seq"));
			rec.medi_clsf = Util.checkString(rset0.getString("medi_clsf"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.send_plac_seq = Util.checkString(rset0.getString("send_plac_seq"));
			rec.send_plac_nm = Util.checkString(rset0.getString("send_plac_nm"));
			rec.basi_yymm = Util.checkString(rset0.getString("basi_yymm"));
			rec.basi_dt = Util.checkString(rset0.getString("basi_dt"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			rec.deal_qty = Util.checkString(rset0.getString("deal_qty"));
			rec.deal_amt = Util.checkString(rset0.getString("deal_amt"));
			this.deal_ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_SAL_1210_LDataSet ds = (PL_SAL_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.deal_ptcrlist.size(); i++){
		PL_SAL_1210_LDEAL_PTCRLISTRecord deal_ptcrlistRec = (PL_SAL_1210_LDEAL_PTCRLISTRecord)ds.deal_ptcrlist.get(i);%>
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
<%= deal_ptcrlistRec.medi_clsf%>
<%= deal_ptcrlistRec.dlco_cd%>
<%= deal_ptcrlistRec.dlco_seq%>
<%= deal_ptcrlistRec.dlco_nm%>
<%= deal_ptcrlistRec.send_plac_seq%>
<%= deal_ptcrlistRec.send_plac_nm%>
<%= deal_ptcrlistRec.basi_yymm%>
<%= deal_ptcrlistRec.basi_dt%>
<%= deal_ptcrlistRec.clos_yn%>
<%= deal_ptcrlistRec.deal_qty%>
<%= deal_ptcrlistRec.deal_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 24 18:16:37 KST 2009 */