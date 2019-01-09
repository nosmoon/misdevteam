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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_3201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_3201_LDataSet(){}
	public EN_INNEXP_3201_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			EN_INNEXP_3201_LCURLISTRecord rec = new EN_INNEXP_3201_LCURLISTRecord();
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.chrg_pers_emp_nm = Util.checkString(rset0.getString("chrg_pers_emp_nm"));
			rec.stlm_yn = Util.checkString(rset0.getString("stlm_yn"));
			rec.spon_amt = Util.checkString(rset0.getString("spon_amt"));
			rec.advt_amt = Util.checkString(rset0.getString("advt_amt"));
			rec.entr_amt = Util.checkString(rset0.getString("entr_amt"));
			rec.join_amt = Util.checkString(rset0.getString("join_amt"));
			rec.etc_amt = Util.checkString(rset0.getString("etc_amt"));
			rec.reven_amt = Util.checkString(rset0.getString("reven_amt"));
			rec.expn_amt = Util.checkString(rset0.getString("expn_amt"));
			rec.bal_amt = Util.checkString(rset0.getString("bal_amt"));
			rec.unrcp_amt = Util.checkString(rset0.getString("unrcp_amt"));
			rec.budg_reven_amt = Util.checkString(rset0.getString("budg_reven_amt"));
			rec.budg_expn_amt = Util.checkString(rset0.getString("budg_expn_amt"));
			rec.budg_bal_amt = Util.checkString(rset0.getString("budg_bal_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	EN_INNEXP_3201_LDataSet ds = (EN_INNEXP_3201_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_3201_LCURLISTRecord curlistRec = (EN_INNEXP_3201_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.chrg_pers_emp_nm%>
<%= curlistRec.stlm_yn%>
<%= curlistRec.spon_amt%>
<%= curlistRec.advt_amt%>
<%= curlistRec.entr_amt%>
<%= curlistRec.join_amt%>
<%= curlistRec.etc_amt%>
<%= curlistRec.reven_amt%>
<%= curlistRec.expn_amt%>
<%= curlistRec.bal_amt%>
<%= curlistRec.unrcp_amt%>
<%= curlistRec.budg_reven_amt%>
<%= curlistRec.budg_expn_amt%>
<%= curlistRec.budg_bal_amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 11 18:29:55 KST 2009 */