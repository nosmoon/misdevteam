/***************************************************************************************************
* 파일명 : .java
* 기능 : 	   
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.ang.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.ang.ds.*;
import chosun.ciis.se.ang.rec.*;

/**
 * 
 */


public class SE_ANG_1030_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bo_cd;
	public String bo_nm;
	public String bo_seq;
	public String qty;
	public String uprc;
	public String amt;
	public String clsf;
	public String chg_pers;

	public SE_ANG_1030_UDM(){}
	public SE_ANG_1030_UDM(String cmpy_cd, String dept_nm, String part_nm, String area_nm, String bo_cd, String bo_nm, String bo_seq, String qty, String uprc, String amt, String clsf, String chg_pers){
		this.cmpy_cd = cmpy_cd;
		this.dept_nm = dept_nm;
		this.part_nm = part_nm;
		this.area_nm = area_nm;
		this.bo_cd = bo_cd;
		this.bo_nm = bo_nm;
		this.bo_seq = bo_seq;
		this.qty = qty;
		this.uprc = uprc;
		this.amt = amt;
		this.clsf = clsf;
		this.chg_pers = chg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_nm(String bo_nm){
		this.bo_nm = bo_nm;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_nm(){
		return this.bo_nm;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getQty(){
		return this.qty;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_ANG_1030_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_ANG_1030_UDM dm = (SE_ANG_1030_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dept_nm);
		cstmt.setString(5, dm.part_nm);
		cstmt.setString(6, dm.area_nm);
		cstmt.setString(7, dm.bo_cd);
		cstmt.setString(8, dm.bo_nm);
		cstmt.setString(9, dm.bo_seq);
		cstmt.setString(10, dm.qty);
		cstmt.setString(11, dm.uprc);
		cstmt.setString(12, dm.amt);
		cstmt.setString(13, dm.clsf);
		cstmt.setString(14, dm.chg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.ang.ds.SE_ANG_1030_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dept_nm = [" + getDept_nm() + "]");
		System.out.println("part_nm = [" + getPart_nm() + "]");
		System.out.println("area_nm = [" + getArea_nm() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_nm = [" + getBo_nm() + "]");
		System.out.println("bo_seq = [" + getBo_seq() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("clsf = [" + getClsf() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
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
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String part_nm = req.getParameter("part_nm");
if( part_nm == null){
	System.out.println(this.toString+" : part_nm is null" );
}else{
	System.out.println(this.toString+" : part_nm is "+part_nm );
}
String area_nm = req.getParameter("area_nm");
if( area_nm == null){
	System.out.println(this.toString+" : area_nm is null" );
}else{
	System.out.println(this.toString+" : area_nm is "+area_nm );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_nm = req.getParameter("bo_nm");
if( bo_nm == null){
	System.out.println(this.toString+" : bo_nm is null" );
}else{
	System.out.println(this.toString+" : bo_nm is "+bo_nm );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String clsf = req.getParameter("clsf");
if( clsf == null){
	System.out.println(this.toString+" : clsf is null" );
}else{
	System.out.println(this.toString+" : clsf is "+clsf );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String part_nm = Util.checkString(req.getParameter("part_nm"));
String area_nm = Util.checkString(req.getParameter("area_nm"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_nm = Util.checkString(req.getParameter("bo_nm"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String qty = Util.checkString(req.getParameter("qty"));
String uprc = Util.checkString(req.getParameter("uprc"));
String amt = Util.checkString(req.getParameter("amt"));
String clsf = Util.checkString(req.getParameter("clsf"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String part_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("part_nm")));
String area_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("area_nm")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_nm")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("clsf")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDept_nm(dept_nm);
dm.setPart_nm(part_nm);
dm.setArea_nm(area_nm);
dm.setBo_cd(bo_cd);
dm.setBo_nm(bo_nm);
dm.setBo_seq(bo_seq);
dm.setQty(qty);
dm.setUprc(uprc);
dm.setAmt(amt);
dm.setClsf(clsf);
dm.setChg_pers(chg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Sep 20 13:49:15 KST 2017 */