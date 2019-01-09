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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_4040_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_extnc_acct_cd_010;
	public String xx_extnc_acct_cd_020;

	public FC_ACCT_4040_MDataSet(){}
	public FC_ACCT_4040_MDataSet(String errcode, String errmsg, String xx_extnc_acct_cd_010, String xx_extnc_acct_cd_020){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_extnc_acct_cd_010 = xx_extnc_acct_cd_010;
		this.xx_extnc_acct_cd_020 = xx_extnc_acct_cd_020;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_extnc_acct_cd_010(String xx_extnc_acct_cd_010){
		this.xx_extnc_acct_cd_010 = xx_extnc_acct_cd_010;
	}

	public void setXx_extnc_acct_cd_020(String xx_extnc_acct_cd_020){
		this.xx_extnc_acct_cd_020 = xx_extnc_acct_cd_020;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_extnc_acct_cd_010(){
		return this.xx_extnc_acct_cd_010;
	}

	public String getXx_extnc_acct_cd_020(){
		return this.xx_extnc_acct_cd_020;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_extnc_acct_cd_010 = Util.checkString(cstmt.getString(5));
		this.xx_extnc_acct_cd_020 = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_ACCT_4040_MDataSet ds = (FC_ACCT_4040_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_extnc_acct_cd_010()%>
<%= ds.getXx_extnc_acct_cd_020()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 10 17:19:35 KST 2012 */