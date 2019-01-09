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


package chosun.ciis.ad.res.ds;

import java.sql.CallableStatement;
import java.sql.SQLException;

import somo.framework.util.Util;

/**
 * 
 */


public class AD_RES_1230_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String cm;
	public String dn;
	public String chro_clsf;
	public String chro_clsf_nm;
	public String tabl_yn;
	public String issu_side;

	public AD_RES_1230_SDataSet(){}
	public AD_RES_1230_SDataSet(String errcode, String errmsg, String cm, String dn, String chro_clsf, String chro_clsf_nm, String tabl_yn, String issu_side){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cm = cm;
		this.dn = dn;
		this.chro_clsf = chro_clsf;
		this.chro_clsf_nm = chro_clsf_nm;
		this.tabl_yn = tabl_yn;
		this.issu_side = issu_side;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCm(String cm){
		this.cm = cm;
	}

	public void setDn(String dn){
		this.dn = dn;
	}

	public void setChro_clsf(String chro_clsf){
		this.chro_clsf = chro_clsf;
	}

	public void setChro_clsf_nm(String chro_clsf_nm){
		this.chro_clsf_nm = chro_clsf_nm;
	}

	public void setTabl_yn(String tabl_yn){
		this.tabl_yn = tabl_yn;
	}

	public void setIssu_side(String issu_side){
		this.issu_side = issu_side;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCm(){
		return this.cm;
	}

	public String getDn(){
		return this.dn;
	}

	public String getChro_clsf(){
		return this.chro_clsf;
	}

	public String getChro_clsf_nm(){
		return this.chro_clsf_nm;
	}

	public String getTabl_yn(){
		return this.tabl_yn;
	}

	public String getIssu_side(){
		return this.issu_side;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.cm = Util.checkString(cstmt.getString(8));
		this.dn = Util.checkString(cstmt.getString(9));
		this.chro_clsf = Util.checkString(cstmt.getString(10));
		this.chro_clsf_nm = Util.checkString(cstmt.getString(11));
		this.tabl_yn = Util.checkString(cstmt.getString(12));
		this.issu_side = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	AD_RES_1230_SDataSet ds = (AD_RES_1230_SDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCm()%>
<%= ds.getDn()%>
<%= ds.getChro_clsf()%>
<%= ds.getChro_clsf_nm()%>
<%= ds.getTabl_yn()%>
<%= ds.getIssu_side()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Feb 06 17:38:49 KST 2009 */