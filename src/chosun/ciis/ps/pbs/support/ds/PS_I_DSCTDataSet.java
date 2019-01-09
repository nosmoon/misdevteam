/***************************************************************************************************
* ���ϸ� : PS_I_DSCTDM
* ��� :  ��������ó��
* �ۼ����� : 2003-12-27
* �ۼ��� : ���ȣ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * ��������-��������ó��
 *
 */

public class PS_I_DSCTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String regdt;
	public String regno;

	public PS_I_DSCTDataSet(){}
	public PS_I_DSCTDataSet(String errcode, String errmsg, String regdt, String regno){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.regdt = regdt;
		this.regno = regno;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.regdt = Util.checkString(cstmt.getString(24));
		this.regno = Util.checkString(cstmt.getString(25));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PS_I_DSCTDataSet ds = (PS_I_DSCTDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRegdt()%>
<%= ds.getRegno()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Dec 08 16:57:43 KST 2004 */