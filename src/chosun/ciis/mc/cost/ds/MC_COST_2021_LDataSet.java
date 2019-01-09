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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_2021_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_COST_2021_LDataSet(){}
	public MC_COST_2021_LDataSet(String errcode, String errmsg){
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

		ResultSet rset10 = (ResultSet) cstmt.getObject(6);
		while(rset10.next()){
			MC_COST_2021_LCURLISTRecord rec = new MC_COST_2021_LCURLISTRecord();
			rec.cost_dstb_cd = Util.checkString(rset10.getString("cost_dstb_cd"));
			rec.cost_dstb_nm = Util.checkString(rset10.getString("cost_dstb_nm"));
			rec.cur_mon_qty = Util.checkString(rset10.getString("cur_mon_qty"));
			rec.bef_mon_qty = Util.checkString(rset10.getString("bef_mon_qty"));
			rec.sub_qty = Util.checkString(rset10.getString("sub_qty"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_COST_2021_LDataSet ds = (MC_COST_2021_LDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_2021_LCURLISTRecord curlistRec = (MC_COST_2021_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cost_dstb_cd%>
<%= curlistRec.cost_dstb_nm%>
<%= curlistRec.cur_mon_qty%>
<%= curlistRec.bef_mon_qty%>
<%= curlistRec.sub_qty%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri May 08 13:01:51 KST 2009 */