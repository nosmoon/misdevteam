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


public class PL_RCP_3520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_3520_LDataSet(){}
	public PL_RCP_3520_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(9);
		while(rset2.next()){
			PL_RCP_3520_LPTCRLISTRecord rec = new PL_RCP_3520_LPTCRLISTRecord();
			rec.rcpm_dt = Util.checkString(rset2.getString("rcpm_dt"));
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset2.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset2.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset2.getString("dlco_abrv_nm"));
			rec.bef_gurtamt = Util.checkString(rset2.getString("bef_gurtamt"));
			rec.rcpm_amt = Util.checkString(rset2.getString("rcpm_amt"));
			rec.altn_amt = Util.checkString(rset2.getString("altn_amt"));
			rec.retn_amt = Util.checkString(rset2.getString("retn_amt"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_RCP_3520_LDataSet ds = (PL_RCP_3520_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_RCP_3520_LPTCRLISTRecord ptcrlistRec = (PL_RCP_3520_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPtcrlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ptcrlistRec.rcpm_dt%>
<%= ptcrlistRec.dlco_cd%>
<%= ptcrlistRec.dlco_seq%>
<%= ptcrlistRec.dlco_nm%>
<%= ptcrlistRec.dlco_abrv_nm%>
<%= ptcrlistRec.bef_gurtamt%>
<%= ptcrlistRec.rcpm_amt%>
<%= ptcrlistRec.altn_amt%>
<%= ptcrlistRec.retn_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Apr 28 14:05:51 KST 2009 */