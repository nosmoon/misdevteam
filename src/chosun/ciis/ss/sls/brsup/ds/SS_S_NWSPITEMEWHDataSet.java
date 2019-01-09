/***************************************************************************************************
* ���ϸ� : SS_S_NWSPITEMEWHDataSet.java
* ��� : ��������-�Ź�������ǰ-�԰�-�󼼸� ���� DataSet 
* �ۼ����� : 2004-01-20
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * ��������-�Ź�������ǰ-�԰�-�󼼸� ���� DataSet 
 */


public class SS_S_NWSPITEMEWHDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String itemclsfnm;
	public String itemnm;
	public long ewhqunt;
	public long stokqunt;
	public long uprc;

	public SS_S_NWSPITEMEWHDataSet(){}
	public SS_S_NWSPITEMEWHDataSet(String errcode, String errmsg, String itemclsfnm, String itemnm, long ewhqunt, long stokqunt, long uprc){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.itemclsfnm = itemclsfnm;
		this.itemnm = itemnm;
		this.ewhqunt = ewhqunt;
		this.stokqunt = stokqunt;
		this.uprc = uprc;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setItemclsfnm(String itemclsfnm){
		this.itemclsfnm = itemclsfnm;
	}

	public void setItemnm(String itemnm){
		this.itemnm = itemnm;
	}

	public void setEwhqunt(long ewhqunt){
		this.ewhqunt = ewhqunt;
	}

	public void setStokqunt(long stokqunt){
		this.stokqunt = stokqunt;
	}

	public void setUprc(long uprc){
		this.uprc = uprc;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getItemclsfnm(){
		return this.itemclsfnm;
	}

	public String getItemnm(){
		return this.itemnm;
	}

	public long getEwhqunt(){
		return this.ewhqunt;
	}

	public long getStokqunt(){
		return this.stokqunt;
	}

	public long getUprc(){
		return this.uprc;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.itemclsfnm = Util.checkString(cstmt.getString(6));
		this.itemnm = Util.checkString(cstmt.getString(7));
		this.ewhqunt = cstmt.getLong(8);
		this.stokqunt = cstmt.getLong(9);
		this.uprc = cstmt.getLong(10);
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_S_NWSPITEMEWHDataSet ds = (SS_S_NWSPITEMEWHDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getItemclsfnm()%>
<%= ds.getItemnm()%>
<%= ds.getEwhqunt()%>
<%= ds.getStokqunt()%>
<%= ds.getUprc()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 30 10:43:39 KST 2004 */