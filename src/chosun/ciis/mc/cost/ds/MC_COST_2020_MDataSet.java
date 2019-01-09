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


public class MC_COST_2020_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_clos_clsf_010;
	public String xx_clos_clsf_020;
	public String xx_clos_clsf_030;

	public MC_COST_2020_MDataSet(){}
	public MC_COST_2020_MDataSet(String errcode, String errmsg, String xx_clos_clsf_010, String xx_clos_clsf_020, String xx_clos_clsf_030){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_clos_clsf_010 = xx_clos_clsf_010;
		this.xx_clos_clsf_020 = xx_clos_clsf_020;
		this.xx_clos_clsf_030 = xx_clos_clsf_030;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_clos_clsf_010(String xx_clos_clsf_010){
		this.xx_clos_clsf_010 = xx_clos_clsf_010;
	}

	public void setXx_clos_clsf_020(String xx_clos_clsf_020){
		this.xx_clos_clsf_020 = xx_clos_clsf_020;
	}

	public void setXx_clos_clsf_030(String xx_clos_clsf_030){
		this.xx_clos_clsf_030 = xx_clos_clsf_030;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_clos_clsf_010(){
		return this.xx_clos_clsf_010;
	}

	public String getXx_clos_clsf_020(){
		return this.xx_clos_clsf_020;
	}

	public String getXx_clos_clsf_030(){
		return this.xx_clos_clsf_030;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MC_COST_2020_MCURLISTRecord rec = new MC_COST_2020_MCURLISTRecord();
			rec.work_cym = Util.checkString(rset0.getString("work_cym"));
			this.curlist.add(rec);
		}
		this.xx_clos_clsf_010 = Util.checkString(cstmt.getString(6));
		this.xx_clos_clsf_020 = Util.checkString(cstmt.getString(7));
		this.xx_clos_clsf_030 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_COST_2020_MDataSet ds = (MC_COST_2020_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_2020_MCURLISTRecord curlistRec = (MC_COST_2020_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_clos_clsf_010()%>
<%= ds.getXx_clos_clsf_020()%>
<%= ds.getXx_clos_clsf_030()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.work_cym%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 11 17:49:12 KST 2012 */