/***************************************************************************************************
 * ���ϸ� :PB_RREAD_LSTDataSet.java
 * ��� : ���������� �����ȸ ȭ���� ������� ��ȸ
 * �ۼ����� : 2003-11-21
 * �ۼ��� : ���ȣ
 **************************************************************************************************/
 /**************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.rec.*;


/**
 * class definition
 *
 */


public class PB_S_CORBOEMPDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String boemp_no;
	public String flnm;
	public String deptcd;
	public String dutycd;
	public String posicd;

	public PB_S_CORBOEMPDataSet(){}
	public PB_S_CORBOEMPDataSet(String errcode, String errmsg, String boemp_no, String flnm, String deptcd, String dutycd, String posicd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.boemp_no = boemp_no;
		this.flnm = flnm;
		this.deptcd = deptcd;
		this.dutycd = dutycd;
		this.posicd = posicd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDutycd(String dutycd){
		this.dutycd = dutycd;
	}

	public void setPosicd(String posicd){
		this.posicd = posicd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDutycd(){
		return this.dutycd;
	}

	public String getPosicd(){
		return this.posicd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.boemp_no = Util.checkString(cstmt.getString(5));
		this.flnm = Util.checkString(cstmt.getString(6));
		this.deptcd = Util.checkString(cstmt.getString(7));
		this.dutycd = Util.checkString(cstmt.getString(8));
		this.posicd = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	PB_S_CORBOEMPDataSet ds = (PB_S_CORBOEMPDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBoemp_no()%>
<%= ds.getFlnm()%>
<%= ds.getDeptcd()%>
<%= ds.getDutycd()%>
<%= ds.getPosicd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Sat Dec 27 13:27:02 KST 2003 */