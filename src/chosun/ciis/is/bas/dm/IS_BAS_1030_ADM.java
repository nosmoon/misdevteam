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


package chosun.ciis.is.bas.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.ds.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1030_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String std_cd;
	public String mode;
	public String seq;
	public String rvord_uprc;
	public String dstb_scat_uprc;
	public String build_scat_uprc;
	public String etc_scat_uprc;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_BAS_1030_ADM(){}
	public IS_BAS_1030_ADM(String cmpy_cd, String std_cd, String mode, String seq, String rvord_uprc, String dstb_scat_uprc, String build_scat_uprc, String etc_scat_uprc, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.std_cd = std_cd;
		this.mode = mode;
		this.seq = seq;
		this.rvord_uprc = rvord_uprc;
		this.dstb_scat_uprc = dstb_scat_uprc;
		this.build_scat_uprc = build_scat_uprc;
		this.etc_scat_uprc = etc_scat_uprc;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStd_cd(String std_cd){
		this.std_cd = std_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setRvord_uprc(String rvord_uprc){
		this.rvord_uprc = rvord_uprc;
	}

	public void setDstb_scat_uprc(String dstb_scat_uprc){
		this.dstb_scat_uprc = dstb_scat_uprc;
	}

	public void setBuild_scat_uprc(String build_scat_uprc){
		this.build_scat_uprc = build_scat_uprc;
	}

	public void setEtc_scat_uprc(String etc_scat_uprc){
		this.etc_scat_uprc = etc_scat_uprc;
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

	public String getStd_cd(){
		return this.std_cd;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getRvord_uprc(){
		return this.rvord_uprc;
	}

	public String getDstb_scat_uprc(){
		return this.dstb_scat_uprc;
	}

	public String getBuild_scat_uprc(){
		return this.build_scat_uprc;
	}

	public String getEtc_scat_uprc(){
		return this.etc_scat_uprc;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_BAS_1030_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_BAS_1030_ADM dm = (IS_BAS_1030_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.std_cd);
		cstmt.setString(5, dm.mode);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.rvord_uprc);
		cstmt.setString(8, dm.dstb_scat_uprc);
		cstmt.setString(9, dm.build_scat_uprc);
		cstmt.setString(10, dm.etc_scat_uprc);
		cstmt.setString(11, dm.incmg_pers_ip);
		cstmt.setString(12, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.bas.ds.IS_BAS_1030_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("std_cd = [" + getStd_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("rvord_uprc = [" + getRvord_uprc() + "]");
		System.out.println("dstb_scat_uprc = [" + getDstb_scat_uprc() + "]");
		System.out.println("build_scat_uprc = [" + getBuild_scat_uprc() + "]");
		System.out.println("etc_scat_uprc = [" + getEtc_scat_uprc() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
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
String std_cd = req.getParameter("std_cd");
if( std_cd == null){
	System.out.println(this.toString+" : std_cd is null" );
}else{
	System.out.println(this.toString+" : std_cd is "+std_cd );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String rvord_uprc = req.getParameter("rvord_uprc");
if( rvord_uprc == null){
	System.out.println(this.toString+" : rvord_uprc is null" );
}else{
	System.out.println(this.toString+" : rvord_uprc is "+rvord_uprc );
}
String dstb_scat_uprc = req.getParameter("dstb_scat_uprc");
if( dstb_scat_uprc == null){
	System.out.println(this.toString+" : dstb_scat_uprc is null" );
}else{
	System.out.println(this.toString+" : dstb_scat_uprc is "+dstb_scat_uprc );
}
String build_scat_uprc = req.getParameter("build_scat_uprc");
if( build_scat_uprc == null){
	System.out.println(this.toString+" : build_scat_uprc is null" );
}else{
	System.out.println(this.toString+" : build_scat_uprc is "+build_scat_uprc );
}
String etc_scat_uprc = req.getParameter("etc_scat_uprc");
if( etc_scat_uprc == null){
	System.out.println(this.toString+" : etc_scat_uprc is null" );
}else{
	System.out.println(this.toString+" : etc_scat_uprc is "+etc_scat_uprc );
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
String std_cd = Util.checkString(req.getParameter("std_cd"));
String mode = Util.checkString(req.getParameter("mode"));
String seq = Util.checkString(req.getParameter("seq"));
String rvord_uprc = Util.checkString(req.getParameter("rvord_uprc"));
String dstb_scat_uprc = Util.checkString(req.getParameter("dstb_scat_uprc"));
String build_scat_uprc = Util.checkString(req.getParameter("build_scat_uprc"));
String etc_scat_uprc = Util.checkString(req.getParameter("etc_scat_uprc"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String std_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("std_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String rvord_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("rvord_uprc")));
String dstb_scat_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("dstb_scat_uprc")));
String build_scat_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("build_scat_uprc")));
String etc_scat_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_scat_uprc")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStd_cd(std_cd);
dm.setMode(mode);
dm.setSeq(seq);
dm.setRvord_uprc(rvord_uprc);
dm.setDstb_scat_uprc(dstb_scat_uprc);
dm.setBuild_scat_uprc(build_scat_uprc);
dm.setEtc_scat_uprc(etc_scat_uprc);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 18 14:11:16 KST 2012 */