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


public class MC_BUDG_2031_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_2031_LDataSet(){}
	public MC_BUDG_2031_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			MC_BUDG_2031_LCURLISTRecord rec = new MC_BUDG_2031_LCURLISTRecord();
			rec.yymm = Util.checkString(rset2.getString("yymm"));
			rec.sum_31_qunt = Util.checkString(rset2.getString("sum_31_qunt"));
			rec.sum_32_qunt = Util.checkString(rset2.getString("sum_32_qunt"));
			rec.sum_33_qunt = Util.checkString(rset2.getString("sum_33_qunt"));
			rec.sum_38_qunt = Util.checkString(rset2.getString("sum_38_qunt"));
			rec.sum_39_qunt = Util.checkString(rset2.getString("sum_39_qunt"));
			rec.rmks = Util.checkString(rset2.getString("rmks"));
			rec.form_dept_cd = Util.checkString(rset2.getString("form_dept_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_2031_LDataSet ds = (MC_BUDG_2031_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_2031_LCURLISTRecord curlistRec = (MC_BUDG_2031_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.sum_31_qunt%>
<%= curlistRec.sum_32_qunt%>
<%= curlistRec.sum_33_qunt%>
<%= curlistRec.sum_38_qunt%>
<%= curlistRec.sum_39_qunt%>
<%= curlistRec.rmks%>
<%= curlistRec.form_dept_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 19 21:27:05 KST 2009 */