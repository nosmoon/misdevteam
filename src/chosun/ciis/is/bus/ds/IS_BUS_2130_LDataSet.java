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


public class IS_BUS_2130_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_2130_LDataSet(){}
	public IS_BUS_2130_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			IS_BUS_2130_LCURLIST_1Record rec = new IS_BUS_2130_LCURLIST_1Record();
			rec.bo_cd = Util.checkString(rset0.getString("bo_cd"));
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.asnt_dstc_cd_nm = Util.checkString(rset0.getString("asnt_dstc_cd_nm"));
			this.curlist_1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	IS_BUS_2130_LDataSet ds = (IS_BUS_2130_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist_1.size(); i++){
		IS_BUS_2130_LCURLIST_1Record curlist_1Rec = (IS_BUS_2130_LCURLIST_1Record)ds.curlist_1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist_1Rec.bo_cd%>
<%= curlist_1Rec.bo_nm%>
<%= curlist_1Rec.asnt_dstc_cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 21 15:20:31 KST 2012 */