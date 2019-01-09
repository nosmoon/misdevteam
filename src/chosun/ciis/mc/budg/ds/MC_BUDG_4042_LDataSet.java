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


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4042_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4042_LDataSet(){}
	public MC_BUDG_4042_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(11);
		while(rset0.next()){
			MC_BUDG_4042_LCURLISTRecord rec = new MC_BUDG_4042_LCURLISTRecord();
			rec.work_no = Util.checkString(rset0.getString("work_no"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.dtsqty = Util.checkString(rset0.getString("dtsqty"));
			rec.dtdan = Util.checkString(rset0.getString("dtdan"));
			rec.dtamt = Util.checkString(rset0.getString("dtamt"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.crte_clsf = Util.checkString(rset0.getString("crte_clsf"));
			rec.work_dt = Util.checkString(rset0.getString("work_dt"));
			rec.hsty_no = Util.checkString(rset0.getString("hsty_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_4042_LDataSet ds = (MC_BUDG_4042_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4042_LCURLISTRecord curlistRec = (MC_BUDG_4042_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.work_no%>
<%= curlistRec.medi_cd%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.dtsqty%>
<%= curlistRec.dtdan%>
<%= curlistRec.dtamt%>
<%= curlistRec.rmks%>
<%= curlistRec.crte_clsf%>
<%= curlistRec.work_dt%>
<%= curlistRec.hsty_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Apr 17 14:51:07 KST 2009 */