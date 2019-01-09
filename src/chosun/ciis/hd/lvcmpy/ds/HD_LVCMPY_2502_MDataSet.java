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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_2502_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_lvcmpy_clsf_010;
	public String xx_lvcmpy_clsf_020;

	public HD_LVCMPY_2502_MDataSet(){}
	public HD_LVCMPY_2502_MDataSet(String errcode, String errmsg, String xx_lvcmpy_clsf_010, String xx_lvcmpy_clsf_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_lvcmpy_clsf_010 = xx_lvcmpy_clsf_010;
		this.xx_lvcmpy_clsf_020 = xx_lvcmpy_clsf_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_lvcmpy_clsf_010(String xx_lvcmpy_clsf_010){
		this.xx_lvcmpy_clsf_010 = xx_lvcmpy_clsf_010;
	}

	public void setXx_lvcmpy_clsf_020(String xx_lvcmpy_clsf_020){
		this.xx_lvcmpy_clsf_020 = xx_lvcmpy_clsf_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_lvcmpy_clsf_010(){
		return this.xx_lvcmpy_clsf_010;
	}

	public String getXx_lvcmpy_clsf_020(){
		return this.xx_lvcmpy_clsf_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_lvcmpy_clsf_010 = Util.checkString(cstmt.getString(5));
		this.xx_lvcmpy_clsf_020 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_LVCMPY_2502_MDataSet ds = (HD_LVCMPY_2502_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_lvcmpy_clsf_010()%>
<%= ds.getXx_lvcmpy_clsf_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Feb 14 11:04:30 KST 2012 */