/***************************************************************************************************
* ���ϸ� : .java
* ��� : �λ�޿�-�����������
* �ۼ����� : 2014-12-30
* �ۼ��� : ���½�
***************************************************************************************************/
/***************************************************************************************************
* �������� : 
* ������ : 
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.yadjm.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.yadjm.dm.*;
import chosun.ciis.hd.yadjm.rec.*;

/**
 * 
 */


public class HD_YADJM_115700_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_stok_savg_type_010;
	public String xx_stok_savg_type_020;
	public String xx_stok_savg_type_030;
	public String xx_stok_savg_type_040;
	public String xx_stok_savg_type_050;
	public String xx_stok_savg_type_060;
	public String xx_stok_savg_type_070;
	public String xx_stok_savg_type_080;
	public String xx_stok_savg_type_090;
	public String xx_stok_savg_type_100;

	public HD_YADJM_115700_MDataSet(){}
	public HD_YADJM_115700_MDataSet(String errcode, String errmsg, String xx_stok_savg_type_010, String xx_stok_savg_type_020, String xx_stok_savg_type_030, String xx_stok_savg_type_040, String xx_stok_savg_type_050, String xx_stok_savg_type_060, String xx_stok_savg_type_070, String xx_stok_savg_type_080, String xx_stok_savg_type_090, String xx_stok_savg_type_100){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_stok_savg_type_010 = xx_stok_savg_type_010;
		this.xx_stok_savg_type_020 = xx_stok_savg_type_020;
		this.xx_stok_savg_type_030 = xx_stok_savg_type_030;
		this.xx_stok_savg_type_040 = xx_stok_savg_type_040;
		this.xx_stok_savg_type_050 = xx_stok_savg_type_050;
		this.xx_stok_savg_type_060 = xx_stok_savg_type_060;
		this.xx_stok_savg_type_070 = xx_stok_savg_type_070;
		this.xx_stok_savg_type_080 = xx_stok_savg_type_080;
		this.xx_stok_savg_type_090 = xx_stok_savg_type_090;
		this.xx_stok_savg_type_100 = xx_stok_savg_type_100;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_stok_savg_type_010(String xx_stok_savg_type_010){
		this.xx_stok_savg_type_010 = xx_stok_savg_type_010;
	}

	public void setXx_stok_savg_type_020(String xx_stok_savg_type_020){
		this.xx_stok_savg_type_020 = xx_stok_savg_type_020;
	}

	public void setXx_stok_savg_type_030(String xx_stok_savg_type_030){
		this.xx_stok_savg_type_030 = xx_stok_savg_type_030;
	}

	public void setXx_stok_savg_type_040(String xx_stok_savg_type_040){
		this.xx_stok_savg_type_040 = xx_stok_savg_type_040;
	}

	public void setXx_stok_savg_type_050(String xx_stok_savg_type_050){
		this.xx_stok_savg_type_050 = xx_stok_savg_type_050;
	}

	public void setXx_stok_savg_type_060(String xx_stok_savg_type_060){
		this.xx_stok_savg_type_060 = xx_stok_savg_type_060;
	}

	public void setXx_stok_savg_type_070(String xx_stok_savg_type_070){
		this.xx_stok_savg_type_070 = xx_stok_savg_type_070;
	}

	public void setXx_stok_savg_type_080(String xx_stok_savg_type_080){
		this.xx_stok_savg_type_080 = xx_stok_savg_type_080;
	}

	public void setXx_stok_savg_type_090(String xx_stok_savg_type_090){
		this.xx_stok_savg_type_090 = xx_stok_savg_type_090;
	}

	public void setXx_stok_savg_type_100(String xx_stok_savg_type_100){
		this.xx_stok_savg_type_100 = xx_stok_savg_type_100;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_stok_savg_type_010(){
		return this.xx_stok_savg_type_010;
	}

	public String getXx_stok_savg_type_020(){
		return this.xx_stok_savg_type_020;
	}

	public String getXx_stok_savg_type_030(){
		return this.xx_stok_savg_type_030;
	}

	public String getXx_stok_savg_type_040(){
		return this.xx_stok_savg_type_040;
	}

	public String getXx_stok_savg_type_050(){
		return this.xx_stok_savg_type_050;
	}

	public String getXx_stok_savg_type_060(){
		return this.xx_stok_savg_type_060;
	}

	public String getXx_stok_savg_type_070(){
		return this.xx_stok_savg_type_070;
	}

	public String getXx_stok_savg_type_080(){
		return this.xx_stok_savg_type_080;
	}

	public String getXx_stok_savg_type_090(){
		return this.xx_stok_savg_type_090;
	}

	public String getXx_stok_savg_type_100(){
		return this.xx_stok_savg_type_100;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_stok_savg_type_010 = Util.checkString(cstmt.getString(5));
		this.xx_stok_savg_type_020 = Util.checkString(cstmt.getString(6));
		this.xx_stok_savg_type_030 = Util.checkString(cstmt.getString(7));
		this.xx_stok_savg_type_040 = Util.checkString(cstmt.getString(8));
		this.xx_stok_savg_type_050 = Util.checkString(cstmt.getString(9));
		this.xx_stok_savg_type_060 = Util.checkString(cstmt.getString(10));
		this.xx_stok_savg_type_070 = Util.checkString(cstmt.getString(11));
		this.xx_stok_savg_type_080 = Util.checkString(cstmt.getString(12));
		this.xx_stok_savg_type_090 = Util.checkString(cstmt.getString(13));
		this.xx_stok_savg_type_100 = Util.checkString(cstmt.getString(14));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	HD_YADJM_115700_MDataSet ds = (HD_YADJM_115700_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_stok_savg_type_010()%>
<%= ds.getXx_stok_savg_type_020()%>
<%= ds.getXx_stok_savg_type_030()%>
<%= ds.getXx_stok_savg_type_040()%>
<%= ds.getXx_stok_savg_type_050()%>
<%= ds.getXx_stok_savg_type_060()%>
<%= ds.getXx_stok_savg_type_070()%>
<%= ds.getXx_stok_savg_type_080()%>
<%= ds.getXx_stok_savg_type_090()%>
<%= ds.getXx_stok_savg_type_100()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 30 16:14:59 KST 2014 */