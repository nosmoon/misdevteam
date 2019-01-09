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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1560_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_a = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_1560_LDataSet(){}
	public IS_BUS_1560_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			IS_BUS_1560_LCURLIST_ARecord rec = new IS_BUS_1560_LCURLIST_ARecord();
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.dm_amt = Util.checkString(rset0.getString("dm_amt"));
			rec.dm_amt_3 = Util.checkString(rset0.getString("dm_amt_3"));
			rec.dm_amt_2 = Util.checkString(rset0.getString("dm_amt_2"));
			rec.jm_amt = Util.checkString(rset0.getString("jm_amt"));
			rec.jm_amt_3 = Util.checkString(rset0.getString("jm_amt_3"));
			rec.jm_amt_2 = Util.checkString(rset0.getString("jm_amt_2"));
			rec.dm_amt_rate = Util.checkString(rset0.getString("dm_amt_rate"));
			rec.dm_amt_3_rate = Util.checkString(rset0.getString("dm_amt_3_rate"));
			rec.dm_amt_2_rate = Util.checkString(rset0.getString("dm_amt_2_rate"));
			this.curlist_a.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_BUS_1560_LDataSet ds = (IS_BUS_1560_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_BUS_1560_LCURLIST_ARecord curlist_aRec = (IS_BUS_1560_LCURLIST_ARecord)ds.curlist_a.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_a()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist_aRec.dept_cd_nm%>
<%= curlist_aRec.dm_amt%>
<%= curlist_aRec.dm_amt_3%>
<%= curlist_aRec.dm_amt_2%>
<%= curlist_aRec.jm_amt%>
<%= curlist_aRec.jm_amt_3%>
<%= curlist_aRec.jm_amt_2%>
<%= curlist_aRec.dm_amt_rate%>
<%= curlist_aRec.dm_amt_3_rate%>
<%= curlist_aRec.dm_amt_2_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 19 10:19:33 KST 2012 */