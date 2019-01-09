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


public class IS_BUS_1520_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_a = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_1520_LDataSet(){}
	public IS_BUS_1520_LDataSet(String errcode, String errmsg){
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
			IS_BUS_1520_LCURLIST_ARecord rec = new IS_BUS_1520_LCURLIST_ARecord();
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.dm_tgt_amt = Util.checkString(rset0.getString("dm_tgt_amt"));
			rec.dm_rst_amt = Util.checkString(rset0.getString("dm_rst_amt"));
			rec.dm_rate = Util.checkString(rset0.getString("dm_rate"));
			rec.jm_rst_amt = Util.checkString(rset0.getString("jm_rst_amt"));
			rec.dm_j_rate = Util.checkString(rset0.getString("dm_j_rate"));
			rec.dt_tgt_amt = Util.checkString(rset0.getString("dt_tgt_amt"));
			rec.dy_tgt_amt = Util.checkString(rset0.getString("dy_tgt_amt"));
			rec.dy_rst_amt = Util.checkString(rset0.getString("dy_rst_amt"));
			rec.dt_rate = Util.checkString(rset0.getString("dt_rate"));
			rec.dy_rate = Util.checkString(rset0.getString("dy_rate"));
			rec.jy_rst_amt = Util.checkString(rset0.getString("jy_rst_amt"));
			rec.dy_j_rate = Util.checkString(rset0.getString("dy_j_rate"));
			this.curlist_a.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_BUS_1520_LDataSet ds = (IS_BUS_1520_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist_a.size(); i++){
		IS_BUS_1520_LCURLIST_ARecord curlist_aRec = (IS_BUS_1520_LCURLIST_ARecord)ds.curlist_a.get(i);%>
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
<%= curlist_aRec.dm_tgt_amt%>
<%= curlist_aRec.dm_rst_amt%>
<%= curlist_aRec.dm_rate%>
<%= curlist_aRec.jm_rst_amt%>
<%= curlist_aRec.dm_j_rate%>
<%= curlist_aRec.dt_tgt_amt%>
<%= curlist_aRec.dy_tgt_amt%>
<%= curlist_aRec.dy_rst_amt%>
<%= curlist_aRec.dt_rate%>
<%= curlist_aRec.dy_rate%>
<%= curlist_aRec.jy_rst_amt%>
<%= curlist_aRec.dy_j_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jun 19 09:32:29 KST 2012 */