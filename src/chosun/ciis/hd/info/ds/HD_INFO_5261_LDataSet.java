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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_5261_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INFO_5261_LDataSet(){}
	public HD_INFO_5261_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_INFO_5261_LCURLISTRecord rec = new HD_INFO_5261_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.saly_shft_bank_cd = Util.checkString(rset0.getString("saly_shft_bank_cd"));
			rec.saly_shft_bank_nm = Util.checkString(rset0.getString("saly_shft_bank_nm"));
			rec.saly_shft_acct_no = Util.checkString(rset0.getString("saly_shft_acct_no"));
			rec.alon_shft_bank_cd = Util.checkString(rset0.getString("alon_shft_bank_cd"));
			rec.alon_shft_bank_nm = Util.checkString(rset0.getString("alon_shft_bank_nm"));
			rec.alon_shft_acct_no = Util.checkString(rset0.getString("alon_shft_acct_no"));
			rec.encrg_amt_shft_bank_cd = Util.checkString(rset0.getString("encrg_amt_shft_bank_cd"));
			rec.encrg_amt_shft_bank_nm = Util.checkString(rset0.getString("encrg_amt_shft_bank_nm"));
			rec.encrg_amt_shft_acct_no = Util.checkString(rset0.getString("encrg_amt_shft_acct_no"));
			rec.etc_amt_shft_acct_nm = Util.checkString(rset0.getString("etc_amt_shft_acct_nm"));
			rec.etc_amt_shft_acct = Util.checkString(rset0.getString("etc_amt_shft_acct"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INFO_5261_LDataSet ds = (HD_INFO_5261_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INFO_5261_LCURLISTRecord curlistRec = (HD_INFO_5261_LCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.emp_no%>
<%= curlistRec.saly_shft_bank_cd%>
<%= curlistRec.saly_shft_bank_nm%>
<%= curlistRec.saly_shft_acct_no%>
<%= curlistRec.alon_shft_bank_cd%>
<%= curlistRec.alon_shft_bank_nm%>
<%= curlistRec.alon_shft_acct_no%>
<%= curlistRec.encrg_amt_shft_bank_cd%>
<%= curlistRec.encrg_amt_shft_bank_nm%>
<%= curlistRec.encrg_amt_shft_acct_no%>
<%= curlistRec.etc_amt_shft_acct_nm%>
<%= curlistRec.etc_amt_shft_acct%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Dec 18 13:53:52 KST 2017 */