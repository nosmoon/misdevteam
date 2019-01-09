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


package chosun.ciis.mc.cost.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.cost.ds.*;
import chosun.ciis.mc.cost.rec.*;

/**
 * 
 */


public class MC_COST_2053_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String dstb_cd;
	public String dept_cd;
	public long qty;
	public String incmg_pers;
	public String yymm;
	public String key_dstb_cd;
	public String key_dept_cd;
	public String key_medi_cd;

	public MC_COST_2053_UDM(){}
	public MC_COST_2053_UDM(String cmpy_cd, String dstb_cd, String dept_cd, long qty, String incmg_pers, String yymm, String key_dstb_cd, String key_dept_cd, String key_medi_cd){
		this.cmpy_cd = cmpy_cd;
		this.dstb_cd = dstb_cd;
		this.dept_cd = dept_cd;
		this.qty = qty;
		this.incmg_pers = incmg_pers;
		this.yymm = yymm;
		this.key_dstb_cd = key_dstb_cd;
		this.key_dept_cd = key_dept_cd;
		this.key_medi_cd = key_medi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDstb_cd(String dstb_cd){
		this.dstb_cd = dstb_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setQty(long qty){
		this.qty = qty;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setKey_dstb_cd(String key_dstb_cd){
		this.key_dstb_cd = key_dstb_cd;
	}

	public void setKey_dept_cd(String key_dept_cd){
		this.key_dept_cd = key_dept_cd;
	}

	public void setKey_medi_cd(String key_medi_cd){
		this.key_medi_cd = key_medi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDstb_cd(){
		return this.dstb_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public long getQty(){
		return this.qty;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getKey_dstb_cd(){
		return this.key_dstb_cd;
	}

	public String getKey_dept_cd(){
		return this.key_dept_cd;
	}

	public String getKey_medi_cd(){
		return this.key_medi_cd;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_2053_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_2053_UDM dm = (MC_COST_2053_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.dstb_cd);
		cstmt.setString(5, dm.dept_cd);
		cstmt.setLong(6, dm.qty);
		cstmt.setString(7, dm.incmg_pers);
		cstmt.setString(8, dm.yymm);
		cstmt.setString(9, dm.key_dstb_cd);
		cstmt.setString(10, dm.key_dept_cd);
		cstmt.setString(11, dm.key_medi_cd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_2053_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("dstb_cd = [" + getDstb_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("key_dstb_cd = [" + getKey_dstb_cd() + "]");
		System.out.println("key_dept_cd = [" + getKey_dept_cd() + "]");
		System.out.println("key_medi_cd = [" + getKey_medi_cd() + "]");
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
String dstb_cd = req.getParameter("dstb_cd");
if( dstb_cd == null){
	System.out.println(this.toString+" : dstb_cd is null" );
}else{
	System.out.println(this.toString+" : dstb_cd is "+dstb_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String key_dstb_cd = req.getParameter("key_dstb_cd");
if( key_dstb_cd == null){
	System.out.println(this.toString+" : key_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : key_dstb_cd is "+key_dstb_cd );
}
String key_dept_cd = req.getParameter("key_dept_cd");
if( key_dept_cd == null){
	System.out.println(this.toString+" : key_dept_cd is null" );
}else{
	System.out.println(this.toString+" : key_dept_cd is "+key_dept_cd );
}
String key_medi_cd = req.getParameter("key_medi_cd");
if( key_medi_cd == null){
	System.out.println(this.toString+" : key_medi_cd is null" );
}else{
	System.out.println(this.toString+" : key_medi_cd is "+key_medi_cd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String dstb_cd = Util.checkString(req.getParameter("dstb_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String qty = Util.checkString(req.getParameter("qty"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String yymm = Util.checkString(req.getParameter("yymm"));
String key_dstb_cd = Util.checkString(req.getParameter("key_dstb_cd"));
String key_dept_cd = Util.checkString(req.getParameter("key_dept_cd"));
String key_medi_cd = Util.checkString(req.getParameter("key_medi_cd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String key_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("key_dstb_cd")));
String key_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("key_dept_cd")));
String key_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("key_medi_cd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setDstb_cd(dstb_cd);
dm.setDept_cd(dept_cd);
dm.setQty(qty);
dm.setIncmg_pers(incmg_pers);
dm.setYymm(yymm);
dm.setKey_dstb_cd(key_dstb_cd);
dm.setKey_dept_cd(key_dept_cd);
dm.setKey_medi_cd(key_medi_cd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 14 09:37:12 KST 2009 */