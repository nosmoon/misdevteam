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


package chosun.ciis.mc.cost.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.dm.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_2018_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_dstb_cdfr;
	public String xx_dstb_cdto;

	public MC_COST_2018_MDataSet(){}
	public MC_COST_2018_MDataSet(String errcode, String errmsg, String xx_dstb_cdfr, String xx_dstb_cdto){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_dstb_cdfr = xx_dstb_cdfr;
		this.xx_dstb_cdto = xx_dstb_cdto;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_dstb_cdfr(String xx_dstb_cdfr){
		this.xx_dstb_cdfr = xx_dstb_cdfr;
	}

	public void setXx_dstb_cdto(String xx_dstb_cdto){
		this.xx_dstb_cdto = xx_dstb_cdto;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_dstb_cdfr(){
		return this.xx_dstb_cdfr;
	}

	public String getXx_dstb_cdto(){
		return this.xx_dstb_cdto;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_dstb_cdfr = Util.checkString(cstmt.getString(5));
		this.xx_dstb_cdto = Util.checkString(cstmt.getString(6));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	MC_COST_2018_MDataSet ds = (MC_COST_2018_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_dstb_cdfr()%>
<%= ds.getXx_dstb_cdto()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Wed Jan 11 17:18:27 KST 2012 */