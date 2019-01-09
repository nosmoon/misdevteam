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


public class MC_BUDG_4027_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_clsf_cd_010;
	public String xx_clsf_cd_020;
	public String xx_crte_clsf_010;
	public String xx_crte_clsf_020;

	public MC_BUDG_4027_MDataSet(){}
	public MC_BUDG_4027_MDataSet(String errcode, String errmsg, String xx_clsf_cd_010, String xx_clsf_cd_020, String xx_crte_clsf_010, String xx_crte_clsf_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_clsf_cd_010 = xx_clsf_cd_010;
		this.xx_clsf_cd_020 = xx_clsf_cd_020;
		this.xx_crte_clsf_010 = xx_crte_clsf_010;
		this.xx_crte_clsf_020 = xx_crte_clsf_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_clsf_cd_010(String xx_clsf_cd_010){
		this.xx_clsf_cd_010 = xx_clsf_cd_010;
	}

	public void setXx_clsf_cd_020(String xx_clsf_cd_020){
		this.xx_clsf_cd_020 = xx_clsf_cd_020;
	}

	public void setXx_crte_clsf_010(String xx_crte_clsf_010){
		this.xx_crte_clsf_010 = xx_crte_clsf_010;
	}

	public void setXx_crte_clsf_020(String xx_crte_clsf_020){
		this.xx_crte_clsf_020 = xx_crte_clsf_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_clsf_cd_010(){
		return this.xx_clsf_cd_010;
	}

	public String getXx_clsf_cd_020(){
		return this.xx_clsf_cd_020;
	}

	public String getXx_crte_clsf_010(){
		return this.xx_crte_clsf_010;
	}

	public String getXx_crte_clsf_020(){
		return this.xx_crte_clsf_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_clsf_cd_010 = Util.checkString(cstmt.getString(5));
		this.xx_clsf_cd_020 = Util.checkString(cstmt.getString(6));
		this.xx_crte_clsf_010 = Util.checkString(cstmt.getString(7));
		this.xx_crte_clsf_020 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_4027_MDataSet ds = (MC_BUDG_4027_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_clsf_cd_010()%>
<%= ds.getXx_clsf_cd_020()%>
<%= ds.getXx_crte_clsf_010()%>
<%= ds.getXx_crte_clsf_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 16 09:46:20 KST 2012 */