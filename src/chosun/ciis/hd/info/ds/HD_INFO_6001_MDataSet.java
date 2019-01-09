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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_6001_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_emp_clsf_cd;
	public String xx_emp_no_010;
	public String xx_emp_no_020;

	public HD_INFO_6001_MDataSet(){}
	public HD_INFO_6001_MDataSet(String errcode, String errmsg, String xx_emp_clsf_cd, String xx_emp_no_010, String xx_emp_no_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_emp_clsf_cd = xx_emp_clsf_cd;
		this.xx_emp_no_010 = xx_emp_no_010;
		this.xx_emp_no_020 = xx_emp_no_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_emp_clsf_cd(String xx_emp_clsf_cd){
		this.xx_emp_clsf_cd = xx_emp_clsf_cd;
	}

	public void setXx_emp_no_010(String xx_emp_no_010){
		this.xx_emp_no_010 = xx_emp_no_010;
	}

	public void setXx_emp_no_020(String xx_emp_no_020){
		this.xx_emp_no_020 = xx_emp_no_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_emp_clsf_cd(){
		return this.xx_emp_clsf_cd;
	}

	public String getXx_emp_no_010(){
		return this.xx_emp_no_010;
	}

	public String getXx_emp_no_020(){
		return this.xx_emp_no_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_emp_clsf_cd = Util.checkString(cstmt.getString(5));
		this.xx_emp_no_010 = Util.checkString(cstmt.getString(6));
		this.xx_emp_no_020 = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INFO_6001_MDataSet ds = (HD_INFO_6001_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_emp_clsf_cd()%>
<%= ds.getXx_emp_no_010()%>
<%= ds.getXx_emp_no_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Mar 21 19:02:07 KST 2013 */