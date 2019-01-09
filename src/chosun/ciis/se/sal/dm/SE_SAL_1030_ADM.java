/***************************************************************************************************
* 파일명 : SE_SAL_1030_ADM.java
* 기능 : 판매 - 지대관리 - 매출관리 - 월지역담당정보관리
* 작성일자 : 2009-04-09
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.ds.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String mode			;
	public String yymm			;
	public String supr_dept_cd	;
	public String supr_dept_nm	;
	public String dept_cd		;
	public String dept_nm		;
	public String hdpt_cd		;
	public String sido_cd		;
	public String area_cd		;
	public String chrg_pers		;
	public String step			;
	public String gubun			;
	public String incmg_pers_ip	;
	public String incmg_pers	;

	public SE_SAL_1030_ADM(){}
	public SE_SAL_1030_ADM(String cmpy_cd, String mode, String yymm, String supr_dept_cd, String supr_dept_nm, String dept_cd, String dept_nm, String hdpt_cd, String sido_cd, String area_cd, String chrg_pers, String step, String gubun, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd		= cmpy_cd		;
		this.mode 			= mode			;
		this.yymm 			= yymm			;
		this.supr_dept_cd 	= supr_dept_cd	;
		this.supr_dept_nm 	= supr_dept_nm	;
		this.dept_cd 		= dept_cd		;
		this.dept_nm 		= dept_nm		;
		this.hdpt_cd 		= hdpt_cd		;
		this.sido_cd 		= sido_cd		;
		this.area_cd 		= area_cd		;
		this.chrg_pers 		= chrg_pers		;
		this.step 			= step			;
		this.gubun 			= gubun			;
		this.incmg_pers_ip 	= incmg_pers_ip	;
		this.incmg_pers 	= incmg_pers	;
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

	public void setSupr_dept_cd(String supr_dept_cd){
		this.supr_dept_cd = supr_dept_cd;
	}

	public void setSupr_dept_nm(String supr_dept_nm){
		this.supr_dept_nm = supr_dept_nm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setHdpt_cd(String hdpt_cd){
		this.hdpt_cd = hdpt_cd;
	}

	public void setSido_cd(String sido_cd){
		this.sido_cd = sido_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setStep(String step){
		this.step = step;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
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

	public String getSupr_dept_cd(){
		return this.supr_dept_cd;
	}

	public String getSupr_dept_nm(){
		return this.supr_dept_nm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getHdpt_cd(){
		return this.hdpt_cd;
	}

	public String getSido_cd(){
		return this.sido_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getStep(){
		return this.step;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call SP_SE_SAL_1030_A( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SAL_1030_ADM dm = (SE_SAL_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd		);
		cstmt.setString( 4, dm.mode			);
		cstmt.setString( 5, dm.yymm			);
		cstmt.setString( 6, dm.supr_dept_cd	);
		cstmt.setString( 7, dm.supr_dept_nm	);
		cstmt.setString( 8, dm.dept_cd		);
		cstmt.setString( 9, dm.dept_nm		);
		cstmt.setString(10, dm.hdpt_cd		);
		cstmt.setString(11, dm.sido_cd		);
		cstmt.setString(12, dm.area_cd		);
		cstmt.setString(13, dm.chrg_pers	);
		cstmt.setString(14, dm.step			);
		cstmt.setString(15, dm.gubun		);
		cstmt.setString(16, dm.incmg_pers_ip);
		cstmt.setString(17, dm.incmg_pers	);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.sal.ds.SE_SAL_1030_ADataSet();
	}

    public void print(){
        System.out.println("cmpy_cd			= " + getCmpy_cd		());
        System.out.println("mode 			= " + getMode			());
        System.out.println("yymm 			= " + getYymm			());
        System.out.println("supr_dept_cd 	= " + getSupr_dept_cd	());
        System.out.println("supr_dept_nm 	= " + getSupr_dept_nm	());
        System.out.println("dept_cd 		= " + getDept_cd		());
        System.out.println("dept_nm 		= " + getDept_nm		());
        System.out.println("hdpt_cd 		= " + getHdpt_cd		());
        System.out.println("sido_cd 		= " + getSido_cd		());
        System.out.println("area_cd 		= " + getArea_cd		());
        System.out.println("chrg_pers 		= " + getChrg_pers		());
        System.out.println("step 			= " + getStep			());
        System.out.println("gubun 			= " + getGubun			());
        System.out.println("incmg_pers_ip 	= " + getIncmg_pers_ip	());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
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
String supr_dept_cd = req.getParameter("supr_dept_cd");
if( supr_dept_cd == null){
	System.out.println(this.toString+" : supr_dept_cd is null" );
}else{
	System.out.println(this.toString+" : supr_dept_cd is "+supr_dept_cd );
}
String supr_dept_nm = req.getParameter("supr_dept_nm");
if( supr_dept_nm == null){
	System.out.println(this.toString+" : supr_dept_nm is null" );
}else{
	System.out.println(this.toString+" : supr_dept_nm is "+supr_dept_nm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String dept_nm = req.getParameter("dept_nm");
if( dept_nm == null){
	System.out.println(this.toString+" : dept_nm is null" );
}else{
	System.out.println(this.toString+" : dept_nm is "+dept_nm );
}
String hdpt_cd = req.getParameter("hdpt_cd");
if( hdpt_cd == null){
	System.out.println(this.toString+" : hdpt_cd is null" );
}else{
	System.out.println(this.toString+" : hdpt_cd is "+hdpt_cd );
}
String sido_cd = req.getParameter("sido_cd");
if( sido_cd == null){
	System.out.println(this.toString+" : sido_cd is null" );
}else{
	System.out.println(this.toString+" : sido_cd is "+sido_cd );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String step = req.getParameter("step");
if( step == null){
	System.out.println(this.toString+" : step is null" );
}else{
	System.out.println(this.toString+" : step is "+step );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
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
String supr_dept_cd = Util.checkString(req.getParameter("supr_dept_cd"));
String supr_dept_nm = Util.checkString(req.getParameter("supr_dept_nm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String dept_nm = Util.checkString(req.getParameter("dept_nm"));
String hdpt_cd = Util.checkString(req.getParameter("hdpt_cd"));
String sido_cd = Util.checkString(req.getParameter("sido_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String step = Util.checkString(req.getParameter("step"));
String gubun = Util.checkString(req.getParameter("gubun"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String supr_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_dept_cd")));
String supr_dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("supr_dept_nm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String dept_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_nm")));
String hdpt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("hdpt_cd")));
String sido_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sido_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String step = Util.Uni2Ksc(Util.checkString(req.getParameter("step")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setYymm(yymm);
dm.setSupr_dept_cd(supr_dept_cd);
dm.setSupr_dept_nm(supr_dept_nm);
dm.setDept_cd(dept_cd);
dm.setDept_nm(dept_nm);
dm.setHdpt_cd(hdpt_cd);
dm.setSido_cd(sido_cd);
dm.setArea_cd(area_cd);
dm.setChrg_pers(chrg_pers);
dm.setStep(step);
dm.setGubun(gubun);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Apr 09 13:52:23 KST 2009 */