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


package chosun.ciis.hd.duty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.duty.ds.*;
import chosun.ciis.hd.duty.rec.*;

/**
 * 
 */


public class HD_DUTY_1003_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String clndr_dt;
	public String clndr_tm;
	public String hody_clsf;
	public String remk;
	public String incmg_pers;

	public HD_DUTY_1003_ADM(){}
	public HD_DUTY_1003_ADM(String mode, String cmpy_cd, String clndr_dt, String clndr_tm, String hody_clsf, String remk, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.clndr_dt = clndr_dt;
		this.clndr_tm = clndr_tm;
		this.hody_clsf = hody_clsf;
		this.remk = remk;
		this.incmg_pers = incmg_pers;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClndr_dt(String clndr_dt){
		this.clndr_dt = clndr_dt;
	}

	public void setClndr_tm(String clndr_tm){
		this.clndr_tm = clndr_tm;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClndr_dt(){
		return this.clndr_dt;
	}

	public String getClndr_tm(){
		return this.clndr_tm;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_DUTY_1003_A(? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_DUTY_1003_ADM dm = (HD_DUTY_1003_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.clndr_dt);
		cstmt.setString(6, dm.clndr_tm);
		cstmt.setString(7, dm.hody_clsf);
		cstmt.setString(8, dm.remk);
		cstmt.setString(9, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.duty.ds.HD_DUTY_1003_ADataSet();
	}



    public void print(){
        System.out.println("mode = " + getMode());
        System.out.println("cmpy_cd = " + getCmpy_cd());
        System.out.println("clndr_dt = " + getClndr_dt());
        System.out.println("clndr_tm = " + getClndr_tm());
        System.out.println("hody_clsf = " + getHody_clsf());
        System.out.println("remk = " + getRemk());
        System.out.println("incmg_pers = " + getIncmg_pers());
    }
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String clndr_dt = req.getParameter("clndr_dt");
if( clndr_dt == null){
	System.out.println(this.toString+" : clndr_dt is null" );
}else{
	System.out.println(this.toString+" : clndr_dt is "+clndr_dt );
}
String clndr_tm = req.getParameter("clndr_tm");
if( clndr_tm == null){
	System.out.println(this.toString+" : clndr_tm is null" );
}else{
	System.out.println(this.toString+" : clndr_tm is "+clndr_tm );
}
String hody_clsf = req.getParameter("hody_clsf");
if( hody_clsf == null){
	System.out.println(this.toString+" : hody_clsf is null" );
}else{
	System.out.println(this.toString+" : hody_clsf is "+hody_clsf );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String clndr_dt = Util.checkString(req.getParameter("clndr_dt"));
String clndr_tm = Util.checkString(req.getParameter("clndr_tm"));
String hody_clsf = Util.checkString(req.getParameter("hody_clsf"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String clndr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clndr_dt")));
String clndr_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("clndr_tm")));
String hody_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("hody_clsf")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setClndr_dt(clndr_dt);
dm.setClndr_tm(clndr_tm);
dm.setHody_clsf(hody_clsf);
dm.setRemk(remk);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 19 14:25:07 KST 2009 */