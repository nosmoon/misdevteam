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


package chosun.ciis.hd.appmt.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.appmt.dm.*;
import chosun.ciis.hd.appmt.rec.*;

/**
 * 
 */


public class HD_APPMT_1206_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_job_clsf_01;
	public String xx_cd_clsf_010;
	public String xx_mang_cd_5;
	public String xx_cd_clsf_020;

	public HD_APPMT_1206_MDataSet(){}
	public HD_APPMT_1206_MDataSet(String errcode, String errmsg, String xx_job_clsf_01, String xx_cd_clsf_010, String xx_mang_cd_5, String xx_cd_clsf_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_job_clsf_01 = xx_job_clsf_01;
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
		this.xx_mang_cd_5 = xx_mang_cd_5;
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_job_clsf_01(String xx_job_clsf_01){
		this.xx_job_clsf_01 = xx_job_clsf_01;
	}

	public void setXx_cd_clsf_010(String xx_cd_clsf_010){
		this.xx_cd_clsf_010 = xx_cd_clsf_010;
	}

	public void setXx_mang_cd_5(String xx_mang_cd_5){
		this.xx_mang_cd_5 = xx_mang_cd_5;
	}

	public void setXx_cd_clsf_020(String xx_cd_clsf_020){
		this.xx_cd_clsf_020 = xx_cd_clsf_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_job_clsf_01(){
		return this.xx_job_clsf_01;
	}

	public String getXx_cd_clsf_010(){
		return this.xx_cd_clsf_010;
	}

	public String getXx_mang_cd_5(){
		return this.xx_mang_cd_5;
	}

	public String getXx_cd_clsf_020(){
		return this.xx_cd_clsf_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_job_clsf_01 = Util.checkString(cstmt.getString(5));
		this.xx_cd_clsf_010 = Util.checkString(cstmt.getString(6));
		this.xx_mang_cd_5 = Util.checkString(cstmt.getString(7));
		this.xx_cd_clsf_020 = Util.checkString(cstmt.getString(8));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_APPMT_1206_MDataSet ds = (HD_APPMT_1206_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_job_clsf_01()%>
<%= ds.getXx_cd_clsf_010()%>
<%= ds.getXx_mang_cd_5()%>
<%= ds.getXx_cd_clsf_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jan 26 14:59:45 KST 2012 */