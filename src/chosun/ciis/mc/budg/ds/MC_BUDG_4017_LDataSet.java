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


public class MC_BUDG_4017_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4017_LDataSet(){}
	public MC_BUDG_4017_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_4017_LCURLISTRecord rec = new MC_BUDG_4017_LCURLISTRecord();
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			rec.budg_yymm = Util.checkString(rset0.getString("budg_yymm"));
			rec.use_dept_cd = Util.checkString(rset0.getString("use_dept_cd"));
			rec.use_dept_nm = Util.checkString(rset0.getString("use_dept_nm"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.yrsqty = Util.checkString(rset0.getString("yrsqty"));
			rec.yrdan = Util.checkString(rset0.getString("yrdan"));
			rec.yramt = Util.checkString(rset0.getString("yramt"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.qunt = Util.checkString(rset0.getString("qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.hsty_no = Util.checkString(rset0.getString("hsty_no"));
			rec.sub_no = Util.checkString(rset0.getString("sub_no"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_4017_LDataSet ds = (MC_BUDG_4017_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4017_LCURLISTRecord curlistRec = (MC_BUDG_4017_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
<%= curlistRec.budg_yymm%>
<%= curlistRec.use_dept_cd%>
<%= curlistRec.use_dept_nm%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_nm%>
<%= curlistRec.rmks%>
<%= curlistRec.yrsqty%>
<%= curlistRec.yrdan%>
<%= curlistRec.yramt%>
<%= curlistRec.amt%>
<%= curlistRec.qunt%>
<%= curlistRec.uprc%>
<%= curlistRec.hsty_no%>
<%= curlistRec.sub_no%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 29 14:47:01 KST 2009 */