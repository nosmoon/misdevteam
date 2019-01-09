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


public class MC_COST_2002_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String yymm;
	public String cost_dstb_cd;
	public String dept_cd;
	public String medi_cd;
	public String qty;
	public String key_cost_cd;
	public String key_dept_cd;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public MC_COST_2002_IDM(){}
	public MC_COST_2002_IDM(String cmpy_cd, String mode, String yymm, String cost_dstb_cd, String dept_cd, String medi_cd, String qty, String key_cost_cd, String key_dept_cd, String incmg_pers_ipadd, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.yymm = yymm;
		this.cost_dstb_cd = cost_dstb_cd;
		this.dept_cd = dept_cd;
		this.medi_cd = medi_cd;
		this.qty = qty;
		this.key_cost_cd = key_cost_cd;
		this.key_dept_cd = key_dept_cd;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setCost_dstb_cd(String cost_dstb_cd){
		this.cost_dstb_cd = cost_dstb_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setKey_cost_cd(String key_cost_cd){
		this.key_cost_cd = key_cost_cd;
	}

	public void setKey_dept_cd(String key_dept_cd){
		this.key_dept_cd = key_dept_cd;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getCost_dstb_cd(){
		return this.cost_dstb_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getQty(){
		return this.qty;
	}

	public String getKey_cost_cd(){
		return this.key_cost_cd;
	}

	public String getKey_dept_cd(){
		return this.key_dept_cd;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_MC_COST_2002_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MC_COST_2002_IDM dm = (MC_COST_2002_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.cost_dstb_cd);
		cstmt.setString(7, dm.dept_cd);
		cstmt.setString(8, dm.medi_cd);
		cstmt.setString(9, dm.qty);
		cstmt.setString(10, dm.key_cost_cd);
		cstmt.setString(11, dm.key_dept_cd);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mc.cost.ds.MC_COST_2002_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("cost_dstb_cd = [" + getCost_dstb_cd() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("key_cost_cd = [" + getKey_cost_cd() + "]");
		System.out.println("key_dept_cd = [" + getKey_dept_cd() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String cost_dstb_cd = req.getParameter("cost_dstb_cd");
if( cost_dstb_cd == null){
	System.out.println(this.toString+" : cost_dstb_cd is null" );
}else{
	System.out.println(this.toString+" : cost_dstb_cd is "+cost_dstb_cd );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String key_cost_cd = req.getParameter("key_cost_cd");
if( key_cost_cd == null){
	System.out.println(this.toString+" : key_cost_cd is null" );
}else{
	System.out.println(this.toString+" : key_cost_cd is "+key_cost_cd );
}
String key_dept_cd = req.getParameter("key_dept_cd");
if( key_dept_cd == null){
	System.out.println(this.toString+" : key_dept_cd is null" );
}else{
	System.out.println(this.toString+" : key_dept_cd is "+key_dept_cd );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String yymm = Util.checkString(req.getParameter("yymm"));
String cost_dstb_cd = Util.checkString(req.getParameter("cost_dstb_cd"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String qty = Util.checkString(req.getParameter("qty"));
String key_cost_cd = Util.checkString(req.getParameter("key_cost_cd"));
String key_dept_cd = Util.checkString(req.getParameter("key_dept_cd"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String cost_dstb_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cost_dstb_cd")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String key_cost_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("key_cost_cd")));
String key_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("key_dept_cd")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setYymm(yymm);
dm.setCost_dstb_cd(cost_dstb_cd);
dm.setDept_cd(dept_cd);
dm.setMedi_cd(medi_cd);
dm.setQty(qty);
dm.setKey_cost_cd(key_cost_cd);
dm.setKey_dept_cd(key_dept_cd);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 01 10:35:06 KST 2009 */