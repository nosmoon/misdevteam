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


public class MC_BUDG_2021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_2021_LDataSet(){}
	public MC_BUDG_2021_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_2021_LCURLISTRecord rec = new MC_BUDG_2021_LCURLISTRecord();
			rec.yymm = Util.checkString(rset0.getString("yymm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.bsynm = Util.checkString(rset0.getString("bsynm"));
			rec.form_dept_cd = Util.checkString(rset0.getString("form_dept_cd"));
			rec.mt1 = Util.checkString(rset0.getString("mt1"));
			rec.mt2 = Util.checkString(rset0.getString("mt2"));
			rec.mt3 = Util.checkString(rset0.getString("mt3"));
			rec.mt4 = Util.checkString(rset0.getString("mt4"));
			rec.mt5 = Util.checkString(rset0.getString("mt5"));
			rec.mt6 = Util.checkString(rset0.getString("mt6"));
			rec.mt7 = Util.checkString(rset0.getString("mt7"));
			rec.mt8 = Util.checkString(rset0.getString("mt8"));
			rec.mt9 = Util.checkString(rset0.getString("mt9"));
			rec.mt10 = Util.checkString(rset0.getString("mt10"));
			rec.mt11 = Util.checkString(rset0.getString("mt11"));
			rec.mt12 = Util.checkString(rset0.getString("mt12"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_2021_LDataSet ds = (MC_BUDG_2021_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_2021_LCURLISTRecord curlistRec = (MC_BUDG_2021_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.bsynm%>
<%= curlistRec.form_dept_cd%>
<%= curlistRec.mt1%>
<%= curlistRec.mt2%>
<%= curlistRec.mt3%>
<%= curlistRec.mt4%>
<%= curlistRec.mt5%>
<%= curlistRec.mt6%>
<%= curlistRec.mt7%>
<%= curlistRec.mt8%>
<%= curlistRec.mt9%>
<%= curlistRec.mt10%>
<%= curlistRec.mt11%>
<%= curlistRec.mt12%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed May 20 19:26:20 KST 2009 */