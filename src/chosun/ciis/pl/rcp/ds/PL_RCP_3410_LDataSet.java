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


public class PL_RCP_3410_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList ptcrlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public PL_RCP_3410_LDataSet(){}
	public PL_RCP_3410_LDataSet(String errcode, String errmsg){
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

		ResultSet rset8 = (ResultSet) cstmt.getObject(11);
		while(rset8.next()){
			PL_RCP_3410_LPTCRLISTRecord rec = new PL_RCP_3410_LPTCRLISTRecord();
			rec.dlco_clsf_nm = Util.checkString(rset8.getString("dlco_clsf_nm"));
			rec.area_nm = Util.checkString(rset8.getString("area_nm"));
			rec.dlco_cd = Util.checkString(rset8.getString("dlco_cd"));
			rec.dlco_seq = Util.checkString(rset8.getString("dlco_seq"));
			rec.dlco_nm = Util.checkString(rset8.getString("dlco_nm"));
			rec.dlco_abrv_nm = Util.checkString(rset8.getString("dlco_abrv_nm"));
			rec.cyov_bal = Util.checkString(rset8.getString("cyov_bal"));
			rec.sale_amt = Util.checkString(rset8.getString("sale_amt"));
			rec.bal_sum = Util.checkString(rset8.getString("bal_sum"));
			rec.rcpm_amt = Util.checkString(rset8.getString("rcpm_amt"));
			rec.meda_bal = Util.checkString(rset8.getString("meda_bal"));
			this.ptcrlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PL_RCP_3410_LDataSet ds = (PL_RCP_3410_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.ptcrlist.size(); i++){
		PL_RCP_3410_LPTCRLISTRecord ptcrlistRec = (PL_RCP_3410_LPTCRLISTRecord)ds.ptcrlist.get(i);%>
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

<%= ptcrlistRec.dlco_clsf_nm%>
<%= ptcrlistRec.area_nm%>
<%= ptcrlistRec.dlco_cd%>
<%= ptcrlistRec.dlco_seq%>
<%= ptcrlistRec.dlco_nm%>
<%= ptcrlistRec.dlco_abrv_nm%>
<%= ptcrlistRec.cyov_bal%>
<%= ptcrlistRec.sale_amt%>
<%= ptcrlistRec.bal_sum%>
<%= ptcrlistRec.rcpm_amt%>
<%= ptcrlistRec.meda_bal%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Apr 27 18:18:56 KST 2009 */