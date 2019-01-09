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


package chosun.ciis.hd.info.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.dm.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_2204_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_cd_010;
	public String xx_cd_020;
	public String xx_real_fee_paymt_yn_010;
	public String xx_real_fee_paymt_yn_020;
	public String xx_issu_yn;

	public HD_INFO_2204_MDataSet(){}
	public HD_INFO_2204_MDataSet(String errcode, String errmsg, String xx_cd_010, String xx_cd_020, String xx_real_fee_paymt_yn_010, String xx_real_fee_paymt_yn_020, String xx_issu_yn){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cd_010 = xx_cd_010;
		this.xx_cd_020 = xx_cd_020;
		this.xx_real_fee_paymt_yn_010 = xx_real_fee_paymt_yn_010;
		this.xx_real_fee_paymt_yn_020 = xx_real_fee_paymt_yn_020;
		this.xx_issu_yn = xx_issu_yn;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_cd_010(String xx_cd_010){
		this.xx_cd_010 = xx_cd_010;
	}

	public void setXx_cd_020(String xx_cd_020){
		this.xx_cd_020 = xx_cd_020;
	}

	public void setXx_real_fee_paymt_yn_010(String xx_real_fee_paymt_yn_010){
		this.xx_real_fee_paymt_yn_010 = xx_real_fee_paymt_yn_010;
	}

	public void setXx_real_fee_paymt_yn_020(String xx_real_fee_paymt_yn_020){
		this.xx_real_fee_paymt_yn_020 = xx_real_fee_paymt_yn_020;
	}

	public void setXx_issu_yn(String xx_issu_yn){
		this.xx_issu_yn = xx_issu_yn;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_cd_010(){
		return this.xx_cd_010;
	}

	public String getXx_cd_020(){
		return this.xx_cd_020;
	}

	public String getXx_real_fee_paymt_yn_010(){
		return this.xx_real_fee_paymt_yn_010;
	}

	public String getXx_real_fee_paymt_yn_020(){
		return this.xx_real_fee_paymt_yn_020;
	}

	public String getXx_issu_yn(){
		return this.xx_issu_yn;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_cd_010 = Util.checkString(cstmt.getString(5));
		this.xx_cd_020 = Util.checkString(cstmt.getString(6));
		this.xx_real_fee_paymt_yn_010 = Util.checkString(cstmt.getString(7));
		this.xx_real_fee_paymt_yn_020 = Util.checkString(cstmt.getString(8));
		this.xx_issu_yn = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_INFO_2204_MDataSet ds = (HD_INFO_2204_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_cd_010()%>
<%= ds.getXx_cd_020()%>
<%= ds.getXx_real_fee_paymt_yn_010()%>
<%= ds.getXx_real_fee_paymt_yn_020()%>
<%= ds.getXx_issu_yn()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Fri Jan 20 10:37:36 KST 2012 */