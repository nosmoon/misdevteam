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


package chosun.ciis.hd.hlywrk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.hlywrk.dm.*;
import chosun.ciis.hd.hlywrk.rec.*;

/**
 * 
 */


public class HD_HLYWRK_1305_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_alvc_use_yn_010;
	public String xx_alvc_use_yn_020;
	public String xx_alvc_use_yn_030;
	public String xx_certi_clsf;

	public HD_HLYWRK_1305_MDataSet(){}
	public HD_HLYWRK_1305_MDataSet(String errcode, String errmsg, String xx_alvc_use_yn_010, String xx_alvc_use_yn_020, String xx_alvc_use_yn_030, String xx_certi_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_alvc_use_yn_010 = xx_alvc_use_yn_010;
		this.xx_alvc_use_yn_020 = xx_alvc_use_yn_020;
		this.xx_alvc_use_yn_030 = xx_alvc_use_yn_030;
		this.xx_certi_clsf = xx_certi_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_alvc_use_yn_010(String xx_alvc_use_yn_010){
		this.xx_alvc_use_yn_010 = xx_alvc_use_yn_010;
	}

	public void setXx_alvc_use_yn_020(String xx_alvc_use_yn_020){
		this.xx_alvc_use_yn_020 = xx_alvc_use_yn_020;
	}

	public void setXx_alvc_use_yn_030(String xx_alvc_use_yn_030){
		this.xx_alvc_use_yn_030 = xx_alvc_use_yn_030;
	}

	public void setXx_certi_clsf(String xx_certi_clsf){
		this.xx_certi_clsf = xx_certi_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_alvc_use_yn_010(){
		return this.xx_alvc_use_yn_010;
	}

	public String getXx_alvc_use_yn_020(){
		return this.xx_alvc_use_yn_020;
	}

	public String getXx_alvc_use_yn_030(){
		return this.xx_alvc_use_yn_030;
	}

	public String getXx_certi_clsf(){
		return this.xx_certi_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_alvc_use_yn_010 = Util.checkString(cstmt.getString(5));
		this.xx_alvc_use_yn_020 = Util.checkString(cstmt.getString(6));
		this.xx_alvc_use_yn_030 = Util.checkString(cstmt.getString(7));
		this.xx_certi_clsf = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_HLYWRK_1305_MDataSet ds = (HD_HLYWRK_1305_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_alvc_use_yn_010()%>
<%= ds.getXx_alvc_use_yn_020()%>
<%= ds.getXx_alvc_use_yn_030()%>
<%= ds.getXx_certi_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Feb 01 18:01:50 KST 2012 */