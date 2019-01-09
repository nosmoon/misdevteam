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


public class HD_YADJM_115600_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String xx_emp_no;
	public String xx_dona_plac_clsf;
	public String xx_dona_plac_clsf2;

	public HD_YADJM_115600_MDataSet(){}
	public HD_YADJM_115600_MDataSet(String errcode, String errmsg, String xx_emp_no, String xx_dona_plac_clsf, String xx_dona_plac_clsf2){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_emp_no = xx_emp_no;
		this.xx_dona_plac_clsf = xx_dona_plac_clsf;
		this.xx_dona_plac_clsf2 = xx_dona_plac_clsf2;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_emp_no(String xx_emp_no){
		this.xx_emp_no = xx_emp_no;
	}

	public void setXx_dona_plac_clsf(String xx_dona_plac_clsf){
		this.xx_dona_plac_clsf = xx_dona_plac_clsf;
	}

	public void setXx_dona_plac_clsf2(String xx_dona_plac_clsf2){
		this.xx_dona_plac_clsf2 = xx_dona_plac_clsf2;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_emp_no(){
		return this.xx_emp_no;
	}

	public String getXx_dona_plac_clsf(){
		return this.xx_dona_plac_clsf;
	}

	public String getXx_dona_plac_clsf2(){
		return this.xx_dona_plac_clsf2;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.xx_emp_no = Util.checkString(cstmt.getString(5));
		this.xx_dona_plac_clsf = Util.checkString(cstmt.getString(6));
		this.xx_dona_plac_clsf2 = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_YADJM_115600_MDataSet ds = (HD_YADJM_115600_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_emp_no()%>
<%= ds.getXx_dona_plac_clsf()%>
<%= ds.getXx_dona_plac_clsf2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 24 09:57:44 KST 2013 */