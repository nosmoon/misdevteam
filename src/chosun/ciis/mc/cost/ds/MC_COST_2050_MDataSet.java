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


public class MC_COST_2050_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public ArrayList xx_cost_dstb_cd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_clos_clsf;

	public MC_COST_2050_MDataSet(){}
	public MC_COST_2050_MDataSet(String errcode, String errmsg, String xx_clos_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_clos_clsf = xx_clos_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_clos_clsf(String xx_clos_clsf){
		this.xx_clos_clsf = xx_clos_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_clos_clsf(){
		return this.xx_clos_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MC_COST_2050_MCURLISTRecord rec = new MC_COST_2050_MCURLISTRecord();
			rec.work_cym = Util.checkString(rset0.getString("work_cym"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(7);
		while(rset1.next()){
			MC_COST_2050_MXX_COST_DSTB_CD_LISTRecord rec = new MC_COST_2050_MXX_COST_DSTB_CD_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.xx_cost_dstb_cd_list.add(rec);
		}
		this.xx_clos_clsf = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_COST_2050_MDataSet ds = (MC_COST_2050_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_COST_2050_MCURLISTRecord curlistRec = (MC_COST_2050_MCURLISTRecord)ds.curlist.get(i);%>
HTML �ڵ��....
	<%}%>

<%
	for(int i=0; i<ds.xx_cost_dstb_cd_list.size(); i++){
		MC_COST_2050_MXX_COST_DSTB_CD_LISTRecord xx_cost_dstb_cd_listRec = (MC_COST_2050_MXX_COST_DSTB_CD_LISTRecord)ds.xx_cost_dstb_cd_list.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getXx_cost_dstb_cd_list()%>
<%= ds.getXx_clos_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlistRec.work_cym%>
<%= xx_cost_dstb_cd_listRec.cd_nm%>
<%= xx_cost_dstb_cd_listRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 17 14:14:34 KST 2012 */