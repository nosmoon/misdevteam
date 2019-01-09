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


package chosun.ciis.as.aset.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.rec.*;

/**
 * 
 */


public class AS_ASET_1402_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_ASET_1402_LDataSet(){}
	public AS_ASET_1402_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			AS_ASET_1402_LCURLISTRecord rec = new AS_ASET_1402_LCURLISTRecord();
			rec.acct_nm = Util.checkString(rset0.getString("acct_nm"));
			rec.ndduc_rate = Util.checkString(rset0.getString("ndduc_rate"));
			rec.ndduc_amt = Util.checkString(rset0.getString("ndduc_amt"));
			rec.aset_cnt = Util.checkString(rset0.getString("aset_cnt"));
			rec.ndduc_year = Util.checkString(rset0.getString("ndduc_year"));
			rec.ndduc_prd_clsf = Util.checkString(rset0.getString("ndduc_prd_clsf"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AS_ASET_1402_LDataSet ds = (AS_ASET_1402_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_ASET_1402_LCURLISTRecord curlistRec = (AS_ASET_1402_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.acct_nm%>
<%= curlistRec.ndduc_rate%>
<%= curlistRec.ndduc_amt%>
<%= curlistRec.aset_cnt%>
<%= curlistRec.ndduc_year%>
<%= curlistRec.ndduc_prd_clsf%>
<%= curlistRec.acct_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Mar 17 16:21:32 KST 2009 */