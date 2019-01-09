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


public class FC_ACCT_1031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_1031_LDataSet(){}
	public FC_ACCT_1031_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_1031_LCURLISTRecord rec = new FC_ACCT_1031_LCURLISTRecord();
			rec.insd_acct_cd = Util.checkString(rset0.getString("insd_acct_cd"));
			rec.acct_subj_nm = Util.checkString(rset0.getString("acct_subj_nm"));
			rec.supr_acct_cd = Util.checkString(rset0.getString("supr_acct_cd"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.slip_incmg_exne = Util.checkString(rset0.getString("slip_incmg_exne"));
			rec.drcr_bal_clsf = Util.checkString(rset0.getString("drcr_bal_clsf"));
			rec.setoff_yn = Util.checkString(rset0.getString("setoff_yn"));
			rec.tbs_exne = Util.checkString(rset0.getString("tbs_exne"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_1031_LDataSet ds = (FC_ACCT_1031_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_1031_LCURLISTRecord curlistRec = (FC_ACCT_1031_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.insd_acct_cd%>
<%= curlistRec.acct_subj_nm%>
<%= curlistRec.supr_acct_cd%>
<%= curlistRec.acct_cd%>
<%= curlistRec.slip_incmg_exne%>
<%= curlistRec.drcr_bal_clsf%>
<%= curlistRec.setoff_yn%>
<%= curlistRec.tbs_exne%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 27 17:00:08 KST 2009 */