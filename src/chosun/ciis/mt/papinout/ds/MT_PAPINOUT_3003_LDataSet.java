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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_3003_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String clos_clsf;
	public String dpcn_clsf;
	public String paji_clsf;
	public String mqnt_clos_clsf;
	public String magam_dt;
	public String magam_state;

	public MT_PAPINOUT_3003_LDataSet(){}
	public MT_PAPINOUT_3003_LDataSet(String errcode, String errmsg, String clos_clsf, String dpcn_clsf, String paji_clsf, String mqnt_clos_clsf, String magam_dt, String magam_state){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.clos_clsf = clos_clsf;
		this.dpcn_clsf = dpcn_clsf;
		this.paji_clsf = paji_clsf;
		this.mqnt_clos_clsf = mqnt_clos_clsf;
		this.magam_dt = magam_dt;
		this.magam_state = magam_state;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setDpcn_clsf(String dpcn_clsf){
		this.dpcn_clsf = dpcn_clsf;
	}

	public void setPaji_clsf(String paji_clsf){
		this.paji_clsf = paji_clsf;
	}

	public void setMqnt_clos_clsf(String mqnt_clos_clsf){
		this.mqnt_clos_clsf = mqnt_clos_clsf;
	}

	public void setMagam_dt(String magam_dt){
		this.magam_dt = magam_dt;
	}

	public void setMagam_state(String magam_state){
		this.magam_state = magam_state;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getDpcn_clsf(){
		return this.dpcn_clsf;
	}

	public String getPaji_clsf(){
		return this.paji_clsf;
	}

	public String getMqnt_clos_clsf(){
		return this.mqnt_clos_clsf;
	}

	public String getMagam_dt(){
		return this.magam_dt;
	}

	public String getMagam_state(){
		return this.magam_state;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.clos_clsf = Util.checkString(cstmt.getString(6));
		this.dpcn_clsf = Util.checkString(cstmt.getString(7));
		this.paji_clsf = Util.checkString(cstmt.getString(8));
		this.mqnt_clos_clsf = Util.checkString(cstmt.getString(9));
		this.magam_dt = Util.checkString(cstmt.getString(10));
		this.magam_state = Util.checkString(cstmt.getString(11));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_3003_LDataSet ds = (MT_PAPINOUT_3003_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getClos_clsf()%>
<%= ds.getDpcn_clsf()%>
<%= ds.getPaji_clsf()%>
<%= ds.getMqnt_clos_clsf()%>
<%= ds.getMagam_dt()%>
<%= ds.getMagam_state()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 27 20:34:55 KST 2009 */