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


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1000_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{

	public HD_VACA_1000_ADataSet(){}

	public void getValues(CallableStatement cstmt) throws SQLException{
	}

	public String getErrcode() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getErrmsg() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setErrcode(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setErrmsg(String arg0) {
		// TODO Auto-generated method stub
		
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_VACA_1000_ADataSet ds = (HD_VACA_1000_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue May 26 20:31:00 KST 2009 */