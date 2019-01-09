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


public class MC_BUDG_4032_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_clsf_cd_fr;
	public String xx_clsf_cd_to;

	public MC_BUDG_4032_MDataSet(){}
	public MC_BUDG_4032_MDataSet(String errcode, String errmsg, String xx_clsf_cd_fr, String xx_clsf_cd_to){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_clsf_cd_fr = xx_clsf_cd_fr;
		this.xx_clsf_cd_to = xx_clsf_cd_to;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_clsf_cd_fr(String xx_clsf_cd_fr){
		this.xx_clsf_cd_fr = xx_clsf_cd_fr;
	}

	public void setXx_clsf_cd_to(String xx_clsf_cd_to){
		this.xx_clsf_cd_to = xx_clsf_cd_to;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_clsf_cd_fr(){
		return this.xx_clsf_cd_fr;
	}

	public String getXx_clsf_cd_to(){
		return this.xx_clsf_cd_to;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_clsf_cd_fr = Util.checkString(cstmt.getString(5));
		this.xx_clsf_cd_to = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_BUDG_4032_MDataSet ds = (MC_BUDG_4032_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_clsf_cd_fr()%>
<%= ds.getXx_clsf_cd_to()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 16 11:09:21 KST 2012 */