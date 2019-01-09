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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6281_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList cur_vatdeclstmt_list_1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String vat_fr_yymm;
	public String vat_to_yymm;
	public String clos_yn;

	public FC_ACCT_6281_SDataSet(){}
	public FC_ACCT_6281_SDataSet(String errcode, String errmsg, String vat_fr_yymm, String vat_to_yymm, String clos_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.vat_fr_yymm = vat_fr_yymm;
		this.vat_to_yymm = vat_to_yymm;
		this.clos_yn = clos_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setVat_fr_yymm(String vat_fr_yymm){
		this.vat_fr_yymm = vat_fr_yymm;
	}

	public void setVat_to_yymm(String vat_to_yymm){
		this.vat_to_yymm = vat_to_yymm;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getVat_fr_yymm(){
		return this.vat_fr_yymm;
	}

	public String getVat_to_yymm(){
		return this.vat_to_yymm;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			FC_ACCT_6281_SCUR_VATDECLSTMT_LIST_1Record rec = new FC_ACCT_6281_SCUR_VATDECLSTMT_LIST_1Record();
			rec.decl_unit_clsf_cd = Util.checkString(rset0.getString("decl_unit_clsf_cd"));
			rec.erplace_cd = Util.checkString(rset0.getString("erplace_cd"));
			rec.ernm_tax = Util.checkString(rset0.getString("ernm_tax"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.clos_yn = Util.checkString(rset0.getString("clos_yn"));
			this.cur_vatdeclstmt_list_1.add(rec);
		}
		this.vat_fr_yymm = Util.checkString(cstmt.getString(10));
		this.vat_to_yymm = Util.checkString(cstmt.getString(11));
		this.clos_yn = Util.checkString(cstmt.getString(12));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_6281_SDataSet ds = (FC_ACCT_6281_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.cur_vatdeclstmt_list_1.size(); i++){
		FC_ACCT_6281_SCUR_VATDECLSTMT_LIST_1Record cur_vatdeclstmt_list_1Rec = (FC_ACCT_6281_SCUR_VATDECLSTMT_LIST_1Record)ds.cur_vatdeclstmt_list_1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCur_vatdeclstmt_list_1()%>
<%= ds.getVat_fr_yymm()%>
<%= ds.getVat_to_yymm()%>
<%= ds.getClos_yn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= cur_vatdeclstmt_list_1Rec.decl_unit_clsf_cd%>
<%= cur_vatdeclstmt_list_1Rec.erplace_cd%>
<%= cur_vatdeclstmt_list_1Rec.ernm_tax%>
<%= cur_vatdeclstmt_list_1Rec.ern%>
<%= cur_vatdeclstmt_list_1Rec.clos_yn%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jun 27 18:10:34 KST 2014 */