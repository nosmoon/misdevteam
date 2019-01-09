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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_1402_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_salary_dt;
	public String xx_pgm_path;

	public HD_SALY_1402_MDataSet(){}
	public HD_SALY_1402_MDataSet(String errcode, String errmsg, String xx_salary_dt, String xx_pgm_path){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_salary_dt = xx_salary_dt;
		this.xx_pgm_path = xx_pgm_path;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_salary_dt(String xx_salary_dt){
		this.xx_salary_dt = xx_salary_dt;
	}

	public void setXx_pgm_path(String xx_pgm_path){
		this.xx_pgm_path = xx_pgm_path;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_salary_dt(){
		return this.xx_salary_dt;
	}

	public String getXx_pgm_path(){
		return this.xx_pgm_path;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_salary_dt = Util.checkString(cstmt.getString(5));
		this.xx_pgm_path = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_SALY_1402_MDataSet ds = (HD_SALY_1402_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_salary_dt()%>
<%= ds.getXx_pgm_path()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Jun 28 14:16:43 KST 2012 */