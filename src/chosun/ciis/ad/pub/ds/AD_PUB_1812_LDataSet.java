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


public class AD_PUB_1812_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String tot_adv_amt;
	public String tot_fee_amt;
	public String tot_vat_amt;
	public String tot_misu_amt;
	public String tot_pubc;

	public AD_PUB_1812_LDataSet(){}
	public AD_PUB_1812_LDataSet(String errcode, String errmsg, String tot_adv_amt, String tot_fee_amt, String tot_vat_amt, String tot_misu_amt, String tot_pubc){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.tot_adv_amt = tot_adv_amt;
		this.tot_fee_amt = tot_fee_amt;
		this.tot_vat_amt = tot_vat_amt;
		this.tot_misu_amt = tot_misu_amt;
		this.tot_pubc = tot_pubc;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setTot_adv_amt(String tot_adv_amt){
		this.tot_adv_amt = tot_adv_amt;
	}

	public void setTot_fee_amt(String tot_fee_amt){
		this.tot_fee_amt = tot_fee_amt;
	}

	public void setTot_vat_amt(String tot_vat_amt){
		this.tot_vat_amt = tot_vat_amt;
	}

	public void setTot_misu_amt(String tot_misu_amt){
		this.tot_misu_amt = tot_misu_amt;
	}

	public void setTot_pubc(String tot_pubc){
		this.tot_pubc = tot_pubc;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getTot_adv_amt(){
		return this.tot_adv_amt;
	}

	public String getTot_fee_amt(){
		return this.tot_fee_amt;
	}

	public String getTot_vat_amt(){
		return this.tot_vat_amt;
	}

	public String getTot_misu_amt(){
		return this.tot_misu_amt;
	}

	public String getTot_pubc(){
		return this.tot_pubc;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.tot_adv_amt = Util.checkString(cstmt.getString(50));
		this.tot_fee_amt = Util.checkString(cstmt.getString(51));
		this.tot_vat_amt = Util.checkString(cstmt.getString(52));
		this.tot_misu_amt = Util.checkString(cstmt.getString(53));
		this.tot_pubc = Util.checkString(cstmt.getString(54));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_PUB_1812_LDataSet ds = (AD_PUB_1812_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getTot_adv_amt()%>
<%= ds.getTot_fee_amt()%>
<%= ds.getTot_vat_amt()%>
<%= ds.getTot_misu_amt()%>
<%= ds.getTot_pubc()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 12 16:58:02 KST 2017 */