/***************************************************************************************************
* ���ϸ�   : SP_PS_I_RETN_PTCR_LUMP.java
* ���     : �ݼ۰��� excelupload �ϰ�����
* �ۼ����� : 2008-08-13
* �ۼ���   : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������   :
* �������� :
* ���     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.dm.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * �߼�-�ݼ۰��� �ݼ۳��� excelupload �ϰ�����ó��
 *
 */

public class PS_I_RETN_PTCR_LUMPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public PS_I_RETN_PTCR_LUMPDataSet(){}
	public PS_I_RETN_PTCR_LUMPDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PS_I_RETN_PTCR_LUMPDataSet ds = (PS_I_RETN_PTCR_LUMPDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Aug 13 19:04:16 KST 2008 */