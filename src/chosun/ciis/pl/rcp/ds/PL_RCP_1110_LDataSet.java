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


public class PL_RCP_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList rcpm_ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_1110_LDataSet(){}
	public PL_RCP_1110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			PL_RCP_1110_LRCPM_PTCRLISTRecord rec = new PL_RCP_1110_LRCPM_PTCRLISTRecord();
			rec.rcpm_dt = Util.checkString(rset0.getString("rcpm_dt"));
			rec.dlco_clsf_nm = Util.checkString(rset0.getString("dlco_clsf_nm"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset0.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset0.getString("dlco_abrv_nm"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.rcpm_shet_no = Util.checkString(rset0.getString("rcpm_shet_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset0.getString("slip_clsf"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.dd_clos_yn = Util.checkString(rset0.getString("dd_clos_yn"));
			rec.gurt_amt = Util.checkString(rset0.getString("gurt_amt"));
			this.rcpm_ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_RCP_1110_LDataSet ds = (PL_RCP_1110_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.rcpm_ptcrlist.size(); i++){
		PL_RCP_1110_LRCPM_PTCRLISTRecord rcpm_ptcrlistRec = (PL_RCP_1110_LRCPM_PTCRLISTRecord)ds.rcpm_ptcrlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRcpm_ptcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= rcpm_ptcrlistRec.rcpm_dt%>
<%= rcpm_ptcrlistRec.dlco_clsf_nm%>
<%= rcpm_ptcrlistRec.dlco_cd%>
<%= rcpm_ptcrlistRec.dlco_seq%>
<%= rcpm_ptcrlistRec.dlco_nm%>
<%= rcpm_ptcrlistRec.dlco_abrv_nm%>
<%= rcpm_ptcrlistRec.amt%>
<%= rcpm_ptcrlistRec.rcpm_shet_no%>
<%= rcpm_ptcrlistRec.occr_dt%>
<%= rcpm_ptcrlistRec.slip_clsf%>
<%= rcpm_ptcrlistRec.seq%>
<%= rcpm_ptcrlistRec.dd_clos_yn%>
<%= rcpm_ptcrlistRec.gurt_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Apr 23 15:08:46 KST 2009 */