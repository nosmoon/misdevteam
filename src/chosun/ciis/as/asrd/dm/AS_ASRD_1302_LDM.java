/***************************************************************************************************
* 파일명 : .java
* 기능 :   고정자산 - 취득자산일괄조회
* 작성일자 : 2015.10.01
* 작성자   : 노상현
***************************************************************************************************/


package chosun.ciis.as.asrd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.asrd.ds.*;
import chosun.ciis.as.asrd.rec.*;

/**
 * 고정자산 - 취득자산일괄조회
 */

public class AS_ASRD_1302_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String aset_no_fr;
	public String aset_no_to;
	public String dept_cd_fr;
	public String dept_cd_to;
	public String bund_cd_fr;
	public String bund_cd_to;
	public String acqr_dt_fr;
	public String acqr_dt_to;
	public String sale_dt_fr;
	public String sale_dt_to;
	public String cur_acqr_amt_fr;
	public String cur_acqr_amt_to;
	public String aset_stat;
	public String aset_usag;
	public String aset_size;
	public String aset_loca;
	public String aset_nm;
	public String use_emp_no;
	public String srch_total;

	public AS_ASRD_1302_LDM(){}
	public AS_ASRD_1302_LDM(String cmpy_cd, String aset_no_fr, String aset_no_to, String dept_cd_fr, String dept_cd_to, String bund_cd_fr, String bund_cd_to, String acqr_dt_fr, String acqr_dt_to, String sale_dt_fr, String sale_dt_to, String cur_acqr_amt_fr, String cur_acqr_amt_to, String aset_stat, String aset_usag, String aset_size, String aset_loca, String aset_nm, String use_emp_no, String srch_total){
		this.cmpy_cd = cmpy_cd;
		this.aset_no_fr = aset_no_fr;
		this.aset_no_to = aset_no_to;
		this.dept_cd_fr = dept_cd_fr;
		this.dept_cd_to = dept_cd_to;
		this.bund_cd_fr = bund_cd_fr;
		this.bund_cd_to = bund_cd_to;
		this.acqr_dt_fr = acqr_dt_fr;
		this.acqr_dt_to = acqr_dt_to;
		this.sale_dt_fr = sale_dt_fr;
		this.sale_dt_to = sale_dt_to;
		this.cur_acqr_amt_fr = cur_acqr_amt_fr;
		this.cur_acqr_amt_to = cur_acqr_amt_to;
		this.aset_stat = aset_stat;
		this.aset_usag = aset_usag;
		this.aset_size = aset_size;
		this.aset_loca = aset_loca;
		this.aset_nm = aset_nm;
		this.use_emp_no = use_emp_no;
		this.srch_total = srch_total;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAset_no_fr(String aset_no_fr){
		this.aset_no_fr = aset_no_fr;
	}

	public void setAset_no_to(String aset_no_to){
		this.aset_no_to = aset_no_to;
	}

	public void setDept_cd_fr(String dept_cd_fr){
		this.dept_cd_fr = dept_cd_fr;
	}

	public void setDept_cd_to(String dept_cd_to){
		this.dept_cd_to = dept_cd_to;
	}

	public void setBund_cd_fr(String bund_cd_fr){
		this.bund_cd_fr = bund_cd_fr;
	}

	public void setBund_cd_to(String bund_cd_to){
		this.bund_cd_to = bund_cd_to;
	}

	public void setAcqr_dt_fr(String acqr_dt_fr){
		this.acqr_dt_fr = acqr_dt_fr;
	}

	public void setAcqr_dt_to(String acqr_dt_to){
		this.acqr_dt_to = acqr_dt_to;
	}

	public void setSale_dt_fr(String sale_dt_fr){
		this.sale_dt_fr = sale_dt_fr;
	}

	public void setSale_dt_to(String sale_dt_to){
		this.sale_dt_to = sale_dt_to;
	}

	public void setCur_acqr_amt_fr(String cur_acqr_amt_fr){
		this.cur_acqr_amt_fr = cur_acqr_amt_fr;
	}

	public void setCur_acqr_amt_to(String cur_acqr_amt_to){
		this.cur_acqr_amt_to = cur_acqr_amt_to;
	}

	public void setAset_stat(String aset_stat){
		this.aset_stat = aset_stat;
	}

	public void setAset_usag(String aset_usag){
		this.aset_usag = aset_usag;
	}

	public void setAset_size(String aset_size){
		this.aset_size = aset_size;
	}

	public void setAset_loca(String aset_loca){
		this.aset_loca = aset_loca;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setUse_emp_no(String use_emp_no){
		this.use_emp_no = use_emp_no;
	}

	public void setSrch_total(String srch_total){
		this.srch_total = srch_total;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAset_no_fr(){
		return this.aset_no_fr;
	}

	public String getAset_no_to(){
		return this.aset_no_to;
	}

	public String getDept_cd_fr(){
		return this.dept_cd_fr;
	}

	public String getDept_cd_to(){
		return this.dept_cd_to;
	}

	public String getBund_cd_fr(){
		return this.bund_cd_fr;
	}

	public String getBund_cd_to(){
		return this.bund_cd_to;
	}

	public String getAcqr_dt_fr(){
		return this.acqr_dt_fr;
	}

	public String getAcqr_dt_to(){
		return this.acqr_dt_to;
	}

	public String getSale_dt_fr(){
		return this.sale_dt_fr;
	}

	public String getSale_dt_to(){
		return this.sale_dt_to;
	}

	public String getCur_acqr_amt_fr(){
		return this.cur_acqr_amt_fr;
	}

	public String getCur_acqr_amt_to(){
		return this.cur_acqr_amt_to;
	}

	public String getAset_stat(){
		return this.aset_stat;
	}

	public String getAset_usag(){
		return this.aset_usag;
	}

	public String getAset_size(){
		return this.aset_size;
	}

	public String getAset_loca(){
		return this.aset_loca;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getUse_emp_no(){
		return this.use_emp_no;
	}

	public String getSrch_total(){
		return this.srch_total;
	}

	public String getSQL(){
		 return "{ call MISAST.SP_AS_ASRD_1302_L(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		AS_ASRD_1302_LDM dm = (AS_ASRD_1302_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.aset_no_fr);
		cstmt.setString(5, dm.aset_no_to);
		cstmt.setString(6, dm.dept_cd_fr);
		cstmt.setString(7, dm.dept_cd_to);
		cstmt.setString(8, dm.bund_cd_fr);
		cstmt.setString(9, dm.bund_cd_to);
		cstmt.setString(10, dm.acqr_dt_fr);
		cstmt.setString(11, dm.acqr_dt_to);
		cstmt.setString(12, dm.sale_dt_fr);
		cstmt.setString(13, dm.sale_dt_to);
		cstmt.setString(14, dm.cur_acqr_amt_fr);
		cstmt.setString(15, dm.cur_acqr_amt_to);
		cstmt.setString(16, dm.aset_stat);
		cstmt.setString(17, dm.aset_usag);
		cstmt.setString(18, dm.aset_size);
		cstmt.setString(19, dm.aset_loca);
		cstmt.setString(20, dm.aset_nm);
		cstmt.setString(21, dm.use_emp_no);
		cstmt.setString(22, dm.srch_total);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.as.asrd.ds.AS_ASRD_1302_LDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("aset_no_fr = [" + getAset_no_fr() + "]");
		System.out.println("aset_no_to = [" + getAset_no_to() + "]");
		System.out.println("dept_cd_fr = [" + getDept_cd_fr() + "]");
		System.out.println("dept_cd_to = [" + getDept_cd_to() + "]");
		System.out.println("bund_cd_fr = [" + getBund_cd_fr() + "]");
		System.out.println("bund_cd_to = [" + getBund_cd_to() + "]");
		System.out.println("acqr_dt_fr = [" + getAcqr_dt_fr() + "]");
		System.out.println("acqr_dt_to = [" + getAcqr_dt_to() + "]");
		System.out.println("sale_dt_fr = [" + getSale_dt_fr() + "]");
		System.out.println("sale_dt_to = [" + getSale_dt_to() + "]");
		System.out.println("cur_acqr_amt_fr = [" + getCur_acqr_amt_fr() + "]");
		System.out.println("cur_acqr_amt_to = [" + getCur_acqr_amt_to() + "]");
		System.out.println("aset_stat = [" + getAset_stat() + "]");
		System.out.println("aset_usag = [" + getAset_usag() + "]");
		System.out.println("aset_size = [" + getAset_size() + "]");
		System.out.println("aset_loca = [" + getAset_loca() + "]");
		System.out.println("aset_nm = [" + getAset_nm() + "]");
		System.out.println("use_emp_no = [" + getUse_emp_no() + "]");
		System.out.println("srch_total = [" + getSrch_total() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String aset_no_fr = req.getParameter("aset_no_fr");
if( aset_no_fr == null){
	System.out.println(this.toString+" : aset_no_fr is null" );
}else{
	System.out.println(this.toString+" : aset_no_fr is "+aset_no_fr );
}
String aset_no_to = req.getParameter("aset_no_to");
if( aset_no_to == null){
	System.out.println(this.toString+" : aset_no_to is null" );
}else{
	System.out.println(this.toString+" : aset_no_to is "+aset_no_to );
}
String dept_cd_fr = req.getParameter("dept_cd_fr");
if( dept_cd_fr == null){
	System.out.println(this.toString+" : dept_cd_fr is null" );
}else{
	System.out.println(this.toString+" : dept_cd_fr is "+dept_cd_fr );
}
String dept_cd_to = req.getParameter("dept_cd_to");
if( dept_cd_to == null){
	System.out.println(this.toString+" : dept_cd_to is null" );
}else{
	System.out.println(this.toString+" : dept_cd_to is "+dept_cd_to );
}
String bund_cd_fr = req.getParameter("bund_cd_fr");
if( bund_cd_fr == null){
	System.out.println(this.toString+" : bund_cd_fr is null" );
}else{
	System.out.println(this.toString+" : bund_cd_fr is "+bund_cd_fr );
}
String bund_cd_to = req.getParameter("bund_cd_to");
if( bund_cd_to == null){
	System.out.println(this.toString+" : bund_cd_to is null" );
}else{
	System.out.println(this.toString+" : bund_cd_to is "+bund_cd_to );
}
String acqr_dt_fr = req.getParameter("acqr_dt_fr");
if( acqr_dt_fr == null){
	System.out.println(this.toString+" : acqr_dt_fr is null" );
}else{
	System.out.println(this.toString+" : acqr_dt_fr is "+acqr_dt_fr );
}
String acqr_dt_to = req.getParameter("acqr_dt_to");
if( acqr_dt_to == null){
	System.out.println(this.toString+" : acqr_dt_to is null" );
}else{
	System.out.println(this.toString+" : acqr_dt_to is "+acqr_dt_to );
}
String sale_dt_fr = req.getParameter("sale_dt_fr");
if( sale_dt_fr == null){
	System.out.println(this.toString+" : sale_dt_fr is null" );
}else{
	System.out.println(this.toString+" : sale_dt_fr is "+sale_dt_fr );
}
String sale_dt_to = req.getParameter("sale_dt_to");
if( sale_dt_to == null){
	System.out.println(this.toString+" : sale_dt_to is null" );
}else{
	System.out.println(this.toString+" : sale_dt_to is "+sale_dt_to );
}
String cur_acqr_amt_fr = req.getParameter("cur_acqr_amt_fr");
if( cur_acqr_amt_fr == null){
	System.out.println(this.toString+" : cur_acqr_amt_fr is null" );
}else{
	System.out.println(this.toString+" : cur_acqr_amt_fr is "+cur_acqr_amt_fr );
}
String cur_acqr_amt_to = req.getParameter("cur_acqr_amt_to");
if( cur_acqr_amt_to == null){
	System.out.println(this.toString+" : cur_acqr_amt_to is null" );
}else{
	System.out.println(this.toString+" : cur_acqr_amt_to is "+cur_acqr_amt_to );
}
String aset_stat = req.getParameter("aset_stat");
if( aset_stat == null){
	System.out.println(this.toString+" : aset_stat is null" );
}else{
	System.out.println(this.toString+" : aset_stat is "+aset_stat );
}
String aset_usag = req.getParameter("aset_usag");
if( aset_usag == null){
	System.out.println(this.toString+" : aset_usag is null" );
}else{
	System.out.println(this.toString+" : aset_usag is "+aset_usag );
}
String aset_size = req.getParameter("aset_size");
if( aset_size == null){
	System.out.println(this.toString+" : aset_size is null" );
}else{
	System.out.println(this.toString+" : aset_size is "+aset_size );
}
String aset_loca = req.getParameter("aset_loca");
if( aset_loca == null){
	System.out.println(this.toString+" : aset_loca is null" );
}else{
	System.out.println(this.toString+" : aset_loca is "+aset_loca );
}
String aset_nm = req.getParameter("aset_nm");
if( aset_nm == null){
	System.out.println(this.toString+" : aset_nm is null" );
}else{
	System.out.println(this.toString+" : aset_nm is "+aset_nm );
}
String use_emp_no = req.getParameter("use_emp_no");
if( use_emp_no == null){
	System.out.println(this.toString+" : use_emp_no is null" );
}else{
	System.out.println(this.toString+" : use_emp_no is "+use_emp_no );
}
String srch_total = req.getParameter("srch_total");
if( srch_total == null){
	System.out.println(this.toString+" : srch_total is null" );
}else{
	System.out.println(this.toString+" : srch_total is "+srch_total );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String aset_no_fr = Util.checkString(req.getParameter("aset_no_fr"));
String aset_no_to = Util.checkString(req.getParameter("aset_no_to"));
String dept_cd_fr = Util.checkString(req.getParameter("dept_cd_fr"));
String dept_cd_to = Util.checkString(req.getParameter("dept_cd_to"));
String bund_cd_fr = Util.checkString(req.getParameter("bund_cd_fr"));
String bund_cd_to = Util.checkString(req.getParameter("bund_cd_to"));
String acqr_dt_fr = Util.checkString(req.getParameter("acqr_dt_fr"));
String acqr_dt_to = Util.checkString(req.getParameter("acqr_dt_to"));
String sale_dt_fr = Util.checkString(req.getParameter("sale_dt_fr"));
String sale_dt_to = Util.checkString(req.getParameter("sale_dt_to"));
String cur_acqr_amt_fr = Util.checkString(req.getParameter("cur_acqr_amt_fr"));
String cur_acqr_amt_to = Util.checkString(req.getParameter("cur_acqr_amt_to"));
String aset_stat = Util.checkString(req.getParameter("aset_stat"));
String aset_usag = Util.checkString(req.getParameter("aset_usag"));
String aset_size = Util.checkString(req.getParameter("aset_size"));
String aset_loca = Util.checkString(req.getParameter("aset_loca"));
String aset_nm = Util.checkString(req.getParameter("aset_nm"));
String use_emp_no = Util.checkString(req.getParameter("use_emp_no"));
String srch_total = Util.checkString(req.getParameter("srch_total"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String aset_no_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no_fr")));
String aset_no_to = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_no_to")));
String dept_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd_fr")));
String dept_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd_to")));
String bund_cd_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("bund_cd_fr")));
String bund_cd_to = Util.Uni2Ksc(Util.checkString(req.getParameter("bund_cd_to")));
String acqr_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_dt_fr")));
String acqr_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("acqr_dt_to")));
String sale_dt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_dt_fr")));
String sale_dt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_dt_to")));
String cur_acqr_amt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("cur_acqr_amt_fr")));
String cur_acqr_amt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("cur_acqr_amt_to")));
String aset_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_stat")));
String aset_usag = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_usag")));
String aset_size = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_size")));
String aset_loca = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_loca")));
String aset_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("aset_nm")));
String use_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("use_emp_no")));
String srch_total = Util.Uni2Ksc(Util.checkString(req.getParameter("srch_total")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setAset_no_fr(aset_no_fr);
dm.setAset_no_to(aset_no_to);
dm.setDept_cd_fr(dept_cd_fr);
dm.setDept_cd_to(dept_cd_to);
dm.setBund_cd_fr(bund_cd_fr);
dm.setBund_cd_to(bund_cd_to);
dm.setAcqr_dt_fr(acqr_dt_fr);
dm.setAcqr_dt_to(acqr_dt_to);
dm.setSale_dt_fr(sale_dt_fr);
dm.setSale_dt_to(sale_dt_to);
dm.setCur_acqr_amt_fr(cur_acqr_amt_fr);
dm.setCur_acqr_amt_to(cur_acqr_amt_to);
dm.setAset_stat(aset_stat);
dm.setAset_usag(aset_usag);
dm.setAset_size(aset_size);
dm.setAset_loca(aset_loca);
dm.setAset_nm(aset_nm);
dm.setUse_emp_no(use_emp_no);
dm.setSrch_total(srch_total);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 17 19:08:41 KST 2017 */