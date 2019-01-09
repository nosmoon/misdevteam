/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_8040_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList xx_acct_cd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_leas_stat_cd;
	public String xx_leas_clsf_cd;
	public String xx_acct_cd_010;
	public String xx_prelae_pay_clsf_cd;

	public FC_FUNC_8040_MDataSet(){}
	public FC_FUNC_8040_MDataSet(String errcode, String errmsg, String xx_leas_stat_cd, String xx_leas_clsf_cd, String xx_acct_cd_010, String xx_prelae_pay_clsf_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_leas_stat_cd = xx_leas_stat_cd;
		this.xx_leas_clsf_cd = xx_leas_clsf_cd;
		this.xx_acct_cd_010 = xx_acct_cd_010;
		this.xx_prelae_pay_clsf_cd = xx_prelae_pay_clsf_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_leas_stat_cd(String xx_leas_stat_cd){
		this.xx_leas_stat_cd = xx_leas_stat_cd;
	}

	public void setXx_leas_clsf_cd(String xx_leas_clsf_cd){
		this.xx_leas_clsf_cd = xx_leas_clsf_cd;
	}

	public void setXx_acct_cd_010(String xx_acct_cd_010){
		this.xx_acct_cd_010 = xx_acct_cd_010;
	}

	public void setXx_prelae_pay_clsf_cd(String xx_prelae_pay_clsf_cd){
		this.xx_prelae_pay_clsf_cd = xx_prelae_pay_clsf_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_leas_stat_cd(){
		return this.xx_leas_stat_cd;
	}

	public String getXx_leas_clsf_cd(){
		return this.xx_leas_clsf_cd;
	}

	public String getXx_acct_cd_010(){
		return this.xx_acct_cd_010;
	}

	public String getXx_prelae_pay_clsf_cd(){
		return this.xx_prelae_pay_clsf_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_FUNC_8040_MCURLIST1Record rec = new FC_FUNC_8040_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			FC_FUNC_8040_MXX_ACCT_CD_LISTRecord rec = new FC_FUNC_8040_MXX_ACCT_CD_LISTRecord();
			rec.acct_abrv_nm = Util.checkString(rset1.getString("acct_abrv_nm"));
			rec.acct_cd = Util.checkString(rset1.getString("acct_cd"));
			this.xx_acct_cd_list.add(rec);
		}
		this.xx_leas_stat_cd = Util.checkString(cstmt.getString(8));
		this.xx_leas_clsf_cd = Util.checkString(cstmt.getString(9));
		this.xx_acct_cd_010 = Util.checkString(cstmt.getString(10));
		this.xx_prelae_pay_clsf_cd = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_8040_MDataSet ds = (FC_FUNC_8040_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_8040_MCURLIST1Record curlist1Rec = (FC_FUNC_8040_MCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.xx_acct_cd_list.size(); i++){
		FC_FUNC_8040_MXX_ACCT_CD_LISTRecord xx_acct_cd_listRec = (FC_FUNC_8040_MXX_ACCT_CD_LISTRecord)ds.xx_acct_cd_list.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getXx_acct_cd_list()%>
<%= ds.getXx_leas_stat_cd()%>
<%= ds.getXx_leas_clsf_cd()%>
<%= ds.getXx_acct_cd_010()%>
<%= ds.getXx_prelae_pay_clsf_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cd_abrv_nm%>
<%= xx_acct_cd_listRec.acct_abrv_nm%>
<%= xx_acct_cd_listRec.acct_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 10 09:59:41 KST 2012 */