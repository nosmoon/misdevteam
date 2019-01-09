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


public class MC_BUDG_2085_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_budg_type_cd_010;
	public String xx_budg_type_cd_020;

	public MC_BUDG_2085_MDataSet(){}
	public MC_BUDG_2085_MDataSet(String errcode, String errmsg, String xx_budg_type_cd_010, String xx_budg_type_cd_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_budg_type_cd_010 = xx_budg_type_cd_010;
		this.xx_budg_type_cd_020 = xx_budg_type_cd_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_budg_type_cd_010(String xx_budg_type_cd_010){
		this.xx_budg_type_cd_010 = xx_budg_type_cd_010;
	}

	public void setXx_budg_type_cd_020(String xx_budg_type_cd_020){
		this.xx_budg_type_cd_020 = xx_budg_type_cd_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_budg_type_cd_010(){
		return this.xx_budg_type_cd_010;
	}

	public String getXx_budg_type_cd_020(){
		return this.xx_budg_type_cd_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_budg_type_cd_010 = Util.checkString(cstmt.getString(5));
		this.xx_budg_type_cd_020 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_2085_MDataSet ds = (MC_BUDG_2085_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_budg_type_cd_010()%>
<%= ds.getXx_budg_type_cd_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 13 16:14:58 KST 2012 */