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


package chosun.ciis.is.rpt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.rpt.dm.*;
import chosun.ciis.is.rpt.rec.*;

/**
 * 
 */


public class IS_RPT_1310_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_RPT_1310_LDataSet(){}
	public IS_RPT_1310_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			IS_RPT_1310_LCURLIST1Record rec = new IS_RPT_1310_LCURLIST1Record();
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.pm_rst_amt = Util.checkString(rset0.getString("pm_rst_amt"));
			rec.dm_tgt_amt = Util.checkString(rset0.getString("dm_tgt_amt"));
			rec.dm_rst_amt = Util.checkString(rset0.getString("dm_rst_amt"));
			rec.dm_d_rate = Util.checkString(rset0.getString("dm_d_rate"));
			rec.ny_tgt_amt = Util.checkString(rset0.getString("ny_tgt_amt"));
			rec.ny_rst_amt = Util.checkString(rset0.getString("ny_rst_amt"));
			rec.ny_d_rate = Util.checkString(rset0.getString("ny_d_rate"));
			rec.incr_amt = Util.checkString(rset0.getString("incr_amt"));
			rec.incr_rate = Util.checkString(rset0.getString("incr_rate"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_RPT_1310_LDataSet ds = (IS_RPT_1310_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		IS_RPT_1310_LCURLIST1Record curlist1Rec = (IS_RPT_1310_LCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.dept_cd%>
<%= curlist1Rec.dept_cd_nm%>
<%= curlist1Rec.pm_rst_amt%>
<%= curlist1Rec.dm_tgt_amt%>
<%= curlist1Rec.dm_rst_amt%>
<%= curlist1Rec.dm_d_rate%>
<%= curlist1Rec.ny_tgt_amt%>
<%= curlist1Rec.ny_rst_amt%>
<%= curlist1Rec.ny_d_rate%>
<%= curlist1Rec.incr_amt%>
<%= curlist1Rec.incr_rate%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu May 31 13:13:58 KST 2012 */