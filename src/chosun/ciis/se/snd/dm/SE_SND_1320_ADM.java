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


package chosun.ciis.se.snd.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.snd.ds.*;
import chosun.ciis.se.snd.rec.*;

/**
 * 
 */


public class SE_SND_1320_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd       	;
	public String mode				;
	public String reg_dt            ;
	public String reg_seq           ;
	public String route_clsf		;
	public String bgn_route_cd		;
	public String end_route_cd		;
	public String medi_cd			;
	public String prt_plac_cd		;
	public String incmg_pers_ip 	;
	public String incmg_pers    	;

	public SE_SND_1320_ADM(){}
	public SE_SND_1320_ADM(String cmpy_cd, String mode, String reg_dt, String reg_seq, String route_clsf, String bgn_route_cd, String end_route_cd, String medi_cd, String prt_plac_cd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd          	= cmpy_cd         	;
		this.mode				= mode				;
		this.reg_dt             = reg_dt			;
		this.reg_seq			= reg_seq			;
		this.route_clsf	       	= route_clsf	  	;
		this.bgn_route_cd      	= bgn_route_cd 		;
		this.end_route_cd      	= end_route_cd 		;
		this.medi_cd			= medi_cd			;
		this.prt_plac_cd	    = prt_plac_cd		;	
		this.incmg_pers_ip 	  	= incmg_pers_ip 	;
		this.incmg_pers    		= incmg_pers    	;
	}

	public String getBgn_route_cd() {
		return bgn_route_cd;
	}
	public void setBgn_route_cd(String bgn_route_cd) {
		this.bgn_route_cd = bgn_route_cd;
	}
	public String getCmpy_cd() {
		return cmpy_cd;
	}
	public void setCmpy_cd(String cmpy_cd) {
		this.cmpy_cd = cmpy_cd;
	}
	public String getEnd_route_cd() {
		return end_route_cd;
	}
	public void setEnd_route_cd(String end_route_cd) {
		this.end_route_cd = end_route_cd;
	}
	public String getIncmg_pers() {
		return incmg_pers;
	}
	public void setIncmg_pers(String incmg_pers) {
		this.incmg_pers = incmg_pers;
	}
	public String getIncmg_pers_ip() {
		return incmg_pers_ip;
	}
	public void setIncmg_pers_ip(String incmg_pers_ip) {
		this.incmg_pers_ip = incmg_pers_ip;
	}
	public String getMedi_cd() {
		return medi_cd;
	}
	public void setMedi_cd(String medi_cd) {
		this.medi_cd = medi_cd;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getPrt_plac_cd() {
		return prt_plac_cd;
	}
	public void setPrt_plac_cd(String prt_plac_cd) {
		this.prt_plac_cd = prt_plac_cd;
	}
	public String getRoute_clsf() {
		return route_clsf;
	}
	public void setRoute_clsf(String route_clsf) {
		this.route_clsf = route_clsf;
	}
	
	public String getReg_dt() {
		return reg_dt;
	}
	public void setReg_dt(String reg_dt) {
		this.reg_dt = reg_dt;
	}
	public String getReg_seq() {
		return reg_seq;
	}
	public void setReg_seq(String reg_seq) {
		this.reg_seq = reg_seq;
	}
	
	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.snd.ds.SE_SND_1320_ADataSet();
	}

	public String getSQL(){
		 return "{ call SP_SE_SND_1320_A( ?, ?, ? ,? ,? ,? ,? ,? ,? ,? ,?, ?, ? ) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_SND_1320_ADM dm = (SE_SND_1320_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString( 3, dm.cmpy_cd			);
		cstmt.setString( 4, dm.mode				);
		cstmt.setString( 5, dm.reg_dt			);
		cstmt.setString( 6, dm.reg_seq			);
		cstmt.setString( 7, dm.route_clsf		);
		cstmt.setString( 8, dm.bgn_route_cd		);
		cstmt.setString( 9, dm.end_route_cd		);
		cstmt.setString(10, dm.medi_cd			);
		cstmt.setString(11, dm.prt_plac_cd		);
		cstmt.setString(12, dm.incmg_pers_ip	);
		cstmt.setString(13, dm.incmg_pers		);
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
String job_clsf = req.getParameter("job_clsf");
if( job_clsf == null){
	System.out.println(this.toString+" : job_clsf is null" );
}else{
	System.out.println(this.toString+" : job_clsf is "+job_clsf );
}
String cd_clsf = req.getParameter("cd_clsf");
if( cd_clsf == null){
	System.out.println(this.toString+" : cd_clsf is null" );
}else{
	System.out.println(this.toString+" : cd_clsf is "+cd_clsf );
}
String cd = req.getParameter("cd");
if( cd == null){
	System.out.println(this.toString+" : cd is null" );
}else{
	System.out.println(this.toString+" : cd is "+cd );
}
String cd_nm = req.getParameter("cd_nm");
if( cd_nm == null){
	System.out.println(this.toString+" : cd_nm is null" );
}else{
	System.out.println(this.toString+" : cd_nm is "+cd_nm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String job_clsf = Util.checkString(req.getParameter("job_clsf"));
String cd_clsf = Util.checkString(req.getParameter("cd_clsf"));
String cd = Util.checkString(req.getParameter("cd"));
String cd_nm = Util.checkString(req.getParameter("cd_nm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String job_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("job_clsf")));
String cd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_clsf")));
String cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cd")));
String cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("cd_nm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setJob_clsf(job_clsf);
dm.setCd_clsf(cd_clsf);
dm.setCd(cd);
dm.setCd_nm(cd_nm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 19 15:55:59 KST 2009 */