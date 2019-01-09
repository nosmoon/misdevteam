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


package chosun.ciis.hd.prz.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prz.dm.*;
import chosun.ciis.hd.prz.rec.*;

/**
 * 
 */


public class HD_PRZ_1302_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_aplc_clsf_010;
	public String xx_obj_clsf_010;

	public HD_PRZ_1302_MDataSet(){}
	public HD_PRZ_1302_MDataSet(String errcode, String errmsg, String xx_aplc_clsf_010, String xx_obj_clsf_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_aplc_clsf_010 = xx_aplc_clsf_010;
		this.xx_obj_clsf_010 = xx_obj_clsf_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_aplc_clsf_010(String xx_aplc_clsf_010){
		this.xx_aplc_clsf_010 = xx_aplc_clsf_010;
	}

	public void setXx_obj_clsf_010(String xx_obj_clsf_010){
		this.xx_obj_clsf_010 = xx_obj_clsf_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_aplc_clsf_010(){
		return this.xx_aplc_clsf_010;
	}

	public String getXx_obj_clsf_010(){
		return this.xx_obj_clsf_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_aplc_clsf_010 = Util.checkString(cstmt.getString(5));
		this.xx_obj_clsf_010 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_PRZ_1302_MDataSet ds = (HD_PRZ_1302_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_aplc_clsf_010()%>
<%= ds.getXx_obj_clsf_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 27 15:19:53 KST 2012 */