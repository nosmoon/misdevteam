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


package chosun.ciis.ad.pub.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.rec.*;

/**
 * 
 */


public class AD_PUB_3023_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String medi_cd;
	public String pubc_occr_dt;
	public String pubc_occr_seq;

	public AD_PUB_3023_ADataSet(){}
	public AD_PUB_3023_ADataSet(String errcode, String errmsg, String medi_cd, String pubc_occr_dt, String pubc_occr_seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.medi_cd = medi_cd;
		this.pubc_occr_dt = pubc_occr_dt;
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setPubc_occr_dt(String pubc_occr_dt){
		this.pubc_occr_dt = pubc_occr_dt;
	}

	public void setPubc_occr_seq(String pubc_occr_seq){
		this.pubc_occr_seq = pubc_occr_seq;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getPubc_occr_dt(){
		return this.pubc_occr_dt;
	}

	public String getPubc_occr_seq(){
		return this.pubc_occr_seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.medi_cd = Util.checkString(cstmt.getString(33));
		this.pubc_occr_dt = Util.checkString(cstmt.getString(34));
		this.pubc_occr_seq = Util.checkString(cstmt.getString(35));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_PUB_3023_ADataSet ds = (AD_PUB_3023_ADataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getMedi_cd()%>
<%= ds.getPubc_occr_dt()%>
<%= ds.getPubc_occr_seq()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Jan 31 15:45:30 KST 2012 */