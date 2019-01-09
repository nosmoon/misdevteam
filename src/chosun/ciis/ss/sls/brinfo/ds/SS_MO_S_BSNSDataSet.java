/***************************************************************************************************
* ���ϸ� : SS_MO_S_BSNSDataSet.java
* ��� :  �Ǹ�-�߼۰���-��������-�߼۳뼱 ��ȸ-��_����Ͽ�
* �ۼ����� : 2016-12-29
* �ۼ��� : �� �� ��
***************************************************************************************************/
/***************************************************************************************************
* �������� : �߼�ó�ڵ�� ��ȸ�� �� �ְ� �߰�
* ������ : �弱��
* �������� : 2017-08-28
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 *
 */


public class SS_MO_S_BSNSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String bocd;
	public String jpcode;
	public String jbjiorder;
	public String jbpansu;
	public String jpname;
	public String inname;
	public String jbbusu;
	public String jbbalcha;
	public String jbyetime;
	public String jbdotime;
	public String medicd;
	public String mcname;
	public String bo_addr;

	public SS_MO_S_BSNSDataSet(){}
	public SS_MO_S_BSNSDataSet(String errcode, String errmsg, String bocd, String jpcode, String jbjiorder, String jbpansu, String jpname, String inname, String jbbusu, String jbbalcha, String jbyetime, String jbdotime, String medicd, String mcname, String bo_addr){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.bocd = bocd;
		this.jpcode = jpcode;
		this.jbjiorder = jbjiorder;
		this.jbpansu = jbpansu;
		this.jpname = jpname;
		this.inname = inname;
		this.jbbusu = jbbusu;
		this.jbbalcha = jbbalcha;
		this.jbyetime = jbyetime;
		this.jbdotime = jbdotime;
		this.medicd = medicd;
		this.mcname = mcname;
		this.bo_addr = bo_addr;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setJpcode(String jpcode){
		this.jpcode = jpcode;
	}

	public void setJbjiorder(String jbjiorder){
		this.jbjiorder = jbjiorder;
	}

	public void setJbpansu(String jbpansu){
		this.jbpansu = jbpansu;
	}

	public void setJpname(String jpname){
		this.jpname = jpname;
	}

	public void setInname(String inname){
		this.inname = inname;
	}

	public void setJbbusu(String jbbusu){
		this.jbbusu = jbbusu;
	}

	public void setJbbalcha(String jbbalcha){
		this.jbbalcha = jbbalcha;
	}

	public void setJbyetime(String jbyetime){
		this.jbyetime = jbyetime;
	}

	public void setJbdotime(String jbdotime){
		this.jbdotime = jbdotime;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMcname(String mcname){
		this.mcname = mcname;
	}

	public void setBo_addr(String bo_addr){
		this.bo_addr = bo_addr;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getJpcode(){
		return this.jpcode;
	}

	public String getJbjiorder(){
		return this.jbjiorder;
	}

	public String getJbpansu(){
		return this.jbpansu;
	}

	public String getJpname(){
		return this.jpname;
	}

	public String getInname(){
		return this.inname;
	}

	public String getJbbusu(){
		return this.jbbusu;
	}

	public String getJbbalcha(){
		return this.jbbalcha;
	}

	public String getJbyetime(){
		return this.jbyetime;
	}

	public String getJbdotime(){
		return this.jbdotime;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMcname(){
		return this.mcname;
	}

	public String getBo_addr(){
		return this.bo_addr;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.bocd = Util.checkString(cstmt.getString(7));
		this.jpcode = Util.checkString(cstmt.getString(9));
		this.jbjiorder = Util.checkString(cstmt.getString(10));
		this.jbpansu = Util.checkString(cstmt.getString(11));
		this.jpname = Util.checkString(cstmt.getString(12));
		this.inname = Util.checkString(cstmt.getString(13));
		this.jbbusu = Util.checkString(cstmt.getString(14));
		this.jbbalcha = Util.checkString(cstmt.getString(15));
		this.jbyetime = Util.checkString(cstmt.getString(16));
		this.jbdotime = Util.checkString(cstmt.getString(17));
		this.medicd = Util.checkString(cstmt.getString(18));
		this.mcname = Util.checkString(cstmt.getString(19));
		this.bo_addr = Util.checkString(cstmt.getString(20));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_MO_S_BSNSDataSet ds = (SS_MO_S_BSNSDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getBocd()%>
<%= ds.getJpcode()%>
<%= ds.getJbjiorder()%>
<%= ds.getJbpansu()%>
<%= ds.getJpname()%>
<%= ds.getInname()%>
<%= ds.getJbbusu()%>
<%= ds.getJbbalcha()%>
<%= ds.getJbyetime()%>
<%= ds.getJbdotime()%>
<%= ds.getMedicd()%>
<%= ds.getMcname()%>
<%= ds.getBo_addr()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Aug 28 09:51:30 KST 2017 */