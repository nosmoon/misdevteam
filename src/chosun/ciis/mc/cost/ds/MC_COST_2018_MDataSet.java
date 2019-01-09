/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
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
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_COST_2018_MDataSet ds = (MC_COST_2018_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_dstb_cdfr()%>
<%= ds.getXx_dstb_cdto()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 11 17:18:27 KST 2012 */