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


public class MC_BUDG_4073_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4073_LDataSet(){}
	public MC_BUDG_4073_LDataSet(String errcode, String errmsg){
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

		ResultSet rset1 = (ResultSet) cstmt.getObject(10);
		while(rset1.next()){
			MC_BUDG_4073_LCURLISTRecord rec = new MC_BUDG_4073_LCURLISTRecord();
			rec.dept_cd = Util.checkString(rset1.getString("dept_cd"));
			rec.work_dt = Util.checkString(rset1.getString("work_dt"));
			rec.hsty_no = Util.checkString(rset1.getString("hsty_no"));
			rec.rmks2 = Util.checkString(rset1.getString("rmks2"));
			rec.sub_no = Util.checkString(rset1.getString("sub_no"));
			rec.evnt_cd = Util.checkString(rset1.getString("evnt_cd"));
			rec.budg_cd = Util.checkString(rset1.getString("budg_cd"));
			rec.budg_yymm = Util.checkString(rset1.getString("budg_yymm"));
			rec.use_dept_cd = Util.checkString(rset1.getString("use_dept_cd"));
			rec.medi_cd = Util.checkString(rset1.getString("medi_cd"));
			rec.rmks = Util.checkString(rset1.getString("rmks"));
			rec.yramt = Util.checkString(rset1.getString("yramt"));
			rec.amt = Util.checkString(rset1.getString("amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_4073_LDataSet ds = (MC_BUDG_4073_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4073_LCURLISTRecord curlistRec = (MC_BUDG_4073_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_cd%>
<%= curlistRec.work_dt%>
<%= curlistRec.hsty_no%>
<%= curlistRec.rmks2%>
<%= curlistRec.sub_no%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.medi_cd%>
<%= curlistRec.rmks%>
<%= curlistRec.yramt%>
<%= curlistRec.amt%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon May 11 20:24:17 KST 2009 */