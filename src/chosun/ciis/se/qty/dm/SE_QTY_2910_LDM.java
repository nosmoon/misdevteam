/***************************************************************************************************
* 파일명 : SE_QTY_2910_LDM.java
* 기능 : 부수관리 - 발송부수 - 발송부수변동현황
* 작성일자 : 2009-03-09
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.qty.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.qty.ds.*;
import chosun.ciis.se.qty.rec.*;

/**
 * 
 */


public class SE_QTY_2910_LDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd		;
	public String bgn_issu_dt	;
	public String end_issu_dt	;
	public String medi_cd		;
	public String bo_cd			;
	public String send_plac_seq	;
	public String gubun			;
	public String incmg_pers	;
	public String dept_cd	    ;
	public String part_cd	    ;
	public String area_cd	    ;

	public SE_QTY_2910_LDM(){}
	public SE_QTY_2910_LDM(String cmpy_cd, String bgn_issu_dt, String end_issu_dt, String medi_cd, String bo_cd, String send_plac_seq, String gubun, String incmg_pers, String dept_cd, String part_cd, String area_cd){
		this.cmpy_cd 		= cmpy_cd		;
		this.bgn_issu_dt 	= bgn_issu_dt	;
		this.end_issu_dt 	= end_issu_dt	;
		this.medi_cd 		= medi_cd		;
		this.bo_cd 			= bo_cd			;
		this.send_plac_seq 	= send_plac_seq	;
		this.gubun			= gubun			;
		this.incmg_pers 	= incmg_pers	;
		this.dept_cd        = dept_cd       ;
		this.part_cd        = part_cd       ;
		this.area_cd        = area_cd       ;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setBgn_issu_dt(String bgn_issu_dt){
		this.bgn_issu_dt = bgn_issu_dt;
	}

	public void setEnd_issu_dt(String end_issu_dt){
		this.end_issu_dt = end_issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}
	
	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}
	
	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getBgn_issu_dt(){
		return this.bgn_issu_dt;
	}

	public String getEnd_issu_dt(){
		return this.end_issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}
	
	public String getArea_cd(){
		return this.area_cd;
	}
	
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	
	public String getSQL(){
		 return "{ call SP_SE_QTY_2910_L( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_QTY_2910_LDM dm = (SE_QTY_2910_LDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd			);
		cstmt.setString( 4, dm.bgn_issu_dt		);
		cstmt.setString( 5, dm.end_issu_dt		);
		cstmt.setString( 6, dm.medi_cd			);
		cstmt.setString( 7, dm.bo_cd			);
		cstmt.setString( 8, dm.send_plac_seq	);
		cstmt.setString( 9, dm.gubun			);
		cstmt.setString(10, dm.incmg_pers		);
		cstmt.setString(11, dm.dept_cd  		);
		cstmt.setString(12, dm.part_cd  		);
		cstmt.setString(13, dm.area_cd  		);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.qty.ds.SE_QTY_2910_LDataSet();
	}

    public void print(){
        System.out.println("cmpy_cd 		= " + getCmpy_cd		());
        System.out.println("bgn_issu_dt 	= " + getBgn_issu_dt	());
        System.out.println("end_issu_dt 	= " + getEnd_issu_dt	());
        System.out.println("medi_cd 		= " + getMedi_cd		());
        System.out.println("bo_cd 			= " + getBo_cd			());
        System.out.println("send_plac_seq 	= " + getSend_plac_seq	());
        System.out.println("gubun 			= " + getGubun			());
        System.out.println("incmg_pers 		= " + getIncmg_pers		());
        System.out.println("dept_cd  		= " + getDept_cd 		());
        System.out.println("part_cd 		= " + getPart_cd		());
        System.out.println("area_cd 		= " + getArea_cd		());
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
String bgn_issu_dt = req.getParameter("bgn_issu_dt");
if( bgn_issu_dt == null){
	System.out.println(this.toString+" : bgn_issu_dt is null" );
}else{
	System.out.println(this.toString+" : bgn_issu_dt is "+bgn_issu_dt );
}
String end_issu_dt = req.getParameter("end_issu_dt");
if( end_issu_dt == null){
	System.out.println(this.toString+" : end_issu_dt is null" );
}else{
	System.out.println(this.toString+" : end_issu_dt is "+end_issu_dt );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String send_plac_seq = req.getParameter("send_plac_seq");
if( send_plac_seq == null){
	System.out.println(this.toString+" : send_plac_seq is null" );
}else{
	System.out.println(this.toString+" : send_plac_seq is "+send_plac_seq );
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
String bgn_issu_dt = Util.checkString(req.getParameter("bgn_issu_dt"));
String end_issu_dt = Util.checkString(req.getParameter("end_issu_dt"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String send_plac_seq = Util.checkString(req.getParameter("send_plac_seq"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String bgn_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("bgn_issu_dt")));
String end_issu_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("end_issu_dt")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String send_plac_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("send_plac_seq")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setBgn_issu_dt(bgn_issu_dt);
dm.setEnd_issu_dt(end_issu_dt);
dm.setMedi_cd(medi_cd);
dm.setBo_cd(bo_cd);
dm.setSend_plac_seq(send_plac_seq);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 09 15:32:49 KST 2009 */