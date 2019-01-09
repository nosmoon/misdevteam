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


package chosun.ciis.tn.lnk.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.lnk.dm.*;
import chosun.ciis.tn.lnk.rec.*;

/**
 * 
 */


public class TN_LNK_1152_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String excl_pmnt_idx;
	public String excl_pmnt_dtl_idx;

	public TN_LNK_1152_ADataSet(){}
	public TN_LNK_1152_ADataSet(String errcode, String errmsg, String excl_pmnt_idx, String excl_pmnt_dtl_idx){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.excl_pmnt_idx = excl_pmnt_idx;
		this.excl_pmnt_dtl_idx = excl_pmnt_dtl_idx;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setExcl_pmnt_idx(String excl_pmnt_idx){
		this.excl_pmnt_idx = excl_pmnt_idx;
	}

	public void setExcl_pmnt_dtl_idx(String excl_pmnt_dtl_idx){
		this.excl_pmnt_dtl_idx = excl_pmnt_dtl_idx;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getExcl_pmnt_idx(){
		return this.excl_pmnt_idx;
	}

	public String getExcl_pmnt_dtl_idx(){
		return this.excl_pmnt_dtl_idx;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.excl_pmnt_idx = Util.checkString(cstmt.getString(57));
		this.excl_pmnt_dtl_idx = Util.checkString(cstmt.getString(58));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	TN_LNK_1152_ADataSet ds = (TN_LNK_1152_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getExcl_pmnt_idx()%>
<%= ds.getExcl_pmnt_dtl_idx()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Nov 17 11:01:28 KST 2016 */