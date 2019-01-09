/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.move.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
 * 
 */


public class SS_S_MOVM_RDR_COSTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String bonm;
	public String bankcd;
	public String deps_persnm;
	public String acctno;

	public SS_S_MOVM_RDR_COSTDataSet(){}
	public SS_S_MOVM_RDR_COSTDataSet(String errcode, String errmsg, String bonm, String bankcd, String deps_persnm, String acctno){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bonm = bonm;
		this.bankcd = bankcd;
		this.deps_persnm = deps_persnm;
		this.acctno = acctno;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBankcd(String bankcd){
		this.bankcd = bankcd;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBankcd(){
		return this.bankcd;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.bonm = Util.checkString(cstmt.getString(5));
		this.bankcd = Util.checkString(cstmt.getString(6));
		this.deps_persnm = Util.checkString(cstmt.getString(7));
		this.acctno = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_S_MOVM_RDR_COSTDataSet ds = (SS_S_MOVM_RDR_COSTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBonm()%>
<%= ds.getBankcd()%>
<%= ds.getDeps_persnm()%>
<%= ds.getAcctno()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 24 09:33:26 GMT 2014 */