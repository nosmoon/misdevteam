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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_1810_SDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String preng_dt;
	public String sale_clsf;
	public String spcsale_clsf;
	public String seq;
	public String medi_nm;
	public String area_nm;
	public String advcs_nm;
	public String remk_matt;
	public String area_cd;
	public String dept_cd;
	public String sub_dept_cd;
	public String make_pers;
	public String make_pers_nm;

	public IS_BUS_1810_SDataSet(){}
	public IS_BUS_1810_SDataSet(String errcode, String errmsg, String preng_dt, String sale_clsf, String spcsale_clsf, String seq, String medi_nm, String area_nm, String advcs_nm, String remk_matt, String area_cd, String dept_cd, String sub_dept_cd, String make_pers, String make_pers_nm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.preng_dt = preng_dt;
		this.sale_clsf = sale_clsf;
		this.spcsale_clsf = spcsale_clsf;
		this.seq = seq;
		this.medi_nm = medi_nm;
		this.area_nm = area_nm;
		this.advcs_nm = advcs_nm;
		this.remk_matt = remk_matt;
		this.area_cd = area_cd;
		this.dept_cd = dept_cd;
		this.sub_dept_cd = sub_dept_cd;
		this.make_pers = make_pers;
		this.make_pers_nm = make_pers_nm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPreng_dt(String preng_dt){
		this.preng_dt = preng_dt;
	}

	public void setSale_clsf(String sale_clsf){
		this.sale_clsf = sale_clsf;
	}

	public void setSpcsale_clsf(String spcsale_clsf){
		this.spcsale_clsf = spcsale_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setAdvcs_nm(String advcs_nm){
		this.advcs_nm = advcs_nm;
	}

	public void setRemk_matt(String remk_matt){
		this.remk_matt = remk_matt;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setMake_pers_nm(String make_pers_nm){
		this.make_pers_nm = make_pers_nm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPreng_dt(){
		return this.preng_dt;
	}

	public String getSale_clsf(){
		return this.sale_clsf;
	}

	public String getSpcsale_clsf(){
		return this.spcsale_clsf;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getAdvcs_nm(){
		return this.advcs_nm;
	}

	public String getRemk_matt(){
		return this.remk_matt;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getMake_pers_nm(){
		return this.make_pers_nm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.preng_dt = Util.checkString(cstmt.getString(8));
		this.sale_clsf = Util.checkString(cstmt.getString(9));
		this.spcsale_clsf = Util.checkString(cstmt.getString(10));
		this.seq = Util.checkString(cstmt.getString(11));
		this.medi_nm = Util.checkString(cstmt.getString(12));
		this.area_nm = Util.checkString(cstmt.getString(13));
		this.advcs_nm = Util.checkString(cstmt.getString(14));
		this.remk_matt = Util.checkString(cstmt.getString(15));
		this.area_cd = Util.checkString(cstmt.getString(16));
		this.dept_cd = Util.checkString(cstmt.getString(17));
		this.sub_dept_cd = Util.checkString(cstmt.getString(18));
		this.make_pers = Util.checkString(cstmt.getString(19));
		this.make_pers_nm = Util.checkString(cstmt.getString(20));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BUS_1810_SDataSet ds = (IS_BUS_1810_SDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPreng_dt()%>
<%= ds.getSale_clsf()%>
<%= ds.getSpcsale_clsf()%>
<%= ds.getSeq()%>
<%= ds.getMedi_nm()%>
<%= ds.getArea_nm()%>
<%= ds.getAdvcs_nm()%>
<%= ds.getRemk_matt()%>
<%= ds.getArea_cd()%>
<%= ds.getDept_cd()%>
<%= ds.getSub_dept_cd()%>
<%= ds.getMake_pers()%>
<%= ds.getMake_pers_nm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jun 20 20:14:35 KST 2012 */