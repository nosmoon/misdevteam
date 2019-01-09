/***************************************************************************************************
* ���ϸ� : SS_S_NWSPITEMACCDDataSet.java
* ��� : ��������-�Ź�������ǰ-���-�󼼸� ���� DataSet
* �ۼ����� : 2004-01-24
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
 * ��������-�Ź�������ǰ-���-�󼼸� ���� DataSet
 */

public class SS_S_NWSPITEMACCDDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String itemclsfnm;
	public String itemnm;
	public long accdqunt;
	public String remk;
	public String deptnm;
	public String areanm;
	public String bonm;

	public SS_S_NWSPITEMACCDDataSet(){}
	public SS_S_NWSPITEMACCDDataSet(String errcode, String errmsg, String itemclsfnm, String itemnm, long accdqunt, String remk, String deptnm, String areanm, String bonm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.itemclsfnm = itemclsfnm;
		this.itemnm = itemnm;
		this.accdqunt = accdqunt;
		this.remk = remk;
		this.deptnm = deptnm;
		this.areanm = areanm;
		this.bonm = bonm;
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

	public void setAccdqunt(long accdqunt){
		this.accdqunt = accdqunt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public long getAccdqunt(){
		return this.accdqunt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.itemclsfnm = Util.checkString(cstmt.getString(7));
		this.itemnm = Util.checkString(cstmt.getString(8));
		this.accdqunt = cstmt.getLong(9);
		this.remk = Util.checkString(cstmt.getString(10));
		this.deptnm = Util.checkString(cstmt.getString(11));
		this.areanm = Util.checkString(cstmt.getString(12));
		this.bonm = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_S_NWSPITEMACCDDataSet ds = (SS_S_NWSPITEMACCDDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getItemclsfnm()%>
<%= ds.getItemnm()%>
<%= ds.getAccdqunt()%>
<%= ds.getRemk()%>
<%= ds.getDeptnm()%>
<%= ds.getAreanm()%>
<%= ds.getBonm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Thu Feb 05 16:18:34 KST 2004 */